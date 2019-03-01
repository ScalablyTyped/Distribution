package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncodingFalse extends js.Object {
  var encoding: BufferEncoding | scala.Null
  var withFileTypes: js.UndefOr[nodeLib.nodeLibNumbers.`false`] = js.undefined
}

object Anon_EncodingFalse {
  @scala.inline
  def apply(encoding: BufferEncoding = null, withFileTypes: nodeLib.nodeLibNumbers.`false` = null): Anon_EncodingFalse = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (withFileTypes != null) __obj.updateDynamic("withFileTypes")(withFileTypes)
    __obj.asInstanceOf[Anon_EncodingFalse]
  }
}

