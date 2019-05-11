package typings
package phaserLib.PhaserNs.TypesNs.CamerasNs.ControlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FixedKeyControlConfig extends js.Object {
  /**
    * The Camera that this Control will update.
    */
  var camera: js.UndefOr[phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera] = js.undefined
  /**
    * The Key to be pressed that will move the Camera down.
    */
  var down: js.UndefOr[phaserLib.PhaserNs.InputNs.KeyboardNs.Key] = js.undefined
  /**
    * The Key to be pressed that will move the Camera left.
    */
  var left: js.UndefOr[phaserLib.PhaserNs.InputNs.KeyboardNs.Key] = js.undefined
  /**
    * The Key to be pressed that will move the Camera right.
    */
  var right: js.UndefOr[phaserLib.PhaserNs.InputNs.KeyboardNs.Key] = js.undefined
  /**
    * The horizontal and vertical speed the camera will move.
    */
  var speed: js.UndefOr[scala.Double | js.Object] = js.undefined
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

object FixedKeyControlConfig {
  @scala.inline
  def apply(
    camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera = null,
    down: phaserLib.PhaserNs.InputNs.KeyboardNs.Key = null,
    left: phaserLib.PhaserNs.InputNs.KeyboardNs.Key = null,
    right: phaserLib.PhaserNs.InputNs.KeyboardNs.Key = null,
    speed: scala.Double | js.Object = null,
    up: phaserLib.PhaserNs.InputNs.KeyboardNs.Key = null,
    zoomIn: phaserLib.PhaserNs.InputNs.KeyboardNs.Key = null,
    zoomOut: phaserLib.PhaserNs.InputNs.KeyboardNs.Key = null,
    zoomSpeed: scala.Int | scala.Double = null
  ): FixedKeyControlConfig = {
    val __obj = js.Dynamic.literal()
    if (camera != null) __obj.updateDynamic("camera")(camera)
    if (down != null) __obj.updateDynamic("down")(down)
    if (left != null) __obj.updateDynamic("left")(left)
    if (right != null) __obj.updateDynamic("right")(right)
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (up != null) __obj.updateDynamic("up")(up)
    if (zoomIn != null) __obj.updateDynamic("zoomIn")(zoomIn)
    if (zoomOut != null) __obj.updateDynamic("zoomOut")(zoomOut)
    if (zoomSpeed != null) __obj.updateDynamic("zoomSpeed")(zoomSpeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[FixedKeyControlConfig]
  }
}

