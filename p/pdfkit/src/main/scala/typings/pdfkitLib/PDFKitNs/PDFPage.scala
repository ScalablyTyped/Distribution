package typings
package pdfkitLib.PDFKitNs

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
  var height: scala.Double
  var layout: java.lang.String
  var margins: pdfkitLib.Anon_Bottom
  var patterns: js.Any
  var size: java.lang.String
  var width: scala.Double
  var xobjects: js.Any
  def end(): scala.Unit
  def maxY(): scala.Double
  def write(chunk: js.Any): scala.Unit
}

object PDFPage {
  @scala.inline
  def apply(
    annotations: js.Any,
    content: PDFKitReference,
    dictionary: PDFKitReference,
    document: PDFDocument,
    end: () => scala.Unit,
    ext_gstates: js.Any,
    fonts: js.Any,
    height: scala.Double,
    layout: java.lang.String,
    margins: pdfkitLib.Anon_Bottom,
    maxY: () => scala.Double,
    patterns: js.Any,
    size: java.lang.String,
    width: scala.Double,
    write: js.Any => scala.Unit,
    xobjects: js.Any
  ): PDFPage = {
    val __obj = js.Dynamic.literal(annotations = annotations, content = content, dictionary = dictionary, document = document, end = js.Any.fromFunction0(end), ext_gstates = ext_gstates, fonts = fonts, height = height, layout = layout, margins = margins, maxY = js.Any.fromFunction0(maxY), patterns = patterns, size = size, width = width, write = js.Any.fromFunction1(write), xobjects = xobjects)
  
    __obj.asInstanceOf[PDFPage]
  }
}

