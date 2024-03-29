package typings.openfin

import typings.openfin.anon.Click
import typings.openfin.baseMod.Base
import typings.openfin.baseMod.EmitterBase
import typings.openfin.identityMod.Identity
import typings.openfin.notificationsMod.NotificationEvents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationMod {
  
  @JSImport("openfin/_v2/api/notification/notification", JSImport.Default)
  @js.native
  open class default () extends NotificationModule
  
  @JSImport("openfin/_v2/api/notification/notification", "_Notification")
  @js.native
  open class Notification protected () extends EmitterBase[NotificationEvents] {
    def this(wire: typings.openfin.transportMod.default, options: NotificationOptions) = this()
    
    /**
      * Closes the notification
      * @return {Promise.<void>}
      * @tutorial Notification.close
      */
    def close(): js.Promise[Unit] = js.native
    
    /* protected */ def generalListener(msg: Any): Unit = js.native
    
    /* private */ var listenerList: Any = js.native
    
    var message: Any = js.native
    
    /* protected */ var notificationId: Double = js.native
    
    /* protected */ var options: NotificationOptions = js.native
    
    /**
      * Sends a message to the notification.
      * @param { any } message The message to be sent to the notification.
      * Can be either a primitive data type (string, number, or boolean)
      * or composite data type (object, array) that is composed of other
      * primitive or composite data types
      * @return {Promise.<void>}
      * @tutorial Notification.sendMessage
      */
    def sendMessage(message: Any): js.Promise[Unit] = js.native
    
    /**
      * Invoked when the notification is shown
      * @return {Promise.<void>}
      * @tutorial Notification.show
      */
    def show(): js.Promise[Unit] = js.native
    
    var timeout: Double | String = js.native
    
    /* private */ var unhookAllListeners: Any = js.native
    
    var url: String = js.native
  }
  
  @JSImport("openfin/_v2/api/notification/notification", "NotificationOptions")
  @js.native
  open class NotificationOptions protected () extends StObject {
    def this(options: Any, identity: Identity, notificationId: Double) = this()
    
    var ignoreMouseOver: Boolean = js.native
    
    var message: String = js.native
    
    var notificationId: Double = js.native
    
    var timeout: String | Double = js.native
    
    var url: String = js.native
    
    var uuidOfProxiedApp: String = js.native
  }
  
  trait NotificationCallback extends StObject {
    
    var message: js.UndefOr[Any] = js.undefined
  }
  object NotificationCallback {
    
    inline def apply(): NotificationCallback = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationCallback]
    }
    
    extension [Self <: NotificationCallback](x: Self) {
      
      inline def setMessage(value: Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
  
  @js.native
  trait NotificationModule extends Base {
    
    /**
      * Creates a new Notification.
      * @param { object } options
      * @return {_Notification}
      * @tutorial Notification.create
      * @static
      */
    def create(options: Any): Notification = js.native
    
    var events: Click = js.native
    
    /* private */ var genNoteId: Any = js.native
    
    /* private */ var nextNoteId: Any = js.native
  }
}
