package typings.naverWhale.whale.runtime

import typings.chrome.anon.Page
import typings.naverWhale.naverWhaleNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManifestV2
  extends StObject
     with typings.chrome.chrome.runtime.ManifestBase {
  
  // Optional
  var background: js.UndefOr[Page] = js.undefined
  
  // Pick one (or none)
  var browser_action: js.UndefOr[typings.chrome.chrome.runtime.ManifestAction] = js.undefined
  
  var content_security_policy: js.UndefOr[String] = js.undefined
  
  // Required
  @JSName("manifest_version")
  var manifest_version_ManifestV2: `2`
  
  var optional_permissions: js.UndefOr[js.Array[String]] = js.undefined
  
  var page_action: js.UndefOr[typings.chrome.chrome.runtime.ManifestAction] = js.undefined
  
  var permissions: js.UndefOr[js.Array[String]] = js.undefined
  
  var web_accessible_resources: js.UndefOr[js.Array[String]] = js.undefined
}
object ManifestV2 {
  
  inline def apply(name: String, version: String): ManifestV2 = {
    val __obj = js.Dynamic.literal(manifest_version = 2, name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestV2]
  }
  
  extension [Self <: ManifestV2](x: Self) {
    
    inline def setBackground(value: Page): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setBrowser_action(value: typings.chrome.chrome.runtime.ManifestAction): Self = StObject.set(x, "browser_action", value.asInstanceOf[js.Any])
    
    inline def setBrowser_actionUndefined: Self = StObject.set(x, "browser_action", js.undefined)
    
    inline def setContent_security_policy(value: String): Self = StObject.set(x, "content_security_policy", value.asInstanceOf[js.Any])
    
    inline def setContent_security_policyUndefined: Self = StObject.set(x, "content_security_policy", js.undefined)
    
    inline def setManifest_version(value: `2`): Self = StObject.set(x, "manifest_version", value.asInstanceOf[js.Any])
    
    inline def setOptional_permissions(value: js.Array[String]): Self = StObject.set(x, "optional_permissions", value.asInstanceOf[js.Any])
    
    inline def setOptional_permissionsUndefined: Self = StObject.set(x, "optional_permissions", js.undefined)
    
    inline def setOptional_permissionsVarargs(value: String*): Self = StObject.set(x, "optional_permissions", js.Array(value*))
    
    inline def setPage_action(value: typings.chrome.chrome.runtime.ManifestAction): Self = StObject.set(x, "page_action", value.asInstanceOf[js.Any])
    
    inline def setPage_actionUndefined: Self = StObject.set(x, "page_action", js.undefined)
    
    inline def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value*))
    
    inline def setWeb_accessible_resources(value: js.Array[String]): Self = StObject.set(x, "web_accessible_resources", value.asInstanceOf[js.Any])
    
    inline def setWeb_accessible_resourcesUndefined: Self = StObject.set(x, "web_accessible_resources", js.undefined)
    
    inline def setWeb_accessible_resourcesVarargs(value: String*): Self = StObject.set(x, "web_accessible_resources", js.Array(value*))
  }
}
