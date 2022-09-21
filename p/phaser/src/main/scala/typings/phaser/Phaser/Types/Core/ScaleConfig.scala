package typings.phaser.Phaser.Types.Core

import typings.phaser.Phaser.Scale.CenterType
import typings.phaser.Phaser.Scale.ScaleModeType
import typings.phaser.Phaser.Scale.ZoomType
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
  var height: js.UndefOr[Double | String] = js.undefined
  
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
  var resizeInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * The base width of your game. Can be an integer or a string: '100%'. If a string it will only work if you have set a parent element that has a size.
    */
  var width: js.UndefOr[Double | String] = js.undefined
  
  /**
    * The zoom value of the game canvas.
    */
  var zoom: js.UndefOr[ZoomType | Double] = js.undefined
}
object ScaleConfig {
  
  inline def apply(): ScaleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScaleConfig]
  }
  
  extension [Self <: ScaleConfig](x: Self) {
    
    inline def setAutoCenter(value: CenterType): Self = StObject.set(x, "autoCenter", value.asInstanceOf[js.Any])
    
    inline def setAutoCenterUndefined: Self = StObject.set(x, "autoCenter", js.undefined)
    
    inline def setAutoRound(value: Boolean): Self = StObject.set(x, "autoRound", value.asInstanceOf[js.Any])
    
    inline def setAutoRoundUndefined: Self = StObject.set(x, "autoRound", js.undefined)
    
    inline def setExpandParent(value: Boolean): Self = StObject.set(x, "expandParent", value.asInstanceOf[js.Any])
    
    inline def setExpandParentUndefined: Self = StObject.set(x, "expandParent", js.undefined)
    
    inline def setFullscreenTarget(value: HTMLElement | String): Self = StObject.set(x, "fullscreenTarget", value.asInstanceOf[js.Any])
    
    inline def setFullscreenTargetUndefined: Self = StObject.set(x, "fullscreenTarget", js.undefined)
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setMax(value: WidthHeight): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: WidthHeight): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setMode(value: ScaleModeType): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setParent(value: HTMLElement | String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setResizeInterval(value: Double): Self = StObject.set(x, "resizeInterval", value.asInstanceOf[js.Any])
    
    inline def setResizeIntervalUndefined: Self = StObject.set(x, "resizeInterval", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setZoom(value: ZoomType | Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
