package typings
package minecraftDashScriptingDashTypesDashSharedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILevel extends _IMinecraftObject {
  /**
    * The type of the object
    */
  val __type__ : minecraftDashScriptingDashTypesDashSharedLib.minecraftDashScriptingDashTypesDashSharedLibStrings.level
  /**
    * READ ONLY. This is the unique identifier of the level
    */
  val level_id: scala.Double
}

object ILevel {
  @scala.inline
  def apply(
    __type__ : minecraftDashScriptingDashTypesDashSharedLib.minecraftDashScriptingDashTypesDashSharedLibStrings.level,
    level_id: scala.Double
  ): ILevel = {
    val __obj = js.Dynamic.literal(__type__ = __type__, level_id = level_id)
  
    __obj.asInstanceOf[ILevel]
  }
}

