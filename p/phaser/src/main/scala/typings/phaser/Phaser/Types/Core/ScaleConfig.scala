package typings.phaser.Phaser.Types.Core

import typings.phaser.Phaser.Scale.CenterType
import typings.phaser.Phaser.Scale.ScaleModeType
import typings.phaser.Phaser.Scale.ZoomType
import typings.phaser.integer
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScaleConfig extends js.Object {
  /**
    * Automatically center the canvas within the parent?
    */
  var autoCenter: js.UndefOr[CenterType] = js.native
  /**
    * Automatically round the display and style sizes of the canvas. This can help with performance in lower-powered devices.
    */
  var autoRound: js.UndefOr[Boolean] = js.native
  /**
    * Is the Scale Manager allowed to adjust the CSS height property of the parent and/or document body to be 100%?
    */
  var expandParent: js.UndefOr[Boolean] = js.native
  /**
    * The DOM element that will be sent into full screen mode, or its `id`. If undefined Phaser will create its own div and insert the canvas into it when entering fullscreen mode.
    */
  var fullscreenTarget: js.UndefOr[HTMLElement | String] = js.native
  /**
    * The base height of your game. Can be an integer or a string: '100%'. If a string it will only work if you have set a parent element that has a size.
    */
  var height: js.UndefOr[integer | String] = js.native
  /**
    * The maximum width the canvas can be scaled up to.
    */
  var max: js.UndefOr[WidthHeight] = js.native
  /**
    * The minimum width and height the canvas can be scaled down to.
    */
  var min: js.UndefOr[WidthHeight] = js.native
  /**
    * The scale mode.
    */
  var mode: js.UndefOr[ScaleModeType] = js.native
  /**
    * The DOM element that will contain the game canvas, or its `id`. If undefined, or if the named element doesn't exist, the game canvas is inserted directly into the document body. If `null` no parent will be used and you are responsible for adding the canvas to your environment.
    */
  var parent: js.UndefOr[HTMLElement | String] = js.native
  /**
    * How many ms should elapse before checking if the browser size has changed?
    */
  var resizeInterval: js.UndefOr[integer] = js.native
  /**
    * The rendering resolution of the canvas. This is reserved for future use and is currently ignored.
    */
  var resolution: js.UndefOr[Double] = js.native
  /**
    * The base width of your game. Can be an integer or a string: '100%'. If a string it will only work if you have set a parent element that has a size.
    */
  var width: js.UndefOr[integer | String] = js.native
  /**
    * The zoom value of the game canvas.
    */
  var zoom: js.UndefOr[ZoomType | integer] = js.native
}

object ScaleConfig {
  @scala.inline
  def apply(): ScaleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScaleConfig]
  }
  @scala.inline
  implicit class ScaleConfigOps[Self <: ScaleConfig] (val x: Self) extends AnyVal {
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
    def setAutoCenter(value: CenterType): Self = this.set("autoCenter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoCenter: Self = this.set("autoCenter", js.undefined)
    @scala.inline
    def setAutoRound(value: Boolean): Self = this.set("autoRound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoRound: Self = this.set("autoRound", js.undefined)
    @scala.inline
    def setExpandParent(value: Boolean): Self = this.set("expandParent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandParent: Self = this.set("expandParent", js.undefined)
    @scala.inline
    def setFullscreenTarget(value: HTMLElement | String): Self = this.set("fullscreenTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullscreenTarget: Self = this.set("fullscreenTarget", js.undefined)
    @scala.inline
    def setHeight(value: integer | String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setMax(value: WidthHeight): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: WidthHeight): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setMode(value: ScaleModeType): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setParent(value: HTMLElement | String): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    @scala.inline
    def setResizeInterval(value: integer): Self = this.set("resizeInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizeInterval: Self = this.set("resizeInterval", js.undefined)
    @scala.inline
    def setResolution(value: Double): Self = this.set("resolution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolution: Self = this.set("resolution", js.undefined)
    @scala.inline
    def setWidth(value: integer | String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setZoom(value: ZoomType | integer): Self = this.set("zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
  
}

