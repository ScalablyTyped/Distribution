package typings.onfidoSdkUi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionalConfigurations extends StObject {
  
  var disableAnalytics: js.UndefOr[Boolean] = js.undefined
  
  var disableAnalyticsCookies: js.UndefOr[Boolean] = js.undefined
  
  var mobileFlow: js.UndefOr[Boolean] = js.undefined
  
  var roomId: js.UndefOr[String] = js.undefined
  
  var tearDown: js.UndefOr[Boolean] = js.undefined
  
  var useMemoryHistory: js.UndefOr[Boolean] = js.undefined
  
  var useWorkflow: js.UndefOr[Boolean] = js.undefined
}
object FunctionalConfigurations {
  
  inline def apply(): FunctionalConfigurations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionalConfigurations]
  }
  
  extension [Self <: FunctionalConfigurations](x: Self) {
    
    inline def setDisableAnalytics(value: Boolean): Self = StObject.set(x, "disableAnalytics", value.asInstanceOf[js.Any])
    
    inline def setDisableAnalyticsCookies(value: Boolean): Self = StObject.set(x, "disableAnalyticsCookies", value.asInstanceOf[js.Any])
    
    inline def setDisableAnalyticsCookiesUndefined: Self = StObject.set(x, "disableAnalyticsCookies", js.undefined)
    
    inline def setDisableAnalyticsUndefined: Self = StObject.set(x, "disableAnalytics", js.undefined)
    
    inline def setMobileFlow(value: Boolean): Self = StObject.set(x, "mobileFlow", value.asInstanceOf[js.Any])
    
    inline def setMobileFlowUndefined: Self = StObject.set(x, "mobileFlow", js.undefined)
    
    inline def setRoomId(value: String): Self = StObject.set(x, "roomId", value.asInstanceOf[js.Any])
    
    inline def setRoomIdUndefined: Self = StObject.set(x, "roomId", js.undefined)
    
    inline def setTearDown(value: Boolean): Self = StObject.set(x, "tearDown", value.asInstanceOf[js.Any])
    
    inline def setTearDownUndefined: Self = StObject.set(x, "tearDown", js.undefined)
    
    inline def setUseMemoryHistory(value: Boolean): Self = StObject.set(x, "useMemoryHistory", value.asInstanceOf[js.Any])
    
    inline def setUseMemoryHistoryUndefined: Self = StObject.set(x, "useMemoryHistory", js.undefined)
    
    inline def setUseWorkflow(value: Boolean): Self = StObject.set(x, "useWorkflow", value.asInstanceOf[js.Any])
    
    inline def setUseWorkflowUndefined: Self = StObject.set(x, "useWorkflow", js.undefined)
  }
}
