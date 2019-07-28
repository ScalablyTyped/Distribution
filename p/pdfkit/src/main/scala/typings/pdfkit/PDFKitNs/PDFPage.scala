package typings.pdfkit.PDFKitNs

import typings.pdfkit.Anon_Bottom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represent a single page in the PDF document
  */
trait PDFPage extends js.Object {
  var annotations: js.Any
  var content: PDFKitReference
  /**
    * The page dictionnary
    */
  var dictionary: PDFKitReference
  var document: PDFDocument
  var ext_gstates: js.Any
  var fonts: js.Any
  var height: Double
  var layout: String
  var margins: Anon_Bottom
  var patterns: js.Any
  var size: String
  var width: Double
  var xobjects: js.Any
  def end(): Unit
  def maxY(): Double
  def write(chunk: js.Any): Unit
}

object PDFPage {
  @scala.inline
  def apply(
    annotations: js.Any,
    content: PDFKitReference,
    dictionary: PDFKitReference,
    document: PDFDocument,
    end: () => Unit,
    ext_gstates: js.Any,
    fonts: js.Any,
    height: Double,
    layout: String,
    margins: Anon_Bottom,
    maxY: () => Double,
    patterns: js.Any,
    size: String,
    width: Double,
    write: js.Any => Unit,
    xobjects: js.Any
  ): PDFPage = {
    val __obj = js.Dynamic.literal(annotations = annotations, content = content, dictionary = dictionary, document = document, end = js.Any.fromFunction0(end), ext_gstates = ext_gstates, fonts = fonts, height = height, layout = layout, margins = margins, maxY = js.Any.fromFunction0(maxY), patterns = patterns, size = size, width = width, write = js.Any.fromFunction1(write), xobjects = xobjects)
  
    __obj.asInstanceOf[PDFPage]
  }
}

