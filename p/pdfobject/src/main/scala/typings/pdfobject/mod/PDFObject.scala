package typings.pdfobject.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFObject extends js.Object {
  var pdfobjectversion: String = js.native
  var supportsPDFs: Boolean = js.native
  def embed(url: String): HTMLElement = js.native
  def embed(url: String, target: js.UndefOr[scala.Nothing], options: js.Any): HTMLElement = js.native
  def embed(url: String, target: js.Any): HTMLElement = js.native
  def embed(url: String, target: js.Any, options: js.Any): HTMLElement = js.native
}

