package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassNameContextLabelRendererResizable[K, D] extends js.Object {
  var className: js.UndefOr[
    (js.Function1[
      /* context */ atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.HeaderContext[K, D], 
      java.lang.String | scala.Unit | scala.Null
    ]) | java.lang.String | scala.Null
  ] = js.undefined
  var label: Anon_ClassNameContext[K, D]
  var renderer: js.UndefOr[
    (js.Function1[
      /* context */ atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.HeaderContext[K, D], 
      Anon_InsertHTMLElement | scala.Unit | scala.Null
    ]) | scala.Null
  ] = js.undefined
  var resizable: Anon_ContextDisableEnable[K, D]
  var sortable: js.UndefOr[
    (js.Function1[
      /* context */ atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.HeaderContext[K, D], 
      java.lang.String
    ]) | java.lang.String | scala.Null
  ] = js.undefined
  var style: js.UndefOr[
    (js.Function1[
      /* context */ atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.HeaderContext[K, D], 
      java.lang.String | scala.Unit | scala.Null
    ]) | java.lang.String | scala.Null
  ] = js.undefined
}

object Anon_ClassNameContextLabelRendererResizable {
  @scala.inline
  def apply[K, D](
    label: Anon_ClassNameContext[K, D],
    resizable: Anon_ContextDisableEnable[K, D],
    className: (js.Function1[
      /* context */ atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.HeaderContext[K, D], 
      java.lang.String | scala.Unit | scala.Null
    ]) | java.lang.String = null,
    renderer: js.Function1[
      /* context */ atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.HeaderContext[K, D], 
      Anon_InsertHTMLElement | scala.Unit | scala.Null
    ] = null,
    sortable: (js.Function1[
      /* context */ atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.HeaderContext[K, D], 
      java.lang.String
    ]) | java.lang.String = null,
    style: (js.Function1[
      /* context */ atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.HeaderContext[K, D], 
      java.lang.String | scala.Unit | scala.Null
    ]) | java.lang.String = null
  ): Anon_ClassNameContextLabelRendererResizable[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("resizable")(resizable)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    if (sortable != null) __obj.updateDynamic("sortable")(sortable.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClassNameContextLabelRendererResizable[K, D]]
  }
}

