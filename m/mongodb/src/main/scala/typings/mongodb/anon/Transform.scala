package typings.mongodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transform[T] extends StObject {
  
  var transform: js.UndefOr[js.Function1[/* document */ T, js.Any]] = js.undefined
}
object Transform {
  
  inline def apply[T](): Transform[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Transform[T]]
  }
  
  extension [Self <: Transform[?], T](x: Self & Transform[T]) {
    
    inline def setTransform(value: /* document */ T => js.Any): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
  }
}
