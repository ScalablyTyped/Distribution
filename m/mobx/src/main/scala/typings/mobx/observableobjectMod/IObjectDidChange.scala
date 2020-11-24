package typings.mobx.observableobjectMod

import typings.mobx.mobxStrings.add
import typings.mobx.mobxStrings.remove
import typings.mobx.mobxStrings.update
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.mobx.anon.Type[T]
  - typings.mobx.anon.OldValue[T]
  - typings.mobx.anon.NameObject[T]
*/
trait IObjectDidChange[T] extends js.Object
object IObjectDidChange {
  
  @scala.inline
  def Type[T](name: PropertyKey, newValue: js.Any, `object`: T, `type`: add): IObjectDidChange[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectDidChange[T]]
  }
  
  @scala.inline
  def OldValue[T](name: PropertyKey, newValue: js.Any, `object`: T, oldValue: js.Any, `type`: update): IObjectDidChange[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectDidChange[T]]
  }
  
  @scala.inline
  def NameObject[T](name: PropertyKey, `object`: T, oldValue: js.Any, `type`: remove): IObjectDidChange[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectDidChange[T]]
  }
}
