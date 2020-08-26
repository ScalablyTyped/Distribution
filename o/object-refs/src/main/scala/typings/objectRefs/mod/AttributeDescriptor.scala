package typings.objectRefs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributeDescriptor extends js.Object {
  var collection: js.UndefOr[Boolean] = js.native
  var enumerable: js.UndefOr[Boolean] = js.native
  var name: String = js.native
}

object AttributeDescriptor {
  @scala.inline
  def apply(name: String): AttributeDescriptor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeDescriptor]
  }
  @scala.inline
  implicit class AttributeDescriptorOps[Self <: AttributeDescriptor] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setCollection(value: Boolean): Self = this.set("collection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollection: Self = this.set("collection", js.undefined)
    @scala.inline
    def setEnumerable(value: Boolean): Self = this.set("enumerable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnumerable: Self = this.set("enumerable", js.undefined)
  }
  
}

