package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.pdfkit.PDFKit.DocumentPermissions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TDocumentDefinitions extends js.Object {
  var background: js.UndefOr[DynamicBackground | Content] = js.undefined
  var compress: js.UndefOr[Boolean] = js.undefined
  var content: Content
  var defaultStyle: js.UndefOr[Style] = js.undefined
  var footer: js.UndefOr[DynamicContent | Content] = js.undefined
  var header: js.UndefOr[DynamicContent | Content] = js.undefined
  var images: js.UndefOr[StringDictionary[String]] = js.undefined
  var info: js.UndefOr[TDocumentInformation] = js.undefined
  var ownerPassword: js.UndefOr[String] = js.undefined
  var pageBreakBefore: js.UndefOr[
    js.Function4[
      /* currentNode */ Node, 
      /* followingNodesOnPage */ js.Array[Node], 
      /* nodesOnNextPage */ js.Array[Node], 
      /* previousNodesOnPage */ js.Array[Node], 
      Boolean
    ]
  ] = js.undefined
  var pageMargins: js.UndefOr[Margins] = js.undefined
  var pageOrientation: js.UndefOr[PageOrientation] = js.undefined
  var pageSize: js.UndefOr[PageSize] = js.undefined
  var permissions: js.UndefOr[DocumentPermissions] = js.undefined
  var styles: js.UndefOr[StyleDictionary] = js.undefined
  var userPassword: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[PDFVersion] = js.undefined
  var watermark: js.UndefOr[String | Watermark] = js.undefined
}

object TDocumentDefinitions {
  @scala.inline
  def apply(
    content: Content,
    background: DynamicBackground | Content = null,
    compress: js.UndefOr[Boolean] = js.undefined,
    defaultStyle: Style = null,
    footer: DynamicContent | Content = null,
    header: DynamicContent | Content = null,
    images: StringDictionary[String] = null,
    info: TDocumentInformation = null,
    ownerPassword: String = null,
    pageBreakBefore: (/* currentNode */ Node, /* followingNodesOnPage */ js.Array[Node], /* nodesOnNextPage */ js.Array[Node], /* previousNodesOnPage */ js.Array[Node]) => Boolean = null,
    pageMargins: Margins = null,
    pageOrientation: PageOrientation = null,
    pageSize: PageSize = null,
    permissions: DocumentPermissions = null,
    styles: StyleDictionary = null,
    userPassword: String = null,
    version: PDFVersion = null,
    watermark: String | Watermark = null
  ): TDocumentDefinitions = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress.asInstanceOf[js.Any])
    if (defaultStyle != null) __obj.updateDynamic("defaultStyle")(defaultStyle.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (images != null) __obj.updateDynamic("images")(images.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (ownerPassword != null) __obj.updateDynamic("ownerPassword")(ownerPassword.asInstanceOf[js.Any])
    if (pageBreakBefore != null) __obj.updateDynamic("pageBreakBefore")(js.Any.fromFunction4(pageBreakBefore))
    if (pageMargins != null) __obj.updateDynamic("pageMargins")(pageMargins.asInstanceOf[js.Any])
    if (pageOrientation != null) __obj.updateDynamic("pageOrientation")(pageOrientation.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (userPassword != null) __obj.updateDynamic("userPassword")(userPassword.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (watermark != null) __obj.updateDynamic("watermark")(watermark.asInstanceOf[js.Any])
    __obj.asInstanceOf[TDocumentDefinitions]
  }
}

