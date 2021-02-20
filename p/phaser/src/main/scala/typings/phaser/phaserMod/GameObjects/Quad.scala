package typings.phaser.phaserMod.GameObjects

import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Textures.Texture
import typings.phaser.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Quad Game Object.
  * 
  * A Quad is a Mesh Game Object pre-configured with two triangles arranged into a rectangle, with a single
  * texture spread across them.
  * 
  * You can manipulate the corner points of the quad via the getters and setters such as `topLeftX`, and also
  * change their alpha and color values. The quad itself can be moved by adjusting the `x` and `y` properties.
  */
@JSImport("phaser", "GameObjects.Quad")
@js.native
class Quad protected ()
  extends typings.phaser.Phaser.GameObjects.Quad {
  /**
    * 
    * @param scene The Scene to which this Quad belongs.
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param texture The key, or instance of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    * @param frame An optional frame from the Texture this Game Object is rendering with.
    */
  def this(scene: Scene, x: Double, y: Double, texture: String) = this()
  def this(scene: Scene, x: Double, y: Double, texture: Texture) = this()
  def this(scene: Scene, x: Double, y: Double, texture: String, frame: String) = this()
  def this(scene: Scene, x: Double, y: Double, texture: String, frame: integer) = this()
  def this(scene: Scene, x: Double, y: Double, texture: Texture, frame: String) = this()
  def this(scene: Scene, x: Double, y: Double, texture: Texture, frame: integer) = this()
}
