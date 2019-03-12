package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoClassNameContext[K, D] extends js.Object {
  var className: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var field: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var footerClassName: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var footerRenderer: js.UndefOr[
    (js.Function1[
      /* context */ atOracleOraclejetLib.ojtableMod.ojTableNs.FooterRendererContext[K, D], 
      Anon_InsertHTMLElement | scala.Unit
    ]) | scala.Null
  ] = js.undefined
  var footerStyle: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var footerTemplate: js.UndefOr[Anon_ComponentElementElement] = js.undefined
  var headerClassName: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var headerRenderer: js.UndefOr[
    (js.Function1[
      /* context */ atOracleOraclejetLib.ojtableMod.ojTableNs.HeaderRendererContext[K, D], 
      Anon_InsertHTMLElement | scala.Unit
    ]) | scala.Null
  ] = js.undefined
  var headerStyle: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var headerTemplate: js.UndefOr[Anon_ComponentElementData] = js.undefined
  var headerText: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var renderer: js.UndefOr[
    (js.Function1[
      /* context */ atOracleOraclejetLib.ojtableMod.ojTableNs.ColumnsRendererContext[K, D], 
      Anon_InsertHTMLElement | scala.Unit
    ]) | scala.Null
  ] = js.undefined
  var resizable: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled
  ] = js.undefined
  var sortProperty: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var sortable: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled
  ] = js.undefined
  var style: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var template: js.UndefOr[Anon_ColumnIndexComponentElement] = js.undefined
  var width: js.UndefOr[scala.Double | scala.Null] = js.undefined
}

object Anon_AutoClassNameContext {
  @scala.inline
  def apply[K, D](
    className: java.lang.String = null,
    field: java.lang.String = null,
    footerClassName: java.lang.String = null,
    footerRenderer: /* context */ atOracleOraclejetLib.ojtableMod.ojTableNs.FooterRendererContext[K, D] => Anon_InsertHTMLElement | scala.Unit = null,
    footerStyle: java.lang.String = null,
    footerTemplate: Anon_ComponentElementElement = null,
    headerClassName: java.lang.String = null,
    headerRenderer: /* context */ atOracleOraclejetLib.ojtableMod.ojTableNs.HeaderRendererContext[K, D] => Anon_InsertHTMLElement | scala.Unit = null,
    headerStyle: java.lang.String = null,
    headerTemplate: Anon_ComponentElementData = null,
    headerText: java.lang.String = null,
    renderer: /* context */ atOracleOraclejetLib.ojtableMod.ojTableNs.ColumnsRendererContext[K, D] => Anon_InsertHTMLElement | scala.Unit = null,
    resizable: atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled = null,
    sortProperty: java.lang.String = null,
    sortable: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled = null,
    style: java.lang.String = null,
    template: Anon_ColumnIndexComponentElement = null,
    width: scala.Int | scala.Double = null
  ): Anon_AutoClassNameContext[K, D] = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (field != null) __obj.updateDynamic("field")(field)
    if (footerClassName != null) __obj.updateDynamic("footerClassName")(footerClassName)
    if (footerRenderer != null) __obj.updateDynamic("footerRenderer")(js.Any.fromFunction1(footerRenderer))
    if (footerStyle != null) __obj.updateDynamic("footerStyle")(footerStyle)
    if (footerTemplate != null) __obj.updateDynamic("footerTemplate")(footerTemplate)
    if (headerClassName != null) __obj.updateDynamic("headerClassName")(headerClassName)
    if (headerRenderer != null) __obj.updateDynamic("headerRenderer")(js.Any.fromFunction1(headerRenderer))
    if (headerStyle != null) __obj.updateDynamic("headerStyle")(headerStyle)
    if (headerTemplate != null) __obj.updateDynamic("headerTemplate")(headerTemplate)
    if (headerText != null) __obj.updateDynamic("headerText")(headerText)
    if (renderer != null) __obj.updateDynamic("renderer")(js.Any.fromFunction1(renderer))
    if (resizable != null) __obj.updateDynamic("resizable")(resizable.asInstanceOf[js.Any])
    if (sortProperty != null) __obj.updateDynamic("sortProperty")(sortProperty)
    if (sortable != null) __obj.updateDynamic("sortable")(sortable.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (template != null) __obj.updateDynamic("template")(template)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AutoClassNameContext[K, D]]
  }
}

