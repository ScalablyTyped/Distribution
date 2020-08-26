package typings.phaser.MatterJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICollisionFilter extends js.Object {
  var category: Double = js.native
  var group: Double = js.native
  var mask: Double = js.native
}

object ICollisionFilter {
  @scala.inline
  def apply(category: Double, group: Double, mask: Double): ICollisionFilter = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICollisionFilter]
  }
  @scala.inline
  implicit class ICollisionFilterOps[Self <: ICollisionFilter] (val x: Self) extends AnyVal {
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
    def setCategory(value: Double): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroup(value: Double): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def setMask(value: Double): Self = this.set("mask", value.asInstanceOf[js.Any])
  }
  
}

