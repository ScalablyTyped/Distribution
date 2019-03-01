package typings
package mobxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameObjectRemove
  extends mobxLib.libTypesObservableobjectMod.IObjectWillChange {
  var name: java.lang.String
  var `object`: js.Any
  var `type`: mobxLib.mobxLibStrings.remove
}

object Anon_NameObjectRemove {
  @scala.inline
  def apply(name: java.lang.String, `object`: js.Any, `type`: mobxLib.mobxLibStrings.remove): Anon_NameObjectRemove = {
    val __obj = js.Dynamic.literal(`object` = `object`, `type` = `type`)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_NameObjectRemove]
  }
}

