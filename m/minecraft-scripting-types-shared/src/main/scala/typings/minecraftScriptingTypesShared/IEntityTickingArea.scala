package typings.minecraftScriptingTypesShared

import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.entity_ticking_area
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEntityTickingArea extends ITickingArea {
  /**
    * The type of the object
    */
  val __type__ : entity_ticking_area
  /**
    * The unique identifier of the ticking area
    */
  val entity_ticking_area_id: Int64
}

object IEntityTickingArea {
  @scala.inline
  def apply(__type__ : entity_ticking_area, entity_ticking_area_id: Int64): IEntityTickingArea = {
    val __obj = js.Dynamic.literal(__type__ = __type__.asInstanceOf[js.Any], entity_ticking_area_id = entity_ticking_area_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IEntityTickingArea]
  }
}

