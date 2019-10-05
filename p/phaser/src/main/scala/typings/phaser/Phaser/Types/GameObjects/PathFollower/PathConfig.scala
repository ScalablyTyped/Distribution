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
    duration: Int | Double = null,
    from: Int | Double = null,
    positionOnPath: js.UndefOr[Boolean] = js.undefined,
    rotateToPath: js.UndefOr[Boolean] = js.undefined,
    rotationOffset: Int | Double = null,
    startAt: Int | Double = null,
    to: Int | Double = null
  ): PathConfig = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (!js.isUndefined(positionOnPath)) __obj.updateDynamic("positionOnPath")(positionOnPath)
    if (!js.isUndefined(rotateToPath)) __obj.updateDynamic("rotateToPath")(rotateToPath)
    if (rotationOffset != null) __obj.updateDynamic("rotationOffset")(rotationOffset.asInstanceOf[js.Any])
    if (startAt != null) __obj.updateDynamic("startAt")(startAt.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathConfig]
  }
}

