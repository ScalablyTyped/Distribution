package typings.phaser.Phaser.Types.GameObjects.Particles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines an operation yielding a random value within a range.
  */
@js.native
trait EmitterOpRandomConfig extends _EmitterOpOnEmitType {
  
  /**
    * The minimum and maximum values, as [min, max].
    */
  var random: js.Array[Double] = js.native
}
object EmitterOpRandomConfig {
  
  @scala.inline
  def apply(random: js.Array[Double]): EmitterOpRandomConfig = {
    val __obj = js.Dynamic.literal(random = random.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitterOpRandomConfig]
  }
  
  @scala.inline
  implicit class EmitterOpRandomConfigMutableBuilder[Self <: EmitterOpRandomConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRandom(value: js.Array[Double]): Self = StObject.set(x, "random", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRandomVarargs(value: Double*): Self = StObject.set(x, "random", js.Array(value :_*))
  }
}
