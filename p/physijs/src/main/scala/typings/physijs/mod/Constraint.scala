package typings.physijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Constraint extends StObject {
  
  def getDefinition(): Any
}
object Constraint {
  
  inline def apply(getDefinition: () => Any): Constraint = {
    val __obj = js.Dynamic.literal(getDefinition = js.Any.fromFunction0(getDefinition))
    __obj.asInstanceOf[Constraint]
  }
  
  extension [Self <: Constraint](x: Self) {
    
    inline def setGetDefinition(value: () => Any): Self = StObject.set(x, "getDefinition", js.Any.fromFunction0(value))
  }
}
