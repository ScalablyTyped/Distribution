package typings.mobx.anon

import typings.mobx.mobxStrings.remove
import typings.mobx.observableobjectMod.IObjectDidChange
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameObject extends IObjectDidChange {
  var name: PropertyKey
  var `object`: js.Any
  var oldValue: js.Any
  var `type`: remove
}

object NameObject {
  @scala.inline
  def apply(name: PropertyKey, `object`: js.Any, oldValue: js.Any, `type`: remove): NameObject = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameObject]
  }
}

