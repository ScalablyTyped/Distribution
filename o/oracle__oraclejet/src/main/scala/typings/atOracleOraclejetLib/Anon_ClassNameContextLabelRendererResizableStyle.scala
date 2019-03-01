package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassNameContextLabelRendererResizableStyle[K, D] extends js.Object {
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
  var style: js.UndefOr[
    (js.Function1[
      /* context */ atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.HeaderContext[K, D], 
      java.lang.String | scala.Unit | scala.Null
    ]) | java.lang.String | scala.Null
  ] = js.undefined
}

object Anon_ClassNameContextLabelRendererResizableStyle {
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
    style: (js.Function1[
      /* context */ atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.HeaderContext[K, D], 
      java.lang.String | scala.Unit | scala.Null
    ]) | java.lang.String = null
  ): Anon_ClassNameContextLabelRendererResizableStyle[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("resizable")(resizable)
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClassNameContextLabelRendererResizableStyle[K, D]]
  }
}

