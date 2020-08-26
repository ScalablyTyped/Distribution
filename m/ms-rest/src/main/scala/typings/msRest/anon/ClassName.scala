package typings.msRest.anon

import org.scalablytyped.runtime.StringDictionary
import typings.msRest.mod.Mapper
import typings.msRest.mod.MapperType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassName extends js.Object {
  var className: String = js.native
  var modelProperties: js.UndefOr[StringDictionary[Mapper]] = js.native
  var name: MapperType = js.native
}

object ClassName {
  @scala.inline
  def apply(className: String, name: MapperType): ClassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassName]
  }
  @scala.inline
  implicit class ClassNameOps[Self <: ClassName] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: MapperType): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setModelProperties(value: StringDictionary[Mapper]): Self = this.set("modelProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModelProperties: Self = this.set("modelProperties", js.undefined)
  }
  
}

