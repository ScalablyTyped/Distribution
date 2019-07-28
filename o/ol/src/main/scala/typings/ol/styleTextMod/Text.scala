package typings.ol.styleTextMod

import typings.ol.styleTextPlacementMod.TextPlacement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Text extends js.Object {
  def getBackgroundFill(): typings.ol.styleFillMod.default = js.native
  def getBackgroundStroke(): typings.ol.styleStrokeMod.default = js.native
  def getFill(): typings.ol.styleFillMod.default = js.native
  def getFont(): String = js.native
  def getMaxAngle(): Double = js.native
  def getOffsetX(): Double = js.native
  def getOffsetY(): Double = js.native
  def getOverflow(): Boolean = js.native
  def getPadding(): js.Array[Double] = js.native
  def getPlacement(): TextPlacement | String = js.native
  def getRotateWithView(): Boolean = js.native
  def getRotation(): Double = js.native
  def getScale(): Double = js.native
  def getStroke(): typings.ol.styleStrokeMod.default = js.native
  def getText(): String = js.native
  def getTextAlign(): String = js.native
  def getTextBaseline(): String = js.native
  def setBackgroundFill(fill: typings.ol.styleFillMod.default): Unit = js.native
  def setBackgroundStroke(stroke: typings.ol.styleStrokeMod.default): Unit = js.native
  def setFill(fill: typings.ol.styleFillMod.default): Unit = js.native
  def setFont(font: String): Unit = js.native
  def setMaxAngle(maxAngle: Double): Unit = js.native
  def setOffsetX(offsetX: Double): Unit = js.native
  def setOffsetY(offsetY: Double): Unit = js.native
  def setOverflow(overflow: Boolean): Unit = js.native
  def setPadding(padding: js.Array[Double]): Unit = js.native
  def setPlacement(placement: String): Unit = js.native
  def setPlacement(placement: TextPlacement): Unit = js.native
  def setRotation(rotation: Double): Unit = js.native
  def setScale(scale: Double): Unit = js.native
  def setStroke(stroke: typings.ol.styleStrokeMod.default): Unit = js.native
  def setText(text: String): Unit = js.native
  def setTextAlign(textAlign: String): Unit = js.native
  def setTextBaseline(textBaseline: String): Unit = js.native
}

