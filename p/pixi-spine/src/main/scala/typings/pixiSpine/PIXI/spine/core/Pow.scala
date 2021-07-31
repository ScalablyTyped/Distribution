package typings.pixiSpine.PIXI.spine.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pow
  extends StObject
     with Interpolation {
  
  var power: Double
}
object Pow {
  
  @scala.inline
  def apply(apply: (Double, Double, Double) => Double, applyInternal: Double => Double, power: Double): Pow = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction3(apply), applyInternal = js.Any.fromFunction1(applyInternal), power = power.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pow]
  }
  
  @scala.inline
  implicit class PowMutableBuilder[Self <: Pow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPower(value: Double): Self = StObject.set(x, "power", value.asInstanceOf[js.Any])
  }
}
