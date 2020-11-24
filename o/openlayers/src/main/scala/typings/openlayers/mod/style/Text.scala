package typings.openlayers.mod.style

import typings.openlayers.mod.olx.style.TextOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Set text style for vector features.
  *
  * @param opt_options Options.
  * @api
  */
@JSImport("openlayers", "style.Text")
@js.native
/**
  * @classdesc
  * Set text style for vector features.
  *
  * @param opt_options Options.
  * @api
  */
class Text () extends js.Object {
  def this(opt_options: TextOptions) = this()
  
  /**
    * Get the fill style for the text.
    * @return Fill style.
    * @api
    */
  def getFill(): Fill = js.native
  
  /**
    * Get the font name.
    * @return Font.
    * @api
    */
  def getFont(): String = js.native
  
  /**
    * Get the x-offset for the text.
    * @return Horizontal text offset.
    * @api
    */
  def getOffsetX(): Double = js.native
  
  /**
    * Get the y-offset for the text.
    * @return Vertical text offset.
    * @api
    */
  def getOffsetY(): Double = js.native
  
  /**
    * Determine whether the text rotates with the map.
    * @return Rotate with map.
    * @api
    */
  def getRotateWithView(): Boolean = js.native
  
  /**
    * Get the text rotation.
    * @return Rotation.
    * @api
    */
  def getRotation(): Double = js.native
  
  /**
    * Get the text scale.
    * @return Scale.
    * @api
    */
  def getScale(): Double = js.native
  
  /**
    * Get the stroke style for the text.
    * @return Stroke style.
    * @api
    */
  def getStroke(): Stroke = js.native
  
  /**
    * Get the text to be rendered.
    * @return Text.
    * @api
    */
  def getText(): String = js.native
  
  /**
    * Get the text alignment.
    * @return Text align.
    * @api
    */
  def getTextAlign(): String = js.native
  
  /**
    * Get the text baseline.
    * @return Text baseline.
    * @api
    */
  def getTextBaseline(): String = js.native
  
  /**
    * Set the fill.
    *
    * @param fill Fill style.
    * @api
    */
  def setFill(fill: Fill): Unit = js.native
  
  /**
    * Set the font.
    *
    * @param font Font.
    * @api
    */
  def setFont(font: String): Unit = js.native
  
  /**
    * Set the x offset.
    *
    * @param offsetX Horizontal text offset.
    * @api
    */
  def setOffsetX(offsetX: Double): Unit = js.native
  
  /**
    * Set the y offset.
    *
    * @param offsetY Vertical text offset.
    * @api
    */
  def setOffsetY(offsetY: Double): Unit = js.native
  
  /**
    * Set the rotation.
    *
    * @param rotation Rotation.
    * @api
    */
  def setRotation(rotation: Double): Unit = js.native
  
  /**
    * Set the scale.
    *
    * @param scale Scale.
    * @api
    */
  def setScale(scale: Double): Unit = js.native
  
  /**
    * Set the stroke.
    *
    * @param stroke Stroke style.
    * @api
    */
  def setStroke(stroke: Stroke): Unit = js.native
  
  /**
    * Set the text.
    *
    * @param text Text.
    * @api
    */
  def setText(text: String): Unit = js.native
  
  /**
    * Set the text alignment.
    *
    * @param textAlign Text align.
    * @api
    */
  def setTextAlign(textAlign: String): Unit = js.native
  
  /**
    * Set the text baseline.
    *
    * @param textBaseline Text baseline.
    * @api
    */
  def setTextBaseline(textBaseline: String): Unit = js.native
}
