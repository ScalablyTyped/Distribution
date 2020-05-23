package typings.phaser.Phaser.Types.Cameras.Controls

import typings.phaser.Phaser.Cameras.Scene2D.Camera
import typings.phaser.Phaser.Input.Keyboard.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmoothedKeyControlConfig extends js.Object {
  /**
    * The horizontal and vertical acceleration the camera will move.
    */
  var acceleration: js.UndefOr[Double | js.Object] = js.undefined
  /**
    * The Camera that this Control will update.
    */
  var camera: js.UndefOr[Camera] = js.undefined
  /**
    * The Key to be pressed that will move the Camera down.
    */
  var down: js.UndefOr[Key] = js.undefined
  /**
    * The horizontal and vertical drag applied to the camera when it is moving.
    */
  var drag: js.UndefOr[Double | js.Object] = js.undefined
  /**
    * The Key to be pressed that will move the Camera left.
    */
  var left: js.UndefOr[Key] = js.undefined
  /**
    * The maximum horizontal and vertical speed the camera will move.
    */
  var maxSpeed: js.UndefOr[Double | js.Object] = js.undefined
  /**
    * The Key to be pressed that will move the Camera right.
    */
  var right: js.UndefOr[Key] = js.undefined
  /**
    * The Key to be pressed that will move the Camera up.
    */
  var up: js.UndefOr[Key] = js.undefined
  /**
    * The Key to be pressed that will zoom the Camera in.
    */
  var zoomIn: js.UndefOr[Key] = js.undefined
  /**
    * The Key to be pressed that will zoom the Camera out.
    */
  var zoomOut: js.UndefOr[Key] = js.undefined
  /**
    * The speed at which the camera will zoom if the `zoomIn` or `zoomOut` keys are pressed.
    */
  var zoomSpeed: js.UndefOr[Double] = js.undefined
}

object SmoothedKeyControlConfig {
  @scala.inline
  def apply(
    acceleration: Double | js.Object = null,
    camera: Camera = null,
    down: Key = null,
    drag: Double | js.Object = null,
    left: Key = null,
    maxSpeed: Double | js.Object = null,
    right: Key = null,
    up: Key = null,
    zoomIn: Key = null,
    zoomOut: Key = null,
    zoomSpeed: js.UndefOr[Double] = js.undefined
  ): SmoothedKeyControlConfig = {
    val __obj = js.Dynamic.literal()
    if (acceleration != null) __obj.updateDynamic("acceleration")(acceleration.asInstanceOf[js.Any])
    if (camera != null) __obj.updateDynamic("camera")(camera.asInstanceOf[js.Any])
    if (down != null) __obj.updateDynamic("down")(down.asInstanceOf[js.Any])
    if (drag != null) __obj.updateDynamic("drag")(drag.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (maxSpeed != null) __obj.updateDynamic("maxSpeed")(maxSpeed.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (up != null) __obj.updateDynamic("up")(up.asInstanceOf[js.Any])
    if (zoomIn != null) __obj.updateDynamic("zoomIn")(zoomIn.asInstanceOf[js.Any])
    if (zoomOut != null) __obj.updateDynamic("zoomOut")(zoomOut.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomSpeed)) __obj.updateDynamic("zoomSpeed")(zoomSpeed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmoothedKeyControlConfig]
  }
}

