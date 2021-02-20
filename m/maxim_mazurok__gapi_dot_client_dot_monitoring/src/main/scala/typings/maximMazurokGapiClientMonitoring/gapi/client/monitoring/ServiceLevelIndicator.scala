package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceLevelIndicator extends StObject {
  
  /** Basic SLI on a well-known service type. */
  var basicSli: js.UndefOr[BasicSli] = js.native
  
  /** Request-based SLIs */
  var requestBased: js.UndefOr[RequestBasedSli] = js.native
  
  /** Windows-based SLIs */
  var windowsBased: js.UndefOr[WindowsBasedSli] = js.native
}
object ServiceLevelIndicator {
  
  @scala.inline
  def apply(): ServiceLevelIndicator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceLevelIndicator]
  }
  
  @scala.inline
  implicit class ServiceLevelIndicatorMutableBuilder[Self <: ServiceLevelIndicator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasicSli(value: BasicSli): Self = StObject.set(x, "basicSli", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasicSliUndefined: Self = StObject.set(x, "basicSli", js.undefined)
    
    @scala.inline
    def setRequestBased(value: RequestBasedSli): Self = StObject.set(x, "requestBased", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBasedUndefined: Self = StObject.set(x, "requestBased", js.undefined)
    
    @scala.inline
    def setWindowsBased(value: WindowsBasedSli): Self = StObject.set(x, "windowsBased", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowsBasedUndefined: Self = StObject.set(x, "windowsBased", js.undefined)
  }
}
