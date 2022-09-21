package typings.postmanCollection.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait In extends StObject {
  
  def in(`val`: scala.Any): String
  
  def out(`val`: String): scala.Any
}
object In {
  
  inline def apply(in: scala.Any => String, out: String => scala.Any): In = {
    val __obj = js.Dynamic.literal(in = js.Any.fromFunction1(in), out = js.Any.fromFunction1(out))
    __obj.asInstanceOf[In]
  }
  
  extension [Self <: In](x: Self) {
    
    inline def setIn(value: scala.Any => String): Self = StObject.set(x, "in", js.Any.fromFunction1(value))
    
    inline def setOut(value: String => scala.Any): Self = StObject.set(x, "out", js.Any.fromFunction1(value))
  }
}
