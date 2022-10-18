package typings.pdfkit.PDFKit

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.node.NodeJS.ReadableStream
import typings.pdfkit.PDFKit.Mixins.PDFAcroForm
import typings.pdfkit.PDFKit.Mixins.PDFAnnotation
import typings.pdfkit.PDFKit.Mixins.PDFAttachment
import typings.pdfkit.PDFKit.Mixins.PDFColor
import typings.pdfkit.PDFKit.Mixins.PDFFont
import typings.pdfkit.PDFKit.Mixins.PDFImage
import typings.pdfkit.PDFKit.Mixins.PDFMarking
import typings.pdfkit.PDFKit.Mixins.PDFText
import typings.pdfkit.PDFKit.Mixins.PDFVector
import typings.pdfkit.anon.Count
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFDocument
  extends StObject
     with ReadableStream
     with PDFAnnotation
     with PDFColor
     with PDFImage
     with PDFText
     with PDFVector
     with PDFFont
     with PDFAcroForm
     with PDFMarking
     with PDFAttachment
     with Instantiable0[PDFDocument]
     with Instantiable1[/* options */ PDFDocumentOptions, PDFDocument] {
  
  def addContent(data: Any): PDFDocument = js.native
  
  def addPage(): PDFDocument = js.native
  def addPage(options: PDFDocumentOptions): PDFDocument = js.native
  
  def bufferedPageRange(): Count = js.native
  
  /**
    * Wheter streams should be compressed
    */
  var compress: Boolean = js.native
  
  def end(): Unit = js.native
  
  def flushPages(): Unit = js.native
  
  /**
    * PDF document Metadata
    */
  var info: DocumentInfo = js.native
  
  /**
    * Options for the document
    */
  var options: PDFDocumentOptions = js.native
  
  /**
    * Deprecated. Throws exception
    */
  def output(fn: Any): Unit = js.native
  
  /**
    * Represent the current page.
    */
  var page: PDFPage = js.native
  
  def ref(data: js.Object): PDFKitReference = js.native
  
  def switchToPage(): PDFPage = js.native
  def switchToPage(n: Double): PDFPage = js.native
  
  /**
    * PDF Version
    */
  var version: Double = js.native
  
  /**
    * Deprecated
    */
  def write(fileName: String, fn: Any): Unit = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
