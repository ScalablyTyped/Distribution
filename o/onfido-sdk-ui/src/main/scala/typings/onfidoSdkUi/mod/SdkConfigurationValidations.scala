package typings.onfidoSdkUi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SdkConfigurationValidations extends StObject {
  
  var on_device: js.UndefOr[SdkConfigurationValidationsOnDevice] = js.undefined
}
object SdkConfigurationValidations {
  
  inline def apply(): SdkConfigurationValidations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SdkConfigurationValidations]
  }
  
  extension [Self <: SdkConfigurationValidations](x: Self) {
    
    inline def setOn_device(value: SdkConfigurationValidationsOnDevice): Self = StObject.set(x, "on_device", value.asInstanceOf[js.Any])
    
    inline def setOn_deviceUndefined: Self = StObject.set(x, "on_device", js.undefined)
  }
}
