package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextRendererSelectable[K, D] extends js.Object {
  var renderer: js.UndefOr[
    (js.Function1[
      /* context */ atOracleOraclejetLib.ojnavigationlistMod.ojNavigationListNs.ItemContext[K, D], 
      scala.Unit
    ]) | scala.Null
  ] = js.undefined
  var selectable: js.UndefOr[
    (js.Function1[
      /* context */ atOracleOraclejetLib.ojnavigationlistMod.ojNavigationListNs.ItemContext[K, D], 
      scala.Boolean
    ]) | scala.Boolean
  ] = js.undefined
}

object Anon_ContextRendererSelectable {
  @scala.inline
  def apply[K, D](
    renderer: /* context */ atOracleOraclejetLib.ojnavigationlistMod.ojNavigationListNs.ItemContext[K, D] => scala.Unit = null,
    selectable: (js.Function1[
      /* context */ atOracleOraclejetLib.ojnavigationlistMod.ojNavigationListNs.ItemContext[K, D], 
      scala.Boolean
    ]) | scala.Boolean = null
  ): Anon_ContextRendererSelectable[K, D] = {
    val __obj = js.Dynamic.literal()
    if (renderer != null) __obj.updateDynamic("renderer")(js.Any.fromFunction1(renderer))
    if (selectable != null) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ContextRendererSelectable[K, D]]
  }
}

