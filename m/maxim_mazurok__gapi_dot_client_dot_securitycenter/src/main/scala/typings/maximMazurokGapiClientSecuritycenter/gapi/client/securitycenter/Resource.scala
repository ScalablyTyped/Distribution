package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resource extends StObject {
  
  /** The full resource name of the resource. See: https://cloud.google.com/apis/design/resource_names#full_resource_name */
  var name: js.UndefOr[String] = js.undefined
  
  /** The human readable name of resource's parent. */
  var parentDisplayName: js.UndefOr[String] = js.undefined
  
  /** The full resource name of resource's parent. */
  var parentName: js.UndefOr[String] = js.undefined
  
  /** The human readable name of project that the resource belongs to. */
  var projectDisplayName: js.UndefOr[String] = js.undefined
  
  /** The full resource name of project that the resource belongs to. */
  var projectName: js.UndefOr[String] = js.undefined
}
object Resource {
  
  @scala.inline
  def apply(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  
  @scala.inline
  implicit class ResourceMutableBuilder[Self <: Resource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParentDisplayName(value: String): Self = StObject.set(x, "parentDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentDisplayNameUndefined: Self = StObject.set(x, "parentDisplayName", js.undefined)
    
    @scala.inline
    def setParentName(value: String): Self = StObject.set(x, "parentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentNameUndefined: Self = StObject.set(x, "parentName", js.undefined)
    
    @scala.inline
    def setProjectDisplayName(value: String): Self = StObject.set(x, "projectDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectDisplayNameUndefined: Self = StObject.set(x, "projectDisplayName", js.undefined)
    
    @scala.inline
    def setProjectName(value: String): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectNameUndefined: Self = StObject.set(x, "projectName", js.undefined)
  }
}
