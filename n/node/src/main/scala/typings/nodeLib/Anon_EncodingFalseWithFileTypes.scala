package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncodingFalseWithFileTypes extends js.Object {
  var encoding: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var withFileTypes: js.UndefOr[nodeLib.nodeLibNumbers.`false`] = js.undefined
}

object Anon_EncodingFalseWithFileTypes {
  @scala.inline
  def apply(encoding: java.lang.String = null, withFileTypes: nodeLib.nodeLibNumbers.`false` = null): Anon_EncodingFalseWithFileTypes = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (withFileTypes != null) __obj.updateDynamic("withFileTypes")(withFileTypes)
    __obj.asInstanceOf[Anon_EncodingFalseWithFileTypes]
  }
}

