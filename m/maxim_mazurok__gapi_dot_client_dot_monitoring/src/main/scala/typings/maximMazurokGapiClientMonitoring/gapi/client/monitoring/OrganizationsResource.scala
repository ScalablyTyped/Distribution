package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationsResource extends StObject {
  
  var timeSeries: TimeSeriesResource
}
object OrganizationsResource {
  
  inline def apply(timeSeries: TimeSeriesResource): OrganizationsResource = {
    val __obj = js.Dynamic.literal(timeSeries = timeSeries.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationsResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrganizationsResource] (val x: Self) extends AnyVal {
    
    inline def setTimeSeries(value: TimeSeriesResource): Self = StObject.set(x, "timeSeries", value.asInstanceOf[js.Any])
  }
}
