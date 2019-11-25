package typings.micro

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Encoding extends js.Object {
  var encoding: js.UndefOr[String] = js.undefined
  var limit: js.UndefOr[String | Double] = js.undefined
}

object Anon_Encoding {
  @scala.inline
  def apply(encoding: String = null, limit: String | Double = null): Anon_Encoding = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Encoding]
  }
}

