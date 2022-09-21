package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LicenseUnitsDetail extends StObject {
  
  // The number of units that are enabled for the active subscription of the service SKU.
  var enabled: js.UndefOr[NullableOption[Double]] = js.undefined
  
  /**
    * The number of units that are suspended because the subscription of the service SKU has been cancelled. The units cannot
    * be assigned but can still be reactivated before they are deleted.
    */
  var suspended: js.UndefOr[NullableOption[Double]] = js.undefined
  
  /**
    * The number of units that are in warning status. When the subscription of the service SKU has expired, the customer has
    * a grace period to renew their subscription before it is cancelled (moved to a suspended state).
    */
  var warning: js.UndefOr[NullableOption[Double]] = js.undefined
}
object LicenseUnitsDetail {
  
  inline def apply(): LicenseUnitsDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicenseUnitsDetail]
  }
  
  extension [Self <: LicenseUnitsDetail](x: Self) {
    
    inline def setEnabled(value: NullableOption[Double]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledNull: Self = StObject.set(x, "enabled", null)
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setSuspended(value: NullableOption[Double]): Self = StObject.set(x, "suspended", value.asInstanceOf[js.Any])
    
    inline def setSuspendedNull: Self = StObject.set(x, "suspended", null)
    
    inline def setSuspendedUndefined: Self = StObject.set(x, "suspended", js.undefined)
    
    inline def setWarning(value: NullableOption[Double]): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningNull: Self = StObject.set(x, "warning", null)
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
