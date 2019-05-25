package typings
package olLib.styleStrokeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stroke extends js.Object {
  def getChecksum(): java.lang.String = js.native
  def getColor(): olLib.colorMod.Color | olLib.colorlikeMod.ColorLike = js.native
  def getLineCap(): java.lang.String = js.native
  def getLineDash(): js.Array[scala.Double] = js.native
  def getLineDashOffset(): scala.Double = js.native
  def getLineJoin(): java.lang.String = js.native
  def getMiterLimit(): scala.Double = js.native
  def getWidth(): scala.Double = js.native
  def setColor(color: olLib.colorMod.Color): scala.Unit = js.native
  def setColor(color: olLib.colorlikeMod.ColorLike): scala.Unit = js.native
  def setLineCap(lineCap: java.lang.String): scala.Unit = js.native
  def setLineDash(lineDash: js.Array[scala.Double]): scala.Unit = js.native
  def setLineDashOffset(lineDashOffset: scala.Double): scala.Unit = js.native
  def setLineJoin(lineJoin: java.lang.String): scala.Unit = js.native
  def setMiterLimit(miterLimit: scala.Double): scala.Unit = js.native
  def setWidth(width: scala.Double): scala.Unit = js.native
}

