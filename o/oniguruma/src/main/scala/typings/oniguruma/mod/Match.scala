package typings.oniguruma.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Match extends js.Object {
  /** An array holding all of the captures (full match + capturing groups) */
  var captureIndices: js.Array[CaptureIndex] = js.native
  /** The index of the best pattern match */
  var index: Double = js.native
}

object Match {
  @scala.inline
  def apply(captureIndices: js.Array[CaptureIndex], index: Double): Match = {
    val __obj = js.Dynamic.literal(captureIndices = captureIndices.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Match]
  }
  @scala.inline
  implicit class MatchOps[Self <: Match] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCaptureIndicesVarargs(value: CaptureIndex*): Self = this.set("captureIndices", js.Array(value :_*))
    @scala.inline
    def setCaptureIndices(value: js.Array[CaptureIndex]): Self = this.set("captureIndices", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
  }
  
}

