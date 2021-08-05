package typings.pixiSpine.PIXI.spine.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Interpolation extends StObject {
  
  @JSName("apply")
  def apply(start: Double, end: Double, a: Double): Double
  
  /* protected */ def applyInternal(a: Double): Double
}
object Interpolation {
  
  inline def apply(apply: (Double, Double, Double) => Double, applyInternal: Double => Double): Interpolation = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction3(apply), applyInternal = js.Any.fromFunction1(applyInternal))
    __obj.asInstanceOf[Interpolation]
  }
  
  extension [Self <: Interpolation](x: Self) {
    
    inline def setApply(value: (Double, Double, Double) => Double): Self = StObject.set(x, "apply", js.Any.fromFunction3(value))
    
    inline def setApplyInternal(value: Double => Double): Self = StObject.set(x, "applyInternal", js.Any.fromFunction1(value))
  }
}
