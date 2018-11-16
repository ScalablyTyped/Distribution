package typings
package pdfkitLib.PDFKitNs.MixinsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFColor[TDocument] extends js.Object {
  def fillColor(color: ColorValue): TDocument = js.native
  def fillColor(color: ColorValue, opacity: scala.Double): TDocument = js.native
  def fillOpacity(opacity: scala.Double): TDocument = js.native
  def linearGradient(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double): pdfkitLib.PDFKitNs.PDFLinearGradient = js.native
  def opacity(opacity: scala.Double): TDocument = js.native
  def radialGradient(
    x1: scala.Double,
    y1: scala.Double,
    r1: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    r2: scala.Double
  ): pdfkitLib.PDFKitNs.PDFRadialGradient = js.native
  def strokeColor(color: ColorValue): TDocument = js.native
  def strokeColor(color: ColorValue, opacity: scala.Double): TDocument = js.native
  def strokeOpacity(opacity: scala.Double): TDocument = js.native
}

