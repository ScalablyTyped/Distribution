package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojnavigationlistMod.ojTabBar.ItemContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RendererSelectable[K, D] extends js.Object {
  var renderer: js.UndefOr[(js.Function1[/* context */ ItemContext[K, D], Unit]) | Null] = js.native
  var selectable: js.UndefOr[(js.Function1[/* context */ ItemContext[K, D], Boolean]) | Boolean] = js.native
}

object RendererSelectable {
  @scala.inline
  def apply[K, D](): RendererSelectable[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RendererSelectable[K, D]]
  }
  @scala.inline
  implicit class RendererSelectableOps[Self <: RendererSelectable[_, _], K, D] (val x: Self with (RendererSelectable[K, D])) extends AnyVal {
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
    def setRenderer(value: /* context */ ItemContext[K, D] => Unit): Self = this.set("renderer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    @scala.inline
    def setRendererNull: Self = this.set("renderer", null)
    @scala.inline
    def setSelectableFunction1(value: /* context */ ItemContext[K, D] => Boolean): Self = this.set("selectable", js.Any.fromFunction1(value))
    @scala.inline
    def setSelectable(value: (js.Function1[/* context */ ItemContext[K, D], Boolean]) | Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
  }
  
}

