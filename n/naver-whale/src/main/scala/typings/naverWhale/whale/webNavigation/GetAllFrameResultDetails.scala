package typings.naverWhale.whale.webNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAllFrameResultDetails
  extends typings.chrome.chrome.webNavigation.GetFrameResultDetails {
  /** The ID of the frame. 0 indicates that this is the main frame; a positive value indicates the ID of a subframe. */
  var frameId: Double
  /** The ID of the process runs the renderer for this tab. */
  var processId: Double
}

object GetAllFrameResultDetails {
  @scala.inline
  def apply(errorOccurred: Boolean, frameId: Double, parentFrameId: Double, processId: Double, url: String): GetAllFrameResultDetails = {
    val __obj = js.Dynamic.literal(errorOccurred = errorOccurred.asInstanceOf[js.Any], frameId = frameId.asInstanceOf[js.Any], parentFrameId = parentFrameId.asInstanceOf[js.Any], processId = processId.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetAllFrameResultDetails]
  }
}

