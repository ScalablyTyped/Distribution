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
import typings.phaser.Phaser.GameObjects.Components.Texture
import typings.phaser.Phaser.GameObjects.Components.Transform
import typings.phaser.Phaser.GameObjects.Components.Visible
import typings.phaser.Phaser.Geom.Mesh.Vertex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Nine Slice Game Object allows you to display a texture-based object that
  * can be stretched both horizontally and vertically, but that retains
  * fixed-sized corners. The dimensions of the corners are set via the
  * parameters to this class.
  * 
  * This is extremely useful for UI and button like elements, where you need
  * them to expand to accommodate the content without distorting the texture.
  * 
  * The texture you provide for this Game Object should be based on the
  * following layout structure:
  * 
  * ```
  *      A                          B
  *    +---+----------------------+---+
  *  C | 1 |          2           | 3 |
  *    +---+----------------------+---+
  *    |   |                      |   |
  *    | 4 |          5           | 6 |
  *    |   |                      |   |
  *    +---+----------------------+---+
  *  D | 7 |          8           | 9 |
  *    +---+----------------------+---+
  * ```
  * 
  * When changing this objects width and / or height:
  * 
  *     areas 1, 3, 7 and 9 (the corners) will remain unscaled
  *     areas 2 and 8 will be stretched horizontally only
  *     areas 4 and 6 will be stretched vertically only
  *     area 5 will be stretched both horizontally and vertically
  * 
  * You can also create a 3 slice Game Object:
  * 
  * This works in a similar way, except you can only stretch it horizontally.
  * Therefore, it requires less configuration:
  * 
  * ```
  *      A                          B
  *    +---+----------------------+---+
  *    |   |                      |   |
  *  C | 1 |          2           | 3 |
  *    |   |                      |   |
  *    +---+----------------------+---+
  * ```
  * 
  * When changing this objects width (you cannot change its height)
  * 
  *     areas 1 and 3 will remain unscaled
  *     area 2 will be stretched horizontally
  * 
  * The above configuration concept is adapted from the Pixi NineSlicePlane.
  * 
  * To specify a 3 slice object instead of a 9 slice you should only
  * provide the `leftWidth` and `rightWidth` parameters. To create a 9 slice
  * you must supply all parameters.
  * 
  * The _minimum_ width this Game Object can be is the total of
  * `leftWidth` + `rightWidth`.  The _minimum_ height this Game Object
  * can be is the total of `topHeight` + `bottomHeight`.
  * If you need to display this object at a smaller size, you can scale it.
  * 
  * In terms of performance, using a 3 slice Game Object is the equivalent of
  * having 3 Sprites in a row. Using a 9 slice Game Object is the equivalent
  * of having 9 Sprites in a row. The vertices of this object are all batched
  * together and can co-exist with other Sprites and graphics on the display
  * list, without incurring any additional overhead.
  * 
  * As of Phaser 3.60 this Game Object is WebGL only.
  */
