package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonComponentData extends StObject {
  
  var active: Boolean
  
  var enabled: Boolean
  
  var fadeDuration: Double
  
  var hitPadding: Vec4
  
  var hoverSpriteAsset: Any
  
  var hoverSpriteFrame: Double
  
  var hoverTint: Color
  
  var imageEntity: Any
  
  var inactiveSpriteAsset: Any
  
  var inactiveSpriteFrame: Double
  
  var inactiveTint: Color
  
  var pressedSpriteAsset: Any
  
  var pressedSpriteFrame: Double
  
  var pressedTint: Color
  
  var transitionMode: Double
}
object ButtonComponentData {
  
  inline def apply(
    active: Boolean,
    enabled: Boolean,
    fadeDuration: Double,
    hitPadding: Vec4,
    hoverSpriteAsset: Any,
    hoverSpriteFrame: Double,
    hoverTint: Color,
    imageEntity: Any,
    inactiveSpriteAsset: Any,
    inactiveSpriteFrame: Double,
    inactiveTint: Color,
    pressedSpriteAsset: Any,
    pressedSpriteFrame: Double,
    pressedTint: Color,
    transitionMode: Double
  ): ButtonComponentData = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], fadeDuration = fadeDuration.asInstanceOf[js.Any], hitPadding = hitPadding.asInstanceOf[js.Any], hoverSpriteAsset = hoverSpriteAsset.asInstanceOf[js.Any], hoverSpriteFrame = hoverSpriteFrame.asInstanceOf[js.Any], hoverTint = hoverTint.asInstanceOf[js.Any], imageEntity = imageEntity.asInstanceOf[js.Any], inactiveSpriteAsset = inactiveSpriteAsset.asInstanceOf[js.Any], inactiveSpriteFrame = inactiveSpriteFrame.asInstanceOf[js.Any], inactiveTint = inactiveTint.asInstanceOf[js.Any], pressedSpriteAsset = pressedSpriteAsset.asInstanceOf[js.Any], pressedSpriteFrame = pressedSpriteFrame.asInstanceOf[js.Any], pressedTint = pressedTint.asInstanceOf[js.Any], transitionMode = transitionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonComponentData]
  }
  
  extension [Self <: ButtonComponentData](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setFadeDuration(value: Double): Self = StObject.set(x, "fadeDuration", value.asInstanceOf[js.Any])
    
    inline def setHitPadding(value: Vec4): Self = StObject.set(x, "hitPadding", value.asInstanceOf[js.Any])
    
    inline def setHoverSpriteAsset(value: Any): Self = StObject.set(x, "hoverSpriteAsset", value.asInstanceOf[js.Any])
    
    inline def setHoverSpriteFrame(value: Double): Self = StObject.set(x, "hoverSpriteFrame", value.asInstanceOf[js.Any])
    
    inline def setHoverTint(value: Color): Self = StObject.set(x, "hoverTint", value.asInstanceOf[js.Any])
    
    inline def setImageEntity(value: Any): Self = StObject.set(x, "imageEntity", value.asInstanceOf[js.Any])
    
    inline def setInactiveSpriteAsset(value: Any): Self = StObject.set(x, "inactiveSpriteAsset", value.asInstanceOf[js.Any])
    
    inline def setInactiveSpriteFrame(value: Double): Self = StObject.set(x, "inactiveSpriteFrame", value.asInstanceOf[js.Any])
    
    inline def setInactiveTint(value: Color): Self = StObject.set(x, "inactiveTint", value.asInstanceOf[js.Any])
    
    inline def setPressedSpriteAsset(value: Any): Self = StObject.set(x, "pressedSpriteAsset", value.asInstanceOf[js.Any])
    
    inline def setPressedSpriteFrame(value: Double): Self = StObject.set(x, "pressedSpriteFrame", value.asInstanceOf[js.Any])
    
    inline def setPressedTint(value: Color): Self = StObject.set(x, "pressedTint", value.asInstanceOf[js.Any])
    
    inline def setTransitionMode(value: Double): Self = StObject.set(x, "transitionMode", value.asInstanceOf[js.Any])
  }
}
