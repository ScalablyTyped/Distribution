package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncodingNull extends js.Object {
  var encoding: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object Anon_EncodingNull {
  @scala.inline
  def apply(encoding: java.lang.String = null): Anon_EncodingNull = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    __obj.asInstanceOf[Anon_EncodingNull]
  }
}

