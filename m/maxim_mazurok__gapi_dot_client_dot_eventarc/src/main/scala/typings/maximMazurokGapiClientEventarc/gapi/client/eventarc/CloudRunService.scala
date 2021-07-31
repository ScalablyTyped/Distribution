package typings.maximMazurokGapiClientEventarc.gapi.client.eventarc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudRunService extends StObject {
  
  /**
    * Optional. The relative path on the Cloud Run service the events should be sent to. The value must conform to the definition of URI path segment (section 3.3 of RFC2396). Examples:
    * "/route", "route", "route/subroute".
    */
  var path: js.UndefOr[String] = js.undefined
  
  /** Required. The region the Cloud Run service is deployed in. */
  var region: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name of the Cloud run service being addressed (see https://cloud.google.com/run/docs/reference/rest/v1/namespaces.services). Only services located in the same project
    * of the trigger object can be addressed.
    */
  var service: js.UndefOr[String] = js.undefined
}
object CloudRunService {
  
  @scala.inline
  def apply(): CloudRunService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudRunService]
  }
  
  @scala.inline
  implicit class CloudRunServiceMutableBuilder[Self <: CloudRunService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
