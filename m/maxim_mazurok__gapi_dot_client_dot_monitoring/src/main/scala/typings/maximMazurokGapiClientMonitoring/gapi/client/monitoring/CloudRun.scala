package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudRun extends StObject {
  
  /**
    * The location the service is run. Corresponds to the location resource label in the cloud_run_revision monitored resource
    * (https://cloud.google.com/monitoring/api/resources#tag_cloud_run_revision).
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the Cloud Run service. Corresponds to the service_name resource label in the cloud_run_revision monitored resource
    * (https://cloud.google.com/monitoring/api/resources#tag_cloud_run_revision).
    */
  var serviceName: js.UndefOr[String] = js.undefined
}
object CloudRun {
  
  inline def apply(): CloudRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudRun]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloudRun] (val x: Self) extends AnyVal {
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
  }
}
