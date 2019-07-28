package typings.atOracleOraclejet

import typings.atOracleOraclejet.ojnavigationlistMod.ojTabBarNs.ItemContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextRendererSelectableBoolean[K, D] extends js.Object {
  var renderer: js.UndefOr[(js.Function1[/* context */ ItemContext[K, D], Unit]) | Null] = js.undefined
  var selectable: js.UndefOr[(js.Function1[/* context */ ItemContext[K, D], Boolean]) | Boolean] = js.undefined
}

object Anon_ContextRendererSelectableBoolean {
  @scala.inline
  def apply[K, D](
    renderer: /* context */ ItemContext[K, D] => Unit = null,
    selectable: (js.Function1[/* context */ ItemContext[K, D], Boolean]) | Boolean = null
  ): Anon_ContextRendererSelectableBoolean[K, D] = {
    val __obj = js.Dynamic.literal()
    if (renderer != null) __obj.updateDynamic("renderer")(js.Any.fromFunction1(renderer))
    if (selectable != null) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ContextRendererSelectableBoolean[K, D]]
  }
}

