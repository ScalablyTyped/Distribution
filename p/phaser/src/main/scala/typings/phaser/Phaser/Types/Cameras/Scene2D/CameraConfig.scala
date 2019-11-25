package typings.phaser.Phaser.Types.Cameras.Scene2D

import typings.phaser.integer
import typings.phaser.phaserNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraConfig extends js.Object {
  /**
    * A CSS color string controlling the Camera background color.
    */
  var backgroundColor: js.UndefOr[`false` | String] = js.undefined
  /**
    * Defines the Camera bounds.
    */
  var bounds: js.UndefOr[js.Object] = js.undefined
  /**
    * The height of the Camera bounds.
    */
  var `bounds.height`: js.UndefOr[Double] = js.undefined
  /**
    * The width of the Camera bounds.
    */
  var `bounds.width`: js.UndefOr[Double] = js.undefined
  /**
    * The top-left extent of the Camera bounds.
    */
  var `bounds.x`: js.UndefOr[Double] = js.undefined
  /**
    * The top-left extent of the Camera bounds.
    */
  var `bounds.y`: js.UndefOr[Double] = js.undefined
  /**
    * The height of the Camera viewport.
    */
  var height: js.UndefOr[integer] = js.undefined
  /**
    * The name of the Camera.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The rotation of the Camera, in radians.
    */
  var rotation: js.UndefOr[Double] = js.undefined
  /**
    * Should the Camera round pixels before rendering?
    */
  var roundPixels: js.UndefOr[Boolean] = js.undefined
  /**
    * The horizontal scroll position of the Camera.
    */
  var scrollX: js.UndefOr[Double] = js.undefined
  /**
    * The vertical scroll position of the Camera.
    */
  var scrollY: js.UndefOr[Double] = js.undefined
  /**
    * The width of the Camera viewport.
    */
  var width: js.UndefOr[integer] = js.undefined
  /**
    * The horizontal position of the Camera viewport.
    */
  var x: js.UndefOr[integer] = js.undefined
  /**
    * The vertical position of the Camera viewport.
    */
  var y: js.UndefOr[integer] = js.undefined
  /**
    * The default zoom level of the Camera.
    */
  var zoom: js.UndefOr[Double] = js.undefined
}

object CameraConfig {
  @scala.inline
  def apply(
    backgroundColor: `false` | String = null,
    bounds: js.Object = null,
    `bounds.height`: Int | Double = null,
    `bounds.width`: Int | Double = null,
    `bounds.x`: Int | Double = null,
    `bounds.y`: Int | Double = null,
    height: Int | Double = null,
    name: String = null,
    rotation: Int | Double = null,
    roundPixels: js.UndefOr[Boolean] = js.undefined,
    scrollX: Int | Double = null,
    scrollY: Int | Double = null,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null,
    zoom: Int | Double = null
  ): CameraConfig = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (`bounds.height` != null) __obj.updateDynamic("bounds.height")(`bounds.height`.asInstanceOf[js.Any])
    if (`bounds.width` != null) __obj.updateDynamic("bounds.width")(`bounds.width`.asInstanceOf[js.Any])
    if (`bounds.x` != null) __obj.updateDynamic("bounds.x")(`bounds.x`.asInstanceOf[js.Any])
    if (`bounds.y` != null) __obj.updateDynamic("bounds.y")(`bounds.y`.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (!js.isUndefined(roundPixels)) __obj.updateDynamic("roundPixels")(roundPixels.asInstanceOf[js.Any])
    if (scrollX != null) __obj.updateDynamic("scrollX")(scrollX.asInstanceOf[js.Any])
    if (scrollY != null) __obj.updateDynamic("scrollY")(scrollY.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraConfig]
  }
}

