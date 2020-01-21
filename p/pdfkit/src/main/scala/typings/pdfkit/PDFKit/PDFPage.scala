package typings.pdfkit.PDFKit

import typings.pdfkit.AnonBottom
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
  var margins: AnonBottom
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
    margins: AnonBottom,
    maxY: () => Double,
    patterns: js.Any,
    size: String,
    width: Double,
    write: js.Any => Unit,
    xobjects: js.Any
  ): PDFPage = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], dictionary = dictionary.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), ext_gstates = ext_gstates.asInstanceOf[js.Any], fonts = fonts.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], margins = margins.asInstanceOf[js.Any], maxY = js.Any.fromFunction0(maxY), patterns = patterns.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], write = js.Any.fromFunction1(write), xobjects = xobjects.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PDFPage]
  }
}

