package typings
package minecraftDashScriptingDashTypesDashSharedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEntity extends _IMinecraftObject {
  /**
    * The identifier of the entity, e.g., "minecraft:sheep", or "minecraft:pumpkin_seeds"
    */
  val __identifier__ : java.lang.String
  /**
    * READ ONLY. The type of the entity
    */
  val __type__ : minecraftDashScriptingDashTypesDashSharedLib.minecraftDashScriptingDashTypesDashSharedLibStrings.entity | minecraftDashScriptingDashTypesDashSharedLib.minecraftDashScriptingDashTypesDashSharedLibStrings.item_entity
  /**
    * READ ONLY. This is the unique identifier of the query
    */
  val id: scala.Double
}

object IEntity {
  @scala.inline
  def apply(
    __identifier__ : java.lang.String,
    __type__ : minecraftDashScriptingDashTypesDashSharedLib.minecraftDashScriptingDashTypesDashSharedLibStrings.entity | minecraftDashScriptingDashTypesDashSharedLib.minecraftDashScriptingDashTypesDashSharedLibStrings.item_entity,
    id: scala.Double
  ): IEntity = {
    val __obj = js.Dynamic.literal(__identifier__ = __identifier__, __type__ = __type__.asInstanceOf[js.Any], id = id)
  
    __obj.asInstanceOf[IEntity]
  }
}

