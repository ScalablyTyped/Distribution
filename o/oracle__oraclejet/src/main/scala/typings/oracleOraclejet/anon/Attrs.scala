package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attrs
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var attrs: js.UndefOr[js.Object] = js.undefined
  
  var contentType: js.UndefOr[String] = js.undefined
  
  var error: js.UndefOr[
    js.Function3[/* model */ this.type, /* xhr */ Any, /* options */ js.Object, Unit]
  ] = js.undefined
  
  var patch: js.UndefOr[Boolean] = js.undefined
  
  var success: js.UndefOr[
    js.Function3[/* model */ this.type, /* response */ Any, /* options */ js.Object, Unit]
  ] = js.undefined
  
  var valdiate: js.UndefOr[Boolean] = js.undefined
  
  @JSName("wait")
  var wait_FAttrs: js.UndefOr[Boolean] = js.undefined
}
object Attrs {
  
  inline def apply(): Attrs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attrs]
  }
  
  extension [Self <: Attrs](x: Self) {
    
    inline def setAttrs(value: js.Object): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setError(value: (Attrs, /* xhr */ Any, /* options */ js.Object) => Unit): Self = StObject.set(x, "error", js.Any.fromFunction3(value))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setPatch(value: Boolean): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
    
    inline def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
    
    inline def setSuccess(value: (Attrs, /* response */ Any, /* options */ js.Object) => Unit): Self = StObject.set(x, "success", js.Any.fromFunction3(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setValdiate(value: Boolean): Self = StObject.set(x, "valdiate", value.asInstanceOf[js.Any])
    
    inline def setValdiateUndefined: Self = StObject.set(x, "valdiate", js.undefined)
    
    inline def setWait_(value: Boolean): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
    
    inline def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
  }
}
