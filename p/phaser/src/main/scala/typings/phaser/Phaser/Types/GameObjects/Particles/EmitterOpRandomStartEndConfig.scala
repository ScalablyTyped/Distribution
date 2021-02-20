package typings.phaser.Phaser.Types.GameObjects.Particles

import org.scalablytyped.runtime.StObject
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
  implicit class EmitterOpRandomStartEndConfigMutableBuilder[Self <: EmitterOpRandomStartEndConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRandom(value: Boolean): Self = StObject.set(x, "random", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
