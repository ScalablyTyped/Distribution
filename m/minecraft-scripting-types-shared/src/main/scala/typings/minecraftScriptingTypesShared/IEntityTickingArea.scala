package typings.minecraftScriptingTypesShared

import typings.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.entity_ticking_area
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEntityTickingArea extends ITickingArea {
  /**
    * The type of the object
    */
  val __type__ : entity_ticking_area = js.native
  /**
    * The unique identifier of the ticking area
    */
  val entity_ticking_area_id: Int64 = js.native
}

object IEntityTickingArea {
  @scala.inline
  def apply(__type__ : entity_ticking_area, entity_ticking_area_id: Int64): IEntityTickingArea = {
    val __obj = js.Dynamic.literal(__type__ = __type__.asInstanceOf[js.Any], entity_ticking_area_id = entity_ticking_area_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntityTickingArea]
  }
  @scala.inline
  implicit class IEntityTickingAreaOps[Self <: IEntityTickingArea] (val x: Self) extends AnyVal {
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
    def set__type__(value: entity_ticking_area): Self = this.set("__type__", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntity_ticking_area_id(value: Int64): Self = this.set("entity_ticking_area_id", value.asInstanceOf[js.Any])
  }
  
}

