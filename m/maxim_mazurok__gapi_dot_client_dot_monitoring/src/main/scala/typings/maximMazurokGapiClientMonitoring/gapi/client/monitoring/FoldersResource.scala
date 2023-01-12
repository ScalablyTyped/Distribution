package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FoldersResource extends StObject {
  
  var timeSeries: TimeSeriesResource
}
object FoldersResource {
  
  inline def apply(timeSeries: TimeSeriesResource): FoldersResource = {
    val __obj = js.Dynamic.literal(timeSeries = timeSeries.asInstanceOf[js.Any])
    __obj.asInstanceOf[FoldersResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FoldersResource] (val x: Self) extends AnyVal {
    
    inline def setTimeSeries(value: TimeSeriesResource): Self = StObject.set(x, "timeSeries", value.asInstanceOf[js.Any])
  }
}
