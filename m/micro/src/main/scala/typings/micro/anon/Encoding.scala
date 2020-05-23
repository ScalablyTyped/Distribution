package typings.micro.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Encoding extends js.Object {
  var encoding: js.UndefOr[String] = js.undefined
  var limit: js.UndefOr[String | Double] = js.undefined
}

object Encoding {
  @scala.inline
  def apply(encoding: String = null, limit: String | Double = null): Encoding = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encoding]
  }
}

