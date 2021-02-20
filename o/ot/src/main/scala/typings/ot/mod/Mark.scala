package typings.ot.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mark extends StObject {
  
  def clear(): Unit = js.native
}
object Mark {
  
  @scala.inline
  def apply(clear: () => Unit): Mark = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear))
    __obj.asInstanceOf[Mark]
  }
  
  @scala.inline
  implicit class MarkMutableBuilder[Self <: Mark] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
  }
}
