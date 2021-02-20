package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudSecuritycenterV1Resource extends StObject {
  
  /** The full resource name of the resource. See: https://cloud.google.com/apis/design/resource_names#full_resource_name */
  var name: js.UndefOr[String] = js.native
  
  /** The full resource name of resource's parent. */
  var parent: js.UndefOr[String] = js.native
  
  /** The human readable name of resource's parent. */
  var parentDisplayName: js.UndefOr[String] = js.native
  
  /** The full resource name of project that the resource belongs to. */
  var project: js.UndefOr[String] = js.native
  
  /** The human readable name of project that the resource belongs to. */
  var projectDisplayName: js.UndefOr[String] = js.native
}
object GoogleCloudSecuritycenterV1Resource {
  
  @scala.inline
  def apply(): GoogleCloudSecuritycenterV1Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudSecuritycenterV1Resource]
  }
  
  @scala.inline
  implicit class GoogleCloudSecuritycenterV1ResourceMutableBuilder[Self <: GoogleCloudSecuritycenterV1Resource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentDisplayName(value: String): Self = StObject.set(x, "parentDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentDisplayNameUndefined: Self = StObject.set(x, "parentDisplayName", js.undefined)
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectDisplayName(value: String): Self = StObject.set(x, "projectDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectDisplayNameUndefined: Self = StObject.set(x, "projectDisplayName", js.undefined)
    
    @scala.inline
    def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
