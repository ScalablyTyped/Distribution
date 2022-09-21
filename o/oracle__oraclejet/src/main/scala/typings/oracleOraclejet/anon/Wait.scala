package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Wait
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var error: js.UndefOr[
    js.Function3[/* model */ this.type, /* xhr */ Any, /* options */ js.Object, Unit]
  ] = js.undefined
  
  var success: js.UndefOr[
    js.Function3[/* model */ this.type, /* response */ Any, /* options */ js.Object, Unit]
  ] = js.undefined
  
  @JSName("wait")
  var wait_FWait: js.UndefOr[Boolean] = js.undefined
}
object Wait {
  
  inline def apply(): Wait = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Wait]
  }
  
  extension [Self <: Wait](x: Self) {
    
    inline def setError(value: (Wait, /* xhr */ Any, /* options */ js.Object) => Unit): Self = StObject.set(x, "error", js.Any.fromFunction3(value))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setSuccess(value: (Wait, /* response */ Any, /* options */ js.Object) => Unit): Self = StObject.set(x, "success", js.Any.fromFunction3(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setWait_(value: Boolean): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
    
    inline def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
  }
}
