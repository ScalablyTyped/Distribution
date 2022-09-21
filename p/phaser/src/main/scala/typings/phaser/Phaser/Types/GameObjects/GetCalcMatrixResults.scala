package typings.phaser.Phaser.Types.GameObjects

import typings.phaser.Phaser.GameObjects.Components.TransformMatrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCalcMatrixResults extends StObject {
  
  /**
    * The calculated results matrix, factoring all others in.
    */
  var calc: TransformMatrix
  
  /**
    * The calculated Camera matrix.
    */
  var camera: TransformMatrix
  
  /**
    * The calculated Sprite (Game Object) matrix.
    */
  var sprite: TransformMatrix
}
object GetCalcMatrixResults {
  
  inline def apply(calc: TransformMatrix, camera: TransformMatrix, sprite: TransformMatrix): GetCalcMatrixResults = {
    val __obj = js.Dynamic.literal(calc = calc.asInstanceOf[js.Any], camera = camera.asInstanceOf[js.Any], sprite = sprite.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCalcMatrixResults]
  }
  
  extension [Self <: GetCalcMatrixResults](x: Self) {
    
    inline def setCalc(value: TransformMatrix): Self = StObject.set(x, "calc", value.asInstanceOf[js.Any])
    
    inline def setCamera(value: TransformMatrix): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    inline def setSprite(value: TransformMatrix): Self = StObject.set(x, "sprite", value.asInstanceOf[js.Any])
  }
}
