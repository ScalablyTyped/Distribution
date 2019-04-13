package typings
package msportalfxDashTestLib.msportalfxDashTestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("msportalfx-test", "Notifications")
@js.native
object NotificationsNs extends js.Object {
  @js.native
  class Notification ()
    extends msportalfxDashTestLib.msportalfxDashTestMod.PortalElement {
    def getDescription(): qLib.qMod.Promise[java.lang.String] = js.native
    def getTitle(): qLib.qMod.Promise[java.lang.String] = js.native
  }
  
  @js.native
  class NotificationsMenu ()
    extends msportalfxDashTestLib.msportalfxDashTestMod.PortalElement {
    def waitForNewNotification(): qLib.qMod.Promise[Notification] = js.native
    def waitForNewNotification(title: java.lang.String): qLib.qMod.Promise[Notification] = js.native
    def waitForNewNotification(title: java.lang.String, description: java.lang.String): qLib.qMod.Promise[Notification] = js.native
    def waitForNewNotification(title: java.lang.String, description: java.lang.String, timeout: scala.Double): qLib.qMod.Promise[Notification] = js.native
  }
  
}

