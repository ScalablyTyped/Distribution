package typings.phaser.Phaser.Types.GameObjects.Particles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines an operation yielding a value incremented continuously across a range.
  */
trait EmitterOpEaseConfig
  extends StObject
     with _EmitterOpOnUpdateType {
  
  /**
    * The ease to find. This can be either a string from the EaseMap, or a custom function.
    */
  var ease: js.UndefOr[String | js.Function] = js.undefined
  
  /**
    * An optional array of ease parameters to go with the ease.
    */
  var easeParams: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * The ending value.
    */
  var end: Double
  
  /**
    * The starting value.
    */
  var start: Double
}
object EmitterOpEaseConfig {
  
  inline def apply(end: Double, start: Double): EmitterOpEaseConfig = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitterOpEaseConfig]
  }
  
  extension [Self <: EmitterOpEaseConfig](x: Self) {
    
    inline def setEase(value: String | js.Function): Self = StObject.set(x, "ease", value.asInstanceOf[js.Any])
    
    inline def setEaseParams(value: js.Array[Double]): Self = StObject.set(x, "easeParams", value.asInstanceOf[js.Any])
    
    inline def setEaseParamsUndefined: Self = StObject.set(x, "easeParams", js.undefined)
    
    inline def setEaseParamsVarargs(value: Double*): Self = StObject.set(x, "easeParams", js.Array(value*))
    
    inline def setEaseUndefined: Self = StObject.set(x, "ease", js.undefined)
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
