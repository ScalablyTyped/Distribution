package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEncodingNull extends js.Object {
  var encoding: js.UndefOr[java.lang.String | Null] = js.undefined
}

object AnonEncodingNull {
  @scala.inline
  def apply(encoding: java.lang.String = null): AnonEncodingNull = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEncodingNull]
  }
}

