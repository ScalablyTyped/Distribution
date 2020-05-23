package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojlistviewMod.ojListView.ItemContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Focusable[K, D] extends js.Object {
  var focusable: js.UndefOr[(js.Function1[/* param0 */ ItemContext[K, D], Boolean]) | Boolean] = js.undefined
  var renderer: js.UndefOr[(js.Function1[/* param0 */ ItemContext[K, D], js.UndefOr[Insert]]) | Null] = js.undefined
  var selectable: js.UndefOr[(js.Function1[/* param0 */ ItemContext[K, D], Boolean]) | Boolean] = js.undefined
}

object Focusable {
  @scala.inline
  def apply[K, D](
    focusable: (js.Function1[/* param0 */ ItemContext[K, D], Boolean]) | Boolean = null,
    renderer: js.UndefOr[Null | (/* param0 */ ItemContext[K, D] => js.UndefOr[Insert])] = js.undefined,
    selectable: (js.Function1[/* param0 */ ItemContext[K, D], Boolean]) | Boolean = null
  ): Focusable[K, D] = {
    val __obj = js.Dynamic.literal()
    if (focusable != null) __obj.updateDynamic("focusable")(focusable.asInstanceOf[js.Any])
    if (!js.isUndefined(renderer)) __obj.updateDynamic("renderer")(if (renderer != null) js.Any.fromFunction1(renderer.asInstanceOf[/* param0 */ ItemContext[K, D] => js.UndefOr[Insert]]) else null)
    if (selectable != null) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Focusable[K, D]]
  }
}

