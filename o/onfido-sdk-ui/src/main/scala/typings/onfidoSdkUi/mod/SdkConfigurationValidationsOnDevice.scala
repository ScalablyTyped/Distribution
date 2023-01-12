package typings.onfidoSdkUi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SdkConfigurationValidationsOnDevice extends StObject {
  
  var blur: js.UndefOr[OnDeviceValidation] = js.undefined
}
object SdkConfigurationValidationsOnDevice {
  
  inline def apply(): SdkConfigurationValidationsOnDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SdkConfigurationValidationsOnDevice]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SdkConfigurationValidationsOnDevice] (val x: Self) extends AnyVal {
    
    inline def setBlur(value: OnDeviceValidation): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
    
    inline def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
  }
}
