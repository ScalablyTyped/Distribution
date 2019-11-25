package typings.mobx

import typings.mobx.libTypesObservableobjectMod.IObjectWillChange
import typings.mobx.mobxStrings.add
import typings.mobx.mobxStrings.update
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddNameNewValue extends IObjectWillChange {
  var name: PropertyKey
  var newValue: js.Any
  var `object`: js.Any
  var `type`: update | add
}

object Anon_AddNameNewValue {
  @scala.inline
  def apply(name: PropertyKey, newValue: js.Any, `object`: js.Any, `type`: update | add): Anon_AddNameNewValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AddNameNewValue]
  }
}

