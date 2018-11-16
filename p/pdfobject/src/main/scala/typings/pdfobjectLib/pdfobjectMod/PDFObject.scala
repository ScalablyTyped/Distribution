package typings
package pdfobjectLib.pdfobjectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFObject extends js.Object {
  var pdfobjectversion: java.lang.String = js.native
  var supportsPDFs: scala.Boolean = js.native
  def embed(url: java.lang.String): stdLib.HTMLElement = js.native
  def embed(url: java.lang.String, target: js.Any): stdLib.HTMLElement = js.native
  def embed(url: java.lang.String, target: js.Any, options: js.Any): stdLib.HTMLElement = js.native
}

