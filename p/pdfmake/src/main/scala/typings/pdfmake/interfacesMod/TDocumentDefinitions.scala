package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.pdfkit.PDFKit.DocumentPermissions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TDocumentDefinitions extends js.Object {
  var background: js.UndefOr[DynamicBackground | Content] = js.native
  var compress: js.UndefOr[Boolean] = js.native
  var content: Content = js.native
  var defaultStyle: js.UndefOr[Style] = js.native
  var footer: js.UndefOr[DynamicContent | Content] = js.native
  var header: js.UndefOr[DynamicContent | Content] = js.native
  var images: js.UndefOr[StringDictionary[String]] = js.native
  var info: js.UndefOr[TDocumentInformation] = js.native
  var ownerPassword: js.UndefOr[String] = js.native
  var pageBreakBefore: js.UndefOr[
    js.Function4[
      /* currentNode */ Node, 
      /* followingNodesOnPage */ js.Array[Node], 
      /* nodesOnNextPage */ js.Array[Node], 
      /* previousNodesOnPage */ js.Array[Node], 
      Boolean
    ]
  ] = js.native
  var pageMargins: js.UndefOr[Margins] = js.native
  var pageOrientation: js.UndefOr[PageOrientation] = js.native
  var pageSize: js.UndefOr[PageSize] = js.native
  var permissions: js.UndefOr[DocumentPermissions] = js.native
  var styles: js.UndefOr[StyleDictionary] = js.native
  var userPassword: js.UndefOr[String] = js.native
  var version: js.UndefOr[PDFVersion] = js.native
  var watermark: js.UndefOr[String | Watermark] = js.native
}

object TDocumentDefinitions {
  @scala.inline
  def apply(content: Content): TDocumentDefinitions = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[TDocumentDefinitions]
  }
  @scala.inline
  implicit class TDocumentDefinitionsOps[Self <: TDocumentDefinitions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContent(value: Content): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackgroundFunction2(value: (/* currentPage */ Double, /* pageSize */ ContextPageSize) => js.UndefOr[Content | Null]): Self = this.set("background", js.Any.fromFunction2(value))
    @scala.inline
    def setBackground(value: DynamicBackground | Content): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setCompress(value: Boolean): Self = this.set("compress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompress: Self = this.set("compress", js.undefined)
    @scala.inline
    def setDefaultStyle(value: Style): Self = this.set("defaultStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultStyle: Self = this.set("defaultStyle", js.undefined)
    @scala.inline
    def setFooterFunction3(
      value: (/* currentPage */ Double, /* pageCount */ Double, /* pageSize */ ContextPageSize) => js.UndefOr[Content | Null]
    ): Self = this.set("footer", js.Any.fromFunction3(value))
    @scala.inline
    def setFooter(value: DynamicContent | Content): Self = this.set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    @scala.inline
    def setHeaderFunction3(
      value: (/* currentPage */ Double, /* pageCount */ Double, /* pageSize */ ContextPageSize) => js.UndefOr[Content | Null]
    ): Self = this.set("header", js.Any.fromFunction3(value))
    @scala.inline
    def setHeader(value: DynamicContent | Content): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setImages(value: StringDictionary[String]): Self = this.set("images", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImages: Self = this.set("images", js.undefined)
    @scala.inline
    def setInfo(value: TDocumentInformation): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
    @scala.inline
    def setOwnerPassword(value: String): Self = this.set("ownerPassword", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerPassword: Self = this.set("ownerPassword", js.undefined)
    @scala.inline
    def setPageBreakBefore(
      value: (/* currentNode */ Node, /* followingNodesOnPage */ js.Array[Node], /* nodesOnNextPage */ js.Array[Node], /* previousNodesOnPage */ js.Array[Node]) => Boolean
    ): Self = this.set("pageBreakBefore", js.Any.fromFunction4(value))
    @scala.inline
    def deletePageBreakBefore: Self = this.set("pageBreakBefore", js.undefined)
    @scala.inline
    def setPageMargins(value: Margins): Self = this.set("pageMargins", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageMargins: Self = this.set("pageMargins", js.undefined)
    @scala.inline
    def setPageOrientation(value: PageOrientation): Self = this.set("pageOrientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageOrientation: Self = this.set("pageOrientation", js.undefined)
    @scala.inline
    def setPageSize(value: PageSize): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPermissions(value: DocumentPermissions): Self = this.set("permissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermissions: Self = this.set("permissions", js.undefined)
    @scala.inline
    def setStyles(value: StyleDictionary): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setUserPassword(value: String): Self = this.set("userPassword", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserPassword: Self = this.set("userPassword", js.undefined)
    @scala.inline
    def setVersion(value: PDFVersion): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    @scala.inline
    def setWatermark(value: String | Watermark): Self = this.set("watermark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWatermark: Self = this.set("watermark", js.undefined)
  }
  
}

