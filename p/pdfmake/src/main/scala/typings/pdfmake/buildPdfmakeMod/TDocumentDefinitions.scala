package typings.pdfmake.buildPdfmakeMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TDocumentDefinitions extends js.Object {
  var background: js.UndefOr[
    String | (js.Function2[/* currentPage */ Double, /* pageSize */ PageSize, String | Content | Null])
  ] = js.undefined
  var compress: js.UndefOr[Boolean] = js.undefined
  var content: String | Content | (js.Array[String | Content])
  var defaultStyle: js.UndefOr[Style] = js.undefined
  var footer: js.UndefOr[TDocumentHeaderFooterFunction] = js.undefined
  var header: js.UndefOr[TDocumentHeaderFooterFunction] = js.undefined
  var images: js.UndefOr[StringDictionary[String]] = js.undefined
  var info: js.UndefOr[TDocumentInformation] = js.undefined
  var pageBreakBefore: js.UndefOr[
    js.Function4[
      /* currentNode */ js.UndefOr[CurrentNode], 
      /* followingNodesOnPage */ js.UndefOr[js.Any], 
      /* nodesOnNextPage */ js.UndefOr[js.Any], 
      /* previousNodesOnPage */ js.UndefOr[js.Any], 
      Boolean
    ]
  ] = js.undefined
  var pageMargins: js.UndefOr[Margins] = js.undefined
  var pageOrientation: js.UndefOr[PageOrientation] = js.undefined
  var pageSize: js.UndefOr[PageSize] = js.undefined
  var styles: js.UndefOr[Style] = js.undefined
}

object TDocumentDefinitions {
  @scala.inline
  def apply(
    content: String | Content | (js.Array[String | Content]),
    background: String | (js.Function2[/* currentPage */ Double, /* pageSize */ PageSize, String | Content | Null]) = null,
    compress: js.UndefOr[Boolean] = js.undefined,
    defaultStyle: Style = null,
    footer: TDocumentHeaderFooterFunction = null,
    header: TDocumentHeaderFooterFunction = null,
    images: StringDictionary[String] = null,
    info: TDocumentInformation = null,
    pageBreakBefore: (/* currentNode */ js.UndefOr[CurrentNode], /* followingNodesOnPage */ js.UndefOr[js.Any], /* nodesOnNextPage */ js.UndefOr[js.Any], /* previousNodesOnPage */ js.UndefOr[js.Any]) => Boolean = null,
    pageMargins: Margins = null,
    pageOrientation: PageOrientation = null,
    pageSize: PageSize = null,
    styles: Style = null
  ): TDocumentDefinitions = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress)
    if (defaultStyle != null) __obj.updateDynamic("defaultStyle")(defaultStyle)
    if (footer != null) __obj.updateDynamic("footer")(footer)
    if (header != null) __obj.updateDynamic("header")(header)
    if (images != null) __obj.updateDynamic("images")(images)
    if (info != null) __obj.updateDynamic("info")(info)
    if (pageBreakBefore != null) __obj.updateDynamic("pageBreakBefore")(js.Any.fromFunction4(pageBreakBefore))
    if (pageMargins != null) __obj.updateDynamic("pageMargins")(pageMargins.asInstanceOf[js.Any])
    if (pageOrientation != null) __obj.updateDynamic("pageOrientation")(pageOrientation)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[TDocumentDefinitions]
  }
}

