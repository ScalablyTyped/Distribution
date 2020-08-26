package typings.phaser.Phaser.Types.GameObjects.PathFollower

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Settings for a PathFollower.
  */
@js.native
trait PathConfig extends js.Object {
  /**
    * The duration of the path follow in ms. Must be `> 0`.
    */
  var duration: js.UndefOr[Double] = js.native
  /**
    * The start position of the path follow, between 0 and 1. Must be less than `to`.
    */
  var from: js.UndefOr[Double] = js.native
  /**
    * Whether to position the PathFollower on the Path using its path offset.
    */
  var positionOnPath: js.UndefOr[Boolean] = js.native
  /**
    * Should the PathFollower automatically rotate to point in the direction of the Path?
    */
  var rotateToPath: js.UndefOr[Boolean] = js.native
  /**
    * If the PathFollower is rotating to match the Path, this value is added to the rotation value. This allows you to rotate objects to a path but control the angle of the rotation as well.
    */
  var rotationOffset: js.UndefOr[Double] = js.native
  /**
    * Current start position of the path follow, must be between `from` and `to`.
    */
  var startAt: js.UndefOr[Double] = js.native
  /**
    * The end position of the path follow, between 0 and 1. Must be more than `from`.
    */
  var to: js.UndefOr[Double] = js.native
}

object PathConfig {
  @scala.inline
  def apply(): PathConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathConfig]
  }
  @scala.inline
  implicit class PathConfigOps[Self <: PathConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setFrom(value: Double): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setPositionOnPath(value: Boolean): Self = this.set("positionOnPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositionOnPath: Self = this.set("positionOnPath", js.undefined)
    @scala.inline
    def setRotateToPath(value: Boolean): Self = this.set("rotateToPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotateToPath: Self = this.set("rotateToPath", js.undefined)
    @scala.inline
    def setRotationOffset(value: Double): Self = this.set("rotationOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotationOffset: Self = this.set("rotationOffset", js.undefined)
    @scala.inline
    def setStartAt(value: Double): Self = this.set("startAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartAt: Self = this.set("startAt", js.undefined)
    @scala.inline
    def setTo(value: Double): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
  
}

