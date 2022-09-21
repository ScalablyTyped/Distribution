package typings.pgPromise.anon

import typings.pgPromise.mod.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait From[T] extends StObject {
  
  var from: js.UndefOr[String] = js.undefined
  
  var skip: js.UndefOr[String | js.Array[String] | (js.Function1[/* c */ Column[T], Boolean])] = js.undefined
  
  var to: js.UndefOr[String] = js.undefined
}
object From {
  
  inline def apply[T](): From[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[From[T]]
  }
  
  extension [Self <: From[?], T](x: Self & From[T]) {
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setSkip(value: String | js.Array[String] | (js.Function1[/* c */ Column[T], Boolean])): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    inline def setSkipFunction1(value: /* c */ Column[T] => Boolean): Self = StObject.set(x, "skip", js.Any.fromFunction1(value))
    
    inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    inline def setSkipVarargs(value: String*): Self = StObject.set(x, "skip", js.Array(value*))
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
