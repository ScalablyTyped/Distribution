package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LicenseDetails
  extends StObject
     with Entity {
  
  // Information about the service plans assigned with the license. Read-only, Not nullable
  var servicePlans: js.UndefOr[js.Array[ServicePlanInfo]] = js.undefined
  
  /**
    * Unique identifier (GUID) for the service SKU. Equal to the skuId property on the related SubscribedSku object.
    * Read-only
    */
  var skuId: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Unique SKU display name. Equal to the skuPartNumber on the related SubscribedSku object; for example: 'AAD_Premium'.
    * Read-only
    */
  var skuPartNumber: js.UndefOr[NullableOption[String]] = js.undefined
}
object LicenseDetails {
  
  @scala.inline
  def apply(): LicenseDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicenseDetails]
  }
  
  @scala.inline
  implicit class LicenseDetailsMutableBuilder[Self <: LicenseDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServicePlans(value: js.Array[ServicePlanInfo]): Self = StObject.set(x, "servicePlans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicePlansUndefined: Self = StObject.set(x, "servicePlans", js.undefined)
    
    @scala.inline
    def setServicePlansVarargs(value: ServicePlanInfo*): Self = StObject.set(x, "servicePlans", js.Array(value :_*))
    
    @scala.inline
    def setSkuId(value: NullableOption[String]): Self = StObject.set(x, "skuId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkuIdNull: Self = StObject.set(x, "skuId", null)
    
    @scala.inline
    def setSkuIdUndefined: Self = StObject.set(x, "skuId", js.undefined)
    
    @scala.inline
    def setSkuPartNumber(value: NullableOption[String]): Self = StObject.set(x, "skuPartNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkuPartNumberNull: Self = StObject.set(x, "skuPartNumber", null)
    
    @scala.inline
    def setSkuPartNumberUndefined: Self = StObject.set(x, "skuPartNumber", js.undefined)
  }
}
