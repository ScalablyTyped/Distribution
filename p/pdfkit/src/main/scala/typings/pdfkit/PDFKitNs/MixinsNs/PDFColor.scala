package typings.pdfkit.PDFKitNs.MixinsNs

import typings.pdfkit.PDFKitNs.PDFLinearGradient
import typings.pdfkit.PDFKitNs.PDFRadialGradient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFColor[TDocument] extends js.Object {
  def fillColor(color: ColorValue): TDocument = js.native
  def fillColor(color: ColorValue, opacity: Double): TDocument = js.native
  def fillOpacity(opacity: Double): TDocument = js.native
  def linearGradient(x1: Double, y1: Double, x2: Double, y2: Double): PDFLinearGradient = js.native
  def opacity(opacity: Double): TDocument = js.native
  def radialGradient(x1: Double, y1: Double, r1: Double, x2: Double, y2: Double, r2: Double): PDFRadialGradient = js.native
  def strokeColor(color: ColorValue): TDocument = js.native
  def strokeColor(color: ColorValue, opacity: Double): TDocument = js.native
  def strokeOpacity(opacity: Double): TDocument = js.native
}

