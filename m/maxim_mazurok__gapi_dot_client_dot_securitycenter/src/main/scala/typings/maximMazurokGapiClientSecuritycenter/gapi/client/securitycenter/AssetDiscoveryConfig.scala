package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetDiscoveryConfig extends StObject {
  
  /** The folder ids to use for filtering asset discovery. It consists of only digits, e.g., 756619654966. */
  var folderIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The mode to use for filtering asset discovery. */
  var inclusionMode: js.UndefOr[String] = js.undefined
  
  /** The project ids to use for filtering asset discovery. */
  var projectIds: js.UndefOr[js.Array[String]] = js.undefined
}
object AssetDiscoveryConfig {
  
  inline def apply(): AssetDiscoveryConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssetDiscoveryConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssetDiscoveryConfig] (val x: Self) extends AnyVal {
    
    inline def setFolderIds(value: js.Array[String]): Self = StObject.set(x, "folderIds", value.asInstanceOf[js.Any])
    
    inline def setFolderIdsUndefined: Self = StObject.set(x, "folderIds", js.undefined)
    
    inline def setFolderIdsVarargs(value: String*): Self = StObject.set(x, "folderIds", js.Array(value*))
    
    inline def setInclusionMode(value: String): Self = StObject.set(x, "inclusionMode", value.asInstanceOf[js.Any])
    
    inline def setInclusionModeUndefined: Self = StObject.set(x, "inclusionMode", js.undefined)
    
    inline def setProjectIds(value: js.Array[String]): Self = StObject.set(x, "projectIds", value.asInstanceOf[js.Any])
    
    inline def setProjectIdsUndefined: Self = StObject.set(x, "projectIds", js.undefined)
    
    inline def setProjectIdsVarargs(value: String*): Self = StObject.set(x, "projectIds", js.Array(value*))
  }
}
