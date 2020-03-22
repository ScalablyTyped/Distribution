package typings.officeUiFabricReact

import typings.officeUiFabricReact.officeUiFabricReactStrings.a
import typings.officeUiFabricReact.officeUiFabricReactStrings.b
import typings.officeUiFabricReact.officeUiFabricReactStrings.g
import typings.officeUiFabricReact.officeUiFabricReactStrings.hex
import typings.officeUiFabricReact.officeUiFabricReactStrings.r
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComponent extends js.Object {
  var component: a | hex | b | g | r
  var value: String
}

object AnonComponent {
  @scala.inline
  def apply(component: a | hex | b | g | r, value: String): AnonComponent = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonComponent]
  }
}

