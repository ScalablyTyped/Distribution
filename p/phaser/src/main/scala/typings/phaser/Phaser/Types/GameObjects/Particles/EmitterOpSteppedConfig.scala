package typings.phaser.Phaser.Types.GameObjects.Particles

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
  implicit class EmitterOpSteppedConfigOps[Self <: EmitterOpSteppedConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSteps(value: Double): Self = this.set("steps", value.asInstanceOf[js.Any])
  }
}
