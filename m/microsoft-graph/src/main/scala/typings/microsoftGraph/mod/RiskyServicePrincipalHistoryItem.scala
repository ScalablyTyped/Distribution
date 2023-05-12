package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RiskyServicePrincipalHistoryItem
  extends StObject
     with RiskyServicePrincipal {
  
  // The activity related to service principal risk level change.
  var activity: js.UndefOr[NullableOption[RiskServicePrincipalActivity]] = js.undefined
  
  // The identifier of the actor of the operation.
  var initiatedBy: js.UndefOr[NullableOption[String]] = js.undefined
}
object RiskyServicePrincipalHistoryItem {
  
  inline def apply(): RiskyServicePrincipalHistoryItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RiskyServicePrincipalHistoryItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RiskyServicePrincipalHistoryItem] (val x: Self) extends AnyVal {
    
    inline def setActivity(value: NullableOption[RiskServicePrincipalActivity]): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
    
    inline def setActivityNull: Self = StObject.set(x, "activity", null)
    
    inline def setActivityUndefined: Self = StObject.set(x, "activity", js.undefined)
    
    inline def setInitiatedBy(value: NullableOption[String]): Self = StObject.set(x, "initiatedBy", value.asInstanceOf[js.Any])
    
    inline def setInitiatedByNull: Self = StObject.set(x, "initiatedBy", null)
    
    inline def setInitiatedByUndefined: Self = StObject.set(x, "initiatedBy", js.undefined)
  }
}
