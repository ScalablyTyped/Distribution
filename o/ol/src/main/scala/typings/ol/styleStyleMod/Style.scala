package typings.ol.styleStyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Style extends js.Object {
  
  /**
    * Get the fill style.
    */
  def getFill(): typings.ol.fillMod.default = js.native
  
  /**
    * Get the geometry to be rendered.
    */
  def getGeometry(): String | typings.ol.geometryMod.default | GeometryFunction = js.native
  
  /**
    * Get the function used to generate a geometry for rendering.
    */
  def getGeometryFunction(): GeometryFunction = js.native
  
  /**
    * Get the image style.
    */
  def getImage(): typings.ol.styleImageMod.default = js.native
  
  /**
    * Get the custom renderer function that was configured with
    * {@link #setRenderer} or the renderer constructor option.
    */
  def getRenderer(): RenderFunction | Null = js.native
  
  /**
    * Get the stroke style.
    */
  def getStroke(): typings.ol.strokeMod.default = js.native
  
  /**
    * Get the text style.
    */
  def getText(): typings.ol.textMod.default = js.native
  
  /**
    * Get the z-index for the style.
    */
  def getZIndex(): js.UndefOr[Double] = js.native
  
  /**
    * Set the fill style.
    */
  def setFill(fill: typings.ol.fillMod.default): Unit = js.native
  
  /**
    * Set a geometry that is rendered instead of the feature's geometry.
    */
  def setGeometry(geometry: String): Unit = js.native
  def setGeometry(geometry: typings.ol.geometryMod.default): Unit = js.native
  def setGeometry(geometry: GeometryFunction): Unit = js.native
  
  /**
    * Set the image style.
    */
  def setImage(image: typings.ol.styleImageMod.default): Unit = js.native
  
  /**
    * Sets a custom renderer function for this style. When set, fill, stroke
    * and image options of the style will be ignored.
    */
  def setRenderer(): Unit = js.native
  def setRenderer(renderer: RenderFunction): Unit = js.native
  
  /**
    * Set the stroke style.
    */
  def setStroke(stroke: typings.ol.strokeMod.default): Unit = js.native
  
  /**
    * Set the text style.
    */
  def setText(text: typings.ol.textMod.default): Unit = js.native
  
  /**
    * Set the z-index.
    */
  def setZIndex(): Unit = js.native
  def setZIndex(zIndex: Double): Unit = js.native
}
