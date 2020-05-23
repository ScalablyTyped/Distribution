package typings.phaser.Phaser.GameObjects

import typings.phaser.Phaser.Math.Vector2
import typings.phaser.Phaser.Tweens.Tween
import typings.phaser.Phaser.Types.GameObjects.PathFollower.PathConfig
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
@js.native
trait PathFollower
  extends Sprite
     with typings.phaser.Phaser.GameObjects.Components.PathFollower {
  /**
    * Settings for the PathFollower.
    */
  var pathConfig: PathConfig = js.native
  /**
    * The distance the follower has traveled from the previous point to the current one, at the last update.
    */
  var pathDelta: Vector2 = js.native
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

