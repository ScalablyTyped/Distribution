package typings.mobx.observableobjectMod

import typings.mobx.mobxStrings.add
import typings.mobx.mobxStrings.remove
import typings.mobx.mobxStrings.update
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mobx.AnonNameNewValue
  - typings.mobx.AnonObjectType
*/
trait IObjectWillChange extends js.Object

object IObjectWillChange {
  @scala.inline
  def AnonNameNewValue(name: PropertyKey, newValue: js.Any, `object`: js.Any, `type`: update | add): IObjectWillChange = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectWillChange]
  }
  @scala.inline
  def AnonObjectType(name: PropertyKey, `object`: js.Any, `type`: remove): IObjectWillChange = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectWillChange]
  }
}

