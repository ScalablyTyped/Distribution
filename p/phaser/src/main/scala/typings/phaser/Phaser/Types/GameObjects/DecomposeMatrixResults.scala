package typings.phaser.Phaser.Types.GameObjects

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecomposeMatrixResults extends StObject {
  
  /**
    * The rotation value.
    */
  var rotation: Double
  
  /**
    * The scale x value.
    */
  var scaleX: Double
  
  /**
    * The scale y value.
    */
  var scaleY: Double
  
  /**
    * The translated x value.
    */
  var translateX: Double
  
  /**
    * The translated y value.
    */
  var translateY: Double
}
object DecomposeMatrixResults {
  
  inline def apply(rotation: Double, scaleX: Double, scaleY: Double, translateX: Double, translateY: Double): DecomposeMatrixResults = {
    val __obj = js.Dynamic.literal(rotation = rotation.asInstanceOf[js.Any], scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any], translateX = translateX.asInstanceOf[js.Any], translateY = translateY.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecomposeMatrixResults]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DecomposeMatrixResults] (val x: Self) extends AnyVal {
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    inline def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
    
    inline def setTranslateX(value: Double): Self = StObject.set(x, "translateX", value.asInstanceOf[js.Any])
    
    inline def setTranslateY(value: Double): Self = StObject.set(x, "translateY", value.asInstanceOf[js.Any])
  }
}
