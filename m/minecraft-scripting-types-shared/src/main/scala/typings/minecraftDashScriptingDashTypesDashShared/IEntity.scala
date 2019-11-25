package typings.minecraftDashScriptingDashTypesDashShared

import typings.minecraftDashScriptingDashTypesDashShared.minecraftDashScriptingDashTypesDashSharedStrings.entity
import typings.minecraftDashScriptingDashTypesDashShared.minecraftDashScriptingDashTypesDashSharedStrings.item_entity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEntity extends _IMinecraftObject {
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
  @scala.inline
  def apply(__identifier__ : String, __type__ : entity | item_entity, id: Double): IEntity = {
    val __obj = js.Dynamic.literal(__identifier__ = __identifier__.asInstanceOf[js.Any], __type__ = __type__.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IEntity]
  }
}

