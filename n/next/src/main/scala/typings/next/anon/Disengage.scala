package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Disengage extends StObject {
  
  def disengage(): Unit
}
object Disengage {
  
  inline def apply(disengage: () => Unit): Disengage = {
    val __obj = js.Dynamic.literal(disengage = js.Any.fromFunction0(disengage))
    __obj.asInstanceOf[Disengage]
  }
  
  extension [Self <: Disengage](x: Self) {
    
    inline def setDisengage(value: () => Unit): Self = StObject.set(x, "disengage", js.Any.fromFunction0(value))
  }
}
