package typings.mobx.anon

import typings.mobx.mobxStrings.remove
import typings.mobx.observableobjectMod.IObjectWillChange
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectType extends IObjectWillChange {
  var name: PropertyKey = js.native
  var `object`: js.Any = js.native
  var `type`: remove = js.native
}

object ObjectType {
  @scala.inline
  def apply(name: PropertyKey, `object`: js.Any, `type`: remove): ObjectType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectType]
  }
  @scala.inline
  implicit class ObjectTypeOps[Self <: ObjectType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: PropertyKey): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: js.Any): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: remove): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

