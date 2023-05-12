package typings.phaser.Phaser.Types.GameObjects.Particles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines an operation yielding a value incremented continuously across an interpolated data set.
  */
trait EmitterOpInterpolationConfig
  extends StObject
     with _EmitterOpOnUpdateType {
  
  /**
    * An optional ease function to use. This can be either a string from the EaseMap, or a custom function.
    */
  var ease: js.UndefOr[String | js.Function] = js.undefined
  
  /**
    * An optional array of ease parameters to go with the ease.
    */
  var easeParams: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * The interpolation function to use. Typically one of `linear`, `bezier` or `catmull` or a custom function.
    */
  var interpolation: js.UndefOr[String | js.Function] = js.undefined
  
  /**
    * The array of number values to interpolate through.
    */
  var values: js.Array[Double]
}
object EmitterOpInterpolationConfig {
  
  inline def apply(values: js.Array[Double]): EmitterOpInterpolationConfig = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitterOpInterpolationConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmitterOpInterpolationConfig] (val x: Self) extends AnyVal {
    
    inline def setEase(value: String | js.Function): Self = StObject.set(x, "ease", value.asInstanceOf[js.Any])
    
    inline def setEaseParams(value: js.Array[Double]): Self = StObject.set(x, "easeParams", value.asInstanceOf[js.Any])
    
    inline def setEaseParamsUndefined: Self = StObject.set(x, "easeParams", js.undefined)
    
    inline def setEaseParamsVarargs(value: Double*): Self = StObject.set(x, "easeParams", js.Array(value*))
    
    inline def setEaseUndefined: Self = StObject.set(x, "ease", js.undefined)
    
    inline def setInterpolation(value: String | js.Function): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
    
    inline def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
    
    inline def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
