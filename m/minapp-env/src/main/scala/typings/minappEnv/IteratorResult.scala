package typings.minappEnv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IteratorResult[T] extends StObject {
  
  var done: scala.Boolean
  
  var value: T
}
object IteratorResult {
  
  @scala.inline
  def apply[T](done: scala.Boolean, value: T): IteratorResult[T] = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IteratorResult[T]]
  }
  
  @scala.inline
  implicit class IteratorResultMutableBuilder[Self <: IteratorResult[?], T] (val x: Self & IteratorResult[T]) extends AnyVal {
    
    @scala.inline
    def setDone(value: scala.Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
