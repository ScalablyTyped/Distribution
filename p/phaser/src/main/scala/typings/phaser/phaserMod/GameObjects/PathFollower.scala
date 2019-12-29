package typings.phaser.phaserMod.GameObjects

import typings.phaser.Phaser.Curves.Path
import typings.phaser.Phaser.Scene
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A PathFollower Game Object.
  * 
  * A PathFollower is a Sprite Game Object with some extra helpers to allow it to follow a Path automatically.
  * 
  * Anything you can do with a standard Sprite can be done with this PathFollower, such as animate it, tint it,
  * scale it and so on.
  * 
  * PathFollowers are bound to a single Path at any one time and can traverse the length of the Path, from start
  * to finish, forwards or backwards, or from any given point on the Path to its end. They can optionally rotate
  * to face the direction of the path, be offset from the path coordinates or rotate independently of the Path.
  */
@JSImport("phaser", "GameObjects.PathFollower")
@js.native
class PathFollower protected ()
  extends typings.phaser.Phaser.GameObjects.PathFollower {
  /**
    * 
    * @param scene The Scene to which this PathFollower belongs.
    * @param path The Path this PathFollower is following. It can only follow one Path at a time.
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    * @param frame An optional frame from the Texture this Game Object is rendering with.
    */
  def this(scene: Scene, path: Path, x: Double, y: Double, texture: String) = this()
  def this(scene: Scene, path: Path, x: Double, y: Double, texture: String, frame: String) = this()
  def this(scene: Scene, path: Path, x: Double, y: Double, texture: String, frame: integer) = this()
}

