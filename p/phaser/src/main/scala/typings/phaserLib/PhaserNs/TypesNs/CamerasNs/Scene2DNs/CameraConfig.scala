package typings
package phaserLib.PhaserNs.TypesNs.CamerasNs.Scene2DNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraConfig extends js.Object {
  /**
    * A CSS color string controlling the Camera background color.
    */
  var backgroundColor: js.UndefOr[phaserLib.phaserLibNumbers.`false` | java.lang.String] = js.undefined
  /**
    * Defines the Camera bounds.
    */
  var bounds: js.UndefOr[js.Object] = js.undefined
  /**
    * The height of the Camera bounds.
    */
  var `bounds.height`: js.UndefOr[scala.Double] = js.undefined
  /**
    * The width of the Camera bounds.
    */
  var `bounds.width`: js.UndefOr[scala.Double] = js.undefined
  /**
    * The top-left extent of the Camera bounds.
    */
  var `bounds.x`: js.UndefOr[scala.Double] = js.undefined
  /**
    * The top-left extent of the Camera bounds.
    */
  var `bounds.y`: js.UndefOr[scala.Double] = js.undefined
  /**
    * The height of the Camera viewport.
    */
  var height: js.UndefOr[phaserLib.integer] = js.undefined
  /**
    * The name of the Camera.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The rotation of the Camera, in radians.
    */
  var rotation: js.UndefOr[scala.Double] = js.undefined
  /**
    * Should the Camera round pixels before rendering?
    */
  var roundPixels: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The horizontal scroll position of the Camera.
    */
  var scrollX: js.UndefOr[scala.Double] = js.undefined
  /**
    * The vertical scroll position of the Camera.
    */
  var scrollY: js.UndefOr[scala.Double] = js.undefined
  /**
    * The width of the Camera viewport.
    */
  var width: js.UndefOr[phaserLib.integer] = js.undefined
  /**
    * The horizontal position of the Camera viewport.
    */
  var x: js.UndefOr[phaserLib.integer] = js.undefined
  /**
    * The vertical position of the Camera viewport.
    */
  var y: js.UndefOr[phaserLib.integer] = js.undefined
  /**
    * The default zoom level of the Camera.
    */
  var zoom: js.UndefOr[scala.Double] = js.undefined
}

object CameraConfig {
  @scala.inline
  def apply(
    backgroundColor: phaserLib.phaserLibNumbers.`false` | java.lang.String = null,
    bounds: js.Object = null,
    `bounds.height`: scala.Int | scala.Double = null,
    `bounds.width`: scala.Int | scala.Double = null,
    `bounds.x`: scala.Int | scala.Double = null,
    `bounds.y`: scala.Int | scala.Double = null,
    height: js.UndefOr[phaserLib.integer] = js.undefined,
    name: java.lang.String = null,
    rotation: scala.Int | scala.Double = null,
    roundPixels: js.UndefOr[scala.Boolean] = js.undefined,
    scrollX: scala.Int | scala.Double = null,
    scrollY: scala.Int | scala.Double = null,
    width: js.UndefOr[phaserLib.integer] = js.undefined,
    x: js.UndefOr[phaserLib.integer] = js.undefined,
    y: js.UndefOr[phaserLib.integer] = js.undefined,
    zoom: scala.Int | scala.Double = null
  ): CameraConfig = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds)
    if (`bounds.height` != null) __obj.updateDynamic("bounds.height")(`bounds.height`.asInstanceOf[js.Any])
    if (`bounds.width` != null) __obj.updateDynamic("bounds.width")(`bounds.width`.asInstanceOf[js.Any])
    if (`bounds.x` != null) __obj.updateDynamic("bounds.x")(`bounds.x`.asInstanceOf[js.Any])
    if (`bounds.y` != null) __obj.updateDynamic("bounds.y")(`bounds.y`.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height)
    if (name != null) __obj.updateDynamic("name")(name)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (!js.isUndefined(roundPixels)) __obj.updateDynamic("roundPixels")(roundPixels)
    if (scrollX != null) __obj.updateDynamic("scrollX")(scrollX.asInstanceOf[js.Any])
    if (scrollY != null) __obj.updateDynamic("scrollY")(scrollY.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width)
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x)
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y)
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraConfig]
  }
}

