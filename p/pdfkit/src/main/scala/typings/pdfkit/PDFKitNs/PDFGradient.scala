package typings.pdfkit.PDFKitNs

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFGradient
  extends Instantiable1[/* document */ js.Any, PDFGradient] {
  @JSName("apply")
  def apply(): Unit = js.native
  def embed(): Unit = js.native
  def stop(pos: Double): PDFGradient = js.native
  def stop(pos: Double, color: String): PDFGradient = js.native
  def stop(pos: Double, color: String, opacity: Double): PDFGradient = js.native
  def stop(pos: Double, color: PDFGradient): PDFGradient = js.native
  def stop(pos: Double, color: PDFGradient, opacity: Double): PDFGradient = js.native
}

