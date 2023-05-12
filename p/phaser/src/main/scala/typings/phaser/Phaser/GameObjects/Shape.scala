package typings.phaser.Phaser.GameObjects

import typings.phaser.Phaser.GameObjects.Components.AlphaSingle
import typings.phaser.Phaser.GameObjects.Components.BlendMode
import typings.phaser.Phaser.GameObjects.Components.Depth
import typings.phaser.Phaser.GameObjects.Components.GetBounds
import typings.phaser.Phaser.GameObjects.Components.Mask
import typings.phaser.Phaser.GameObjects.Components.Origin
import typings.phaser.Phaser.GameObjects.Components.Pipeline
import typings.phaser.Phaser.GameObjects.Components.PostPipeline
import typings.phaser.Phaser.GameObjects.Components.ScrollFactor
import typings.phaser.Phaser.GameObjects.Components.Transform
import typings.phaser.Phaser.GameObjects.Components.Visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Shape Game Object is a base class for the various different shapes, such as the Arc, Star or Polygon.
  * You cannot add a Shape directly to your Scene, it is meant as a base for your own custom Shape classes.
  */
@js.native
trait Shape
  extends StObject
     with GameObject
     with AlphaSingle
     with BlendMode
     with Depth
     with GetBounds
     with Mask
     with Origin
     with Pipeline
     with PostPipeline
     with ScrollFactor
     with Transform
     with Visible {
  
  /**
    * Controls if this Shape path is closed during rendering when stroked.
    * Note that some Shapes are always closed when stroked (such as Ellipse shapes)
    */
  var closePath: Boolean = js.native
  
  /**
    * The displayed height of this Game Object.
    * 
    * This value takes into account the scale factor.
    * 
    * Setting this value will adjust the Game Object's scale property.
    */
  var displayHeight: Double = js.native
  
  /**
    * The displayed width of this Game Object.
    * 
    * This value takes into account the scale factor.
    * 
    * Setting this value will adjust the Game Object's scale property.
    */
  var displayWidth: Double = js.native
  
  /**
    * The fill alpha value used by this Shape.
    */
  var fillAlpha: Double = js.native
  
  /**
    * The fill color used by this Shape.
    */
  var fillColor: Double = js.native
  
  /**
    * The source Shape data. Typically a geometry object.
    * You should not manipulate this directly.
    */
  val geom: Any = js.native
  
  /**
    * The native (un-scaled) height of this Game Object.
    * 
    * Changing this value will not change the size that the Game Object is rendered in-game.
    * For that you need to either set the scale of the Game Object (`setScale`) or use
    * the `displayHeight` property.
    */
  var height: Double = js.native
  
  /**
    * Controls if this Shape is filled or not.
    * Note that some Shapes do not support being filled (such as Line shapes)
    */
  var isFilled: Boolean = js.native
  
  /**
    * Controls if this Shape is stroked or not.
    * Note that some Shapes do not support being stroked (such as Iso Box shapes)
    */
  var isStroked: Boolean = js.native
  
  /**
    * The stroke line width used by this Shape.
    */
  var lineWidth: Double = js.native
  
  /**
    * Holds the polygon path data for filled rendering.
    */
  val pathData: js.Array[Double] = js.native
  
  /**
    * Holds the earcut polygon path index data for filled rendering.
    */
  val pathIndexes: js.Array[Double] = js.native
  
  /**
    * Internal destroy handler, called as part of the destroy process.
    */
  /* protected */ def preDestroy(): Unit = js.native
  
  /**
    * Sets if this Shape path is closed during rendering when stroked.
    * Note that some Shapes are always closed when stroked (such as Ellipse shapes)
    * 
    * This call can be chained.
    * @param value Set to `true` if the Shape should be closed when stroked, otherwise `false`.
    */
  def setClosePath(value: Boolean): this.type = js.native
  
  /**
    * Sets the display size of this Shape.
    * 
    * Calling this will adjust the scale.
    * @param width The display width of this Shape.
    * @param height The display height of this Shape.
    */
  def setDisplaySize(width: Double, height: Double): this.type = js.native
  
  /**
    * Sets the fill color and alpha for this Shape.
    * 
    * If you wish for the Shape to not be filled then call this method with no arguments, or just set `isFilled` to `false`.
    * 
    * Note that some Shapes do not support fill colors, such as the Line shape.
    * 
    * This call can be chained.
    * @param color The color used to fill this shape. If not provided the Shape will not be filled.
    * @param alpha The alpha value used when filling this shape, if a fill color is given. Default 1.
    */
  def setFillStyle(): this.type = js.native
  def setFillStyle(color: Double): this.type = js.native
  def setFillStyle(color: Double, alpha: Double): this.type = js.native
  def setFillStyle(color: Unit, alpha: Double): this.type = js.native
  
  /**
    * Sets the stroke color and alpha for this Shape.
    * 
    * If you wish for the Shape to not be stroked then call this method with no arguments, or just set `isStroked` to `false`.
    * 
    * Note that some Shapes do not support being stroked, such as the Iso Box shape.
    * 
    * This call can be chained.
    * @param lineWidth The width of line to stroke with. If not provided or undefined the Shape will not be stroked.
    * @param color The color used to stroke this shape. If not provided the Shape will not be stroked.
    * @param alpha The alpha value used when stroking this shape, if a stroke color is given. Default 1.
    */
  def setStrokeStyle(): this.type = js.native
  def setStrokeStyle(lineWidth: Double): this.type = js.native
  def setStrokeStyle(lineWidth: Double, color: Double): this.type = js.native
  def setStrokeStyle(lineWidth: Double, color: Double, alpha: Double): this.type = js.native
  def setStrokeStyle(lineWidth: Double, color: Unit, alpha: Double): this.type = js.native
  def setStrokeStyle(lineWidth: Unit, color: Double): this.type = js.native
  def setStrokeStyle(lineWidth: Unit, color: Double, alpha: Double): this.type = js.native
  def setStrokeStyle(lineWidth: Unit, color: Unit, alpha: Double): this.type = js.native
  
  /**
    * The stroke alpha value used by this Shape.
    */
  var strokeAlpha: Double = js.native
  
  /**
    * The stroke color used by this Shape.
    */
  var strokeColor: Double = js.native
  
  /**
    * The native (un-scaled) width of this Game Object.
    * 
    * Changing this value will not change the size that the Game Object is rendered in-game.
    * For that you need to either set the scale of the Game Object (`setScale`) or use
    * the `displayWidth` property.
    */
  var width: Double = js.native
}
