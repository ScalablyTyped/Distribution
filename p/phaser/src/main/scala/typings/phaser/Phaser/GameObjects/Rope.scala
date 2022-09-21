package typings.phaser.Phaser.GameObjects

import typings.phaser.Phaser.Animations.AnimationState
import typings.phaser.Phaser.GameObjects.Components.AlphaSingle
import typings.phaser.Phaser.GameObjects.Components.BlendMode
import typings.phaser.Phaser.GameObjects.Components.Depth
import typings.phaser.Phaser.GameObjects.Components.Flip
import typings.phaser.Phaser.GameObjects.Components.Mask
import typings.phaser.Phaser.GameObjects.Components.Pipeline
import typings.phaser.Phaser.GameObjects.Components.ScrollFactor
import typings.phaser.Phaser.GameObjects.Components.Size
import typings.phaser.Phaser.GameObjects.Components.Texture
import typings.phaser.Phaser.GameObjects.Components.Transform
import typings.phaser.Phaser.GameObjects.Components.Visible
import typings.phaser.Phaser.Types.Math.Vector2Like
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Rope Game Object.
  * 
  * The Rope object is WebGL only and does not have a Canvas counterpart.
  * 
  * A Rope is a special kind of Game Object that has a texture that repeats along its entire length.
  * Unlike a Sprite, it isn't restricted to using just a quad and can have as many vertices as you define
  * when creating it. The vertices can be arranged in a horizontal or vertical strip and have their own
  * color and alpha values as well.
  * 
  * A Ropes origin is always 0.5 x 0.5 and cannot be changed.
  */
