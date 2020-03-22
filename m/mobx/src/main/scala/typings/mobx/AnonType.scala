package typings.mobx

import typings.mobx.mobxStrings.add
import typings.mobx.observableobjectMod.IObjectDidChange
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends IObjectDidChange {
  var name: PropertyKey
  var newValue: js.Any
  var `object`: js.Any
  var `type`: add
}

object AnonType {
  @scala.inline
  def apply(name: PropertyKey, newValue: js.Any, `object`: js.Any, `type`: add): AnonType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

