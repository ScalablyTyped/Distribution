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
    * The name of the easing function.
    */
  var ease: js.UndefOr[String] = js.undefined
  
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
    
    inline def setEase(value: String): Self = StObject.set(x, "ease", value.asInstanceOf[js.Any])
    
    inline def setEaseUndefined: Self = StObject.set(x, "ease", js.undefined)
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
