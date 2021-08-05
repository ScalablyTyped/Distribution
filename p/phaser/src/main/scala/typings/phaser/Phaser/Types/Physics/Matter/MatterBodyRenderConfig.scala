package typings.phaser.Phaser.Types.Physics.Matter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatterBodyRenderConfig extends StObject {
  
  /**
    * The color value of the fill when rendering this body.
    */
  var fillColor: js.UndefOr[Double] = js.undefined
  
  /**
    * The opacity of the fill when rendering this body, a value between 0 and 1.
    */
  var fillOpacity: js.UndefOr[Double] = js.undefined
  
  /**
    * The color value of the line stroke when rendering this body.
    */
  var lineColor: js.UndefOr[Double] = js.undefined
  
  /**
    * The opacity of the line when rendering this body, a value between 0 and 1.
    */
  var lineOpacity: js.UndefOr[Double] = js.undefined
  
  /**
    * If rendering lines, the thickness of the line.
    */
  var lineThickness: js.UndefOr[Double] = js.undefined
  
  /**
    * The opacity of the body and all parts within it.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
    * Controls the offset between the body and the parent Game Object, if it has one.
    */
  var sprite: js.UndefOr[js.Object] = js.undefined
  
  /**
    * The horizontal offset between the body and the parent Game Object texture, if it has one.
    */
  @JSName("sprite.xOffset")
  var spriteDotxOffset: js.UndefOr[Double] = js.undefined
  
  /**
    * The vertical offset between the body and the parent Game Object texture, if it has one.
    */
  @JSName("sprite.yOffset")
  var spriteDotyOffset: js.UndefOr[Double] = js.undefined
  
  /**
    * Should this body be rendered by the Debug Renderer?
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object MatterBodyRenderConfig {
  
  inline def apply(): MatterBodyRenderConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatterBodyRenderConfig]
  }
  
  extension [Self <: MatterBodyRenderConfig](x: Self) {
    
    inline def setFillColor(value: Double): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    inline def setLineColor(value: Double): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
    
    inline def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
    
    inline def setLineOpacity(value: Double): Self = StObject.set(x, "lineOpacity", value.asInstanceOf[js.Any])
    
    inline def setLineOpacityUndefined: Self = StObject.set(x, "lineOpacity", js.undefined)
    
    inline def setLineThickness(value: Double): Self = StObject.set(x, "lineThickness", value.asInstanceOf[js.Any])
    
    inline def setLineThicknessUndefined: Self = StObject.set(x, "lineThickness", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setSprite(value: js.Object): Self = StObject.set(x, "sprite", value.asInstanceOf[js.Any])
    
    inline def setSpriteDotxOffset(value: Double): Self = StObject.set(x, "sprite.xOffset", value.asInstanceOf[js.Any])
    
    inline def setSpriteDotxOffsetUndefined: Self = StObject.set(x, "sprite.xOffset", js.undefined)
    
    inline def setSpriteDotyOffset(value: Double): Self = StObject.set(x, "sprite.yOffset", value.asInstanceOf[js.Any])
    
    inline def setSpriteDotyOffsetUndefined: Self = StObject.set(x, "sprite.yOffset", js.undefined)
    
    inline def setSpriteUndefined: Self = StObject.set(x, "sprite", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
