package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.pdfkit.PDFKit.DocumentPermissions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TDocumentDefinitions extends StObject {
  
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
  
  inline def apply(content: Content): TDocumentDefinitions = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[TDocumentDefinitions]
  }
  
  extension [Self <: TDocumentDefinitions](x: Self) {
    
    inline def setBackground(value: DynamicBackground | Content): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundFunction2(value: (/* currentPage */ Double, /* pageSize */ ContextPageSize) => js.UndefOr[Content | Null]): Self = StObject.set(x, "background", js.Any.fromFunction2(value))
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
    
    inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
    
    inline def setContent(value: Content): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setDefaultStyle(value: Style): Self = StObject.set(x, "defaultStyle", value.asInstanceOf[js.Any])
    
    inline def setDefaultStyleUndefined: Self = StObject.set(x, "defaultStyle", js.undefined)
    
    inline def setFooter(value: DynamicContent | Content): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterFunction3(
      value: (/* currentPage */ Double, /* pageCount */ Double, /* pageSize */ ContextPageSize) => js.UndefOr[Content | Null]
    ): Self = StObject.set(x, "footer", js.Any.fromFunction3(value))
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setHeader(value: DynamicContent | Content): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderFunction3(
      value: (/* currentPage */ Double, /* pageCount */ Double, /* pageSize */ ContextPageSize) => js.UndefOr[Content | Null]
    ): Self = StObject.set(x, "header", js.Any.fromFunction3(value))
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setImages(value: StringDictionary[String]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
    
    inline def setInfo(value: TDocumentInformation): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    inline def setOwnerPassword(value: String): Self = StObject.set(x, "ownerPassword", value.asInstanceOf[js.Any])
    
    inline def setOwnerPasswordUndefined: Self = StObject.set(x, "ownerPassword", js.undefined)
    
    inline def setPageBreakBefore(
      value: (/* currentNode */ Node, /* followingNodesOnPage */ js.Array[Node], /* nodesOnNextPage */ js.Array[Node], /* previousNodesOnPage */ js.Array[Node]) => Boolean
    ): Self = StObject.set(x, "pageBreakBefore", js.Any.fromFunction4(value))
    
    inline def setPageBreakBeforeUndefined: Self = StObject.set(x, "pageBreakBefore", js.undefined)
    
    inline def setPageMargins(value: Margins): Self = StObject.set(x, "pageMargins", value.asInstanceOf[js.Any])
    
    inline def setPageMarginsUndefined: Self = StObject.set(x, "pageMargins", js.undefined)
    
    inline def setPageOrientation(value: PageOrientation): Self = StObject.set(x, "pageOrientation", value.asInstanceOf[js.Any])
    
    inline def setPageOrientationUndefined: Self = StObject.set(x, "pageOrientation", js.undefined)
    
    inline def setPageSize(value: PageSize): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPermissions(value: DocumentPermissions): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setStyles(value: StyleDictionary): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setUserPassword(value: String): Self = StObject.set(x, "userPassword", value.asInstanceOf[js.Any])
    
    inline def setUserPasswordUndefined: Self = StObject.set(x, "userPassword", js.undefined)
    
    inline def setVersion(value: PDFVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setWatermark(value: String | Watermark): Self = StObject.set(x, "watermark", value.asInstanceOf[js.Any])
    
    inline def setWatermarkUndefined: Self = StObject.set(x, "watermark", js.undefined)
  }
}
