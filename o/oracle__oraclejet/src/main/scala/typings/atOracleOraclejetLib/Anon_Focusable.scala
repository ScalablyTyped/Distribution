package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Focusable[K, D] extends js.Object {
  var focusable: js.UndefOr[
    (js.Function1[
      /* param0 */ atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ItemContext[K, D], 
      scala.Boolean
    ]) | scala.Boolean
  ] = js.undefined
  var renderer: js.UndefOr[
    (js.Function1[
      /* param0 */ atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ItemContext[K, D], 
      js.UndefOr[Anon_Insert]
    ]) | scala.Null
  ] = js.undefined
  var selectable: js.UndefOr[
    (js.Function1[
      /* param0 */ atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ItemContext[K, D], 
      scala.Boolean
    ]) | scala.Boolean
  ] = js.undefined
}

object Anon_Focusable {
  @scala.inline
  def apply[K, D](
    focusable: (js.Function1[
      /* param0 */ atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ItemContext[K, D], 
      scala.Boolean
    ]) | scala.Boolean = null,
    renderer: js.Function1[
      /* param0 */ atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ItemContext[K, D], 
      js.UndefOr[Anon_Insert]
    ] = null,
    selectable: (js.Function1[
      /* param0 */ atOracleOraclejetLib.ojlistviewMod.ojListViewNs.ItemContext[K, D], 
      scala.Boolean
    ]) | scala.Boolean = null
  ): Anon_Focusable[K, D] = {
    val __obj = js.Dynamic.literal()
    if (focusable != null) __obj.updateDynamic("focusable")(focusable.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    if (selectable != null) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Focusable[K, D]]
  }
}

