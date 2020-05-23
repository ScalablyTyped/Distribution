package typings.phaser.Phaser.Types.Cameras.Scene2D

import typings.phaser.integer
import typings.phaser.phaserBooleans.`false`
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
  @JSName("bounds.height")
  var boundsDotheight: js.UndefOr[Double] = js.undefined
  /**
    * The width of the Camera bounds.
    */
  @JSName("bounds.width")
  var boundsDotwidth: js.UndefOr[Double] = js.undefined
  /**
    * The top-left extent of the Camera bounds.
    */
  @JSName("bounds.x")
  var boundsDotx: js.UndefOr[Double] = js.undefined
  /**
    * The top-left extent of the Camera bounds.
    */
  @JSName("bounds.y")
  var boundsDoty: js.UndefOr[Double] = js.undefined
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
    boundsDotheight: js.UndefOr[Double] = js.undefined,
    boundsDotwidth: js.UndefOr[Double] = js.undefined,
    boundsDotx: js.UndefOr[Double] = js.undefined,
    boundsDoty: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[integer] = js.undefined,
    name: String = null,
    rotation: js.UndefOr[Double] = js.undefined,
    roundPixels: js.UndefOr[Boolean] = js.undefined,
    scrollX: js.UndefOr[Double] = js.undefined,
    scrollY: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[integer] = js.undefined,
    x: js.UndefOr[integer] = js.undefined,
    y: js.UndefOr[integer] = js.undefined,
    zoom: js.UndefOr[Double] = js.undefined
  ): CameraConfig = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (!js.isUndefined(boundsDotheight)) __obj.updateDynamic("bounds.height")(boundsDotheight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(boundsDotwidth)) __obj.updateDynamic("bounds.width")(boundsDotwidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(boundsDotx)) __obj.updateDynamic("bounds.x")(boundsDotx.get.asInstanceOf[js.Any])
    if (!js.isUndefined(boundsDoty)) __obj.updateDynamic("bounds.y")(boundsDoty.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(rotation)) __obj.updateDynamic("rotation")(rotation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(roundPixels)) __obj.updateDynamic("roundPixels")(roundPixels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollX)) __obj.updateDynamic("scrollX")(scrollX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollY)) __obj.updateDynamic("scrollY")(scrollY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zoom)) __obj.updateDynamic("zoom")(zoom.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraConfig]
  }
}

