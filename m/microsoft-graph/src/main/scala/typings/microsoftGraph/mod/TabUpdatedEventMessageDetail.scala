package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabUpdatedEventMessageDetail
  extends StObject
     with EventMessageDetail {
  
  // Initiator of the event.
  var initiator: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  // Unique identifier of the tab.
  var tabId: js.UndefOr[NullableOption[String]] = js.undefined
}
object TabUpdatedEventMessageDetail {
  
  inline def apply(): TabUpdatedEventMessageDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabUpdatedEventMessageDetail]
  }
  
  extension [Self <: TabUpdatedEventMessageDetail](x: Self) {
    
    inline def setInitiator(value: NullableOption[IdentitySet]): Self = StObject.set(x, "initiator", value.asInstanceOf[js.Any])
    
    inline def setInitiatorNull: Self = StObject.set(x, "initiator", null)
    
    inline def setInitiatorUndefined: Self = StObject.set(x, "initiator", js.undefined)
    
    inline def setTabId(value: NullableOption[String]): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    
    inline def setTabIdNull: Self = StObject.set(x, "tabId", null)
    
    inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
  }
}
