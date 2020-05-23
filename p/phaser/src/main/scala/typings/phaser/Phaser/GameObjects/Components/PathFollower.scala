package typings.phaser.Phaser.GameObjects.Components

import typings.phaser.Phaser.Curves.Path
import typings.phaser.Phaser.Types.GameObjects.PathFollower.PathConfig
import typings.phaser.Phaser.Types.Tweens.NumberTweenBuilderConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides methods used for managing a Game Object following a Path.
  * Should be applied as a mixin and not used directly.
  */
@js.native
trait PathFollower extends js.Object {
  /**
    * The Path this PathFollower is following. It can only follow one Path at a time.
    */
  var path: Path = js.native
  /**
    * Should the PathFollower automatically rotate to point in the direction of the Path?
    */
  var rotateToPath: Boolean = js.native
  /**
    * Is this PathFollower actively following a Path or not?
    * 
    * To be considered as `isFollowing` it must be currently moving on a Path, and not paused.
    */
  def isFollowing(): Boolean = js.native
  /**
    * Internal update handler that advances this PathFollower along the path.
    * 
    * Called automatically by the Scene step, should not typically be called directly.
    */
  def pathUpdate(): Unit = js.native
  /**
    * Pauses this PathFollower. It will still continue to render, but it will remain motionless at the
    * point on the Path at which you paused it.
    */
  def pauseFollow(): this.type = js.native
  /**
    * Resumes a previously paused PathFollower.
    * 
    * If the PathFollower was not paused this has no effect.
    */
  def resumeFollow(): this.type = js.native
  /**
    * Set the Path that this PathFollower should follow.
    * 
    * Optionally accepts {@link Phaser.Types.GameObjects.PathFollower.PathConfig} settings.
    * @param path The Path this PathFollower is following. It can only follow one Path at a time.
    * @param config Settings for the PathFollower.
    */
  def setPath(path: Path): this.type = js.native
  def setPath(path: Path, config: Double): this.type = js.native
  def setPath(path: Path, config: PathConfig): this.type = js.native
  def setPath(path: Path, config: NumberTweenBuilderConfig): this.type = js.native
  /**
    * Set whether the PathFollower should automatically rotate to point in the direction of the Path.
    * @param value Whether the PathFollower should automatically rotate to point in the direction of the Path.
    * @param offset Rotation offset in degrees. Default 0.
    */
  def setRotateToPath(value: Boolean): this.type = js.native
  def setRotateToPath(value: Boolean, offset: Double): this.type = js.native
  /**
    * Starts this PathFollower following its given Path.
    * @param config The duration of the follow, or a PathFollower config object. Default {}.
    * @param startAt Optional start position of the follow, between 0 and 1. Default 0.
    */
  def startFollow(): this.type = js.native
  def startFollow(config: Double): this.type = js.native
  def startFollow(config: Double, startAt: Double): this.type = js.native
  def startFollow(config: PathConfig): this.type = js.native
  def startFollow(config: PathConfig, startAt: Double): this.type = js.native
  def startFollow(config: NumberTweenBuilderConfig): this.type = js.native
  def startFollow(config: NumberTweenBuilderConfig, startAt: Double): this.type = js.native
  /**
    * Stops this PathFollower from following the path any longer.
    * 
    * This will invoke any 'stop' conditions that may exist on the Path, or for the follower.
    */
  def stopFollow(): this.type = js.native
}

