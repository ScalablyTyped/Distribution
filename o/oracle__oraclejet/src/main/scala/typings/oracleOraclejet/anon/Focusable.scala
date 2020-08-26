package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojlistviewMod.ojListView.ItemContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Focusable[K, D] extends js.Object {
  var focusable: js.UndefOr[(js.Function1[/* param0 */ ItemContext[K, D], Boolean]) | Boolean] = js.native
  var renderer: js.UndefOr[(js.Function1[/* param0 */ ItemContext[K, D], js.UndefOr[Insert]]) | Null] = js.native
  var selectable: js.UndefOr[(js.Function1[/* param0 */ ItemContext[K, D], Boolean]) | Boolean] = js.native
}

object Focusable {
  @scala.inline
  def apply[K, D](): Focusable[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Focusable[K, D]]
  }
  @scala.inline
  implicit class FocusableOps[Self <: Focusable[_, _], K, D] (val x: Self with (Focusable[K, D])) extends AnyVal {
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
    def setFocusableFunction1(value: /* param0 */ ItemContext[K, D] => Boolean): Self = this.set("focusable", js.Any.fromFunction1(value))
    @scala.inline
    def setFocusable(value: (js.Function1[/* param0 */ ItemContext[K, D], Boolean]) | Boolean): Self = this.set("focusable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFocusable: Self = this.set("focusable", js.undefined)
    @scala.inline
    def setRenderer(value: /* param0 */ ItemContext[K, D] => js.UndefOr[Insert]): Self = this.set("renderer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    @scala.inline
    def setRendererNull: Self = this.set("renderer", null)
    @scala.inline
    def setSelectableFunction1(value: /* param0 */ ItemContext[K, D] => Boolean): Self = this.set("selectable", js.Any.fromFunction1(value))
    @scala.inline
    def setSelectable(value: (js.Function1[/* param0 */ ItemContext[K, D], Boolean]) | Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
  }
  
}

