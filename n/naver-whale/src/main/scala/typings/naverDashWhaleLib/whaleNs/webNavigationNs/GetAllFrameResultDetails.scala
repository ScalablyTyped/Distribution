package typings
package naverDashWhaleLib.whaleNs.webNavigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAllFrameResultDetails
  extends chromeLib.chromeNs.webNavigationNs.GetFrameResultDetails {
  /** The ID of the frame. 0 indicates that this is the main frame; a positive value indicates the ID of a subframe. */
  var frameId: scala.Double
  /** The ID of the process runs the renderer for this tab. */
  var processId: scala.Double
}

object GetAllFrameResultDetails {
  @scala.inline
  def apply(
    errorOccurred: scala.Boolean,
    frameId: scala.Double,
    parentFrameId: scala.Double,
    processId: scala.Double,
    url: java.lang.String
  ): GetAllFrameResultDetails = {
    val __obj = js.Dynamic.literal(errorOccurred = errorOccurred, frameId = frameId, parentFrameId = parentFrameId, processId = processId, url = url)
  
    __obj.asInstanceOf[GetAllFrameResultDetails]
  }
}

