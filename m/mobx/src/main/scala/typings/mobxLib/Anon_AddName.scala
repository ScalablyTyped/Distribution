package typings
package mobxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddName
  extends mobxLib.libTypesObservableobjectMod.IObjectDidChange {
  var name: java.lang.String
  var newValue: js.Any
  var `object`: js.Any
  var `type`: mobxLib.mobxLibStrings.add
}

object Anon_AddName {
  @scala.inline
  def apply(name: java.lang.String, newValue: js.Any, `object`: js.Any, `type`: mobxLib.mobxLibStrings.add): Anon_AddName = {
    val __obj = js.Dynamic.literal(`object` = `object`, `type` = `type`)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("newValue")(newValue)
    __obj.asInstanceOf[Anon_AddName]
  }
}

