package typings
package msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.NotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotificationsMenu
  extends msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.PortalElement {
  def waitForNewNotification(): qLib.qMod.QNs.Promise[Notification] = js.native
  def waitForNewNotification(title: java.lang.String): qLib.qMod.QNs.Promise[Notification] = js.native
  def waitForNewNotification(title: java.lang.String, description: java.lang.String): qLib.qMod.QNs.Promise[Notification] = js.native
  def waitForNewNotification(title: java.lang.String, description: java.lang.String, timeout: scala.Double): qLib.qMod.QNs.Promise[Notification] = js.native
}

