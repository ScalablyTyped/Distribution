package typings.phaser.global.Phaser.GameObjects

import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Textures.Texture
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
@JSGlobal("Phaser.GameObjects.NineSlice")
@js.native
open class NineSlice protected ()
  extends StObject
     with typings.phaser.Phaser.GameObjects.NineSlice {
  /**
    * 
    * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
    * @param x The horizontal position of the center of this Game Object in the world.
    * @param y The vertical position of the center of this Game Object in the world.
    * @param texture The key, or instance of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    * @param frame An optional frame from the Texture this Game Object is rendering with.
    * @param width The width of the Nine Slice Game Object. You can adjust the width post-creation. Default 256.
    * @param height The height of the Nine Slice Game Object. If this is a 3 slice object the height will be fixed to the height of the texture and cannot be changed. Default 256.
    * @param leftWidth The size of the left vertical column (A). Default 10.
    * @param rightWidth The size of the right vertical column (B). Default 10.
    * @param topHeight The size of the top horiztonal row (C). Set to zero or undefined to create a 3 slice object. Default 0.
    * @param bottomHeight The size of the bottom horiztonal row (D). Set to zero or undefined to create a 3 slice object. Default 0.
    */
  def this(
    scene: Scene,
    x: Double,
    y: Double,
    texture: String | Texture,
    frame: js.UndefOr[String | Double],
    width: js.UndefOr[Double],
    height: js.UndefOr[Double],
    leftWidth: js.UndefOr[Double],
    rightWidth: js.UndefOr[Double],
    topHeight: js.UndefOr[Double],
    bottomHeight: js.UndefOr[Double]
  ) = this()
  
  /**
    * The depth of this Game Object within the Scene. Ensure this value is only ever set to a number data-type.
    * 
    * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
    * of Game Objects, without actually moving their position in the display list.
    * 
    * The default depth is zero. A Game Object with a higher depth
    * value will always render in front of one with a lower value.
    * 
    * Setting the depth will queue a depth sort event within the Scene.
    */
  /* CompleteClass */
  var depth: Double = js.native
  
  /**
    * The depth of this Game Object within the Scene.
    * 
    * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
    * of Game Objects, without actually moving their position in the display list.
    * 
    * The default depth is zero. A Game Object with a higher depth
    * value will always render in front of one with a lower value.
    * 
    * Setting the depth will queue a depth sort event within the Scene.
    * @param value The depth of this Game Object. Ensure this value is only ever a number data-type.
    */
  /* CompleteClass */
  override def setDepth(value: Double): this.type = js.native
  
  /**
    * Sets the visibility of this Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    * @param value The visible state of the Game Object.
    */
  /* CompleteClass */
  override def setVisible(value: Boolean): this.type = js.native
  
  /**
    * The visible state of the Game Object.
    * 
    * An invisible Game Object will skip rendering, but will still process update logic.
    */
  /* CompleteClass */
  var visible: Boolean = js.native
}
