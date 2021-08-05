package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudSecuritycenterV1Resource extends StObject {
  
  /** The full resource name of the resource. See: https://cloud.google.com/apis/design/resource_names#full_resource_name */
  var name: js.UndefOr[String] = js.undefined
  
  /** The full resource name of resource's parent. */
  var parent: js.UndefOr[String] = js.undefined
  
  /** The human readable name of resource's parent. */
  var parentDisplayName: js.UndefOr[String] = js.undefined
  
  /** The full resource name of project that the resource belongs to. */
  var project: js.UndefOr[String] = js.undefined
  
  /** The human readable name of project that the resource belongs to. */
  var projectDisplayName: js.UndefOr[String] = js.undefined
}
object GoogleCloudSecuritycenterV1Resource {
  
  inline def apply(): GoogleCloudSecuritycenterV1Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudSecuritycenterV1Resource]
  }
  
  extension [Self <: GoogleCloudSecuritycenterV1Resource](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentDisplayName(value: String): Self = StObject.set(x, "parentDisplayName", value.asInstanceOf[js.Any])
    
    inline def setParentDisplayNameUndefined: Self = StObject.set(x, "parentDisplayName", js.undefined)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectDisplayName(value: String): Self = StObject.set(x, "projectDisplayName", value.asInstanceOf[js.Any])
    
    inline def setProjectDisplayNameUndefined: Self = StObject.set(x, "projectDisplayName", js.undefined)
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
