package typings
package phaserLib.PhaserNs.GameObjectsNs.ComponentsNs

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
  var path: phaserLib.PhaserNs.CurvesNs.Path = js.native
  /**
    * Should the PathFollower automatically rotate to point in the direction of the Path?
    */
  var rotateToPath: scala.Boolean = js.native
  /**
    * Is this PathFollower actively following a Path or not?
    * 
    * To be considered as `isFollowing` it must be currently moving on a Path, and not paused.
    */
  def isFollowing(): scala.Boolean = js.native
  /**
    * Internal update handler that advances this PathFollower along the path.
    * 
    * Called automatically by the Scene step, should not typically be called directly.
    */
  def pathUpdate(): scala.Unit = js.native
  /**
    * Pauses this PathFollower. It will still continue to render, but it will remain motionless at the
    * point on the Path at which you paused it.
    */
  def pauseFollow(): phaserLib.PhaserNs.GameObjectsNs.PathFollower = js.native
  /**
    * Resumes a previously paused PathFollower.
    * 
    * If the PathFollower was not paused this has no effect.
    */
  def resumeFollow(): phaserLib.PhaserNs.GameObjectsNs.PathFollower = js.native
  /**
    * Set the Path that this PathFollower should follow.
    * 
    * Optionally accepts {@link Phaser.Types.GameObjects.PathFollower.PathConfig} settings.
    * @param path The Path this PathFollower is following. It can only follow one Path at a time.
    * @param config Settings for the PathFollower.
    */
  def setPath(path: phaserLib.PhaserNs.CurvesNs.Path): phaserLib.PhaserNs.GameObjectsNs.PathFollower = js.native
  def setPath(
    path: phaserLib.PhaserNs.CurvesNs.Path,
    config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.PathFollowerNs.PathConfig
  ): phaserLib.PhaserNs.GameObjectsNs.PathFollower = js.native
  def setPath(
    path: phaserLib.PhaserNs.CurvesNs.Path,
    config: phaserLib.PhaserNs.TypesNs.TweensNs.NumberTweenBuilderConfig
  ): phaserLib.PhaserNs.GameObjectsNs.PathFollower = js.native
  def setPath(path: phaserLib.PhaserNs.CurvesNs.Path, config: scala.Double): phaserLib.PhaserNs.GameObjectsNs.PathFollower = js.native
  /**
    * Set whether the PathFollower should automatically rotate to point in the direction of the Path.
    * @param value Whether the PathFollower should automatically rotate to point in the direction of the Path.
    * @param offset Rotation offset in degrees. Default 0.
    */
  def setRotateToPath(value: scala.Boolean): phaserLib.PhaserNs.GameObjectsNs.PathFollower = js.native
  def setRotateToPath(value: scala.Boolean, offset: scala.Double): phaserLib.PhaserNs.GameObjectsNs.PathFollower = js.native
  /**
    * Starts this PathFollower following its given Path.
    * @param config The duration of the follow, or a PathFollower config object. Default {}.
    * @param startAt Optional start position of the follow, between 0 and 1. Default 0.
    */
  def startFollow(): phaserLib.PhaserNs.GameObjectsNs.PathFollower = js.native
  def startFollow(config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.PathFollowerNs.PathConfig): phaserLib.PhaserNs.GameObjectsNs.PathFollower = js.native
  def startFollow(config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.PathFollowerNs.PathConfig, startAt: scala.Double): phaserLib.PhaserNs.GameObjectsNs.PathFollower = js.native
  def startFollow(config: phaserLib.PhaserNs.TypesNs.TweensNs.NumberTweenBuilderConfig): phaserLib.PhaserNs.GameObjectsNs.PathFollower = js.native
  def startFollow(config: phaserLib.PhaserNs.TypesNs.TweensNs.NumberTweenBuilderConfig, startAt: scala.Double): phaserLib.PhaserNs.GameObjectsNs.PathFollower = js.native
  def startFollow(config: scala.Double): phaserLib.PhaserNs.GameObjectsNs.PathFollower = js.native
  def startFollow(config: scala.Double, startAt: scala.Double): phaserLib.PhaserNs.GameObjectsNs.PathFollower = js.native
  /**
    * Stops this PathFollower from following the path any longer.
    * 
    * This will invoke any 'stop' conditions that may exist on the Path, or for the follower.
    */
  def stopFollow(): phaserLib.PhaserNs.GameObjectsNs.PathFollower = js.native
}

