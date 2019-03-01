package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassNameContext[K, D] extends js.Object {
  var className: js.UndefOr[
    (js.Function1[
      /* context */ atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.LabelContext[K, D], 
      java.lang.String | scala.Unit | scala.Null
    ]) | java.lang.String | scala.Null
  ] = js.undefined
  var renderer: js.UndefOr[
    (js.Function1[
      /* context */ atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.LabelContext[K, D], 
      Anon_InsertHTMLElement | scala.Unit | scala.Null
    ]) | scala.Null
  ] = js.undefined
  var style: js.UndefOr[
    (js.Function1[
      /* context */ atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.LabelContext[K, D], 
      java.lang.String | scala.Unit | scala.Null
    ]) | java.lang.String | scala.Null
  ] = js.undefined
}

object Anon_ClassNameContext {
  @scala.inline
  def apply[K, D](
    className: (js.Function1[
      /* context */ atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.LabelContext[K, D], 
      java.lang.String | scala.Unit | scala.Null
    ]) | java.lang.String = null,
    renderer: js.Function1[
      /* context */ atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.LabelContext[K, D], 
      Anon_InsertHTMLElement | scala.Unit | scala.Null
    ] = null,
    style: (js.Function1[
      /* context */ atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.LabelContext[K, D], 
      java.lang.String | scala.Unit | scala.Null
    ]) | java.lang.String = null
  ): Anon_ClassNameContext[K, D] = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClassNameContext[K, D]]
  }
}

