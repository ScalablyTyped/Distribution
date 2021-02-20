package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleMonitoringV3Range extends StObject {
  
  /** Range maximum. */
  var max: js.UndefOr[Double] = js.native
  
  /** Range minimum. */
  var min: js.UndefOr[Double] = js.native
}
object GoogleMonitoringV3Range {
  
  @scala.inline
  def apply(): GoogleMonitoringV3Range = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleMonitoringV3Range]
  }
  
  @scala.inline
  implicit class GoogleMonitoringV3RangeMutableBuilder[Self <: GoogleMonitoringV3Range] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
