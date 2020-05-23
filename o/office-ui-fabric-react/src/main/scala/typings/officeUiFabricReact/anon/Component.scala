package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.colorPickerBaseMod.ColorComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Component extends js.Object {
  /** Which color component is being edited */
  var component: ColorComponent
  /** Currently entered value, which is not valid */
  var value: String
}

object Component {
  @scala.inline
  def apply(component: ColorComponent, value: String): Component = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Component]
  }
}

