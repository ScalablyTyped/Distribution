package typings.msRest.anon

import typings.msRest.mod.Mapper
import typings.msRest.mod.MapperType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Value extends js.Object {
  var name: MapperType = js.native
  var value: Mapper = js.native
}

object Value {
  @scala.inline
  def apply(name: MapperType, value: Mapper): Value = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  @scala.inline
  implicit class ValueOps[Self <: Value] (val x: Self) extends AnyVal {
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
    def setName(value: MapperType): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Mapper): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

