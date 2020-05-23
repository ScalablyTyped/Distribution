package typings.phaser.Phaser.Types.GameObjects.PathFollower

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Settings for a PathFollower.
  */
trait PathConfig extends js.Object {
  /**
    * The duration of the path follow in ms. Must be `> 0`.
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * The start position of the path follow, between 0 and 1. Must be less than `to`.
    */
  var from: js.UndefOr[Double] = js.undefined
  /**
    * Whether to position the PathFollower on the Path using its path offset.
    */
  var positionOnPath: js.UndefOr[Boolean] = js.undefined
  /**
    * Should the PathFollower automatically rotate to point in the direction of the Path?
    */
  var rotateToPath: js.UndefOr[Boolean] = js.undefined
  /**
    * If the PathFollower is rotating to match the Path, this value is added to the rotation value. This allows you to rotate objects to a path but control the angle of the rotation as well.
    */
  var rotationOffset: js.UndefOr[Double] = js.undefined
  /**
    * Current start position of the path follow, must be between `from` and `to`.
    */
  var startAt: js.UndefOr[Double] = js.undefined
  /**
    * The end position of the path follow, between 0 and 1. Must be more than `from`.
    */
  var to: js.UndefOr[Double] = js.undefined
}

object PathConfig {
  @scala.inline
  def apply(
    duration: js.UndefOr[Double] = js.undefined,
    from: js.UndefOr[Double] = js.undefined,
    positionOnPath: js.UndefOr[Boolean] = js.undefined,
    rotateToPath: js.UndefOr[Boolean] = js.undefined,
    rotationOffset: js.UndefOr[Double] = js.undefined,
    startAt: js.UndefOr[Double] = js.undefined,
    to: js.UndefOr[Double] = js.undefined
  ): PathConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(from)) __obj.updateDynamic("from")(from.get.asInstanceOf[js.Any])
    if (!js.isUndefined(positionOnPath)) __obj.updateDynamic("positionOnPath")(positionOnPath.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rotateToPath)) __obj.updateDynamic("rotateToPath")(rotateToPath.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rotationOffset)) __obj.updateDynamic("rotationOffset")(rotationOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startAt)) __obj.updateDynamic("startAt")(startAt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(to)) __obj.updateDynamic("to")(to.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathConfig]
  }
}

