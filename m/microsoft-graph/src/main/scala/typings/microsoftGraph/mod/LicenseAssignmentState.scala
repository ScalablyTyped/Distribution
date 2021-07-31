package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LicenseAssignmentState extends StObject {
  
  var assignedByGroup: js.UndefOr[NullableOption[String]] = js.undefined
  
  var disabledPlans: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  var error: js.UndefOr[NullableOption[String]] = js.undefined
  
  var skuId: js.UndefOr[NullableOption[String]] = js.undefined
  
  var state: js.UndefOr[NullableOption[String]] = js.undefined
}
object LicenseAssignmentState {
  
  @scala.inline
  def apply(): LicenseAssignmentState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicenseAssignmentState]
  }
  
  @scala.inline
  implicit class LicenseAssignmentStateMutableBuilder[Self <: LicenseAssignmentState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignedByGroup(value: NullableOption[String]): Self = StObject.set(x, "assignedByGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignedByGroupNull: Self = StObject.set(x, "assignedByGroup", null)
    
    @scala.inline
    def setAssignedByGroupUndefined: Self = StObject.set(x, "assignedByGroup", js.undefined)
    
    @scala.inline
    def setDisabledPlans(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "disabledPlans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledPlansNull: Self = StObject.set(x, "disabledPlans", null)
    
    @scala.inline
    def setDisabledPlansUndefined: Self = StObject.set(x, "disabledPlans", js.undefined)
    
    @scala.inline
    def setDisabledPlansVarargs(value: String*): Self = StObject.set(x, "disabledPlans", js.Array(value :_*))
    
    @scala.inline
    def setError(value: NullableOption[String]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorNull: Self = StObject.set(x, "error", null)
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setSkuId(value: NullableOption[String]): Self = StObject.set(x, "skuId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkuIdNull: Self = StObject.set(x, "skuId", null)
    
    @scala.inline
    def setSkuIdUndefined: Self = StObject.set(x, "skuId", js.undefined)
    
    @scala.inline
    def setState(value: NullableOption[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateNull: Self = StObject.set(x, "state", null)
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
