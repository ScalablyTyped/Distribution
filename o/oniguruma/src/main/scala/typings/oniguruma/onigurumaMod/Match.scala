package typings.oniguruma.onigurumaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Match extends js.Object {
  /** An array holding all of the captures (full match + capturing groups) */
  var captureIndices: js.Array[CaptureIndex]
  /** The index of the best pattern match */
  var index: Double
}

object Match {
  @scala.inline
  def apply(captureIndices: js.Array[CaptureIndex], index: Double): Match = {
    val __obj = js.Dynamic.literal(captureIndices = captureIndices, index = index)
  
    __obj.asInstanceOf[Match]
  }
}

