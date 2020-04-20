package typings.parchment

import org.scalablytyped.runtime.Instantiable1
import typings.parchment.storeMod.default
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClass extends js.Object {
  var Attribute: AnonAttribute
  var Class: TypeofClassAttributor
  var Store: Instantiable1[/* domNode */ HTMLElement, default]
  var Style: TypeofStyleAttributor
}

object AnonClass {
  @scala.inline
  def apply(
    Attribute: AnonAttribute,
    Class: TypeofClassAttributor,
    Store: Instantiable1[/* domNode */ HTMLElement, default],
    Style: TypeofStyleAttributor
  ): AnonClass = {
    val __obj = js.Dynamic.literal(Attribute = Attribute.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Store = Store.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClass]
  }
}

