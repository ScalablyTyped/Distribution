package typings.naverDashWhale.whaleNs.webNavigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.webNavigation")
@js.native
object ^ extends js.Object {
  var onBeforeNavigate: typings.chrome.chromeNs.webNavigationNs.WebNavigationParentedEvent = js.native
  var onCommitted: typings.chrome.chromeNs.webNavigationNs.WebNavigationTransitionalEvent = js.native
  var onCompleted: typings.chrome.chromeNs.webNavigationNs.WebNavigationFramedEvent = js.native
  var onCreatedNavigationTarget: typings.chrome.chromeNs.webNavigationNs.WebNavigationSourceEvent = js.native
  var onDOMContentLoaded: typings.chrome.chromeNs.webNavigationNs.WebNavigationFramedEvent = js.native
  var onErrorOccurred: typings.chrome.chromeNs.webNavigationNs.WebNavigationFramedErrorEvent = js.native
  var onHistoryStateUpdated: typings.chrome.chromeNs.webNavigationNs.WebNavigationTransitionalEvent = js.native
  var onReferenceFragmentUpdated: typings.chrome.chromeNs.webNavigationNs.WebNavigationTransitionalEvent = js.native
  var onTabReplaced: typings.chrome.chromeNs.webNavigationNs.WebNavigationReplacementEvent = js.native
  def getAllFrames(
    details: typings.chrome.chromeNs.webNavigationNs.GetAllFrameDetails,
    callback: js.Function1[
      /* details */ js.Array[typings.chrome.chromeNs.webNavigationNs.GetAllFrameResultDetails] | Null, 
      Unit
    ]
  ): Unit = js.native
  def getFrame(
    details: typings.chrome.chromeNs.webNavigationNs.GetFrameDetails,
    callback: js.Function1[
      /* details */ typings.chrome.chromeNs.webNavigationNs.GetFrameResultDetails | Null, 
      Unit
    ]
  ): Unit = js.native
}

