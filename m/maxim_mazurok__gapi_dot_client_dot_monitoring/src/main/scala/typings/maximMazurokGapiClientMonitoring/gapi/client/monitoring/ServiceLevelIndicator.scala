package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceLevelIndicator extends StObject {
  
  /** Basic SLI on a well-known service type. */
  var basicSli: js.UndefOr[BasicSli] = js.undefined
  
  /** Request-based SLIs */
  var requestBased: js.UndefOr[RequestBasedSli] = js.undefined
  
  /** Windows-based SLIs */
  var windowsBased: js.UndefOr[WindowsBasedSli] = js.undefined
}
object ServiceLevelIndicator {
  
  inline def apply(): ServiceLevelIndicator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceLevelIndicator]
  }
  
  extension [Self <: ServiceLevelIndicator](x: Self) {
    
    inline def setBasicSli(value: BasicSli): Self = StObject.set(x, "basicSli", value.asInstanceOf[js.Any])
    
    inline def setBasicSliUndefined: Self = StObject.set(x, "basicSli", js.undefined)
    
    inline def setRequestBased(value: RequestBasedSli): Self = StObject.set(x, "requestBased", value.asInstanceOf[js.Any])
    
    inline def setRequestBasedUndefined: Self = StObject.set(x, "requestBased", js.undefined)
    
    inline def setWindowsBased(value: WindowsBasedSli): Self = StObject.set(x, "windowsBased", value.asInstanceOf[js.Any])
    
    inline def setWindowsBasedUndefined: Self = StObject.set(x, "windowsBased", js.undefined)
  }
}
