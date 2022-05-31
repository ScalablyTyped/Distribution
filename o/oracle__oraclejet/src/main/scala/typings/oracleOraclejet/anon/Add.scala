package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Add
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var add: js.UndefOr[Boolean] = js.undefined
  
  var error: js.UndefOr[
    js.Function3[/* collection */ this.type, /* xhr */ js.Any, /* options */ js.Object, Unit]
  ] = js.undefined
  
  var fetchSize: js.UndefOr[Double] = js.undefined
  
  var set: js.UndefOr[Boolean] = js.undefined
  
  var since: js.UndefOr[js.Any] = js.undefined
  
  var startID: js.UndefOr[js.Any] = js.undefined
  
  var startIndex: js.UndefOr[Double] = js.undefined
  
  var success: js.UndefOr[
    js.Function3[/* collection */ this.type, /* response */ js.Any, /* options */ js.Object, Unit]
  ] = js.undefined
  
  var until: js.UndefOr[js.Any] = js.undefined
}
object Add {
  
  inline def apply(): Add = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Add]
  }
  
  extension [Self <: Add](x: Self) {
    
    inline def setAdd(value: Boolean): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setError(value: (Add, /* xhr */ js.Any, /* options */ js.Object) => Unit): Self = StObject.set(x, "error", js.Any.fromFunction3(value))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setFetchSize(value: Double): Self = StObject.set(x, "fetchSize", value.asInstanceOf[js.Any])
    
    inline def setFetchSizeUndefined: Self = StObject.set(x, "fetchSize", js.undefined)
    
    inline def setSet(value: Boolean): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
    
    inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
    
    inline def setSince(value: js.Any): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
    
    inline def setSinceUndefined: Self = StObject.set(x, "since", js.undefined)
    
    inline def setStartID(value: js.Any): Self = StObject.set(x, "startID", value.asInstanceOf[js.Any])
    
    inline def setStartIDUndefined: Self = StObject.set(x, "startID", js.undefined)
    
    inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    inline def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
    
    inline def setSuccess(value: (Add, /* response */ js.Any, /* options */ js.Object) => Unit): Self = StObject.set(x, "success", js.Any.fromFunction3(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setUntil(value: js.Any): Self = StObject.set(x, "until", value.asInstanceOf[js.Any])
    
    inline def setUntilUndefined: Self = StObject.set(x, "until", js.undefined)
  }
}
