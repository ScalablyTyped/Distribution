package typings.phaser.Phaser.Types.GameObjects.Particles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines an operation yielding a value incremented by steps across a range.
  */
@js.native
trait EmitterOpSteppedConfig extends _EmitterOpOnEmitType {
  
  /**
    * The ending value.
    */
  var end: Double = js.native
  
  /**
    * The starting value.
    */
  var start: Double = js.native
  
  /**
    * The number of steps between start and end.
    */
  var steps: Double = js.native
}
object EmitterOpSteppedConfig {
  
  @scala.inline
  def apply(end: Double, start: Double, steps: Double): EmitterOpSteppedConfig = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitterOpSteppedConfig]
  }
  
  @scala.inline
  implicit class EmitterOpSteppedConfigMutableBuilder[Self <: EmitterOpSteppedConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
  }
}
