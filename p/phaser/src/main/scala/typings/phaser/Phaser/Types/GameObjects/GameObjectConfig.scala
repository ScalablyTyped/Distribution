package typings.phaser.Phaser.Types.GameObjects

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GameObjectConfig extends StObject {
  
  /**
    * Add the GameObject to the scene.
    */
  var add: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The alpha (opacity) of the Game Object.
    */
  var alpha: js.UndefOr[Double] = js.undefined
  
  /**
    * The rotation angle of the Game Object, in degrees.
    */
  var angle: js.UndefOr[Double] = js.undefined
  
  /**
    * The blend mode of the GameObject.
    */
  var blendMode: js.UndefOr[Double] = js.undefined
  
  /**
    * The depth of the GameObject.
    */
  var depth: js.UndefOr[Double] = js.undefined
  
  /**
    * The horizontally flipped state of the Game Object.
    */
  var flipX: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The vertically flipped state of the Game Object.
    */
  var flipY: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The origin of the Game Object.
    */
  var origin: js.UndefOr[Double | js.Object] = js.undefined
  
  /**
    * The rotation angle of the Game Object, in radians.
    */
  var rotation: js.UndefOr[Double] = js.undefined
  
  /**
    * The scale of the GameObject.
    */
  var scale: js.UndefOr[Double | js.Object] = js.undefined
  
  /**
    * The scale mode of the GameObject.
    */
  var scaleMode: js.UndefOr[Double] = js.undefined
  
  /**
    * The scroll factor of the GameObject.
    */
  var scrollFactor: js.UndefOr[Double | js.Object] = js.undefined
  
  /**
    * The visible state of the Game Object.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The x position of the Game Object.
    */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
    * The y position of the Game Object.
    */
  var y: js.UndefOr[Double] = js.undefined
}
object GameObjectConfig {
  
  inline def apply(): GameObjectConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GameObjectConfig]
  }
  
  extension [Self <: GameObjectConfig](x: Self) {
    
    inline def setAdd(value: Boolean): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    inline def setBlendMode(value: Double): Self = StObject.set(x, "blendMode", value.asInstanceOf[js.Any])
    
    inline def setBlendModeUndefined: Self = StObject.set(x, "blendMode", js.undefined)
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    inline def setFlipX(value: Boolean): Self = StObject.set(x, "flipX", value.asInstanceOf[js.Any])
    
    inline def setFlipXUndefined: Self = StObject.set(x, "flipX", js.undefined)
    
    inline def setFlipY(value: Boolean): Self = StObject.set(x, "flipY", value.asInstanceOf[js.Any])
    
    inline def setFlipYUndefined: Self = StObject.set(x, "flipY", js.undefined)
    
    inline def setOrigin(value: Double | js.Object): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setScale(value: Double | js.Object): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleMode(value: Double): Self = StObject.set(x, "scaleMode", value.asInstanceOf[js.Any])
    
    inline def setScaleModeUndefined: Self = StObject.set(x, "scaleMode", js.undefined)
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setScrollFactor(value: Double | js.Object): Self = StObject.set(x, "scrollFactor", value.asInstanceOf[js.Any])
    
    inline def setScrollFactorUndefined: Self = StObject.set(x, "scrollFactor", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
