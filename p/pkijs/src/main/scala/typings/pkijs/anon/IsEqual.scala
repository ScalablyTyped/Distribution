package typings.pkijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsEqual extends StObject {
  
  def isEqual(data: Any): Boolean
}
object IsEqual {
  
  inline def apply(isEqual: Any => Boolean): IsEqual = {
    val __obj = js.Dynamic.literal(isEqual = js.Any.fromFunction1(isEqual))
    __obj.asInstanceOf[IsEqual]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsEqual] (val x: Self) extends AnyVal {
    
    inline def setIsEqual(value: Any => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
  }
}
