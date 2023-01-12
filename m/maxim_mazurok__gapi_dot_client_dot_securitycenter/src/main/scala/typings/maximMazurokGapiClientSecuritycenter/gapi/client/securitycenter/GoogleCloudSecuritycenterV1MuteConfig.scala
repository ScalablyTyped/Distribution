package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudSecuritycenterV1MuteConfig extends StObject {
  
  /** Output only. The time at which the mute config was created. This field is set by the server and will be ignored if provided on config creation. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** A description of the mute config. */
  var description: js.UndefOr[String] = js.undefined
  
  /** The human readable name to be displayed for the mute config. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * Required. An expression that defines the filter to apply across create/update events of findings. While creating a filter string, be mindful of the scope in which the mute
    * configuration is being created. E.g., If a filter contains project = X but is created under the project = Y scope, it might not match any findings. The following field and operator
    * combinations are supported: * severity: `=`, `:` * category: `=`, `:` * resource.name: `=`, `:` * resource.project_name: `=`, `:` * resource.project_display_name: `=`, `:` *
    * resource.folders.resource_folder: `=`, `:` * resource.parent_name: `=`, `:` * resource.parent_display_name: `=`, `:` * resource.type: `=`, `:` * finding_class: `=`, `:` *
    * indicator.ip_addresses: `=`, `:` * indicator.domains: `=`, `:`
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /** Output only. Email address of the user who last edited the mute config. This field is set by the server and will be ignored if provided on config creation or update. */
  var mostRecentEditor: js.UndefOr[String] = js.undefined
  
  /**
    * This field will be ignored if provided on config creation. Format "organizations/{organization}/muteConfigs/{mute_config}" "folders/{folder}/muteConfigs/{mute_config}"
    * "projects/{project}/muteConfigs/{mute_config}"
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. The most recent time at which the mute config was updated. This field is set by the server and will be ignored if provided on config creation or update. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object GoogleCloudSecuritycenterV1MuteConfig {
  
  inline def apply(): GoogleCloudSecuritycenterV1MuteConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudSecuritycenterV1MuteConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudSecuritycenterV1MuteConfig] (val x: Self) extends AnyVal {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setMostRecentEditor(value: String): Self = StObject.set(x, "mostRecentEditor", value.asInstanceOf[js.Any])
    
    inline def setMostRecentEditorUndefined: Self = StObject.set(x, "mostRecentEditor", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
