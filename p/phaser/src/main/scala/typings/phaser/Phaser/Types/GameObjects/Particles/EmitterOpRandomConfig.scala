package typings.phaser.Phaser.Types.GameObjects.Particles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines an operation yielding a random value within a range.
  */
trait EmitterOpRandomConfig
  extends StObject
     with _EmitterOpOnEmitType {
  
  /**
    * The minimum and maximum values, as [min, max].
    */
  var random: js.Array[Double]
}
object EmitterOpRandomConfig {
  
  inline def apply(random: js.Array[Double]): EmitterOpRandomConfig = {
    val __obj = js.Dynamic.literal(random = random.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitterOpRandomConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmitterOpRandomConfig] (val x: Self) extends AnyVal {
    
    inline def setRandom(value: js.Array[Double]): Self = StObject.set(x, "random", value.asInstanceOf[js.Any])
    
    inline def setRandomVarargs(value: Double*): Self = StObject.set(x, "random", js.Array(value*))
  }
}
