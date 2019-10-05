package typings.naverDashWhale.whale.webNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.webNavigation.getAllFrames")
@js.native
object getAllFrames extends js.Object {
  def apply(
    details: typings.chrome.chrome.webNavigation.GetAllFrameDetails,
    callback: js.Function1[
      /* details */ js.Array[typings.chrome.chrome.webNavigation.GetAllFrameResultDetails] | Null, 
      Unit
    ]
  ): Unit = js.native
}

