package typings.officeJs.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides information about the message from the parent page that raised the `DialogParentMessageReceived` event.
  *
  * To add an event handler for the `DialogParentMessageReceived` event, use the `addHandlerAsync` method of the
  * {@link Office.UI} object.
  *
  */
trait DialogParentMessageReceivedEventArgs extends StObject {
  
  /**
    * Gets the content of the message sent from the parent page, which can be any string or stringified data.
    */
  var message: String
  
  /**
    * Gets the domain of the parent page that called `Dialog.messageChild`. 
    * 
    * @remarks
    * 
    * **Requirement set**: {@link https://learn.microsoft.com/javascript/api/requirement-sets/common/dialog-origin-requirement-sets | DialogOrigin 1.1}.
    * The property is `undefined` on clients that do not support this requirement set.
    */
  var origin: js.UndefOr[String] = js.undefined
  
  /**
    * Gets an {@link Office.EventType} enumeration value that identifies the kind of event that was raised.
    */
  var `type`: EventType
}
object DialogParentMessageReceivedEventArgs {
  
  inline def apply(message: String, `type`: EventType): DialogParentMessageReceivedEventArgs = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogParentMessageReceivedEventArgs]
  }
  
  extension [Self <: DialogParentMessageReceivedEventArgs](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setType(value: EventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
