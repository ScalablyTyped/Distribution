package typings.pdfjsDist.anon

import typings.pdfjsDist.interfacesMod.PDFPageProxy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PdfPage extends StObject {
  
  var pdfPage: PDFPageProxy
}
object PdfPage {
  
  inline def apply(pdfPage: PDFPageProxy): PdfPage = {
    val __obj = js.Dynamic.literal(pdfPage = pdfPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[PdfPage]
  }
  
  extension [Self <: PdfPage](x: Self) {
    
    inline def setPdfPage(value: PDFPageProxy): Self = StObject.set(x, "pdfPage", value.asInstanceOf[js.Any])
  }
}
