package typings.phaser.phaserMod.GameObjects

import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Types.Math.Vector2Like
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
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
@JSImport("phaser", "GameObjects.Rope")
@js.native
class Rope protected ()
  extends typings.phaser.Phaser.GameObjects.Rope {
  /**
    * 
    * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
    * @param x The horizontal position of this Game Object in the world. Default 0.
    * @param y The vertical position of this Game Object in the world. Default 0.
    * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager. If not given, `__DEFAULT` is used.
    * @param frame An optional frame from the Texture this Game Object is rendering with.
    * @param points An array containing the vertices data for this Rope, or a number that indicates how many segments to split the texture frame into. If none is provided a simple quad is created. See `setPoints` to set this post-creation. Default 2.
    * @param horizontal Should the vertices of this Rope be aligned horizontally (`true`), or vertically (`false`)? Default true.
    * @param colors An optional array containing the color data for this Rope. You should provide one color value per pair of vertices.
    * @param alphas An optional array containing the alpha data for this Rope. You should provide one alpha value per pair of vertices.
    */
  def this(
    scene: Scene,
    x: js.UndefOr[Double],
    y: js.UndefOr[Double],
    texture: js.UndefOr[String],
    frame: js.UndefOr[String | integer | Null],
    points: js.UndefOr[integer | js.Array[Vector2Like]],
    horizontal: js.UndefOr[Boolean],
    colors: js.UndefOr[js.Array[Double]],
    alphas: js.UndefOr[js.Array[Double]]
  ) = this()
}
