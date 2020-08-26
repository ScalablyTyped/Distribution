package typings.officeUiFabricReact.detailsListAnimationExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDetailsListAnimationExampleItem extends js.Object {
  var key: Double = js.native
  var name: String = js.native
  var value: Double = js.native
}

object IDetailsListAnimationExampleItem {
  @scala.inline
  def apply(key: Double, name: String, value: Double): IDetailsListAnimationExampleItem = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsListAnimationExampleItem]
  }
  @scala.inline
  implicit class IDetailsListAnimationExampleItemOps[Self <: IDetailsListAnimationExampleItem] (val x: Self) extends AnyVal {
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
    def setKey(value: Double): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

