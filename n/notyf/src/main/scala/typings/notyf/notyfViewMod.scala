package typings.notyf

import typings.notyf.notyfModelsMod.NotyfArrayEvent
import typings.notyf.notyfModelsMod.NotyfEventCallback
import typings.notyf.notyfModelsMod.NotyfNotification
import typings.notyf.notyfOptionsMod.NotyfEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notyfViewMod {
  
  @JSImport("notyf/notyf.view", "NotyfView")
  @js.native
  open class NotyfView () extends StObject {
    
    /* private */ val X_POSITION_FLEX_MAP: Any = js.native
    
    /* private */ val Y_POSITION_FLEX_MAP: Any = js.native
    
    /**
      * Announces a message to screenreaders.
      */
    /* private */ var _announce: Any = js.native
    
    /* private */ var _buildNotificationCard: Any = js.native
    
    /**
      * Creates an invisible container which will announce the notyfs to
      * screen readers
      */
    /* private */ var _createA11yContainer: Any = js.native
    
    /* private */ var _createHTMLElement: Any = js.native
    
    /**
      * Determine which animationend event is supported
      */
    /* private */ var _getAnimationEndEventName: Any = js.native
    
    /* private */ var _popRenderedNotification: Any = js.native
    
    /* private */ var _renderNotification: Any = js.native
    
    var a11yContainer: HTMLElement = js.native
    
    def addNotification(notification: NotyfNotification): Unit = js.native
    
    /* private */ var adjustContainerAlignment: Any = js.native
    
    var animationEndEventName: String = js.native
    
    var container: HTMLElement = js.native
    
    /* private */ var events: Any = js.native
    
    /* private */ var getXPosition: Any = js.native
    
    /* private */ var getYPosition: Any = js.native
    
    /* private */ var notifications: Any = js.native
    
    def on(event: NotyfEvent, cb: NotyfEventCallback): Unit = js.native
    
    def removeNotification(notification: NotyfNotification): Unit = js.native
    
    def update(notification: NotyfNotification, `type`: NotyfArrayEvent): Unit = js.native
  }
}
