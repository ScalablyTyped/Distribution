package typings.minecraftScriptingTypesShared

import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.entity
import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.item_entity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEntity extends _IMinecraftObject {
  
  /**
    * The identifier of the entity, e.g., "minecraft:sheep", or "minecraft:pumpkin_seeds"
    */
  val __identifier__ : String = js.native
  
  /**
    * READ ONLY. The type of the entity
    */
  val __type__ : entity | item_entity = js.native
  
  /**
    * READ ONLY. This is the unique identifier of the query
    */
  val id: Double = js.native
}
object IEntity {
  
  @scala.inline
  def apply(__identifier__ : String, __type__ : entity | item_entity, id: Double): IEntity = {
    val __obj = js.Dynamic.literal(__identifier__ = __identifier__.asInstanceOf[js.Any], __type__ = __type__.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntity]
  }
  
  @scala.inline
  implicit class IEntityOps[Self <: IEntity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set__identifier__(value: String): Self = this.set("__identifier__", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__type__(value: entity | item_entity): Self = this.set("__type__", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
  }
}
