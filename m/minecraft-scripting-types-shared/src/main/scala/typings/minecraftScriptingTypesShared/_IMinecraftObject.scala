package typings.minecraftScriptingTypesShared

import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.entity
import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.item_entity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _IMinecraftObject extends StObject
object _IMinecraftObject {
  
  inline def IBlock(__identifier__ : String, block_position: VectorXYZ, ticking_area: ITickingArea): typings.minecraftScriptingTypesShared.IBlock = {
    val __obj = js.Dynamic.literal(__identifier__ = __identifier__.asInstanceOf[js.Any], __type__ = "block", block_position = block_position.asInstanceOf[js.Any], ticking_area = ticking_area.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.minecraftScriptingTypesShared.IBlock]
  }
  
  inline def IEntity(__identifier__ : String, __type__ : entity | item_entity, id: Double): typings.minecraftScriptingTypesShared.IEntity = {
    val __obj = js.Dynamic.literal(__identifier__ = __identifier__.asInstanceOf[js.Any], __type__ = __type__.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.minecraftScriptingTypesShared.IEntity]
  }
  
  inline def IEntityTickingArea(entity_ticking_area_id: Int64): typings.minecraftScriptingTypesShared.IEntityTickingArea = {
    val __obj = js.Dynamic.literal(__type__ = "entity_ticking_area", entity_ticking_area_id = entity_ticking_area_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.minecraftScriptingTypesShared.IEntityTickingArea]
  }
  
  inline def IItemStack(__identifier__ : String, count: Double, item: String): typings.minecraftScriptingTypesShared.IItemStack = {
    val __obj = js.Dynamic.literal(__identifier__ = __identifier__.asInstanceOf[js.Any], __type__ = "item_stack", count = count.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.minecraftScriptingTypesShared.IItemStack]
  }
  
  inline def ILevel(level_id: Double): typings.minecraftScriptingTypesShared.ILevel = {
    val __obj = js.Dynamic.literal(__type__ = "level", level_id = level_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.minecraftScriptingTypesShared.ILevel]
  }
  
  inline def ILevelTickingArea(level_ticking_area_id: String): typings.minecraftScriptingTypesShared.ILevelTickingArea = {
    val __obj = js.Dynamic.literal(__type__ = "level_ticking_area", level_ticking_area_id = level_ticking_area_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.minecraftScriptingTypesShared.ILevelTickingArea]
  }
  
  inline def IQuery(query_id: Double): typings.minecraftScriptingTypesShared.IQuery = {
    val __obj = js.Dynamic.literal(__type__ = "query", query_id = query_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.minecraftScriptingTypesShared.IQuery]
  }
}
