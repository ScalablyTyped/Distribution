package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudEndpoints extends StObject {
  
  /**
    * The name of the Cloud Endpoints service underlying this service. Corresponds to the service resource label in the api monitored resource
    * (https://cloud.google.com/monitoring/api/resources#tag_api).
    */
  var service: js.UndefOr[String] = js.undefined
}
object CloudEndpoints {
  
  inline def apply(): CloudEndpoints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudEndpoints]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloudEndpoints] (val x: Self) extends AnyVal {
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
