package typings.oracleOraclejet

import typings.oracleOraclejet.ojlistviewMod.ojListView.ItemContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFocusable[K, D] extends js.Object {
  var focusable: js.UndefOr[(js.Function1[/* param0 */ ItemContext[K, D], Boolean]) | Boolean] = js.undefined
  var renderer: js.UndefOr[(js.Function1[/* param0 */ ItemContext[K, D], js.UndefOr[AnonInsert]]) | Null] = js.undefined
  var selectable: js.UndefOr[(js.Function1[/* param0 */ ItemContext[K, D], Boolean]) | Boolean] = js.undefined
}

object AnonFocusable {
  @scala.inline
  def apply[K, D](
    focusable: (js.Function1[/* param0 */ ItemContext[K, D], Boolean]) | Boolean = null,
    renderer: /* param0 */ ItemContext[K, D] => js.UndefOr[AnonInsert] = null,
    selectable: (js.Function1[/* param0 */ ItemContext[K, D], Boolean]) | Boolean = null
  ): AnonFocusable[K, D] = {
    val __obj = js.Dynamic.literal()
    if (focusable != null) __obj.updateDynamic("focusable")(focusable.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(js.Any.fromFunction1(renderer))
    if (selectable != null) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFocusable[K, D]]
  }
}

