package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssignedLicense extends StObject {
  
  // A collection of the unique identifiers for plans that have been disabled.
  var disabledPlans: js.UndefOr[js.Array[String]] = js.undefined
  
  // The unique identifier for the SKU.
  var skuId: js.UndefOr[NullableOption[String]] = js.undefined
}
object AssignedLicense {
  
  inline def apply(): AssignedLicense = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssignedLicense]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssignedLicense] (val x: Self) extends AnyVal {
    
    inline def setDisabledPlans(value: js.Array[String]): Self = StObject.set(x, "disabledPlans", value.asInstanceOf[js.Any])
    
    inline def setDisabledPlansUndefined: Self = StObject.set(x, "disabledPlans", js.undefined)
    
    inline def setDisabledPlansVarargs(value: String*): Self = StObject.set(x, "disabledPlans", js.Array(value*))
    
    inline def setSkuId(value: NullableOption[String]): Self = StObject.set(x, "skuId", value.asInstanceOf[js.Any])
    
    inline def setSkuIdNull: Self = StObject.set(x, "skuId", null)
    
    inline def setSkuIdUndefined: Self = StObject.set(x, "skuId", js.undefined)
  }
}
