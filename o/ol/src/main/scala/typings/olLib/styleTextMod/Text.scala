package typings
package olLib.styleTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Text extends js.Object {
  def getBackgroundFill(): olLib.styleFillMod.default = js.native
  def getBackgroundStroke(): olLib.styleStrokeMod.default = js.native
  def getFill(): olLib.styleFillMod.default = js.native
  def getFont(): java.lang.String = js.native
  def getMaxAngle(): scala.Double = js.native
  def getOffsetX(): scala.Double = js.native
  def getOffsetY(): scala.Double = js.native
  def getOverflow(): scala.Boolean = js.native
  def getPadding(): js.Array[scala.Double] = js.native
  def getPlacement(): olLib.styleTextPlacementMod.TextPlacement | java.lang.String = js.native
  def getRotateWithView(): scala.Boolean = js.native
  def getRotation(): scala.Double = js.native
  def getScale(): scala.Double = js.native
  def getStroke(): olLib.styleStrokeMod.default = js.native
  def getText(): java.lang.String = js.native
  def getTextAlign(): java.lang.String = js.native
  def getTextBaseline(): java.lang.String = js.native
  def setBackgroundFill(fill: olLib.styleFillMod.default): scala.Unit = js.native
  def setBackgroundStroke(stroke: olLib.styleStrokeMod.default): scala.Unit = js.native
  def setFill(fill: olLib.styleFillMod.default): scala.Unit = js.native
  def setFont(font: java.lang.String): scala.Unit = js.native
  def setMaxAngle(maxAngle: scala.Double): scala.Unit = js.native
  def setOffsetX(offsetX: scala.Double): scala.Unit = js.native
  def setOffsetY(offsetY: scala.Double): scala.Unit = js.native
  def setOverflow(overflow: scala.Boolean): scala.Unit = js.native
  def setPadding(padding: js.Array[scala.Double]): scala.Unit = js.native
  def setPlacement(placement: java.lang.String): scala.Unit = js.native
  def setPlacement(placement: olLib.styleTextPlacementMod.TextPlacement): scala.Unit = js.native
  def setRotation(rotation: scala.Double): scala.Unit = js.native
  def setScale(scale: scala.Double): scala.Unit = js.native
  def setStroke(stroke: olLib.styleStrokeMod.default): scala.Unit = js.native
  def setText(text: java.lang.String): scala.Unit = js.native
  def setTextAlign(textAlign: java.lang.String): scala.Unit = js.native
  def setTextBaseline(textBaseline: java.lang.String): scala.Unit = js.native
}

