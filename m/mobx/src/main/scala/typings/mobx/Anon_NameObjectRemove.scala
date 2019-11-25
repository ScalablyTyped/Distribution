package typings.mobx

import typings.mobx.libTypesObservableobjectMod.IObjectWillChange
import typings.mobx.mobxStrings.remove
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameObjectRemove extends IObjectWillChange {
  var name: PropertyKey
  var `object`: js.Any
  var `type`: remove
}

object Anon_NameObjectRemove {
  @scala.inline
  def apply(name: PropertyKey, `object`: js.Any, `type`: remove): Anon_NameObjectRemove = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NameObjectRemove]
  }
}

