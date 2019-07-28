package typings.naverDashWhale.whaleNs.devtoolsNs.networkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("whale.devtools.network")
@js.native
object ^ extends js.Object {
  var onNavigated: typings.chrome.chromeNs.devtoolsNs.networkNs.NavigatedEvent = js.native
  var onRequestFinished: typings.chrome.chromeNs.devtoolsNs.networkNs.RequestFinishedEvent = js.native
  def getHAR(callback: js.Function1[/* harLog */ js.Object, Unit]): Unit = js.native
}

