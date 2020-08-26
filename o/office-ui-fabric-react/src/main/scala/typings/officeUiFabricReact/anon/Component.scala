package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.colorPickerBaseMod.ColorComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Component extends js.Object {
  /** Which color component is being edited */
  var component: ColorComponent = js.native
  /** Currently entered value, which is not valid */
  var value: String = js.native
}

object Component {
  @scala.inline
  def apply(component: ColorComponent, value: String): Component = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Component]
  }
  @scala.inline
  implicit class ComponentOps[Self <: Component] (val x: Self) extends AnyVal {
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
    def setComponent(value: ColorComponent): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

