package typings.phaser.PhaserNs.TypesNs.CoreNs

import typings.phaser.PhaserNs.ScaleNs.CenterType
import typings.phaser.PhaserNs.ScaleNs.ScaleModeType
import typings.phaser.PhaserNs.ScaleNs.ZoomType
import typings.phaser.integer
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaleConfig extends js.Object {
  /**
    * Automatically center the canvas within the parent?
    */
  var autoCenter: js.UndefOr[CenterType] = js.undefined
  /**
    * Automatically round the display and style sizes of the canvas. This can help with performance in lower-powered devices.
    */
  var autoRound: js.UndefOr[Boolean] = js.undefined
  /**
    * Is the Scale Manager allowed to adjust the CSS height property of the parent and/or document body to be 100%?
    */
  var expandParent: js.UndefOr[Boolean] = js.undefined
  /**
    * The DOM element that will be sent into full screen mode, or its `id`. If undefined Phaser will create its own div and insert the canvas into it when entering fullscreen mode.
    */
  var fullscreenTarget: js.UndefOr[HTMLElement | String] = js.undefined
  /**
    * The base height of your game. Can be an integer or a string: '100%'. If a string it will only work if you have set a parent element that has a size.
    */
  var height: js.UndefOr[integer | String] = js.undefined
  /**
    * The maximum width the canvas can be scaled up to.
    */
  var max: js.UndefOr[WidthHeight] = js.undefined
  /**
    * The minimum width and height the canvas can be scaled down to.
    */
  var min: js.UndefOr[WidthHeight] = js.undefined
  /**
    * The scale mode.
    */
  var mode: js.UndefOr[ScaleModeType] = js.undefined
  /**
    * The DOM element that will contain the game canvas, or its `id`. If undefined, or if the named element doesn't exist, the game canvas is inserted directly into the document body. If `null` no parent will be used and you are responsible for adding the canvas to your environment.
    */
  var parent: js.UndefOr[HTMLElement | String] = js.undefined
  /**
    * How many ms should elapse before checking if the browser size has changed?
    */
  var resizeInterval: js.UndefOr[integer] = js.undefined
  /**
    * The rendering resolution of the canvas. This is reserved for future use and is currently ignored.
    */
  var resolution: js.UndefOr[Double] = js.undefined
  /**
    * The base width of your game. Can be an integer or a string: '100%'. If a string it will only work if you have set a parent element that has a size.
    */
  var width: js.UndefOr[integer | String] = js.undefined
  /**
    * The zoom value of the game canvas.
    */
  var zoom: js.UndefOr[ZoomType | integer] = js.undefined
}

object ScaleConfig {
  @scala.inline
  def apply(
    autoCenter: CenterType = null,
    autoRound: js.UndefOr[Boolean] = js.undefined,
    expandParent: js.UndefOr[Boolean] = js.undefined,
    fullscreenTarget: HTMLElement | String = null,
    height: integer | String = null,
    max: WidthHeight = null,
    min: WidthHeight = null,
    mode: ScaleModeType = null,
    parent: HTMLElement | String = null,
    resizeInterval: js.UndefOr[integer] = js.undefined,
    resolution: Int | Double = null,
    width: integer | String = null,
    zoom: ZoomType | integer = null
  ): ScaleConfig = {
    val __obj = js.Dynamic.literal()
    if (autoCenter != null) __obj.updateDynamic("autoCenter")(autoCenter)
    if (!js.isUndefined(autoRound)) __obj.updateDynamic("autoRound")(autoRound)
    if (!js.isUndefined(expandParent)) __obj.updateDynamic("expandParent")(expandParent)
    if (fullscreenTarget != null) __obj.updateDynamic("fullscreenTarget")(fullscreenTarget.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max)
    if (min != null) __obj.updateDynamic("min")(min)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (!js.isUndefined(resizeInterval)) __obj.updateDynamic("resizeInterval")(resizeInterval)
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleConfig]
  }
}

