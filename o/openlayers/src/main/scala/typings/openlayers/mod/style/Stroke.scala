package typings.openlayers.mod.style

import typings.openlayers.mod.Color_
import typings.openlayers.mod.olx.style.StrokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @classdesc
  * Set stroke style for vector features.
  * Note that the defaults given are the Canvas defaults, which will be used if
  * option is not defined. The `get` functions return whatever was entered in
  * the options; they will not return the default.
  *
  * @param opt_options Options.
  * @api
  */
@JSImport("openlayers", "style.Stroke")
@js.native
/**
  * @classdesc
  * Set stroke style for vector features.
  * Note that the defaults given are the Canvas defaults, which will be used if
  * option is not defined. The `get` functions return whatever was entered in
  * the options; they will not return the default.
  *
  * @param opt_options Options.
  * @api
  */
class Stroke () extends js.Object {
  def this(opt_options: StrokeOptions) = this()
  
  /**
    * Get the stroke color.
    * @return Color.
    * @api
    */
  def getColor(): Color_ | String = js.native
  
  /**
    * Get the line cap type for the stroke.
    * @return Line cap.
    * @api
    */
  def getLineCap(): String = js.native
  
  /**
    * Get the line dash style for the stroke.
    * @return Line dash.
    * @api
    */
  def getLineDash(): js.Array[Double] = js.native
  
  /**
    * Get the line dash offset style for the stroke.
    * @return Line dash offset
    * @api
    */
  def getLineDashOffset(): Double = js.native
  
  /**
    * Get the line join type for the stroke.
    * @return Line join.
    * @api
    */
  def getLineJoin(): String = js.native
  
  /**
    * Get the miter limit for the stroke.
    * @return Miter limit.
    * @api
    */
  def getMiterLimit(): Double = js.native
  
  /**
    * Get the stroke width.
    * @return Width.
    * @api
    */
  def getWidth(): Double = js.native
  
  def setColor(color: String): Unit = js.native
  /**
    * Set the color.
    *
    * @param color Color.
    * @api
    */
  def setColor(color: Color_): Unit = js.native
  
  /**
    * Set the line cap.
    *
    * @param lineCap Line cap.
    * @api
    */
  def setLineCap(lineCap: String): Unit = js.native
  
  /**
    * Set the line dash.
    *
    * Please note that Internet Explorer 10 and lower [do not support][mdn] the
    * `setLineDash` method on the `CanvasRenderingContext2D` and therefore this
    * property will have no visual effect in these browsers.
    *
    * [mdn]: https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/setLineDash#Browser_compatibility
    *
    * @param lineDash Line dash.
    * @api
    */
  def setLineDash(lineDash: js.Array[Double]): Unit = js.native
  
  /**
    * Set the line dash offset.
    *
    * @param lineDashOffset Line dash offset.
    * @api
    */
  def setLineDashOffset(lineDashOffset: Double): Unit = js.native
  
  /**
    * Set the line join.
    *
    * @param lineJoin Line join.
    * @api
    */
  def setLineJoin(lineJoin: String): Unit = js.native
  
  /**
    * Set the miter limit.
    *
    * @param miterLimit Miter limit.
    * @api
    */
  def setMiterLimit(miterLimit: Double): Unit = js.native
  
  /**
    * Set the width.
    *
    * @param width Width.
    * @api
    */
  def setWidth(width: Double): Unit = js.native
}
