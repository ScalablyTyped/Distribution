package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InAppPurchasesFound extends StObject {
  
  /** The total number of in-app purchases flows explored: how many times the robo tries to buy a SKU. */
  var inAppPurchasesFlowsExplored: js.UndefOr[Double] = js.undefined
  
  /** The total number of in-app purchases flows started. */
  var inAppPurchasesFlowsStarted: js.UndefOr[Double] = js.undefined
}
object InAppPurchasesFound {
  
  inline def apply(): InAppPurchasesFound = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InAppPurchasesFound]
  }
  
  extension [Self <: InAppPurchasesFound](x: Self) {
    
    inline def setInAppPurchasesFlowsExplored(value: Double): Self = StObject.set(x, "inAppPurchasesFlowsExplored", value.asInstanceOf[js.Any])
    
    inline def setInAppPurchasesFlowsExploredUndefined: Self = StObject.set(x, "inAppPurchasesFlowsExplored", js.undefined)
    
    inline def setInAppPurchasesFlowsStarted(value: Double): Self = StObject.set(x, "inAppPurchasesFlowsStarted", value.asInstanceOf[js.Any])
    
    inline def setInAppPurchasesFlowsStartedUndefined: Self = StObject.set(x, "inAppPurchasesFlowsStarted", js.undefined)
  }
}
