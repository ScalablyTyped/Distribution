package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojnavigationlistMod.ojNavigationList.ItemContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Selectable[K, D] extends js.Object {
  var renderer: js.UndefOr[(js.Function1[/* context */ ItemContext[K, D], Unit]) | Null] = js.undefined
  var selectable: js.UndefOr[(js.Function1[/* context */ ItemContext[K, D], Boolean]) | Boolean] = js.undefined
}

object Selectable {
  @scala.inline
  def apply[K, D](
    renderer: js.UndefOr[Null | (/* context */ ItemContext[K, D] => Unit)] = js.undefined,
    selectable: (js.Function1[/* context */ ItemContext[K, D], Boolean]) | Boolean = null
  ): Selectable[K, D] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(renderer)) __obj.updateDynamic("renderer")(if (renderer != null) js.Any.fromFunction1(renderer.asInstanceOf[/* context */ ItemContext[K, D] => Unit]) else null)
    if (selectable != null) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selectable[K, D]]
  }
}

