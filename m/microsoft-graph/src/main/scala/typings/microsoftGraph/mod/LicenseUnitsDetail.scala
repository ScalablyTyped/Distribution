package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LicenseUnitsDetail extends StObject {
  
  // The number of units that are enabled.
  var enabled: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The number of units that are suspended.
  var suspended: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The number of units that are in warning status.
  var warning: js.UndefOr[NullableOption[Double]] = js.undefined
}
object LicenseUnitsDetail {
  
  @scala.inline
  def apply(): LicenseUnitsDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicenseUnitsDetail]
  }
  
  @scala.inline
  implicit class LicenseUnitsDetailMutableBuilder[Self <: LicenseUnitsDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: NullableOption[Double]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledNull: Self = StObject.set(x, "enabled", null)
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setSuspended(value: NullableOption[Double]): Self = StObject.set(x, "suspended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuspendedNull: Self = StObject.set(x, "suspended", null)
    
    @scala.inline
    def setSuspendedUndefined: Self = StObject.set(x, "suspended", js.undefined)
    
    @scala.inline
    def setWarning(value: NullableOption[Double]): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningNull: Self = StObject.set(x, "warning", null)
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
