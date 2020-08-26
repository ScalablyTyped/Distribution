package typings.naverWhale.whale.webNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAllFrameResultDetails
  extends typings.chrome.chrome.webNavigation.GetFrameResultDetails {
  /** The ID of the frame. 0 indicates that this is the main frame; a positive value indicates the ID of a subframe. */
  var frameId: Double = js.native
  /** The ID of the process runs the renderer for this tab. */
  var processId: Double = js.native
}

object GetAllFrameResultDetails {
  @scala.inline
  def apply(errorOccurred: Boolean, frameId: Double, parentFrameId: Double, processId: Double, url: String): GetAllFrameResultDetails = {
    val __obj = js.Dynamic.literal(errorOccurred = errorOccurred.asInstanceOf[js.Any], frameId = frameId.asInstanceOf[js.Any], parentFrameId = parentFrameId.asInstanceOf[js.Any], processId = processId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAllFrameResultDetails]
  }
  @scala.inline
  implicit class GetAllFrameResultDetailsOps[Self <: GetAllFrameResultDetails] (val x: Self) extends AnyVal {
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
    def setFrameId(value: Double): Self = this.set("frameId", value.asInstanceOf[js.Any])
    @scala.inline
    def setProcessId(value: Double): Self = this.set("processId", value.asInstanceOf[js.Any])
  }
  
}

