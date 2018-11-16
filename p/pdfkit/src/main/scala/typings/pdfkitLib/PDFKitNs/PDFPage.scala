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

