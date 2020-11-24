package typings.phaser.Phaser.Types.GameObjects.Particles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines an operation yielding a random value within a range.
  */
@js.native
trait EmitterOpRandomStartEndConfig extends _EmitterOpOnEmitType {
  
  /**
    * The ending value.
    */
  var end: Double = js.native
  
  /**
    * If false, this becomes {@link EmitterOpEaseConfig}.
    */
  var random: Boolean = js.native
  
  /**
    * The starting value.
    */
  var start: Double = js.native
}
object EmitterOpRandomStartEndConfig {
  
  @scala.inline
  def apply(end: Double, random: Boolean, start: Double): EmitterOpRandomStartEndConfig = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], random = random.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitterOpRandomStartEndConfig]
  }
  
  @scala.inline
  implicit class EmitterOpRandomStartEndConfigOps[Self <: EmitterOpRandomStartEndConfig] (val x: Self) extends AnyVal {
    
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
    def setRandom(value: Boolean): Self = this.set("random", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
  }
}
