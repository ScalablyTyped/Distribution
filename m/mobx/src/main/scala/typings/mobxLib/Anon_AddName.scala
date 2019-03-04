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
    val __obj = js.Dynamic.literal(name = name, newValue = newValue)
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_AddName]
  }
}

