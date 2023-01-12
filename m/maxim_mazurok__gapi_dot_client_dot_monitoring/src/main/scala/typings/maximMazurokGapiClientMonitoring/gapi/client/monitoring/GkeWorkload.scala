package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GkeWorkload extends StObject {
  
  /** The name of the parent cluster. */
  var clusterName: js.UndefOr[String] = js.undefined
  
  /** The location of the parent cluster. This may be a zone or region. */
  var location: js.UndefOr[String] = js.undefined
  
  /** The name of the parent namespace. */
  var namespaceName: js.UndefOr[String] = js.undefined
  
  /** Output only. The project this resource lives in. For legacy services migrated from the Custom type, this may be a distinct project from the one parenting the service itself. */
  var projectId: js.UndefOr[String] = js.undefined
  
  /** The name of this workload. */
  var topLevelControllerName: js.UndefOr[String] = js.undefined
  
  /** The type of this workload (for example, "Deployment" or "DaemonSet") */
  var topLevelControllerType: js.UndefOr[String] = js.undefined
}
object GkeWorkload {
  
  inline def apply(): GkeWorkload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GkeWorkload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GkeWorkload] (val x: Self) extends AnyVal {
    
    inline def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    inline def setClusterNameUndefined: Self = StObject.set(x, "clusterName", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setNamespaceName(value: String): Self = StObject.set(x, "namespaceName", value.asInstanceOf[js.Any])
    
    inline def setNamespaceNameUndefined: Self = StObject.set(x, "namespaceName", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setTopLevelControllerName(value: String): Self = StObject.set(x, "topLevelControllerName", value.asInstanceOf[js.Any])
    
    inline def setTopLevelControllerNameUndefined: Self = StObject.set(x, "topLevelControllerName", js.undefined)
    
    inline def setTopLevelControllerType(value: String): Self = StObject.set(x, "topLevelControllerType", value.asInstanceOf[js.Any])
    
    inline def setTopLevelControllerTypeUndefined: Self = StObject.set(x, "topLevelControllerType", js.undefined)
  }
}
