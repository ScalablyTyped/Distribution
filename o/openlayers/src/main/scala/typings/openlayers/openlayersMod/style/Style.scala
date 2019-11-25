package typings.openlayers.openlayersMod.style

import typings.openlayers.openlayersMod.StyleGeometryFunction
import typings.openlayers.openlayersMod.geom.Geometry
import typings.openlayers.openlayersMod.olx.style.StyleOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Container for vector feature rendering styles. Any changes made to the style
  * or its children through `set*()` methods will not take effect until the
  * feature or layer that uses the style is re-rendered.
  *
  * @struct
  * @param opt_options Style options.
  * @api
  */
@JSImport("openlayers", "style.Style")
@js.native
/**
  * @classdesc
  * Container for vector feature rendering styles. Any changes made to the style
  * or its children through `set*()` methods will not take effect until the
  * feature or layer that uses the style is re-rendered.
  *
  * @struct
  * @param opt_options Style options.
  * @api
  */
class Style () extends js.Object {
  def this(opt_options: StyleOptions) = this()
  /**
    * Get the fill style.
    * @return Fill style.
    * @api
    */
  def getFill(): Fill = js.native
  /**
    * Get the geometry to be rendered.
    * @return Feature property or geometry or function that returns the geometry that will
    *     be rendered with this style.
    * @api
    */
  def getGeometry(): String | Geometry | StyleGeometryFunction = js.native
  /**
    * Get the function used to generate a geometry for rendering.
    * @return Function that is called with a feature
    * and returns the geometry to render instead of the feature's geometry.
    * @api
    */
  def getGeometryFunction(): StyleGeometryFunction = js.native
  /**
    * Get the image style.
    * @return Image style.
    * @api
    */
  def getImage(): typings.openlayers.openlayersMod.style.Image = js.native
  /**
    * Get the stroke style.
    * @return Stroke style.
    * @api
    */
  def getStroke(): Stroke = js.native
  /**
    * Get the text style.
    * @return Text style.
    * @api
    */
  def getText(): Text = js.native
  /**
    * Get the z-index for the style.
    * @return ZIndex.
    * @api
    */
  def getZIndex(): Double = js.native
  /**
    * Set the fill style.
    * @param fill Fill style.
    * @api
    */
  def setFill(fill: Fill): Unit = js.native
  /**
    * Set a geometry that is rendered instead of the feature's geometry.
    *
    * @param geometry
    *     Feature property or geometry or function returning a geometry to render
    *     for this style.
    * @api
    */
  def setGeometry(geometry: String): Unit = js.native
  def setGeometry(geometry: StyleGeometryFunction): Unit = js.native
  def setGeometry(geometry: Geometry): Unit = js.native
  /**
    * Set the image style.
    * @param image Image style.
    * @api
    */
  def setImage(image: typings.openlayers.openlayersMod.style.Image): Unit = js.native
  /**
    * Set the stroke style.
    * @param stroke Stroke style.
    * @api
    */
  def setStroke(stroke: Stroke): Unit = js.native
  /**
    * Set the text style.
    * @param text Text style.
    * @api
    */
  def setText(text: Text): Unit = js.native
  /**
    * Set the z-index.
    *
    * @param zIndex ZIndex.
    * @api
    */
  def setZIndex(zIndex: Double): Unit = js.native
}

