package typings.node.utilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncodeIntoResult extends js.Object {
  /**
    * The read Unicode code units of input.
    */
  var read: Double = js.native
  /**
    * The written UTF-8 bytes of output.
    */
  var written: Double = js.native
}

object EncodeIntoResult {
  @scala.inline
  def apply(read: Double, written: Double): EncodeIntoResult = {
    val __obj = js.Dynamic.literal(read = read.asInstanceOf[js.Any], written = written.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodeIntoResult]
  }
  @scala.inline
  implicit class EncodeIntoResultOps[Self <: EncodeIntoResult] (val x: Self) extends AnyVal {
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
    def setRead(value: Double): Self = this.set("read", value.asInstanceOf[js.Any])
    @scala.inline
    def setWritten(value: Double): Self = this.set("written", value.asInstanceOf[js.Any])
  }
  
}

