package typings.minecraftScriptingTypesShared

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.minecraftScriptingTypesShared.IEntityTickingArea
  - typings.minecraftScriptingTypesShared.ILevelTickingArea
*/
trait ITickingArea
  extends StObject
     with _IMinecraftObject
object ITickingArea {
  
  @scala.inline
  def IEntityTickingArea(entity_ticking_area_id: Int64): typings.minecraftScriptingTypesShared.IEntityTickingArea = {
    val __obj = js.Dynamic.literal(__type__ = "entity_ticking_area", entity_ticking_area_id = entity_ticking_area_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.minecraftScriptingTypesShared.IEntityTickingArea]
  }
  
  @scala.inline
  def ILevelTickingArea(level_ticking_area_id: String): typings.minecraftScriptingTypesShared.ILevelTickingArea = {
    val __obj = js.Dynamic.literal(__type__ = "level_ticking_area", level_ticking_area_id = level_ticking_area_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.minecraftScriptingTypesShared.ILevelTickingArea]
  }
}
