package typings.oracleOraclejet

import typings.oracleOraclejet.ojnavigationlistMod.ojTabBar.ItemContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContextRendererSelectableBoolean[K, D] extends js.Object {
  var renderer: js.UndefOr[(js.Function1[/* context */ ItemContext[K, D], Unit]) | Null] = js.undefined
  var selectable: js.UndefOr[(js.Function1[/* context */ ItemContext[K, D], Boolean]) | Boolean] = js.undefined
}

object AnonContextRendererSelectableBoolean {
  @scala.inline
  def apply[K, D](
    renderer: /* context */ ItemContext[K, D] => Unit = null,
    selectable: (js.Function1[/* context */ ItemContext[K, D], Boolean]) | Boolean = null
  ): AnonContextRendererSelectableBoolean[K, D] = {
    val __obj = js.Dynamic.literal()
    if (renderer != null) __obj.updateDynamic("renderer")(js.Any.fromFunction1(renderer))
    if (selectable != null) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContextRendererSelectableBoolean[K, D]]
  }
}