@js.native
trait Rope
  extends StObject
     with GameObject
     with AlphaSingle
     with BlendMode
     with Depth
     with Flip
     with Mask
     with Pipeline
     with Size
     with Texture
     with Transform
     with Visible
     with ScrollFactor {
  
  /**
    * An array containing the alpha data for this Rope.
    * 
    * Alphas should be given as float values, such as 0.5.
    * You should provide _two_ alpha values for every point in the Rope, one for the top and one for the bottom of each quad.
    * 
    * You can modify the contents of this array directly in real-time, however, should you need to change the _size_
    * of the array, then you should use the `setAlphas` method instead.
    */
  var alphas: js.typedarray.Float32Array = js.native
  
  /**
    * The Animation State of this Rope.
    */
  var anims: AnimationState = js.native
  
  /**
    * An array containing the color data for this Rope.
    * 
    * Colors should be given as numeric RGB values, such as 0xff0000.
    * You should provide _two_ color values for every point in the Rope, one for the top and one for the bottom of each quad.
    * 
    * You can modify the contents of this array directly in real-time, however, should you need to change the _size_
    * of the array, then you should use the `setColors` method instead.
    */
  var colors: js.typedarray.Uint32Array = js.native
  
  /**
    * You can optionally choose to render the vertices of this Rope to a Graphics instance.
    * 
    * Achieve this by setting the `debugCallback` and the `debugGraphic` properties.
    * 
    * You can do this in a single call via the `Rope.setDebug` method, which will use the
    * built-in debug function. You can also set it to your own callback. The callback
    * will be invoked _once per render_ and sent the following parameters:
    * 
    * `debugCallback(src, meshLength, verts)`
    * 
    * `src` is the Rope instance being debugged.
    * `meshLength` is the number of mesh vertices in total.
    * `verts` is an array of the translated vertex coordinates.
    * 
    * To disable rendering, set this property back to `null`.
    */
  var debugCallback: js.Function = js.native
  
  /**
    * The Graphics instance that the debug vertices will be drawn to, if `setDebug` has
    * been called.
    */
  var debugGraphic: Graphics = js.native
  
  /**
    * If the Rope is marked as `dirty` it will automatically recalculate its vertices
    * the next time it renders. You can also force this by calling `updateVertices`.
    */
  var dirty: Boolean = js.native
  
  /**
    * Are the Rope vertices aligned horizontally, in a strip, or vertically, in a column?
    * 
    * This property is set during instantiation and cannot be changed directly.
    * See the `setVertical` and `setHorizontal` methods.
    */
  val horizontal: Boolean = js.native
  
  /**
    * Start playing the given animation.
    * @param key The string-based key of the animation to play.
    * @param ignoreIfPlaying If an animation is already playing then ignore this call. Default false.
    * @param startFrame Optionally start the animation playing from this frame index. Default 0.
    */
  def play(key: String): this.type = js.native
  def play(key: String, ignoreIfPlaying: Boolean): this.type = js.native
  def play(key: String, ignoreIfPlaying: Boolean, startFrame: Double): this.type = js.native
  def play(key: String, ignoreIfPlaying: Unit, startFrame: Double): this.type = js.native
  
  /**
    * An array containing the points data for this Rope.
    * 
    * Each point should be given as a Vector2Like object (i.e. a Vector2, Geom.Point or object with public x/y properties).
    * 
    * The point coordinates are given in local space, where 0 x 0 is the start of the Rope strip.
    * 
    * You can modify the contents of this array directly in real-time to create interesting effects.
    * If you do so, be sure to call `setDirty` _after_ modifying this array, so that the vertices data is
    * updated before the next render. Alternatively, you can use the `setPoints` method instead.
    * 
    * Should you need to change the _size_ of this array, then you should always use the `setPoints` method.
    */
  var points: js.Array[Vector2Like] = js.native
  
  /**
    * The Rope update loop.
    * @param time The current timestamp.
    * @param delta The delta time, in ms, elapsed since the last frame.
    */
  /* protected */ def preUpdate(time: Double, delta: Double): Unit = js.native
  
  /**
    * The built-in Rope vertices debug rendering method.
    * 
    * See `Rope.setDebug` for more details.
    * @param src The Rope object being rendered.
    * @param meshLength The number of vertices in the mesh.
    * @param verts An array of translated vertex coordinates.
    */
  def renderDebugVerts(src: Rope, meshLength: Double, verts: js.Array[Double]): Unit = js.native
  
  /**
    * Resizes all of the internal arrays: `vertices`, `uv`, `colors` and `alphas` to the new
    * given Rope segment total.
    * @param newSize The amount of segments to split the Rope in to.
    */
  def resizeArrays(newSize: Double): this.type = js.native
  
  /**
    * Set the alpha values used by the Rope during rendering.
    * 
    * You can provide the values in a number of ways:
    * 
    * 1) One single numeric value: `setAlphas(0.5)` - This will set a single alpha for the whole Rope.
    * 2) Two numeric value: `setAlphas(1, 0.5)` - This will set a 'top' and 'bottom' alpha value across the whole Rope.
    * 3) An array of values: `setAlphas([ 1, 0.5, 0.2 ])`
    * 
    * If you provide an array of values and the array has exactly the same number of values as `points` in the Rope, it
    * will use each alpha value per rope segment.
    * 
    * If the provided array has a different number of values than `points` then it will use the values in order, from
    * the first Rope segment and on, until it runs out of values. This allows you to control the alpha values at all
    * vertices in the Rope.
    * 
    * Note this method is called `setAlphas` (plural) and not `setAlpha`.
    * @param alphas Either a single alpha value, or an array of values. If nothing is provided alpha is reset to 1.
    * @param bottomAlpha An optional bottom alpha value. See the method description for details.
    */
  def setAlphas(): this.type = js.native
  def setAlphas(alphas: js.Array[Double]): this.type = js.native
  def setAlphas(alphas: js.Array[Double], bottomAlpha: Double): this.type = js.native
  def setAlphas(alphas: Double): this.type = js.native
  def setAlphas(alphas: Double, bottomAlpha: Double): this.type = js.native
  def setAlphas(alphas: Unit, bottomAlpha: Double): this.type = js.native
  
  /**
    * Set the color values used by the Rope during rendering.
    * 
    * Colors are used to control the level of tint applied across the Rope texture.
    * 
    * You can provide the values in a number of ways:
    * 
    * * One single numeric value: `setColors(0xff0000)` - This will set a single color tint for the whole Rope.
    * * An array of values: `setColors([ 0xff0000, 0x00ff00, 0x0000ff ])`
    * 
    * If you provide an array of values and the array has exactly the same number of values as `points` in the Rope, it
    * will use each color per rope segment.
    * 
    * If the provided array has a different number of values than `points` then it will use the values in order, from
    * the first Rope segment and on, until it runs out of values. This allows you to control the color values at all
    * vertices in the Rope.
    * @param colors Either a single color value, or an array of values. If nothing is provided color is reset to 0xffffff.
    */
  def setColors(): this.type = js.native
  def setColors(colors: js.Array[Double]): this.type = js.native
  def setColors(colors: Double): this.type = js.native
  
  /**
    * This method enables rendering of the Rope vertices to the given Graphics instance.
    * 
    * If you enable this feature, you **must** call `Graphics.clear()` in your Scene `update`,
    * otherwise the Graphics instance you provide to debug will fill-up with draw calls,
    * eventually crashing the browser. This is not done automatically to allow you to debug
    * draw multiple Rope objects to a single Graphics instance.
    * 
    * The Rope class has a built-in debug rendering callback `Rope.renderDebugVerts`, however
    * you can also provide your own callback to be used instead. Do this by setting the `callback` parameter.
    * 
    * The callback is invoked _once per render_ and sent the following parameters:
    * 
    * `callback(src, meshLength, verts)`
    * 
    * `src` is the Rope instance being debugged.
    * `meshLength` is the number of mesh vertices in total.
    * `verts` is an array of the translated vertex coordinates.
    * 
    * If using your own callback you do not have to provide a Graphics instance to this method.
    * 
    * To disable debug rendering, to either your own callback or the built-in one, call this method
    * with no arguments.
    * @param graphic The Graphic instance to render to if using the built-in callback.
    * @param callback The callback to invoke during debug render. Leave as undefined to use the built-in callback.
    */
  def setDebug(): this.type = js.native
  def setDebug(graphic: Unit, callback: js.Function): this.type = js.native
  def setDebug(graphic: Graphics): this.type = js.native
  def setDebug(graphic: Graphics, callback: js.Function): this.type = js.native
  
  /**
    * Flags this Rope as being dirty. A dirty rope will recalculate all of its vertices data
    * the _next_ time it renders. You should set this rope as dirty if you update the points
    * array directly.
    */
  def setDirty(): this.type = js.native
  
  /**
    * Sets the alignment of the points in this Rope to be horizontal, in a strip format.
    * 
    * Calling this method will reset this Rope. The current points, vertices, colors and alpha
    * values will be reset to thoes values given as parameters.
    * @param points An array containing the vertices data for this Rope, or a number that indicates how many segments to split the texture frame into. If none is provided the current points length is used.
    * @param colors Either a single color value, or an array of values.
    * @param alphas Either a single alpha value, or an array of values.
    */
  def setHorizontal(): this.type = js.native
  def setHorizontal(points: js.Array[Vector2Like]): this.type = js.native
  def setHorizontal(points: js.Array[Vector2Like], colors: js.Array[Double]): this.type = js.native
  def setHorizontal(points: js.Array[Vector2Like], colors: js.Array[Double], alphas: js.Array[Double]): this.type = js.native
  def setHorizontal(points: js.Array[Vector2Like], colors: js.Array[Double], alphas: Double): this.type = js.native
  def setHorizontal(points: js.Array[Vector2Like], colors: Double): this.type = js.native
  def setHorizontal(points: js.Array[Vector2Like], colors: Double, alphas: js.Array[Double]): this.type = js.native
  def setHorizontal(points: js.Array[Vector2Like], colors: Double, alphas: Double): this.type = js.native
  def setHorizontal(points: js.Array[Vector2Like], colors: Unit, alphas: js.Array[Double]): this.type = js.native
  def setHorizontal(points: js.Array[Vector2Like], colors: Unit, alphas: Double): this.type = js.native
  def setHorizontal(points: Double): this.type = js.native
  def setHorizontal(points: Double, colors: js.Array[Double]): this.type = js.native
  def setHorizontal(points: Double, colors: js.Array[Double], alphas: js.Array[Double]): this.type = js.native
  def setHorizontal(points: Double, colors: js.Array[Double], alphas: Double): this.type = js.native
  def setHorizontal(points: Double, colors: Double): this.type = js.native
  def setHorizontal(points: Double, colors: Double, alphas: js.Array[Double]): this.type = js.native
  def setHorizontal(points: Double, colors: Double, alphas: Double): this.type = js.native
  def setHorizontal(points: Double, colors: Unit, alphas: js.Array[Double]): this.type = js.native
  def setHorizontal(points: Double, colors: Unit, alphas: Double): this.type = js.native
  def setHorizontal(points: Unit, colors: js.Array[Double]): this.type = js.native
  def setHorizontal(points: Unit, colors: js.Array[Double], alphas: js.Array[Double]): this.type = js.native
  def setHorizontal(points: Unit, colors: js.Array[Double], alphas: Double): this.type = js.native
  def setHorizontal(points: Unit, colors: Double): this.type = js.native
  def setHorizontal(points: Unit, colors: Double, alphas: js.Array[Double]): this.type = js.native
  def setHorizontal(points: Unit, colors: Double, alphas: Double): this.type = js.native
  def setHorizontal(points: Unit, colors: Unit, alphas: js.Array[Double]): this.type = js.native
  def setHorizontal(points: Unit, colors: Unit, alphas: Double): this.type = js.native
  
  /**
    * Sets the points used by this Rope.
    * 
    * The points should be provided as an array of Vector2, or vector2-like objects (i.e. those with public x/y properties).
    * 
    * Each point corresponds to one segment of the Rope. The more points in the array, the more segments the rope has.
    * 
    * Point coordinates are given in local-space, not world-space, and are directly related to the size of the texture
    * this Rope object is using.
    * 
    * For example, a Rope using a 512 px wide texture, split into 4 segments (128px each) would use the following points:
    * 
    * ```javascript
    * rope.setPoints([
    *   { x: 0, y: 0 },
    *   { x: 128, y: 0 },
    *   { x: 256, y: 0 },
    *   { x: 384, y: 0 }
    * ]);
    * ```
    * 
    * Or, you can provide an integer to do the same thing:
    * 
    * ```javascript
    * rope.setPoints(4);
    * ```
    * 
    * Which will divide the Rope into 4 equally sized segments based on the frame width.
    * 
    * Note that calling this method with a different number of points than the Rope has currently will
    * _reset_ the color and alpha values, unless you provide them as arguments to this method.
    * @param points An array containing the vertices data for this Rope, or a number that indicates how many segments to split the texture frame into. If none is provided a simple quad is created. Default 2.
    * @param colors Either a single color value, or an array of values.
    * @param alphas Either a single alpha value, or an array of values.
    */
  def setPoints(): this.type = js.native
  def setPoints(points: js.Array[Vector2Like]): this.type = js.native
  def setPoints(points: js.Array[Vector2Like], colors: js.Array[Double]): this.type = js.native
  def setPoints(points: js.Array[Vector2Like], colors: js.Array[Double], alphas: js.Array[Double]): this.type = js.native
  def setPoints(points: js.Array[Vector2Like], colors: js.Array[Double], alphas: Double): this.type = js.native
  def setPoints(points: js.Array[Vector2Like], colors: Double): this.type = js.native
  def setPoints(points: js.Array[Vector2Like], colors: Double, alphas: js.Array[Double]): this.type = js.native
  def setPoints(points: js.Array[Vector2Like], colors: Double, alphas: Double): this.type = js.native
  def setPoints(points: js.Array[Vector2Like], colors: Unit, alphas: js.Array[Double]): this.type = js.native
  def setPoints(points: js.Array[Vector2Like], colors: Unit, alphas: Double): this.type = js.native
  def setPoints(points: Double): this.type = js.native
  def setPoints(points: Double, colors: js.Array[Double]): this.type = js.native
  def setPoints(points: Double, colors: js.Array[Double], alphas: js.Array[Double]): this.type = js.native
  def setPoints(points: Double, colors: js.Array[Double], alphas: Double): this.type = js.native
  def setPoints(points: Double, colors: Double): this.type = js.native
  def setPoints(points: Double, colors: Double, alphas: js.Array[Double]): this.type = js.native
  def setPoints(points: Double, colors: Double, alphas: Double): this.type = js.native
  def setPoints(points: Double, colors: Unit, alphas: js.Array[Double]): this.type = js.native
  def setPoints(points: Double, colors: Unit, alphas: Double): this.type = js.native
  def setPoints(points: Unit, colors: js.Array[Double]): this.type = js.native
  def setPoints(points: Unit, colors: js.Array[Double], alphas: js.Array[Double]): this.type = js.native
  def setPoints(points: Unit, colors: js.Array[Double], alphas: Double): this.type = js.native
  def setPoints(points: Unit, colors: Double): this.type = js.native
  def setPoints(points: Unit, colors: Double, alphas: js.Array[Double]): this.type = js.native
  def setPoints(points: Unit, colors: Double, alphas: Double): this.type = js.native
  def setPoints(points: Unit, colors: Unit, alphas: js.Array[Double]): this.type = js.native
  def setPoints(points: Unit, colors: Unit, alphas: Double): this.type = js.native
  
  /**
    * Sets the tint fill mode.
    * 
    * Mode 0 (`false`) is an additive tint, the default, which blends the vertices colors with the texture.
    * This mode respects the texture alpha.
    * 
    * Mode 1 (`true`) is a fill tint. Unlike an additive tint, a fill-tint literally replaces the pixel colors
    * from the texture with those in the tint. You can use this for effects such as making a player flash 'white'
    * if hit by something. This mode respects the texture alpha.
    * 
    * See the `setColors` method for details of how to color each of the vertices.
    * @param value Set to `false` for an Additive tint or `true` fill tint with alpha. Default false.
    */
  def setTintFill(): this.type = js.native
  def setTintFill(value: Boolean): this.type = js.native
  
  /**
    * Sets the alignment of the points in this Rope to be vertical, in a column format.
    * 
    * Calling this method will reset this Rope. The current points, vertices, colors and alpha
    * values will be reset to thoes values given as parameters.
    * @param points An array containing the vertices data for this Rope, or a number that indicates how many segments to split the texture frame into. If none is provided the current points length is used.
    * @param colors Either a single color value, or an array of values.
    * @param alphas Either a single alpha value, or an array of values.
    */
  def setVertical(): this.type = js.native
  def setVertical(points: js.Array[Vector2Like]): this.type = js.native
  def setVertical(points: js.Array[Vector2Like], colors: js.Array[Double]): this.type = js.native
  def setVertical(points: js.Array[Vector2Like], colors: js.Array[Double], alphas: js.Array[Double]): this.type = js.native
  def setVertical(points: js.Array[Vector2Like], colors: js.Array[Double], alphas: Double): this.type = js.native
  def setVertical(points: js.Array[Vector2Like], colors: Double): this.type = js.native
  def setVertical(points: js.Array[Vector2Like], colors: Double, alphas: js.Array[Double]): this.type = js.native
  def setVertical(points: js.Array[Vector2Like], colors: Double, alphas: Double): this.type = js.native
  def setVertical(points: js.Array[Vector2Like], colors: Unit, alphas: js.Array[Double]): this.type = js.native
  def setVertical(points: js.Array[Vector2Like], colors: Unit, alphas: Double): this.type = js.native
  def setVertical(points: Double): this.type = js.native
  def setVertical(points: Double, colors: js.Array[Double]): this.type = js.native
  def setVertical(points: Double, colors: js.Array[Double], alphas: js.Array[Double]): this.type = js.native
  def setVertical(points: Double, colors: js.Array[Double], alphas: Double): this.type = js.native
  def setVertical(points: Double, colors: Double): this.type = js.native
  def setVertical(points: Double, colors: Double, alphas: js.Array[Double]): this.type = js.native
  def setVertical(points: Double, colors: Double, alphas: Double): this.type = js.native
  def setVertical(points: Double, colors: Unit, alphas: js.Array[Double]): this.type = js.native
  def setVertical(points: Double, colors: Unit, alphas: Double): this.type = js.native
  def setVertical(points: Unit, colors: js.Array[Double]): this.type = js.native
  def setVertical(points: Unit, colors: js.Array[Double], alphas: js.Array[Double]): this.type = js.native
  def setVertical(points: Unit, colors: js.Array[Double], alphas: Double): this.type = js.native
  def setVertical(points: Unit, colors: Double): this.type = js.native
  def setVertical(points: Unit, colors: Double, alphas: js.Array[Double]): this.type = js.native
  def setVertical(points: Unit, colors: Double, alphas: Double): this.type = js.native
  def setVertical(points: Unit, colors: Unit, alphas: js.Array[Double]): this.type = js.native
  def setVertical(points: Unit, colors: Unit, alphas: Double): this.type = js.native
  
  /**
    * The tint fill mode.
    * 
    * `false` = An additive tint (the default), where vertices colors are blended with the texture.
    * `true` = A fill tint, where the vertices colors replace the texture, but respects texture alpha.
    */
  var tintFill: Boolean = js.native
  
  /**
    * Updates all of the UVs based on the Rope.points and `flipX` and `flipY` settings.
    */
  def updateUVs(): this.type = js.native
  
  /**
    * Updates the vertices based on the Rope points.
    * 
    * This method is called automatically during rendering if `Rope.dirty` is `true`, which is set
    * by the `setPoints` and `setDirty` methods. You should flag the Rope as being dirty if you modify
    * the Rope points directly.
    */
  def updateVertices(): this.type = js.native
  
  /**
    * An array containing the uv data for this Rope.
    * 
    * This data is calculated automatically in the `setPoints` method, based on the points provided.
    */
  var uv: js.typedarray.Float32Array = js.native
  
  /**
    * An array containing the vertices data for this Rope.
    * 
    * This data is calculated automatically in the `updateVertices` method, based on the points provided.
    */
  var vertices: js.typedarray.Float32Array = js.native
}
