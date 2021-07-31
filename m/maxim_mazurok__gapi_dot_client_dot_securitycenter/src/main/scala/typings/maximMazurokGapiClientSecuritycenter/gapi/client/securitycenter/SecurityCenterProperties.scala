package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityCenterProperties extends StObject {
  
  /** The user defined display name for this resource. */
  var resourceDisplayName: js.UndefOr[String] = js.undefined
  
  /**
    * The full resource name of the Google Cloud resource this asset represents. This field is immutable after create time. See:
    * https://cloud.google.com/apis/design/resource_names#full_resource_name
    */
  var resourceName: js.UndefOr[String] = js.undefined
  
  /** Owners of the Google Cloud resource. */
  var resourceOwners: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The full resource name of the immediate parent of the resource. See: https://cloud.google.com/apis/design/resource_names#full_resource_name */
  var resourceParent: js.UndefOr[String] = js.undefined
  
  /** The user defined display name for the parent of this resource. */
  var resourceParentDisplayName: js.UndefOr[String] = js.undefined
  
  /** The full resource name of the project the resource belongs to. See: https://cloud.google.com/apis/design/resource_names#full_resource_name */
  var resourceProject: js.UndefOr[String] = js.undefined
  
  /** The user defined display name for the project of this resource. */
  var resourceProjectDisplayName: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the Google Cloud resource. Examples include: APPLICATION, PROJECT, and ORGANIZATION. This is a case insensitive field defined by Security Command Center and/or the
    * producer of the resource and is immutable after create time.
    */
  var resourceType: js.UndefOr[String] = js.undefined
}
object SecurityCenterProperties {
  
  @scala.inline
  def apply(): SecurityCenterProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityCenterProperties]
  }
  
  @scala.inline
  implicit class SecurityCenterPropertiesMutableBuilder[Self <: SecurityCenterProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceDisplayName(value: String): Self = StObject.set(x, "resourceDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceDisplayNameUndefined: Self = StObject.set(x, "resourceDisplayName", js.undefined)
    
    @scala.inline
    def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    @scala.inline
    def setResourceOwners(value: js.Array[String]): Self = StObject.set(x, "resourceOwners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceOwnersUndefined: Self = StObject.set(x, "resourceOwners", js.undefined)
    
    @scala.inline
    def setResourceOwnersVarargs(value: String*): Self = StObject.set(x, "resourceOwners", js.Array(value :_*))
    
    @scala.inline
    def setResourceParent(value: String): Self = StObject.set(x, "resourceParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceParentDisplayName(value: String): Self = StObject.set(x, "resourceParentDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceParentDisplayNameUndefined: Self = StObject.set(x, "resourceParentDisplayName", js.undefined)
    
    @scala.inline
    def setResourceParentUndefined: Self = StObject.set(x, "resourceParent", js.undefined)
    
    @scala.inline
    def setResourceProject(value: String): Self = StObject.set(x, "resourceProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceProjectDisplayName(value: String): Self = StObject.set(x, "resourceProjectDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceProjectDisplayNameUndefined: Self = StObject.set(x, "resourceProjectDisplayName", js.undefined)
    
    @scala.inline
    def setResourceProjectUndefined: Self = StObject.set(x, "resourceProject", js.undefined)
    
    @scala.inline
    def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
