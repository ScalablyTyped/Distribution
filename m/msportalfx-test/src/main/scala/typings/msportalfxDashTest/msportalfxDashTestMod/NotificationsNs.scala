package typings.msportalfxDashTest.msportalfxDashTestMod

import typings.msportalfxDashTest.msportalfxDashTestMod.NotificationsNs.Notification
import typings.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("msportalfx-test", "Notifications")
@js.native
object NotificationsNs extends js.Object {
  @js.native
  class Notification () extends PortalElement {
    def getDescription(): Promise[String] = js.native
    def getTitle(): Promise[String] = js.native
  }
  
  @js.native
  class NotificationsMenu () extends PortalElement {
    def waitForNewNotification(): Promise[Notification] = js.native
    def waitForNewNotification(title: String): Promise[Notification] = js.native
    def waitForNewNotification(title: String, description: String): Promise[Notification] = js.native
    def waitForNewNotification(title: String, description: String, timeout: Double): Promise[Notification] = js.native
  }
  
}

