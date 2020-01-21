package typings.pdfkit.PDFKit.Mixins

import typings.pdfkit.AnonOrigin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFVector extends js.Object {
  def bezierCurveTo(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double): this.type = js.native
  def circle(x: Double, y: Double, raduis: Double): this.type = js.native
  def clip(): this.type = js.native
  def clip(rule: RuleValue): this.type = js.native
  def closePath(): this.type = js.native
  def dash(length: Double, option: js.Any): this.type = js.native
  def ellipse(x: Double, y: Double, r1: Double): this.type = js.native
  def ellipse(x: Double, y: Double, r1: Double, r2: Double): this.type = js.native
  def fill(): this.type = js.native
  def fill(color: ColorValue): this.type = js.native
  def fill(color: ColorValue, rule: RuleValue): this.type = js.native
  def fill(rule: RuleValue): this.type = js.native
  def fillAndStroke(): this.type = js.native
  def fillAndStroke(fillColor: ColorValue): this.type = js.native
  def fillAndStroke(fillColor: ColorValue, rule: RuleValue): this.type = js.native
  def fillAndStroke(fillColor: ColorValue, strokeColor: ColorValue): this.type = js.native
  def fillAndStroke(fillColor: ColorValue, strokeColor: ColorValue, rule: RuleValue): this.type = js.native
  def fillAndStroke(rule: RuleValue): this.type = js.native
  def lineCap(c: String): this.type = js.native
  def lineJoin(j: String): this.type = js.native
  def lineTo(x: Double, y: Double): this.type = js.native
  def lineWidth(w: Double): this.type = js.native
  def miterLimit(m: js.Any): this.type = js.native
  def moveTo(x: Double, y: Double): this.type = js.native
  def path(path: String): this.type = js.native
  def polygon(points: js.Array[Double]*): this.type = js.native
  def quadraticCurveTo(cpx: Double, cpy: Double, x: Double, y: Double): this.type = js.native
  def rect(x: Double, y: Double, w: Double, h: Double): this.type = js.native
  def restore(): this.type = js.native
  def rotate(angle: Double): this.type = js.native
  def rotate(angle: Double, options: AnonOrigin): this.type = js.native
  def roundedRect(x: Double, y: Double, w: Double, h: Double): this.type = js.native
  def roundedRect(x: Double, y: Double, w: Double, h: Double, r: Double): this.type = js.native
  def save(): this.type = js.native
  def scale(xFactor: Double): this.type = js.native
  def scale(xFactor: Double, yFactor: Double): this.type = js.native
  def scale(xFactor: Double, yFactor: Double, options: AnonOrigin): this.type = js.native
  def stroke(): this.type = js.native
  def stroke(color: ColorValue): this.type = js.native
  def transform(m11: Double, m12: Double, m21: Double, m22: Double, dx: Double, dy: Double): this.type = js.native
  def translate(x: Double, y: Double): this.type = js.native
  def undash(): this.type = js.native
}

