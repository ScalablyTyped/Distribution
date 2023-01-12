package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LicenseAssignmentState extends StObject {
  
  var assignedByGroup: js.UndefOr[NullableOption[String]] = js.undefined
  
  var disabledPlans: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  var error: js.UndefOr[NullableOption[String]] = js.undefined
  
  var lastUpdatedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  var skuId: js.UndefOr[NullableOption[String]] = js.undefined
  
  var state: js.UndefOr[NullableOption[String]] = js.undefined
}
object LicenseAssignmentState {
  
  inline def apply(): LicenseAssignmentState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicenseAssignmentState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LicenseAssignmentState] (val x: Self) extends AnyVal {
    
    inline def setAssignedByGroup(value: NullableOption[String]): Self = StObject.set(x, "assignedByGroup", value.asInstanceOf[js.Any])
    
    inline def setAssignedByGroupNull: Self = StObject.set(x, "assignedByGroup", null)
    
    inline def setAssignedByGroupUndefined: Self = StObject.set(x, "assignedByGroup", js.undefined)
    
    inline def setDisabledPlans(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "disabledPlans", value.asInstanceOf[js.Any])
    
    inline def setDisabledPlansNull: Self = StObject.set(x, "disabledPlans", null)
    
    inline def setDisabledPlansUndefined: Self = StObject.set(x, "disabledPlans", js.undefined)
    
    inline def setDisabledPlansVarargs(value: String*): Self = StObject.set(x, "disabledPlans", js.Array(value*))
    
    inline def setError(value: NullableOption[String]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorNull: Self = StObject.set(x, "error", null)
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setLastUpdatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateTimeNull: Self = StObject.set(x, "lastUpdatedDateTime", null)
    
    inline def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "lastUpdatedDateTime", js.undefined)
    
    inline def setSkuId(value: NullableOption[String]): Self = StObject.set(x, "skuId", value.asInstanceOf[js.Any])
    
    inline def setSkuIdNull: Self = StObject.set(x, "skuId", null)
    
    inline def setSkuIdUndefined: Self = StObject.set(x, "skuId", js.undefined)
    
    inline def setState(value: NullableOption[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
