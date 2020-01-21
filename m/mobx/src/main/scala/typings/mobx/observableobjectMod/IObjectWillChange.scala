package typings.mobx.observableobjectMod

import typings.mobx.mobxStrings.add
import typings.mobx.mobxStrings.remove
import typings.mobx.mobxStrings.update
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mobx.AnonAddNameNewValue
  - typings.mobx.AnonNameObjectRemove
*/
trait IObjectWillChange extends js.Object

object IObjectWillChange {
  @scala.inline
  def AnonAddNameNewValue(name: PropertyKey, newValue: js.Any, `object`: js.Any, `type`: update | add): IObjectWillChange = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectWillChange]
  }
  @scala.inline
  def AnonNameObjectRemove(name: PropertyKey, `object`: js.Any, `type`: remove): IObjectWillChange = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectWillChange]
  }
}

