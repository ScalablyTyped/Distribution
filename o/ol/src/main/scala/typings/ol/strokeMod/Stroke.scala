package typings.ol.strokeMod

import typings.ol.colorMod.Color
import typings.ol.colorlikeMod.ColorLike
import typings.std.CanvasLineCap
import typings.std.CanvasLineJoin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stroke extends js.Object {
  
  /**
    * Get the stroke color.
    */
  def getColor(): Color | ColorLike = js.native
  
  /**
    * Get the line cap type for the stroke.
    */
  def getLineCap(): js.UndefOr[CanvasLineCap] = js.native
  
  /**
    * Get the line dash style for the stroke.
    */
  def getLineDash(): js.Array[Double] = js.native
  
  /**
    * Get the line dash offset for the stroke.
    */
  def getLineDashOffset(): js.UndefOr[Double] = js.native
  
  /**
    * Get the line join type for the stroke.
    */
  def getLineJoin(): js.UndefOr[CanvasLineJoin] = js.native
  
  /**
    * Get the miter limit for the stroke.
    */
  def getMiterLimit(): js.UndefOr[Double] = js.native
  
  /**
    * Get the stroke width.
    */
  def getWidth(): js.UndefOr[Double] = js.native
  
  /**
    * Set the color.
    */
  def setColor(color: Color): Unit = js.native
  def setColor(color: ColorLike): Unit = js.native
  
  /**
    * Set the line cap.
    */
  def setLineCap(): Unit = js.native
  def setLineCap(lineCap: CanvasLineCap): Unit = js.native
  
  /**
    * Set the line dash.
    * Please note that Internet Explorer 10 and lower do not support the
    * setLineDash method on the CanvasRenderingContext2D and therefore this
    * property will have no visual effect in these browsers.
    */
  def setLineDash(lineDash: js.Array[Double]): Unit = js.native
  
  /**
    * Set the line dash offset.
    */
  def setLineDashOffset(): Unit = js.native
  def setLineDashOffset(lineDashOffset: Double): Unit = js.native
  
  /**
    * Set the line join.
    */
  def setLineJoin(): Unit = js.native
  def setLineJoin(lineJoin: CanvasLineJoin): Unit = js.native
  
  /**
    * Set the miter limit.
    */
  def setMiterLimit(): Unit = js.native
  def setMiterLimit(miterLimit: Double): Unit = js.native
  
  /**
    * Set the width.
    */
  def setWidth(): Unit = js.native
  def setWidth(width: Double): Unit = js.native
}
