package typings.maximMazurokGapiClientEventarc.gapi.client.eventarc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GKE extends StObject {
  
  /** Required. The name of the cluster the GKE service is running in. The cluster must be running in the same project as the trigger being created. */
  var cluster: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name of the Google Compute Engine in which the cluster resides, which can either be compute zone (for example, us-central1-a) for the zonal clusters or region (for
    * example, us-central1) for regional clusters.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /** Required. The namespace the GKE service is running in. */
  var namespace: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The relative path on the GKE service the events should be sent to. The value must conform to the definition of a URI path segment (section 3.3 of RFC2396). Examples:
    * "/route", "route", "route/subroute".
    */
  var path: js.UndefOr[String] = js.undefined
  
  /** Required. Name of the GKE service. */
  var service: js.UndefOr[String] = js.undefined
}
object GKE {
  
  inline def apply(): GKE = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GKE]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GKE] (val x: Self) extends AnyVal {
    
    inline def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
