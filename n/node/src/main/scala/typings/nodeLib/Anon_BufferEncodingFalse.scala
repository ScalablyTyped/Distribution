package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferEncodingFalse extends js.Object {
  var encoding: nodeLib.nodeLibStrings.buffer
  var withFileTypes: js.UndefOr[nodeLib.nodeLibNumbers.`false`] = js.undefined
}

object Anon_BufferEncodingFalse {
  @scala.inline
  def apply(encoding: nodeLib.nodeLibStrings.buffer, withFileTypes: nodeLib.nodeLibNumbers.`false` = null): Anon_BufferEncodingFalse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("encoding")(encoding)
    if (withFileTypes != null) __obj.updateDynamic("withFileTypes")(withFileTypes)
    __obj.asInstanceOf[Anon_BufferEncodingFalse]
  }
}

