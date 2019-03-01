package typings
package mobxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddNameNewValue
  extends mobxLib.libTypesObservableobjectMod.IObjectWillChange {
  var name: java.lang.String
  var newValue: js.Any
  var `object`: js.Any
  var `type`: mobxLib.mobxLibStrings.update | mobxLib.mobxLibStrings.add
}

object Anon_AddNameNewValue {
  @scala.inline
  def apply(
    name: java.lang.String,
    newValue: js.Any,
    `object`: js.Any,
    `type`: mobxLib.mobxLibStrings.update | mobxLib.mobxLibStrings.add
  ): Anon_AddNameNewValue = {
    val __obj = js.Dynamic.literal(`object` = `object`, `type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("newValue")(newValue)
    __obj.asInstanceOf[Anon_AddNameNewValue]
  }
}

