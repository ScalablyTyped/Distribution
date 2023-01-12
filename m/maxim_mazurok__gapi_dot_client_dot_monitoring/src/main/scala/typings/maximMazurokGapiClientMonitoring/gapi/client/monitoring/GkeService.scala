package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GkeService extends StObject {
  
  /** The name of the parent cluster. */
  var clusterName: js.UndefOr[String] = js.undefined
  
  /** The location of the parent cluster. This may be a zone or region. */
  var location: js.UndefOr[String] = js.undefined
  
  /** The name of the parent namespace. */
  var namespaceName: js.UndefOr[String] = js.undefined
  
  /** Output only. The project this resource lives in. For legacy services migrated from the Custom type, this may be a distinct project from the one parenting the service itself. */
  var projectId: js.UndefOr[String] = js.undefined
  
  /** The name of this service. */
  var serviceName: js.UndefOr[String] = js.undefined
}
object GkeService {
  
  inline def apply(): GkeService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GkeService]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GkeService] (val x: Self) extends AnyVal {
    
    inline def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    inline def setClusterNameUndefined: Self = StObject.set(x, "clusterName", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setNamespaceName(value: String): Self = StObject.set(x, "namespaceName", value.asInstanceOf[js.Any])
    
    inline def setNamespaceNameUndefined: Self = StObject.set(x, "namespaceName", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
  }
}