@js.native
trait NineSlice
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
     with Texture
     with Transform
     with Visible {
  
  /**
    * The size of the bottom horizontal bar (D).
    * 
    * If this is a 3 slice object this property will be set to zero.
    */
  val bottomHeight: Double = js.native
  
  /**
    * Clears all tint values associated with this Game Object.
    * 
    * Immediately sets the color values back to 0xffffff and the tint type to 'additive',
    * which results in no visible change to the texture.
    */
  def clearTint(): this.type = js.native
  
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
    * The displayed height of this Game Object.
    * 
    * Setting this value will adjust the way in which this Nine Slice
    * object scales vertically, if configured to do so.
    * 
    * The _minimum_ height this Game Object can be is the total of
    * `topHeight` + `bottomHeight`. If you need to display this object
    * at a smaller size, you can also scale it.
    * 
    * If this is a 3-slice object, you can only stretch it horizontally
    * and changing the height will be ignored.
    */
  var height: Double = js.native
  
  /**
    * This property is `true` if this Nine Slice Game Object was configured
    * with just `leftWidth` and `rightWidth` values, making it a 3-slice
    * instead of a 9-slice object.
    */
  var is3Slice: Boolean = js.native
  
  /**
    * Does this Game Object have a tint applied?
    * 
    * It checks to see if the tint property is set to a value other than 0xffffff.
    * This indicates that a Game Object is tinted.
    */
  val isTinted: Boolean = js.native
  
  /**
    * The size of the left vertical bar (A).
    */
  val leftWidth: Double = js.native
  
  /**
    * The size of the right vertical bar (B).
    */
  val rightWidth: Double = js.native
  
  /**
    * Sets the display size of this Game Object.
    * 
    * Calling this will adjust the scale.
    * @param width The width of this Game Object.
    * @param height The height of this Game Object.
    */
  def setDisplaySize(width: Double, height: Double): this.type = js.native
  
  /**
    * Sets the size of this Game Object.
    * 
    * For a Nine Slice Game Object this means it will be stretched (or shrunk) horizontally
    * and vertically depending on the dimensions given to this method, in accordance with
    * how it has been configured for the various corner sizes.
    * 
    * If this is a 3-slice object, you can only stretch it horizontally
    * and changing the height will be ignored.
    * 
    * If you have enabled this Game Object for input, changing the size will also change the
    * size of the hit area.
    * @param width The width of this Game Object.
    * @param height The height of this Game Object.
    */
  def setSize(width: Double, height: Double): this.type = js.native
  
  /**
    * This method is included but does nothing for the Nine Slice Game Object,
    * because the size of the object isn't based on the texture frame.
    * 
    * You should not call this method.
    */
  def setSizeToFrame(): this.type = js.native
  
  /**
    * Resets the width, height and slices for this NineSlice Game Object.
    * 
    * This allows you to modify the texture being used by this object and then reset the slice configuration,
    * to avoid having to destroy this Game Object in order to use it for a different game element.
    * 
    * Please note that you cannot change a 9-slice to a 3-slice or vice versa.
    * @param width The width of the Nine Slice Game Object. You can adjust the width post-creation. Default 256.
    * @param height The height of the Nine Slice Game Object. If this is a 3 slice object the height will be fixed to the height of the texture and cannot be changed. Default 256.
    * @param leftWidth The size of the left vertical column (A). Default 10.
    * @param rightWidth The size of the right vertical column (B). Default 10.
    * @param topHeight The size of the top horiztonal row (C). Set to zero or undefined to create a 3 slice object. Default 0.
    * @param bottomHeight The size of the bottom horiztonal row (D). Set to zero or undefined to create a 3 slice object. Default 0.
    */
  def setSlices(
    width: js.UndefOr[Double],
    height: js.UndefOr[Double],
    leftWidth: js.UndefOr[Double],
    rightWidth: js.UndefOr[Double],
    topHeight: js.UndefOr[Double],
    bottomHeight: js.UndefOr[Double]
  ): this.type = js.native
  
  /**
    * Sets an additive tint on this Game Object.
    * 
    * The tint works by taking the pixel color values from the Game Objects texture, and then
    * multiplying it by the color value of the tint.
    * 
    * To modify the tint color once set, either call this method again with new values or use the
    * `tint` property.
    * 
    * To remove a tint call `clearTint`, or call this method with no parameters.
    * 
    * To swap this from being an additive tint to a fill based tint set the property `tintFill` to `true`.
    * @param color The tint being applied to the entire Game Object. Default 0xffffff.
    */
  def setTint(): this.type = js.native
  def setTint(color: Double): this.type = js.native
  
  /**
    * Sets a fill-based tint on this Game Object.
    * 
    * Unlike an additive tint, a fill-tint literally replaces the pixel colors from the texture
    * with those in the tint. You can use this for effects such as making a player flash 'white'
    * if hit by something. The whole Game Object will be rendered in the given color.
    * 
    * To modify the tint color once set, either call this method again with new values or use the
    * `tint` property.
    * 
    * To remove a tint call `clearTint`, or call this method with no parameters.
    * 
    * To swap this from being a fill-tint to an additive tint set the property `tintFill` to `false`.
    * @param color The tint being applied to the entire Game Object. Default 0xffffff.
    */
  def setTintFill(): this.type = js.native
  def setTintFill(color: Double): this.type = js.native
  
  /**
    * The tint value being applied to the top-left vertice of the Game Object.
    * This value is interpolated from the corner to the center of the Game Object.
    * The value should be set as a hex number, i.e. 0xff0000 for red, or 0xff00ff for purple.
    */
  var tint: Double = js.native
  
  /**
    * The tint fill mode.
    * 
    * `false` = An additive tint (the default), where vertices colors are blended with the texture.
    * `true` = A fill tint, where the vertices colors replace the texture, but respects texture alpha.
    */
  var tintFill: Boolean = js.native
  
  /**
    * The size of the top horizontal bar (C).
    * 
    * If this is a 3 slice object this property will be set to the
    * height of the texture being used.
    */
  val topHeight: Double = js.native
  
  /**
    * Internally updates the position coordinates across all vertices of the
    * given quad offset.
    * 
    * You should not typically need to call this method directly, but it
    * is left public should an extended class require it.
    * @param offset The offset in the vertices array of the quad to update.
    * @param x1 The top-left quad coordinate.
    * @param y1 The top-left quad coordinate.
    * @param x2 The bottom-right quad coordinate.
    * @param y2 The bottom-right quad coordinate.
    */
  def updateQuad(offset: Double, x1: Double, y1: Double, x2: Double, y2: Double): Unit = js.native
  
  /**
    * Internally updates the UV coordinates across all vertices of the
    * given quad offset, based on the frame size.
    * 
    * You should not typically need to call this method directly, but it
    * is left public should an extended class require it.
    * @param offset The offset in the vertices array of the quad to update.
    * @param u1 The top-left UV coordinate.
    * @param v1 The top-left UV coordinate.
    * @param u2 The bottom-right UV coordinate.
    * @param v2 The bottom-right UV coordinate.
    */
  def updateQuadUVs(offset: Double, u1: Double, v1: Double, u2: Double, v2: Double): Unit = js.native
  
  /**
    * Updates all of the vertice UV coordinates. This is called automatically
    * when the NineSlice Game Object is created, or if the texture frame changes.
    * 
    * Unlike with the `updateVertice` method, you do not need to call this
    * method if the Nine Slice changes size. Only if it changes texture frame.
    */
  def updateUVs(): Unit = js.native
  
  /**
    * Recalculates all of the vertices in this Nine Slice Game Object
    * based on the `leftWidth`, `rightWidth`, `topHeight` and `bottomHeight`
    * properties, combined with the Game Object size.
    * 
    * This method is called automatically when this object is created
    * or if it's origin is changed.
    * 
    * You should not typically need to call this method directly, but it
    * is left public should you find a need to modify one of those properties
    * after creation.
    */
  def updateVertices(): Unit = js.native
  
  /**
    * An array of Vertex objects that correspond to the quads that make-up
    * this Nine Slice Game Object. They are stored in the following order:
    * 
    * Top Left - Indexes 0 - 5
    * Top Center - Indexes 6 - 11
    * Top Right - Indexes 12 - 17
    * Center Left - Indexes 18 - 23
    * Center - Indexes 24 - 29
    * Center Right - Indexes 30 - 35
    * Bottom Left - Indexes 36 - 41
    * Bottom Center - Indexes 42 - 47
    * Bottom Right - Indexes 48 - 53
    * 
    * Each quad is represented by 6 Vertex instances.
    * 
    * This array will contain 18 elements for a 3 slice object
    * and 54 for a nine slice object.
    * 
    * You should never modify this array once it has been populated.
    */
  var vertices: js.Array[Vertex] = js.native
  
  /**
    * The displayed width of this Game Object.
    * 
    * Setting this value will adjust the way in which this Nine Slice
    * object scales horizontally, if configured to do so.
    * 
    * The _minimum_ width this Game Object can be is the total of
    * `leftWidth` + `rightWidth`. If you need to display this object
    * at a smaller size, you can also scale it.
    */
  var width: Double = js.native
}
