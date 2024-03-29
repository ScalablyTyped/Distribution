package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Success
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var error: js.UndefOr[js.Function3[/* xhr */ Any, /* status */ Any, /* error */ Any, Unit]] = js.undefined
  
  var success: js.UndefOr[js.Function1[/* json */ js.UndefOr[js.Array[Any]], Unit]] = js.undefined
}
object Success {
  
  inline def apply(): Success = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Success]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Success] (val x: Self) extends AnyVal {
    
    inline def setError(value: (/* xhr */ Any, /* status */ Any, /* error */ Any) => Unit): Self = StObject.set(x, "error", js.Any.fromFunction3(value))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setSuccess(value: /* json */ js.UndefOr[js.Array[Any]] => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
