package typings.officeJs.Office

import typings.officeJs.Office.MailboxEnums.InfobarActionType
import typings.officeJs.Office.MailboxEnums.InfobarType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides additional details about the notification message that raised the `Office.EventType.InfobarClicked` event.
  *
  * @remarks
  * [Api set: Mailbox 1.10]
  */
trait InfobarDetails extends StObject {
  
  /**
    * The action type. Currently, "Dismiss" is the only supported action.
    *
    * @remarks
    * [Api set: Mailbox 1.10]
    */
  var actionType: InfobarActionType
  
  /**
    * The notification type.
    *
    * @remarks
    * [Api set: Mailbox 1.10]
    */
  var infobarType: InfobarType
}
object InfobarDetails {
  
  inline def apply(actionType: InfobarActionType, infobarType: InfobarType): InfobarDetails = {
    val __obj = js.Dynamic.literal(actionType = actionType.asInstanceOf[js.Any], infobarType = infobarType.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfobarDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InfobarDetails] (val x: Self) extends AnyVal {
    
    inline def setActionType(value: InfobarActionType): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
    
    inline def setInfobarType(value: InfobarType): Self = StObject.set(x, "infobarType", value.asInstanceOf[js.Any])
  }
}
