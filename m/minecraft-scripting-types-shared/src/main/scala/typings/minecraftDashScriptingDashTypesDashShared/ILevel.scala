package typings.minecraftDashScriptingDashTypesDashShared

import typings.minecraftDashScriptingDashTypesDashShared.minecraftDashScriptingDashTypesDashSharedStrings.level
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILevel extends _IMinecraftObject {
  /**
    * The type of the object
    */
  val __type__ : level
  /**
    * READ ONLY. This is the unique identifier of the level
    */
  val level_id: Double
}

object ILevel {
  @scala.inline
  def apply(__type__ : level, level_id: Double): ILevel = {
    val __obj = js.Dynamic.literal(__type__ = __type__, level_id = level_id)
  
    __obj.asInstanceOf[ILevel]
  }
}

