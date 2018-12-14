package typings
package pdfkitLib.PDFKitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFDocument
  extends nodeLib.NodeJSNs.ReadableStream
     with pdfkitLib.PDFKitNs.MixinsNs.PDFAnnotation[PDFDocument]
     with pdfkitLib.PDFKitNs.MixinsNs.PDFColor[PDFDocument]
     with pdfkitLib.PDFKitNs.MixinsNs.PDFImage[PDFDocument]
     with pdfkitLib.PDFKitNs.MixinsNs.PDFText[PDFDocument]
     with pdfkitLib.PDFKitNs.MixinsNs.PDFVector[PDFDocument]
     with pdfkitLib.PDFKitNs.MixinsNs.PDFFont[PDFDocument]
     with org.scalablytyped.runtime.Instantiable0[PDFDocument]
     with org.scalablytyped.runtime.Instantiable1[/* options */ PDFDocumentOptions, PDFDocument] {
  /**
          * Wheter streams should be compressed
          */
  var compress: scala.Boolean = js.native
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
  var version: scala.Double = js.native
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  def addContent(data: js.Any): PDFDocument = js.native
  def addPage(): PDFDocument = js.native
  def addPage(options: PDFDocumentOptions): PDFDocument = js.native
  def bufferedPageRange(): pdfkitLib.Anon_Count = js.native
  def end(): scala.Unit = js.native
  def flushPages(): scala.Unit = js.native
  /**
          * Deprecated. Throws exception
          */
  def output(fn: js.Any): scala.Unit = js.native
  def ref(data: js.Object): PDFKitReference = js.native
  def switchToPage(): PDFPage = js.native
  def switchToPage(n: scala.Double): PDFPage = js.native
  /**
          * Deprecated
          */
  def write(fileName: java.lang.String, fn: js.Any): scala.Unit = js.native
}

