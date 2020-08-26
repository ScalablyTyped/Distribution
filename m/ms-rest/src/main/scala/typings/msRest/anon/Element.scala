package typings.msRest.anon

import typings.msRest.mod.Mapper
import typings.msRest.mod.MapperType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Element extends js.Object {
  var element: Mapper = js.native
  var name: MapperType = js.native
}

object Element {
  @scala.inline
  def apply(element: Mapper, name: MapperType): Element = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
  @scala.inline
  implicit class ElementOps[Self <: Element] (val x: Self) extends AnyVal {
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
    def setElement(value: Mapper): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: MapperType): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

