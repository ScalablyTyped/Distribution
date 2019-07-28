package typings.phaser.PhaserNs.GameObjectsNs

import typings.phaser.PhaserNs.CurvesNs.Path
import typings.phaser.PhaserNs.MathNs.Vector2
import typings.phaser.PhaserNs.Scene
import typings.phaser.PhaserNs.TweensNs.Tween
import typings.phaser.PhaserNs.TypesNs.GameObjectsNs.PathFollowerNs.PathConfig
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
@JSGlobal("Phaser.GameObjects.PathFollower")
@js.native
class PathFollower protected ()
  extends Sprite
     with typings.phaser.PhaserNs.GameObjectsNs.ComponentsNs.PathFollower {
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
  /**
    * Settings for the PathFollower.
    */
  var pathConfig: PathConfig = js.native
  /**
    * An additional vector to add to the PathFollowers position, allowing you to offset it from the
    * Path coordinates.
    */
  var pathOffset: Vector2 = js.native
  /**
    * If the PathFollower is rotating to match the Path (@see Phaser.GameObjects.PathFollower#rotateToPath)
    * this value is added to the rotation value. This allows you to rotate objects to a path but control
    * the angle of the rotation as well.
    */
  var pathRotationOffset: Double = js.native
  /**
    * The Tween used for following the Path.
    */
  var pathTween: Tween = js.native
  /**
    * A Vector2 that stores the current point of the path the follower is on.
    */
  var pathVector: Vector2 = js.native
}

