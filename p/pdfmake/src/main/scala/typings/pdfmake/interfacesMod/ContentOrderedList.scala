package typings.pdfmake.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentOrderedList
  extends ContentBase
     with _Content {
  var ol: js.Array[OrderedListElement] = js.native
  var reversed: js.UndefOr[Boolean] = js.native
  var separator: js.UndefOr[String | (js.Tuple2[String, String])] = js.native
  var start: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[OrderedListType] = js.native
}

object ContentOrderedList {
  @scala.inline
  def apply(ol: js.Array[OrderedListElement]): ContentOrderedList = {
    val __obj = js.Dynamic.literal(ol = ol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentOrderedList]
  }
  @scala.inline
  implicit class ContentOrderedListOps[Self <: ContentOrderedList] (val x: Self) extends AnyVal {
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
    def setOlVarargs(value: OrderedListElement*): Self = this.set("ol", js.Array(value :_*))
    @scala.inline
    def setOl(value: js.Array[OrderedListElement]): Self = this.set("ol", value.asInstanceOf[js.Any])
    @scala.inline
    def setReversed(value: Boolean): Self = this.set("reversed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReversed: Self = this.set("reversed", js.undefined)
    @scala.inline
    def setSeparator(value: String | (js.Tuple2[String, String])): Self = this.set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setType(value: OrderedListType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

