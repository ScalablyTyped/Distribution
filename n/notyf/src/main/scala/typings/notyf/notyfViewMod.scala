package typings.notyf

import typings.notyf.notyfModelsMod.NotyfArrayEvent
import typings.notyf.notyfModelsMod.NotyfNotification
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("notyf/notyf.view", JSImport.Namespace)
@js.native
object notyfViewMod extends js.Object {
  @js.native
  class NotyfView () extends js.Object {
    /**
      * Announces a message to screenreaders.
      */
    var _announce: js.Any = js.native
    var _buildNotificationCard: js.Any = js.native
    /**
      * Creates an invisible container which will announce the notyfs to
      * screen readers
      */
    var _createA11yContainer: js.Any = js.native
    var _createHTLMElement: js.Any = js.native
    /**
      * Determine which animationend event is supported
      */
    var _getAnimationEndEventName: js.Any = js.native
    var _popRenderedNotification: js.Any = js.native
    var _renderNotification: js.Any = js.native
    var a11yContainer: HTMLElement = js.native
    var animationEndEventName: String = js.native
    var container: HTMLElement = js.native
    var notifications: js.Any = js.native
    def addNotification(notification: NotyfNotification): Unit = js.native
    def removeNotification(notification: NotyfNotification): Unit = js.native
    def update(notification: NotyfNotification, `type`: NotyfArrayEvent): Unit = js.native
  }
  
}

