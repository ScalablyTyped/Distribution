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
    val __obj = js.Dynamic.literal(name = name, newValue = newValue)
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AddNameNewValue]
  }
}

