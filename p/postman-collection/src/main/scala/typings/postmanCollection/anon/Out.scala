package typings.postmanCollection.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Out extends StObject {
  
  def in[T](`val`: T): T = js.native
  
  def out[T](`val`: T): T = js.native
}
object Out {
  
  @scala.inline
  def apply(in: js.Any => js.Any, out: js.Any => js.Any): Out = {
    val __obj = js.Dynamic.literal(in = js.Any.fromFunction1(in), out = js.Any.fromFunction1(out))
    __obj.asInstanceOf[Out]
  }
  
  @scala.inline
  implicit class OutMutableBuilder[Self <: Out] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIn(value: js.Any => js.Any): Self = StObject.set(x, "in", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOut(value: js.Any => js.Any): Self = StObject.set(x, "out", js.Any.fromFunction1(value))
  }
}
