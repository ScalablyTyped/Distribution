package typings.pdfmake.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentUnorderedList
  extends ContentBase
     with _Content {
  var `type`: js.UndefOr[UnorderedListType] = js.native
  var ul: js.Array[UnorderedListElement] = js.native
}

object ContentUnorderedList {
  @scala.inline
  def apply(ul: js.Array[UnorderedListElement]): ContentUnorderedList = {
    val __obj = js.Dynamic.literal(ul = ul.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentUnorderedList]
  }
  @scala.inline
  implicit class ContentUnorderedListOps[Self <: ContentUnorderedList] (val x: Self) extends AnyVal {
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
    def setUlVarargs(value: UnorderedListElement*): Self = this.set("ul", js.Array(value :_*))
    @scala.inline
    def setUl(value: js.Array[UnorderedListElement]): Self = this.set("ul", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: UnorderedListType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

