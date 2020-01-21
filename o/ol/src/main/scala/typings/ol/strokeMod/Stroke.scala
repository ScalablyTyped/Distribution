package typings.ol.strokeMod

import typings.ol.colorMod.Color
import typings.ol.colorlikeMod.ColorLike
import typings.std.CanvasLineCap
import typings.std.CanvasLineJoin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stroke extends js.Object {
  def getColor(): Color | ColorLike = js.native
  def getLineCap(): CanvasLineCap = js.native
  def getLineDash(): js.Array[Double] = js.native
  def getLineDashOffset(): Double = js.native
  def getLineJoin(): CanvasLineJoin = js.native
  def getMiterLimit(): Double = js.native
  def getWidth(): Double = js.native
  def setColor(color: Color): Unit = js.native
  def setColor(color: ColorLike): Unit = js.native
  def setLineCap(): Unit = js.native
  def setLineCap(lineCap: CanvasLineCap): Unit = js.native
  def setLineDash(lineDash: js.Array[Double]): Unit = js.native
  def setLineDashOffset(): Unit = js.native
  def setLineDashOffset(lineDashOffset: Double): Unit = js.native
  def setLineJoin(): Unit = js.native
  def setLineJoin(lineJoin: CanvasLineJoin): Unit = js.native
  def setMiterLimit(): Unit = js.native
  def setMiterLimit(miterLimit: Double): Unit = js.native
  def setWidth(): Unit = js.native
  def setWidth(width: Double): Unit = js.native
}

