package typings.pdfmake

import typings.pdfkit.PDFKit.PDFDocument
import typings.pdfmake.interfacesMod.BufferOptions
import typings.pdfmake.interfacesMod.TDocumentDefinitions
import typings.pdfmake.interfacesMod.TFontDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pdfmake", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with PdfPrinter {
    def this(fontDescriptors: TFontDictionary) = this()
  }
  
  @js.native
  trait PdfPrinter extends StObject {
    
    def createPdfKitDocument(docDefinition: TDocumentDefinitions): PDFDocument = js.native
    def createPdfKitDocument(docDefinition: TDocumentDefinitions, options: BufferOptions): PDFDocument = js.native
  }
}
