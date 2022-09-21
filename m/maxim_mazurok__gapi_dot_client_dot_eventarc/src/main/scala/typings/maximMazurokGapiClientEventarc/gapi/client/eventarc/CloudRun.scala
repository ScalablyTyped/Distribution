package typings.maximMazurokGapiClientEventarc.gapi.client.eventarc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudRun extends StObject {
  
  /**
    * Optional. The relative path on the Cloud Run service the events should be sent to. The value must conform to the definition of a URI path segment (section 3.3 of RFC2396). Examples:
    * "/route", "route", "route/subroute".
    */
  var path: js.UndefOr[String] = js.undefined
  
  /** Required. The region the Cloud Run service is deployed in. */
  var region: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name of the Cloud Run service being addressed. See https://cloud.google.com/run/docs/reference/rest/v1/namespaces.services. Only services located in the same project
    * as the trigger object can be addressed.
    */
  var service: js.UndefOr[String] = js.undefined
}
object CloudRun {
  
  inline def apply(): CloudRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudRun]
  }
  
  extension [Self <: CloudRun](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
