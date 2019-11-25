package typings.mobx.libTypesObservableobjectMod

import typings.mobx.mobxStrings.add
import typings.mobx.mobxStrings.remove
import typings.mobx.mobxStrings.update
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mobx.Anon_AddName
  - typings.mobx.Anon_NameNewValue
  - typings.mobx.Anon_NameObject
*/
trait IObjectDidChange extends js.Object

object IObjectDidChange {
  @scala.inline
  def Anon_AddName(name: PropertyKey, newValue: js.Any, `object`: js.Any, `type`: add): IObjectDidChange = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectDidChange]
  }
  @scala.inline
  def Anon_NameNewValue(name: PropertyKey, newValue: js.Any, `object`: js.Any, oldValue: js.Any, `type`: update): IObjectDidChange = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectDidChange]
  }
  @scala.inline
  def Anon_NameObject(name: PropertyKey, `object`: js.Any, oldValue: js.Any, `type`: remove): IObjectDidChange = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectDidChange]
  }
}

