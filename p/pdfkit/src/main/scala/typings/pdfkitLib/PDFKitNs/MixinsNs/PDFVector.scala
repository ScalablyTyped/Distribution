package typings
package pdfkitLib.PDFKitNs.MixinsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFVector[TDocument] extends js.Object {
  def bezierCurveTo(
    cp1x: scala.Double,
    cp1y: scala.Double,
    cp2x: scala.Double,
    cp2y: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): TDocument = js.native
  def circle(x: scala.Double, y: scala.Double, raduis: scala.Double): TDocument = js.native
  def clip(): TDocument = js.native
  def clip(rule: RuleValue): TDocument = js.native
  def closePath(): TDocument = js.native
  def dash(length: scala.Double, option: js.Any): TDocument = js.native
  def ellipse(x: scala.Double, y: scala.Double, r1: scala.Double): TDocument = js.native
  def ellipse(x: scala.Double, y: scala.Double, r1: scala.Double, r2: scala.Double): TDocument = js.native
  def fill(): TDocument = js.native
  def fill(color: ColorValue | RuleValue): TDocument = js.native
  def fill(color: ColorValue, rule: RuleValue): TDocument = js.native
  def fillAndStroke(): TDocument = js.native
  def fillAndStroke(fillColor: ColorValue | RuleValue): TDocument = js.native
  def fillAndStroke(fillColor: ColorValue, strokeColor: ColorValue | RuleValue): TDocument = js.native
  def fillAndStroke(fillColor: ColorValue, strokeColor: ColorValue, rule: RuleValue): TDocument = js.native
  def lineCap(c: java.lang.String): TDocument = js.native
  def lineJoin(j: java.lang.String): TDocument = js.native
  def lineTo(x: scala.Double, y: scala.Double): TDocument = js.native
  def lineWidth(w: scala.Double): TDocument = js.native
  def miterLimit(m: js.Any): TDocument = js.native
  def moveTo(x: scala.Double, y: scala.Double): TDocument = js.native
  def path(path: java.lang.String): TDocument = js.native
  def polygon(points: js.Array[scala.Double]*): TDocument = js.native
  def quadraticCurveTo(cpx: scala.Double, cpy: scala.Double, x: scala.Double, y: scala.Double): TDocument = js.native
  def rect(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): TDocument = js.native
  def restore(): TDocument = js.native
  def rotate(angle: scala.Double): TDocument = js.native
  def rotate(angle: scala.Double, options: pdfkitLib.Anon_Origin): TDocument = js.native
  def roundedRect(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double): TDocument = js.native
  def roundedRect(x: scala.Double, y: scala.Double, w: scala.Double, h: scala.Double, r: scala.Double): TDocument = js.native
  def save(): TDocument = js.native
  def scale(xFactor: scala.Double): TDocument = js.native
  def scale(xFactor: scala.Double, yFactor: scala.Double): TDocument = js.native
  def scale(xFactor: scala.Double, yFactor: scala.Double, options: pdfkitLib.Anon_Origin): TDocument = js.native
  def stroke(): TDocument = js.native
  def stroke(color: ColorValue): TDocument = js.native
  def transform(
    m11: scala.Double,
    m12: scala.Double,
    m21: scala.Double,
    m22: scala.Double,
    dx: scala.Double,
    dy: scala.Double
  ): TDocument = js.native
  def translate(x: scala.Double, y: scala.Double): TDocument = js.native
  def undash(): TDocument = js.native
}

