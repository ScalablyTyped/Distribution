package typings.mjml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MJMLJsonObject extends js.Object {
  var attributes: js.Object = js.native
  var children: js.UndefOr[js.Array[MJMLJsonObject]] = js.native
  var content: js.UndefOr[String] = js.native
  var tagName: String = js.native
}

object MJMLJsonObject {
  @scala.inline
  def apply(attributes: js.Object, tagName: String): MJMLJsonObject = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MJMLJsonObject]
  }
  @scala.inline
  implicit class MJMLJsonObjectOps[Self <: MJMLJsonObject] (val x: Self) extends AnyVal {
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
    def setAttributes(value: js.Object): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagName(value: String): Self = this.set("tagName", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildrenVarargs(value: MJMLJsonObject*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[MJMLJsonObject]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
  }
  
}

