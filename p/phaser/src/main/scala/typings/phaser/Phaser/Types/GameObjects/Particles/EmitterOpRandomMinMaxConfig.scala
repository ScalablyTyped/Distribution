package typings.phaser.Phaser.Types.GameObjects.Particles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines an operation yielding a random value within a range.
  */
@js.native
trait EmitterOpRandomMinMaxConfig extends _EmitterOpOnEmitType {
  
  /**
    * The maximum value.
    */
  var max: Double = js.native
  
  /**
    * The minimum value.
    */
  var min: Double = js.native
}
object EmitterOpRandomMinMaxConfig {
  
  @scala.inline
  def apply(max: Double, min: Double): EmitterOpRandomMinMaxConfig = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitterOpRandomMinMaxConfig]
  }
  
  @scala.inline
  implicit class EmitterOpRandomMinMaxConfigMutableBuilder[Self <: EmitterOpRandomMinMaxConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
