package typings.mobx.observableobjectMod

import typings.mobx.mobxStrings.add
import typings.mobx.mobxStrings.remove
import typings.mobx.mobxStrings.update
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.mobx.anon.NameNewValue
  - typings.mobx.anon.ObjectType
*/
trait IObjectWillChange extends js.Object

object IObjectWillChange {
  @scala.inline
  def NameNewValue(name: PropertyKey, newValue: js.Any, `object`: js.Any, `type`: update | add): IObjectWillChange = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectWillChange]
  }
  @scala.inline
  def ObjectType(name: PropertyKey, `object`: js.Any, `type`: remove): IObjectWillChange = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectWillChange]
  }
}

