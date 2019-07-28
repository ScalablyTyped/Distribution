package typings.pdfkit.PDFKitNs.MixinsNs

import typings.pdfkit.Anon_Origin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFVector[TDocument] extends js.Object {
  def bezierCurveTo(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double): TDocument = js.native
  def circle(x: Double, y: Double, raduis: Double): TDocument = js.native
  def clip(): TDocument = js.native
  def clip(rule: RuleValue): TDocument = js.native
  def closePath(): TDocument = js.native
  def dash(length: Double, option: js.Any): TDocument = js.native
  def ellipse(x: Double, y: Double, r1: Double): TDocument = js.native
  def ellipse(x: Double, y: Double, r1: Double, r2: Double): TDocument = js.native
  def fill(): TDocument = js.native
  def fill(color: ColorValue): TDocument = js.native
  def fill(color: ColorValue, rule: RuleValue): TDocument = js.native
  def fill(rule: RuleValue): TDocument = js.native
  def fillAndStroke(): TDocument = js.native
  def fillAndStroke(fillColor: ColorValue): TDocument = js.native
  def fillAndStroke(fillColor: ColorValue, rule: RuleValue): TDocument = js.native
  def fillAndStroke(fillColor: ColorValue, strokeColor: ColorValue): TDocument = js.native
  def fillAndStroke(fillColor: ColorValue, strokeColor: ColorValue, rule: RuleValue): TDocument = js.native
  def fillAndStroke(rule: RuleValue): TDocument = js.native
  def lineCap(c: String): TDocument = js.native
  def lineJoin(j: String): TDocument = js.native
  def lineTo(x: Double, y: Double): TDocument = js.native
  def lineWidth(w: Double): TDocument = js.native
  def miterLimit(m: js.Any): TDocument = js.native
  def moveTo(x: Double, y: Double): TDocument = js.native
  def path(path: String): TDocument = js.native
  def polygon(points: js.Array[Double]*): TDocument = js.native
  def quadraticCurveTo(cpx: Double, cpy: Double, x: Double, y: Double): TDocument = js.native
  def rect(x: Double, y: Double, w: Double, h: Double): TDocument = js.native
  def restore(): TDocument = js.native
  def rotate(angle: Double): TDocument = js.native
  def rotate(angle: Double, options: Anon_Origin): TDocument = js.native
  def roundedRect(x: Double, y: Double, w: Double, h: Double): TDocument = js.native
  def roundedRect(x: Double, y: Double, w: Double, h: Double, r: Double): TDocument = js.native
  def save(): TDocument = js.native
  def scale(xFactor: Double): TDocument = js.native
  def scale(xFactor: Double, yFactor: Double): TDocument = js.native
  def scale(xFactor: Double, yFactor: Double, options: Anon_Origin): TDocument = js.native
  def stroke(): TDocument = js.native
  def stroke(color: ColorValue): TDocument = js.native
  def transform(m11: Double, m12: Double, m21: Double, m22: Double, dx: Double, dy: Double): TDocument = js.native
  def translate(x: Double, y: Double): TDocument = js.native
  def undash(): TDocument = js.native
}

