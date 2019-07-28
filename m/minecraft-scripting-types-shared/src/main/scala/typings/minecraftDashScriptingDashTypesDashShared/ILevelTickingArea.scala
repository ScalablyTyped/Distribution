package typings.minecraftDashScriptingDashTypesDashShared

import typings.minecraftDashScriptingDashTypesDashShared.minecraftDashScriptingDashTypesDashSharedStrings.level_ticking_area
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILevelTickingArea extends ITickingArea {
  /**
    * The type of the object
    */
  val __type__ : level_ticking_area
  /**
    * The uuid of the ticking area
    */
  val level_ticking_area_id: String
}

object ILevelTickingArea {
  @scala.inline
  def apply(__type__ : level_ticking_area, level_ticking_area_id: String): ILevelTickingArea = {
    val __obj = js.Dynamic.literal(__type__ = __type__, level_ticking_area_id = level_ticking_area_id)
  
    __obj.asInstanceOf[ILevelTickingArea]
  }
}

