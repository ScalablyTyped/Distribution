package typings.nats.anon

import typings.nats.typesMod.callbackFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitializedFn extends StObject {
  
  var headers_only: js.UndefOr[Boolean] = js.undefined
  
  var initializedFn: js.UndefOr[callbackFn] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
}
object InitializedFn {
  
  inline def apply(): InitializedFn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitializedFn]
  }
  
  extension [Self <: InitializedFn](x: Self) {
    
    inline def setHeaders_only(value: Boolean): Self = StObject.set(x, "headers_only", value.asInstanceOf[js.Any])
    
    inline def setHeaders_onlyUndefined: Self = StObject.set(x, "headers_only", js.undefined)
    
    inline def setInitializedFn(value: () => Unit): Self = StObject.set(x, "initializedFn", js.Any.fromFunction0(value))
    
    inline def setInitializedFnUndefined: Self = StObject.set(x, "initializedFn", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
