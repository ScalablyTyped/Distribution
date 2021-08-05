package typings.pgPromise.anon

import typings.pgPromise.mod.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait From[S] extends StObject {
  
  var from: js.UndefOr[String] = js.undefined
  
  var skip: js.UndefOr[String | js.Array[String] | (js.Function1[/* c */ Column[S], Boolean])] = js.undefined
  
  var to: js.UndefOr[String] = js.undefined
}
object From {
  
  inline def apply[S](): From[S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[From[S]]
  }
  
  extension [Self <: From[?], S](x: Self & From[S]) {
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setSkip(value: String | js.Array[String] | (js.Function1[/* c */ Column[S], Boolean])): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    inline def setSkipFunction1(value: /* c */ Column[S] => Boolean): Self = StObject.set(x, "skip", js.Any.fromFunction1(value))
    
    inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    inline def setSkipVarargs(value: String*): Self = StObject.set(x, "skip", js.Array(value :_*))
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
