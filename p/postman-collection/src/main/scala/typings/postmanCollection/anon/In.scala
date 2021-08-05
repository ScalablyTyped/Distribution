package typings.postmanCollection.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait In extends StObject {
  
  def in(`val`: js.Any): String
  
  def out(`val`: String): js.Any
}
object In {
  
  inline def apply(in: js.Any => String, out: String => js.Any): In = {
    val __obj = js.Dynamic.literal(in = js.Any.fromFunction1(in), out = js.Any.fromFunction1(out))
    __obj.asInstanceOf[In]
  }
  
  extension [Self <: In](x: Self) {
    
    inline def setIn(value: js.Any => String): Self = StObject.set(x, "in", js.Any.fromFunction1(value))
    
    inline def setOut(value: String => js.Any): Self = StObject.set(x, "out", js.Any.fromFunction1(value))
  }
}
