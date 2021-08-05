package typings.minecraftScriptingTypesShared

import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.entity
import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.item_entity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEntity
  extends StObject
     with _IMinecraftObject {
  
  /**
    * The identifier of the entity, e.g., "minecraft:sheep", or "minecraft:pumpkin_seeds"
    */
  val __identifier__ : String
  
  /**
    * READ ONLY. The type of the entity
    */
  val __type__ : entity | item_entity
  
  /**
    * READ ONLY. This is the unique identifier of the query
    */
  val id: Double
}
object IEntity {
  
  inline def apply(__identifier__ : String, __type__ : entity | item_entity, id: Double): IEntity = {
    val __obj = js.Dynamic.literal(__identifier__ = __identifier__.asInstanceOf[js.Any], __type__ = __type__.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntity]
  }
  
  extension [Self <: IEntity](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def set__identifier__(value: String): Self = StObject.set(x, "__identifier__", value.asInstanceOf[js.Any])
    
    inline def set__type__(value: entity | item_entity): Self = StObject.set(x, "__type__", value.asInstanceOf[js.Any])
  }
}
