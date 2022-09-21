package typings.officeJs.Office

import typings.officeJs.officeJsStrings.olkInfobarClicked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides basic details about the notification message that raised the `Office.EventType.InfobarClicked` event.
  *
  * @remarks
  * [Api set: Mailbox 1.10]
  */
trait InfobarClickedEventArgs extends StObject {
  
  /**
    * Gets additional details about the notification message.
    *
    * @remarks
    * [Api set: Mailbox 1.10]
    */
  var infobarDetails: InfobarDetails
  
  /**
    * Gets the type of the event. For details, refer to {@link https://learn.microsoft.com/javascript/api/office/office.eventtype | Office.EventType}.
    *
    * @remarks
    * [Api set: Mailbox 1.10]
    */
  var `type`: olkInfobarClicked
}
object InfobarClickedEventArgs {
  
  inline def apply(infobarDetails: InfobarDetails): InfobarClickedEventArgs = {
    val __obj = js.Dynamic.literal(infobarDetails = infobarDetails.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("olkInfobarClicked")
    __obj.asInstanceOf[InfobarClickedEventArgs]
  }
  
  extension [Self <: InfobarClickedEventArgs](x: Self) {
    
    inline def setInfobarDetails(value: InfobarDetails): Self = StObject.set(x, "infobarDetails", value.asInstanceOf[js.Any])
    
    inline def setType(value: olkInfobarClicked): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
