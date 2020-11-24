package typings.ol.textMod

import typings.ol.sizeMod.Size
import typings.ol.textPlacementMod.TextPlacement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Text extends js.Object {
  
  /**
    * Get the background fill style for the text.
    */
  def getBackgroundFill(): typings.ol.fillMod.default = js.native
  
  /**
    * Get the background stroke style for the text.
    */
  def getBackgroundStroke(): typings.ol.strokeMod.default = js.native
  
  /**
    * Get the fill style for the text.
    */
  def getFill(): typings.ol.fillMod.default = js.native
  
  /**
    * Get the font name.
    */
  def getFont(): js.UndefOr[String] = js.native
  
  /**
    * Get the maximum angle between adjacent characters.
    */
  def getMaxAngle(): Double = js.native
  
  /**
    * Get the x-offset for the text.
    */
  def getOffsetX(): Double = js.native
  
  /**
    * Get the y-offset for the text.
    */
  def getOffsetY(): Double = js.native
  
  /**
    * Get the overflow configuration.
    */
  def getOverflow(): Boolean = js.native
  
  /**
    * Get the padding for the text.
    */
  def getPadding(): js.Array[Double] = js.native
  
  /**
    * Get the label placement.
    */
  def getPlacement(): TextPlacement | String = js.native
  
  /**
    * Determine whether the text rotates with the map.
    */
  def getRotateWithView(): js.UndefOr[Boolean] = js.native
  
  /**
    * Get the text rotation.
    */
  def getRotation(): js.UndefOr[Double] = js.native
  
  /**
    * Get the text scale.
    */
  def getScale(): js.UndefOr[Double | Size] = js.native
  
  /**
    * Get the symbolizer scale array.
    */
  def getScaleArray(): Size = js.native
  
  /**
    * Get the stroke style for the text.
    */
  def getStroke(): typings.ol.strokeMod.default = js.native
  
  /**
    * Get the text to be rendered.
    */
  def getText(): js.UndefOr[String] = js.native
  
  /**
    * Get the text alignment.
    */
  def getTextAlign(): js.UndefOr[String] = js.native
  
  /**
    * Get the text baseline.
    */
  def getTextBaseline(): js.UndefOr[String] = js.native
  
  /**
    * Set the background fill.
    */
  def setBackgroundFill(fill: typings.ol.fillMod.default): Unit = js.native
  
  /**
    * Set the background stroke.
    */
  def setBackgroundStroke(stroke: typings.ol.strokeMod.default): Unit = js.native
  
  /**
    * Set the fill.
    */
  def setFill(fill: typings.ol.fillMod.default): Unit = js.native
  
  /**
    * Set the font.
    */
  def setFont(): Unit = js.native
  def setFont(font: String): Unit = js.native
  
  /**
    * Set the maximum angle between adjacent characters.
    */
  def setMaxAngle(maxAngle: Double): Unit = js.native
  
  /**
    * Set the x offset.
    */
  def setOffsetX(offsetX: Double): Unit = js.native
  
  /**
    * Set the y offset.
    */
  def setOffsetY(offsetY: Double): Unit = js.native
  
  /**
    * Set the overflow property.
    */
  def setOverflow(overflow: Boolean): Unit = js.native
  
  /**
    * Set the padding ([top, right, bottom, left]).
    */
  def setPadding(padding: js.Array[Double]): Unit = js.native
  
  def setPlacement(placement: String): Unit = js.native
  /**
    * Set the text placement.
    */
  def setPlacement(placement: TextPlacement): Unit = js.native
  
  /**
    * Set whether to rotate the text with the view.
    */
  def setRotateWithView(rotateWithView: Boolean): Unit = js.native
  
  /**
    * Set the rotation.
    */
  def setRotation(): Unit = js.native
  def setRotation(rotation: Double): Unit = js.native
  
  /**
    * Set the scale.
    */
  def setScale(): Unit = js.native
  def setScale(scale: Double): Unit = js.native
  def setScale(scale: Size): Unit = js.native
  
  /**
    * Set the stroke.
    */
  def setStroke(stroke: typings.ol.strokeMod.default): Unit = js.native
  
  /**
    * Set the text.
    */
  def setText(): Unit = js.native
  def setText(text: String): Unit = js.native
  
  /**
    * Set the text alignment.
    */
  def setTextAlign(): Unit = js.native
  def setTextAlign(textAlign: String): Unit = js.native
  
  /**
    * Set the text baseline.
    */
  def setTextBaseline(): Unit = js.native
  def setTextBaseline(textBaseline: String): Unit = js.native
}
