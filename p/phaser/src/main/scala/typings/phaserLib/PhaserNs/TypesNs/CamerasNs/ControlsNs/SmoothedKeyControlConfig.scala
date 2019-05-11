package typings
package phaserLib.PhaserNs.TypesNs.CamerasNs.ControlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmoothedKeyControlConfig extends js.Object {
  /**
    * The horizontal and vertical acceleration the camera will move.
    */
  var acceleration: js.UndefOr[scala.Double | js.Object] = js.undefined
  /**
    * The Camera that this Control will update.
    */
  var camera: js.UndefOr[phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera] = js.undefined
  /**
    * The horizontal and vertical drag applied to the camera when it is moving.
    */
  var drag: js.UndefOr[scala.Double | js.Object] = js.undefined
  /**
    * The Key to be pressed that will move the Camera left.
    */
  var left: js.UndefOr[phaserLib.PhaserNs.InputNs.KeyboardNs.Key] = js.undefined
  /**
    * The maximum horizontal and vertical speed the camera will move.
    */
  var maxSpeed: js.UndefOr[scala.Double | js.Object] = js.undefined
  /**
    * The Key to be pressed that will move the Camera right.
    */
  var right: js.UndefOr[phaserLib.PhaserNs.InputNs.KeyboardNs.Key] = js.undefined
  /**
    * The Key to be pressed that will move the Camera up.
    */
  var up: js.UndefOr[phaserLib.PhaserNs.InputNs.KeyboardNs.Key] = js.undefined
  /**
    * The Key to be pressed that will zoom the Camera in.
    */
  var zoomIn: js.UndefOr[phaserLib.PhaserNs.InputNs.KeyboardNs.Key] = js.undefined
  /**
    * The Key to be pressed that will zoom the Camera out.
    */
  var zoomOut: js.UndefOr[phaserLib.PhaserNs.InputNs.KeyboardNs.Key] = js.undefined
  /**
    * The speed at which the camera will zoom if the `zoomIn` or `zoomOut` keys are pressed.
    */
  var zoomSpeed: js.UndefOr[scala.Double] = js.undefined
}

object SmoothedKeyControlConfig {
  @scala.inline
  def apply(
    acceleration: scala.Double | js.Object = null,
    camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera = null,
    drag: scala.Double | js.Object = null,
    left: phaserLib.PhaserNs.InputNs.KeyboardNs.Key = null,
    maxSpeed: scala.Double | js.Object = null,
    right: phaserLib.PhaserNs.InputNs.KeyboardNs.Key = null,
    up: phaserLib.PhaserNs.InputNs.KeyboardNs.Key = null,
    zoomIn: phaserLib.PhaserNs.InputNs.KeyboardNs.Key = null,
    zoomOut: phaserLib.PhaserNs.InputNs.KeyboardNs.Key = null,
    zoomSpeed: scala.Int | scala.Double = null
  ): SmoothedKeyControlConfig = {
    val __obj = js.Dynamic.literal()
    if (acceleration != null) __obj.updateDynamic("acceleration")(acceleration.asInstanceOf[js.Any])
    if (camera != null) __obj.updateDynamic("camera")(camera)
    if (drag != null) __obj.updateDynamic("drag")(drag.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left)
    if (maxSpeed != null) __obj.updateDynamic("maxSpeed")(maxSpeed.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right)
    if (up != null) __obj.updateDynamic("up")(up)
    if (zoomIn != null) __obj.updateDynamic("zoomIn")(zoomIn)
    if (zoomOut != null) __obj.updateDynamic("zoomOut")(zoomOut)
    if (zoomSpeed != null) __obj.updateDynamic("zoomSpeed")(zoomSpeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmoothedKeyControlConfig]
  }
}

