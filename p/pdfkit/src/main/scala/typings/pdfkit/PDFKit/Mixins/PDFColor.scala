package typings.pdfkit.PDFKit.Mixins

import typings.pdfkit.PDFKit.PDFLinearGradient
import typings.pdfkit.PDFKit.PDFRadialGradient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFColor extends js.Object {
  
  def fillColor(color: ColorValue): this.type = js.native
  def fillColor(color: ColorValue, opacity: Double): this.type = js.native
  
  def fillOpacity(opacity: Double): this.type = js.native
  
  def linearGradient(x1: Double, y1: Double, x2: Double, y2: Double): PDFLinearGradient = js.native
  
  def opacity(opacity: Double): this.type = js.native
  
  def radialGradient(x1: Double, y1: Double, r1: Double, x2: Double, y2: Double, r2: Double): PDFRadialGradient = js.native
  
  def strokeColor(color: ColorValue): this.type = js.native
  def strokeColor(color: ColorValue, opacity: Double): this.type = js.native
  
  def strokeOpacity(opacity: Double): this.type = js.native
}
