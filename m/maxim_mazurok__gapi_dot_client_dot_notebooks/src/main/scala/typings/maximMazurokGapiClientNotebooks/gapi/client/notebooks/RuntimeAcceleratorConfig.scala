package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuntimeAcceleratorConfig extends StObject {
  
  /** Count of cores of this accelerator. */
  var coreCount: js.UndefOr[String] = js.undefined
  
  /** Accelerator model. */
  var `type`: js.UndefOr[String] = js.undefined
}
object RuntimeAcceleratorConfig {
  
  inline def apply(): RuntimeAcceleratorConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuntimeAcceleratorConfig]
  }
  
  extension [Self <: RuntimeAcceleratorConfig](x: Self) {
    
    inline def setCoreCount(value: String): Self = StObject.set(x, "coreCount", value.asInstanceOf[js.Any])
    
    inline def setCoreCountUndefined: Self = StObject.set(x, "coreCount", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
