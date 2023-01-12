package typings.phaser.Phaser.Types.GameObjects.Particles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines an operation yielding a value incremented by steps across a range.
  */
trait EmitterOpSteppedConfig
  extends StObject
     with _EmitterOpOnEmitType {
  
  /**
    * The ending value.
    */
  var end: Double
  
  /**
    * The starting value.
    */
  var start: Double
  
  /**
    * The number of steps between start and end.
    */
  var steps: Double
}
object EmitterOpSteppedConfig {
  
  inline def apply(end: Double, start: Double, steps: Double): EmitterOpSteppedConfig = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitterOpSteppedConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmitterOpSteppedConfig] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
  }
}
