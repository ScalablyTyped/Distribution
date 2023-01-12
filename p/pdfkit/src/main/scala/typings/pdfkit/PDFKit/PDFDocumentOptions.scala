package typings.pdfkit.PDFKit

import typings.pdfkit.anon.Bottom
import typings.pdfkit.pdfkitStrings.`1Dot3`
import typings.pdfkit.pdfkitStrings.`1Dot4`
import typings.pdfkit.pdfkitStrings.`1Dot5`
import typings.pdfkit.pdfkitStrings.`1Dot6`
import typings.pdfkit.pdfkitStrings.`1Dot7`
import typings.pdfkit.pdfkitStrings.`1Dot7ext3`
import typings.pdfkit.pdfkitStrings.landscape
import typings.pdfkit.pdfkitStrings.portrait
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PDFDocumentOptions extends StObject {
  
  var autoFirstPage: js.UndefOr[Boolean] = js.undefined
  
  var bufferPages: js.UndefOr[Boolean] = js.undefined
  
  var compress: js.UndefOr[Boolean] = js.undefined
  
  var displayTitle: js.UndefOr[Boolean] = js.undefined
  
  var font: js.UndefOr[String] = js.undefined
  
  var info: js.UndefOr[DocumentInfo] = js.undefined
  
  var lang: js.UndefOr[String] = js.undefined
  
  var layout: js.UndefOr[portrait | landscape] = js.undefined
  
  var margin: js.UndefOr[Double] = js.undefined
  
  var margins: js.UndefOr[Bottom] = js.undefined
  
  var ownerPassword: js.UndefOr[String] = js.undefined
  
  var pdfVersion: js.UndefOr[`1Dot3` | `1Dot4` | `1Dot5` | `1Dot6` | `1Dot7` | `1Dot7ext3`] = js.undefined
  
  var permissions: js.UndefOr[DocumentPermissions] = js.undefined
  
  var size: js.UndefOr[js.Array[Double] | String] = js.undefined
  
  var tagged: js.UndefOr[Boolean] = js.undefined
  
  var userPassword: js.UndefOr[String] = js.undefined
}
object PDFDocumentOptions {
  
  inline def apply(): PDFDocumentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PDFDocumentOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PDFDocumentOptions] (val x: Self) extends AnyVal {
    
    inline def setAutoFirstPage(value: Boolean): Self = StObject.set(x, "autoFirstPage", value.asInstanceOf[js.Any])
    
    inline def setAutoFirstPageUndefined: Self = StObject.set(x, "autoFirstPage", js.undefined)
    
    inline def setBufferPages(value: Boolean): Self = StObject.set(x, "bufferPages", value.asInstanceOf[js.Any])
    
    inline def setBufferPagesUndefined: Self = StObject.set(x, "bufferPages", js.undefined)
    
    inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
    
    inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
    
    inline def setDisplayTitle(value: Boolean): Self = StObject.set(x, "displayTitle", value.asInstanceOf[js.Any])
    
    inline def setDisplayTitleUndefined: Self = StObject.set(x, "displayTitle", js.undefined)
    
    inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setInfo(value: DocumentInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    inline def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setLayout(value: portrait | landscape): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMargins(value: Bottom): Self = StObject.set(x, "margins", value.asInstanceOf[js.Any])
    
    inline def setMarginsUndefined: Self = StObject.set(x, "margins", js.undefined)
    
    inline def setOwnerPassword(value: String): Self = StObject.set(x, "ownerPassword", value.asInstanceOf[js.Any])
    
    inline def setOwnerPasswordUndefined: Self = StObject.set(x, "ownerPassword", js.undefined)
    
    inline def setPdfVersion(value: `1Dot3` | `1Dot4` | `1Dot5` | `1Dot6` | `1Dot7` | `1Dot7ext3`): Self = StObject.set(x, "pdfVersion", value.asInstanceOf[js.Any])
    
    inline def setPdfVersionUndefined: Self = StObject.set(x, "pdfVersion", js.undefined)
    
    inline def setPermissions(value: DocumentPermissions): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setSize(value: js.Array[Double] | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSizeVarargs(value: Double*): Self = StObject.set(x, "size", js.Array(value*))
    
    inline def setTagged(value: Boolean): Self = StObject.set(x, "tagged", value.asInstanceOf[js.Any])
    
    inline def setTaggedUndefined: Self = StObject.set(x, "tagged", js.undefined)
    
    inline def setUserPassword(value: String): Self = StObject.set(x, "userPassword", value.asInstanceOf[js.Any])
    
    inline def setUserPasswordUndefined: Self = StObject.set(x, "userPassword", js.undefined)
  }
}
