package typings.meteor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait After[T] extends StObject {
  
  var after: js.UndefOr[js.Function2[/* requiredModule */ this.type, /* data */ T, Unit]] = js.undefined
  
  var before: js.UndefOr[js.Function2[/* requiredModule */ this.type, /* parentId */ String, T]] = js.undefined
}
object After {
  
  inline def apply[T](): After[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[After[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: After[?], T] (val x: Self & After[T]) extends AnyVal {
    
    inline def setAfter(value: (After[T], /* data */ T) => Unit): Self = StObject.set(x, "after", js.Any.fromFunction2(value))
    
    inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    inline def setBefore(value: (After[T], /* parentId */ String) => T): Self = StObject.set(x, "before", js.Any.fromFunction2(value))
    
    inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
  }
}
