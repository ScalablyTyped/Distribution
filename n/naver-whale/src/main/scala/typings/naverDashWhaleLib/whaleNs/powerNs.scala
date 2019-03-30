package typings
package naverDashWhaleLib.whaleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////
// Power
////////////////////
/**
  * Use the chrome.power API to override the system's power management features.
  * Permissions:  "power"
  * @since Chrome 27.
  */
@JSGlobal("chrome.power")
@js.native
object powerNs extends js.Object {
  def releaseKeepAwake(): scala.Unit = js.native
  def requestKeepAwake(level: java.lang.String): scala.Unit = js.native
}

