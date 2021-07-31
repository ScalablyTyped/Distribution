package typings.phaser.Phaser.Types.Core

import typings.phaser.Phaser.Scale.CenterType
import typings.phaser.Phaser.Scale.ScaleModeType
import typings.phaser.Phaser.Scale.ZoomType
import typings.phaser.integer
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleConfig extends StObject {
  
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
  def apply(): ScaleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScaleConfig]
  }
  
  @scala.inline
  implicit class ScaleConfigMutableBuilder[Self <: ScaleConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoCenter(value: CenterType): Self = StObject.set(x, "autoCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCenterUndefined: Self = StObject.set(x, "autoCenter", js.undefined)
    
    @scala.inline
    def setAutoRound(value: Boolean): Self = StObject.set(x, "autoRound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoRoundUndefined: Self = StObject.set(x, "autoRound", js.undefined)
    
    @scala.inline
    def setExpandParent(value: Boolean): Self = StObject.set(x, "expandParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandParentUndefined: Self = StObject.set(x, "expandParent", js.undefined)
    
    @scala.inline
    def setFullscreenTarget(value: HTMLElement | String): Self = StObject.set(x, "fullscreenTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullscreenTargetUndefined: Self = StObject.set(x, "fullscreenTarget", js.undefined)
    
    @scala.inline
    def setHeight(value: integer | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setMax(value: WidthHeight): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: WidthHeight): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setMode(value: ScaleModeType): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setParent(value: HTMLElement | String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setResizeInterval(value: integer): Self = StObject.set(x, "resizeInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeIntervalUndefined: Self = StObject.set(x, "resizeInterval", js.undefined)
    
    @scala.inline
    def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    @scala.inline
    def setWidth(value: integer | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setZoom(value: ZoomType | integer): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
