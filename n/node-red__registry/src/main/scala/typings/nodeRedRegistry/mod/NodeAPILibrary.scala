package typings.nodeRedRegistry.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeAPILibrary extends StObject {
  
  def register(`type`: String): Unit
}
object NodeAPILibrary {
  
  inline def apply(register: String => Unit): NodeAPILibrary = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction1(register))
    __obj.asInstanceOf[NodeAPILibrary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeAPILibrary] (val x: Self) extends AnyVal {
    
    inline def setRegister(value: String => Unit): Self = StObject.set(x, "register", js.Any.fromFunction1(value))
  }
}
