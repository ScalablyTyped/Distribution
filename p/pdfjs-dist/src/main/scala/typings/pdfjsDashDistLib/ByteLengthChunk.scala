package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ByteLengthChunk extends js.Object {
  var byteLength: js.UndefOr[scala.Double] = js.undefined
}

object ByteLengthChunk {
  @scala.inline
  def apply(byteLength: scala.Int | scala.Double = null): ByteLengthChunk = {
    val __obj = js.Dynamic.literal()
    if (byteLength != null) __obj.updateDynamic("byteLength")(byteLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[ByteLengthChunk]
  }
}

