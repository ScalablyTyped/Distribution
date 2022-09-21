package typings.maximMazurokGapiClientFirebaserules.gapi.client.firebaserules

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Release extends StObject {
  
  /** Output only. Time the release was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Required. Format: `projects/{project_id}/releases/{release_id}` */
  var name: js.UndefOr[String] = js.undefined
  
  /** Required. Name of the `Ruleset` referred to by this `Release`. The `Ruleset` must exist for the `Release` to be created. */
  var rulesetName: js.UndefOr[String] = js.undefined
  
  /** Output only. Time the release was updated. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object Release {
  
  inline def apply(): Release = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Release]
  }
  
  extension [Self <: Release](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRulesetName(value: String): Self = StObject.set(x, "rulesetName", value.asInstanceOf[js.Any])
    
    inline def setRulesetNameUndefined: Self = StObject.set(x, "rulesetName", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
