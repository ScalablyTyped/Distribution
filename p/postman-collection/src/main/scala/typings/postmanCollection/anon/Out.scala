package typings.postmanCollection.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Out extends StObject {
  
  def in[T](`val`: T): T
  
  def out[T](`val`: T): T
}
object Out {
  
  inline def apply(in: scala.Any => scala.Any, out: scala.Any => scala.Any): Out = {
    val __obj = js.Dynamic.literal(in = js.Any.fromFunction1(in), out = js.Any.fromFunction1(out))
    __obj.asInstanceOf[Out]
  }
  
  extension [Self <: Out](x: Self) {
    
    inline def setIn(value: scala.Any => scala.Any): Self = StObject.set(x, "in", js.Any.fromFunction1(value))
    
    inline def setOut(value: scala.Any => scala.Any): Self = StObject.set(x, "out", js.Any.fromFunction1(value))
  }
}
