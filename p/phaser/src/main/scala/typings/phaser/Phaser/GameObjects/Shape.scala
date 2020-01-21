package typings.phaser.Phaser.GameObjects

import typings.phaser.Phaser.GameObjects.Components.AlphaSingle
import typings.phaser.Phaser.GameObjects.Components.BlendMode
import typings.phaser.Phaser.GameObjects.Components.ComputedSize
import typings.phaser.Phaser.GameObjects.Components.Depth
import typings.phaser.Phaser.GameObjects.Components.GetBounds
import typings.phaser.Phaser.GameObjects.Components.Mask
import typings.phaser.Phaser.GameObjects.Components.Origin
import typings.phaser.Phaser.GameObjects.Components.Pipeline
import typings.phaser.Phaser.GameObjects.Components.ScrollFactor
import typings.phaser.Phaser.GameObjects.Components.Transform
import typings.phaser.Phaser.GameObjects.Components.Visible
import typings.phaser.Phaser.Scene
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Shape Game Object is a base class for the various different shapes, such as the Arc, Star or Polygon.
  * You cannot add a Shape directly to your Scene, it is meant as a base for your own custom Shape classes.
  */
@JSGlobal("Phaser.GameObjects.Shape")
@js.native
class Shape protected ()
  extends GameObject
     with AlphaSingle
     with BlendMode
     with ComputedSize
     with Depth
     with GetBounds
     with Mask
     with Origin
     with Pipeline
     with ScrollFactor
     with Transform
     with Visible {
  /**
    * 
    * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
    * @param type The internal type of the Shape.
    * @param data The data of the source shape geometry, if any.
    */
  def this(scene: Scene) = this()
  def this(scene: Scene, `type`: String) = this()
  def this(scene: Scene, `type`: String, data: js.Any) = this()
  /**
    * Controls if this Shape path is closed during rendering when stroked.
    * Note that some Shapes are always closed when stroked (such as Ellipse shapes)
    */
  var closePath: Boolean = js.native
  /**
    * The depth of this Game Object within the Scene.
    * 
    * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
    * of Game Objects, without actually moving their position in the display list.
    * 
    * The depth starts from zero (the default value) and increases from that point. A Game Object with a higher depth
    * value will always render in front of one with a lower value.
    * 
    * Setting the depth will queue a depth sort event within the Scene.
    */
  /* CompleteClass */
  override var depth: Double = js.native
  /**
    * The displayed height of this Game Object.
    * 
    * This value takes into account the scale factor.
    * 
    * Setting this value will adjust the Game Object's scale property.
    */
  /* CompleteClass */
  override var displayHeight: Double = js.native
  /**
    * The displayed width of this Game Object.
    * 
    * This value takes into account the scale factor.
    * 
    * Setting this value will adjust the Game Object's scale property.
    */
  /* CompleteClass */
  override var displayWidth: Double = js.native
  /**
    * The fill alpha value used by this Shape.
    */
  var fillAlpha: Double = js.native
  /**
    * The fill color used by this Shape.
    */
  var fillColor: Double = js.native
  /**
    * The native (un-scaled) height of this Game Object.
    * 
    * Changing this value will not change the size that the Game Object is rendered in-game.
    * For that you need to either set the scale of the Game Object (`setScale`) or use
    * the `displayHeight` property.
    */
  /* CompleteClass */
  override var height: Double = js.native
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
  val pathIndexes: js.Array[integer] = js.native
  /**
    * The stroke alpha value used by this Shape.
    */
  var strokeAlpha: Double = js.native
  /**
    * The stroke color used by this Shape.
    */
  var strokeColor: Double = js.native
  /**
    * The visible state of the Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    */
  /* CompleteClass */
  override var visible: Boolean = js.native
  /**
    * The native (un-scaled) width of this Game Object.
    * 
    * Changing this value will not change the size that the Game Object is rendered in-game.
    * For that you need to either set the scale of the Game Object (`setScale`) or use
    * the `displayWidth` property.
    */
  /* CompleteClass */
  override var width: Double = js.native
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
    * The depth of this Game Object within the Scene.
    * 
    * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
    * of Game Objects, without actually moving their position in the display list.
    * 
    * The depth starts from zero (the default value) and increases from that point. A Game Object with a higher depth
    * value will always render in front of one with a lower value.
    * 
    * Setting the depth will queue a depth sort event within the Scene.
    * @param value The depth of this Game Object.
    */
  /* CompleteClass */
  override def setDepth(value: integer): this.type = js.native
  /**
    * Sets the display size of this Game Object.
    * 
    * Calling this will adjust the scale.
    * @param width The width of this Game Object.
    * @param height The height of this Game Object.
    */
  /* CompleteClass */
  override def setDisplaySize(width: Double, height: Double): this.type = js.native
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
  /**
    * Sets the internal size of this Game Object, as used for frame or physics body creation.
    * 
    * This will not change the size that the Game Object is rendered in-game.
    * For that you need to either set the scale of the Game Object (`setScale`) or call the
    * `setDisplaySize` method, which is the same thing as changing the scale but allows you
    * to do so by giving pixel values.
    * 
    * If you have enabled this Game Object for input, changing the size will _not_ change the
    * size of the hit area. To do this you should adjust the `input.hitArea` object directly.
    * @param width The width of this Game Object.
    * @param height The height of this Game Object.
    */
  /* CompleteClass */
  override def setSize(width: Double, height: Double): this.type = js.native
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
  /**
    * Sets the visibility of this Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    * @param value The visible state of the Game Object.
    */
  /* CompleteClass */
  override def setVisible(value: Boolean): this.type = js.native
}

