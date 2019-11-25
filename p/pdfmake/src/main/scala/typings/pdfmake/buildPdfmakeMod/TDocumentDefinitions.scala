package typings.pdfmake.buildPdfmakeMod

import org.scalablytyped.runtime.StringDictionary
import typings.pdfmake.Anon_Height
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
  var pageSize: js.UndefOr[PageSize | Anon_Height] = js.undefined
  var styles: js.UndefOr[Style] = js.undefined
}

object TDocumentDefinitions {
  @scala.inline
  def apply(
    content: String | Content | (js.Array[String | Content]),
    background: String | (js.Function2[/* currentPage */ Double, /* pageSize */ PageSize, String | Content | Null]) = null,
    compress: js.UndefOr[Boolean] = js.undefined,
    defaultStyle: Style = null,
    footer: (/* currentPage */ Double, /* pageCount */ Double, /* pageSize */ js.UndefOr[Anon_Height]) => js.Any = null,
    header: (/* currentPage */ Double, /* pageCount */ Double, /* pageSize */ js.UndefOr[Anon_Height]) => js.Any = null,
    images: StringDictionary[String] = null,
    info: TDocumentInformation = null,
    pageBreakBefore: (/* currentNode */ js.UndefOr[CurrentNode], /* followingNodesOnPage */ js.UndefOr[js.Any], /* nodesOnNextPage */ js.UndefOr[js.Any], /* previousNodesOnPage */ js.UndefOr[js.Any]) => Boolean = null,
    pageMargins: Margins = null,
    pageOrientation: PageOrientation = null,
    pageSize: PageSize | Anon_Height = null,
    styles: Style = null
  ): TDocumentDefinitions = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress.asInstanceOf[js.Any])
    if (defaultStyle != null) __obj.updateDynamic("defaultStyle")(defaultStyle.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(js.Any.fromFunction3(footer))
    if (header != null) __obj.updateDynamic("header")(js.Any.fromFunction3(header))
    if (images != null) __obj.updateDynamic("images")(images.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (pageBreakBefore != null) __obj.updateDynamic("pageBreakBefore")(js.Any.fromFunction4(pageBreakBefore))
    if (pageMargins != null) __obj.updateDynamic("pageMargins")(pageMargins.asInstanceOf[js.Any])
    if (pageOrientation != null) __obj.updateDynamic("pageOrientation")(pageOrientation.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[TDocumentDefinitions]
  }
}

