package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtableMod.ojTable.ColumnsRendererContext
import typings.oracleOraclejet.ojtableMod.ojTable.FooterRendererContext
import typings.oracleOraclejet.ojtableMod.ojTable.HeaderRendererContext
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.disabled
import typings.oracleOraclejet.oracleOraclejetStrings.enabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FooterClassName[K, D] extends js.Object {
  var className: js.UndefOr[String | Null] = js.undefined
  var field: js.UndefOr[String | Null] = js.undefined
  var footerClassName: js.UndefOr[String | Null] = js.undefined
  var footerRenderer: js.UndefOr[(js.Function1[/* context */ FooterRendererContext[K, D], `1` | Unit]) | Null] = js.undefined
  var footerStyle: js.UndefOr[String | Null] = js.undefined
  var footerTemplate: js.UndefOr[ComponentElementElement] = js.undefined
  var headerClassName: js.UndefOr[String | Null] = js.undefined
  var headerRenderer: js.UndefOr[(js.Function1[/* context */ HeaderRendererContext[K, D], `1` | Unit]) | Null] = js.undefined
  var headerStyle: js.UndefOr[String | Null] = js.undefined
  var headerTemplate: js.UndefOr[ComponentElementData] = js.undefined
  var headerText: js.UndefOr[String | Null] = js.undefined
  var renderer: js.UndefOr[(js.Function1[/* context */ ColumnsRendererContext[K, D], `1` | Unit]) | Null] = js.undefined
  var resizable: js.UndefOr[enabled | disabled] = js.undefined
  var sortProperty: js.UndefOr[String | Null] = js.undefined
  var sortable: js.UndefOr[auto | enabled | disabled] = js.undefined
  var style: js.UndefOr[String | Null] = js.undefined
  var template: js.UndefOr[Mode] = js.undefined
  var width: js.UndefOr[Double | Null] = js.undefined
}

object FooterClassName {
  @scala.inline
  def apply[K, D](
    className: js.UndefOr[Null | String] = js.undefined,
    field: js.UndefOr[Null | String] = js.undefined,
    footerClassName: js.UndefOr[Null | String] = js.undefined,
    footerRenderer: js.UndefOr[Null | (/* context */ FooterRendererContext[K, D] => `1` | Unit)] = js.undefined,
    footerStyle: js.UndefOr[Null | String] = js.undefined,
    footerTemplate: ComponentElementElement = null,
    headerClassName: js.UndefOr[Null | String] = js.undefined,
    headerRenderer: js.UndefOr[Null | (/* context */ HeaderRendererContext[K, D] => `1` | Unit)] = js.undefined,
    headerStyle: js.UndefOr[Null | String] = js.undefined,
    headerTemplate: ComponentElementData = null,
    headerText: js.UndefOr[Null | String] = js.undefined,
    renderer: js.UndefOr[Null | (/* context */ ColumnsRendererContext[K, D] => `1` | Unit)] = js.undefined,
    resizable: enabled | disabled = null,
    sortProperty: js.UndefOr[Null | String] = js.undefined,
    sortable: auto | enabled | disabled = null,
    style: js.UndefOr[Null | String] = js.undefined,
    template: Mode = null,
    width: js.UndefOr[Null | Double] = js.undefined
  ): FooterClassName[K, D] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(className)) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(field)) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (!js.isUndefined(footerClassName)) __obj.updateDynamic("footerClassName")(footerClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(footerRenderer)) __obj.updateDynamic("footerRenderer")(if (footerRenderer != null) js.Any.fromFunction1(footerRenderer.asInstanceOf[/* context */ FooterRendererContext[K, D] => `1` | Unit]) else null)
    if (!js.isUndefined(footerStyle)) __obj.updateDynamic("footerStyle")(footerStyle.asInstanceOf[js.Any])
    if (footerTemplate != null) __obj.updateDynamic("footerTemplate")(footerTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(headerClassName)) __obj.updateDynamic("headerClassName")(headerClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(headerRenderer)) __obj.updateDynamic("headerRenderer")(if (headerRenderer != null) js.Any.fromFunction1(headerRenderer.asInstanceOf[/* context */ HeaderRendererContext[K, D] => `1` | Unit]) else null)
    if (!js.isUndefined(headerStyle)) __obj.updateDynamic("headerStyle")(headerStyle.asInstanceOf[js.Any])
    if (headerTemplate != null) __obj.updateDynamic("headerTemplate")(headerTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(headerText)) __obj.updateDynamic("headerText")(headerText.asInstanceOf[js.Any])
    if (!js.isUndefined(renderer)) __obj.updateDynamic("renderer")(if (renderer != null) js.Any.fromFunction1(renderer.asInstanceOf[/* context */ ColumnsRendererContext[K, D] => `1` | Unit]) else null)
    if (resizable != null) __obj.updateDynamic("resizable")(resizable.asInstanceOf[js.Any])
    if (!js.isUndefined(sortProperty)) __obj.updateDynamic("sortProperty")(sortProperty.asInstanceOf[js.Any])
    if (sortable != null) __obj.updateDynamic("sortable")(sortable.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FooterClassName[K, D]]
  }
}

