package typings
package naverDashWhaleLib.whaleNs.devtoolsNs.networkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("whale.devtools.network")
@js.native
object ^ extends js.Object {
  var onNavigated: chromeLib.chromeNs.devtoolsNs.networkNs.NavigatedEvent = js.native
  var onRequestFinished: chromeLib.chromeNs.devtoolsNs.networkNs.RequestFinishedEvent = js.native
  def getHAR(callback: js.Function1[/* harLog */ js.Object, scala.Unit]): scala.Unit = js.native
}

