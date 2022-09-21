package typings.pixiSpineRuntime37.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Constraint
  extends StObject
     with Updatable {
  
  def getOrder(): Double
}
object Constraint {
  
  inline def apply(getOrder: () => Double, update: () => Unit): Constraint = {
    val __obj = js.Dynamic.literal(getOrder = js.Any.fromFunction0(getOrder), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[Constraint]
  }
  
  extension [Self <: Constraint](x: Self) {
    
    inline def setGetOrder(value: () => Double): Self = StObject.set(x, "getOrder", js.Any.fromFunction0(value))
  }
}
