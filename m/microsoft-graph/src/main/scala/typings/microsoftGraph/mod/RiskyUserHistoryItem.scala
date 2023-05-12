package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RiskyUserHistoryItem
  extends StObject
     with RiskyUser {
  
  // The activity related to user risk level change.
  var activity: js.UndefOr[NullableOption[RiskUserActivity]] = js.undefined
  
  // The ID of actor that does the operation.
  var initiatedBy: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The ID of the user.
  var userId: js.UndefOr[NullableOption[String]] = js.undefined
}
object RiskyUserHistoryItem {
  
  inline def apply(): RiskyUserHistoryItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RiskyUserHistoryItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RiskyUserHistoryItem] (val x: Self) extends AnyVal {
    
    inline def setActivity(value: NullableOption[RiskUserActivity]): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
    
    inline def setActivityNull: Self = StObject.set(x, "activity", null)
    
    inline def setActivityUndefined: Self = StObject.set(x, "activity", js.undefined)
    
    inline def setInitiatedBy(value: NullableOption[String]): Self = StObject.set(x, "initiatedBy", value.asInstanceOf[js.Any])
    
    inline def setInitiatedByNull: Self = StObject.set(x, "initiatedBy", null)
    
    inline def setInitiatedByUndefined: Self = StObject.set(x, "initiatedBy", js.undefined)
    
    inline def setUserId(value: NullableOption[String]): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdNull: Self = StObject.set(x, "userId", null)
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
