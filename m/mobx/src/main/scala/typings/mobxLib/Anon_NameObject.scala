package typings
package mobxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameObject
  extends mobxLib.libTypesObservableobjectMod.IObjectDidChange {
  var name: java.lang.String
  var `object`: js.Any
  var oldValue: js.Any
  var `type`: mobxLib.mobxLibStrings.remove
}

object Anon_NameObject {
  @scala.inline
  def apply(name: java.lang.String, `object`: js.Any, oldValue: js.Any, `type`: mobxLib.mobxLibStrings.remove): Anon_NameObject = {
    val __obj = js.Dynamic.literal(name = name, oldValue = oldValue)
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_NameObject]
  }
}

