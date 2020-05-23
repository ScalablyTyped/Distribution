package typings.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncodingNull extends js.Object {
  var encoding: js.UndefOr[Null] = js.undefined
  var flag: js.UndefOr[String] = js.undefined
}

object EncodingNull {
  @scala.inline
  def apply(flag: String = null): EncodingNull = {
    val __obj = js.Dynamic.literal()
    if (flag != null) __obj.updateDynamic("flag")(flag.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodingNull]
  }
}

