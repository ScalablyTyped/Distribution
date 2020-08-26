package typings.next.utilsMod

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderPageResult extends js.Object {
  var head: js.UndefOr[js.Array[Element | Null]] = js.native
  var html: String = js.native
}

object RenderPageResult {
  @scala.inline
  def apply(html: String): RenderPageResult = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderPageResult]
  }
  @scala.inline
  implicit class RenderPageResultOps[Self <: RenderPageResult] (val x: Self) extends AnyVal {
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
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeadVarargs(value: (Element | Null)*): Self = this.set("head", js.Array(value :_*))
    @scala.inline
    def setHead(value: js.Array[Element | Null]): Self = this.set("head", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHead: Self = this.set("head", js.undefined)
  }
  
}

