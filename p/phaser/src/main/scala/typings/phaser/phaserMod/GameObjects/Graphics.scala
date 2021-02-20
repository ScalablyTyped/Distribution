package typings.phaser.phaserMod.GameObjects

import typings.phaser.Phaser.Cameras.Scene2D.Camera
import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Types.GameObjects.Graphics.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Graphics object is a way to draw primitive shapes to your game. Primitives include forms of geometry, such as
  * Rectangles, Circles, and Polygons. They also include lines, arcs and curves. When you initially create a Graphics
  * object it will be empty.
  * 
  * To draw to it you must first specify a line style or fill style (or both), draw shapes using paths, and finally
  * fill or stroke them. For example:
  * 
  * ```javascript
  * graphics.lineStyle(5, 0xFF00FF, 1.0);
  * graphics.beginPath();
  * graphics.moveTo(100, 100);
  * graphics.lineTo(200, 200);
  * graphics.closePath();
  * graphics.strokePath();
  * ```
  * 
  * There are also many helpful methods that draw and fill/stroke common shapes for you.
  * 
  * ```javascript
  * graphics.lineStyle(5, 0xFF00FF, 1.0);
  * graphics.fillStyle(0xFFFFFF, 1.0);
  * graphics.fillRect(50, 50, 400, 200);
  * graphics.strokeRect(50, 50, 400, 200);
  * ```
  * 
  * When a Graphics object is rendered it will render differently based on if the game is running under Canvas or WebGL.
  * Under Canvas it will use the HTML Canvas context drawing operations to draw the path.
  * Under WebGL the graphics data is decomposed into polygons. Both of these are expensive processes, especially with
  * complex shapes.
  * 
  * If your Graphics object doesn't change much (or at all) once you've drawn your shape to it, then you will help
  * performance by calling {@link Phaser.GameObjects.Graphics#generateTexture}. This will 'bake' the Graphics object into
  * a Texture, and return it. You can then use this Texture for Sprites or other display objects. If your Graphics object
  * updates frequently then you should avoid doing this, as it will constantly generate new textures, which will consume
  * memory.
  * 
  * As you can tell, Graphics objects are a bit of a trade-off. While they are extremely useful, you need to be careful
  * in their complexity and quantity of them in your game.
  */
@JSImport("phaser", "GameObjects.Graphics")
@js.native
class Graphics protected ()
  extends typings.phaser.Phaser.GameObjects.Graphics {
  /**
    * 
    * @param scene The Scene to which this Graphics object belongs.
    * @param options Options that set the position and default style of this Graphics object.
    */
  def this(scene: Scene) = this()
  def this(scene: Scene, options: Options) = this()
}
object Graphics {
  
  @JSImport("phaser", "GameObjects.Graphics")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A Camera used specifically by the Graphics system for rendering to textures.
    */
  /* static member */
  @JSImport("phaser", "GameObjects.Graphics.TargetCamera")
  @js.native
  def TargetCamera: Camera = js.native
  @scala.inline
  def TargetCamera_=(x: Camera): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TargetCamera")(x.asInstanceOf[js.Any])
}
