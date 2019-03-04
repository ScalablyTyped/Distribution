package typings
package pdfmakeLib.buildPdfmakeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TDocumentDefinitions extends js.Object {
  var compress: js.UndefOr[scala.Boolean] = js.undefined
  var content: java.lang.String | Content
  var defaultStyle: js.UndefOr[Style] = js.undefined
  var footer: js.UndefOr[TDocumentHeaderFooterFunction] = js.undefined
  var header: js.UndefOr[TDocumentHeaderFooterFunction] = js.undefined
  var info: js.UndefOr[TDocumentInformation] = js.undefined
  var pageMargins: js.UndefOr[Margins] = js.undefined
  var pageOrientation: js.UndefOr[PageOrientation] = js.undefined
  var pageSize: js.UndefOr[PageSize] = js.undefined
  var styles: js.UndefOr[Style] = js.undefined
}

object TDocumentDefinitions {
  @scala.inline
  def apply(
    content: java.lang.String | Content,
    compress: js.UndefOr[scala.Boolean] = js.undefined,
    defaultStyle: Style = null,
    footer: TDocumentHeaderFooterFunction = null,
    header: TDocumentHeaderFooterFunction = null,
    info: TDocumentInformation = null,
    pageMargins: Margins = null,
    pageOrientation: PageOrientation = null,
    pageSize: PageSize = null,
    styles: Style = null
  ): TDocumentDefinitions = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress)
    if (defaultStyle != null) __obj.updateDynamic("defaultStyle")(defaultStyle)
    if (footer != null) __obj.updateDynamic("footer")(footer)
    if (header != null) __obj.updateDynamic("header")(header)
    if (info != null) __obj.updateDynamic("info")(info)
    if (pageMargins != null) __obj.updateDynamic("pageMargins")(pageMargins.asInstanceOf[js.Any])
    if (pageOrientation != null) __obj.updateDynamic("pageOrientation")(pageOrientation)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[TDocumentDefinitions]
  }
}

