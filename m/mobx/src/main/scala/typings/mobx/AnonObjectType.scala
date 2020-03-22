package typings.mobx

import typings.mobx.mobxStrings.remove
import typings.mobx.observableobjectMod.IObjectWillChange
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonObjectType extends IObjectWillChange {
  var name: PropertyKey
  var `object`: js.Any
  var `type`: remove
}

object AnonObjectType {
  @scala.inline
  def apply(name: PropertyKey, `object`: js.Any, `type`: remove): AnonObjectType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonObjectType]
  }
}

