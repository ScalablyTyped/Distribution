package typings.phaser.mod.GameObjects

import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Textures.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Plane Game Object.
  * 
  * The Plane Game Object is a helper class that takes the Mesh Game Object and extends it,
  * allowing for fast and easy creation of Planes. A Plane is a one-sided grid of cells,
  * where you specify the number of cells in each dimension. The Plane can have a texture
  * that is either repeated (tiled) across each cell, or applied to the full Plane.
  * 
  * The Plane can then be manipulated in 3D space, with rotation across all 3 axis.
  * 
  * This allows you to create effects not possible with regular Sprites, such as perspective
  * distortion. You can also adjust the vertices on a per-vertex basis. Plane data becomes
  * part of the WebGL batch, just like standard Sprites, so doesn't introduce any additional
  * shader overhead. Because the Plane just generates vertices into the WebGL batch, like any
  * other Sprite, you can use all of the common Game Object components on a Plane too,
  * such as a custom pipeline, mask, blend mode or texture.
  * 
  * You can use the `uvScroll` and `uvScale` methods to adjust the placement and scaling
  * of the texture if this Plane is using a single texture, and not a frame from a texture
  * atlas or sprite sheet.
  * 
  * The Plane Game Object also has the Animation component, allowing you to play animations
  * across the Plane just as you would with a Sprite.
  * 
  * Note that the Plane object is WebGL only and does not have a Canvas counterpart.
  * 
  * The Plane origin is always 0.5 x 0.5 and cannot be changed.
  */
@JSImport("phaser", "GameObjects.Plane")
@js.native
open class Plane protected ()
  extends StObject
     with typings.phaser.Phaser.GameObjects.Plane {
  /**
    * 
    * @param scene The Scene to which this Plane belongs. A Plane can only belong to one Scene at a time.
    * @param x The horizontal position of this Plane in the world.
    * @param y The vertical position of this Plane in the world.
    * @param texture The key, or instance of the Texture this Plane will use to render with, as stored in the Texture Manager.
    * @param frame An optional frame from the Texture this Plane is rendering with.
    * @param width The width of this Plane, in cells, not pixels. Default 8.
    * @param height The height of this Plane, in cells, not pixels. Default 8.
    * @param tile Is the texture tiled? I.e. repeated across each cell. Default false.
    */
  def this(
    scene: Scene,
    x: js.UndefOr[Double],
    y: js.UndefOr[Double],
    texture: js.UndefOr[String | Texture],
    frame: js.UndefOr[String | Double],
    width: js.UndefOr[Double],
    height: js.UndefOr[Double],
    tile: js.UndefOr[Boolean]
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
