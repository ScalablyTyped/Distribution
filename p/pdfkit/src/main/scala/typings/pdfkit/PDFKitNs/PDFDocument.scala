package typings.pdfkit.PDFKitNs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.node.NodeJSNs.ReadableStream
import typings.pdfkit.Anon_Count
import typings.pdfkit.PDFKitNs.MixinsNs.PDFAnnotation
import typings.pdfkit.PDFKitNs.MixinsNs.PDFColor
import typings.pdfkit.PDFKitNs.MixinsNs.PDFFont
import typings.pdfkit.PDFKitNs.MixinsNs.PDFImage
import typings.pdfkit.PDFKitNs.MixinsNs.PDFText
import typings.pdfkit.PDFKitNs.MixinsNs.PDFVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFDocument
  extends ReadableStream
     with PDFAnnotation
     with PDFColor
     with PDFImage
     with PDFText
     with PDFVector
     with PDFFont
     with Instantiable0[PDFDocument]
     with Instantiable1[/* options */ PDFDocumentOptions, PDFDocument] {
  /**
    * Wheter streams should be compressed
    */
  var compress: Boolean = js.native
  /**
    * PDF document Metadata
    */
  var info: DocumentInfo = js.native
  /**
    * Options for the document
    */
  var options: PDFDocumentOptions = js.native
  /**
    * Represent the current page.
    */
  var page: PDFPage = js.native
  /**
    * PDF Version
    */
  var version: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  def addContent(data: js.Any): PDFDocument = js.native
  def addPage(): PDFDocument = js.native
  def addPage(options: PDFDocumentOptions): PDFDocument = js.native
  def bufferedPageRange(): Anon_Count = js.native
  def end(): Unit = js.native
  def flushPages(): Unit = js.native
  /**
    * Deprecated. Throws exception
    */
  def output(fn: js.Any): Unit = js.native
  def ref(data: js.Object): PDFKitReference = js.native
  def switchToPage(): PDFPage = js.native
  def switchToPage(n: Double): PDFPage = js.native
  /**
    * Deprecated
    */
  def write(fileName: String, fn: js.Any): Unit = js.native
}

