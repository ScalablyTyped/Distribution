package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncodingNull extends js.Object {
  var encoding: js.UndefOr[java.lang.String | Null] = js.undefined
}

object Anon_EncodingNull {
  @scala.inline
  def apply(encoding: java.lang.String = null): Anon_EncodingNull = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EncodingNull]
  }
}

