package typings.minappEnv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProxyHandler[T /* <: js.Object */] extends StObject {
  
  @JSName("apply")
  var apply: js.UndefOr[
    js.Function3[/* target */ T, /* thisArg */ Any, /* argArray */ js.UndefOr[Any], Any]
  ] = js.undefined
  
  var construct: js.UndefOr[
    js.Function3[/* target */ T, /* argArray */ Any, /* newTarget */ js.UndefOr[Any], js.Object]
  ] = js.undefined
  
  var defineProperty: js.UndefOr[
    js.Function3[
      /* target */ T, 
      /* p */ PropertyKey, 
      /* attributes */ PropertyDescriptor, 
      scala.Boolean
    ]
  ] = js.undefined
  
  var deleteProperty: js.UndefOr[js.Function2[/* target */ T, /* p */ PropertyKey, scala.Boolean]] = js.undefined
  
  var enumerate: js.UndefOr[js.Function1[/* target */ T, Array[PropertyKey]]] = js.undefined
  
  var get: js.UndefOr[js.Function3[/* target */ T, /* p */ PropertyKey, /* receiver */ Any, Any]] = js.undefined
  
  var getOwnPropertyDescriptor: js.UndefOr[
    js.Function2[/* target */ T, /* p */ PropertyKey, js.UndefOr[PropertyDescriptor]]
  ] = js.undefined
  
  var getPrototypeOf: js.UndefOr[js.Function1[/* target */ T, js.Object | Null]] = js.undefined
  
  var has: js.UndefOr[js.Function2[/* target */ T, /* p */ PropertyKey, scala.Boolean]] = js.undefined
  
  var isExtensible: js.UndefOr[js.Function1[/* target */ T, scala.Boolean]] = js.undefined
  
  var ownKeys: js.UndefOr[js.Function1[/* target */ T, Array[PropertyKey]]] = js.undefined
  
  var preventExtensions: js.UndefOr[js.Function1[/* target */ T, scala.Boolean]] = js.undefined
  
  var set: js.UndefOr[
    js.Function4[/* target */ T, /* p */ PropertyKey, /* value */ Any, /* receiver */ Any, scala.Boolean]
  ] = js.undefined
  
  var setPrototypeOf: js.UndefOr[js.Function2[/* target */ T, /* v */ Any, scala.Boolean]] = js.undefined
}
object ProxyHandler {
  
  inline def apply[T /* <: js.Object */](): ProxyHandler[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxyHandler[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProxyHandler[?], T /* <: js.Object */] (val x: Self & ProxyHandler[T]) extends AnyVal {
    
    inline def setApply(value: (/* target */ T, /* thisArg */ Any, /* argArray */ js.UndefOr[Any]) => Any): Self = StObject.set(x, "apply", js.Any.fromFunction3(value))
    
    inline def setApplyUndefined: Self = StObject.set(x, "apply", js.undefined)
    
    inline def setConstruct(value: (/* target */ T, /* argArray */ Any, /* newTarget */ js.UndefOr[Any]) => js.Object): Self = StObject.set(x, "construct", js.Any.fromFunction3(value))
    
    inline def setConstructUndefined: Self = StObject.set(x, "construct", js.undefined)
    
    inline def setDefineProperty(value: (/* target */ T, /* p */ PropertyKey, /* attributes */ PropertyDescriptor) => scala.Boolean): Self = StObject.set(x, "defineProperty", js.Any.fromFunction3(value))
    
    inline def setDefinePropertyUndefined: Self = StObject.set(x, "defineProperty", js.undefined)
    
    inline def setDeleteProperty(value: (/* target */ T, /* p */ PropertyKey) => scala.Boolean): Self = StObject.set(x, "deleteProperty", js.Any.fromFunction2(value))
    
    inline def setDeletePropertyUndefined: Self = StObject.set(x, "deleteProperty", js.undefined)
    
    inline def setEnumerate(value: /* target */ T => Array[PropertyKey]): Self = StObject.set(x, "enumerate", js.Any.fromFunction1(value))
    
    inline def setEnumerateUndefined: Self = StObject.set(x, "enumerate", js.undefined)
    
    inline def setGet(value: (/* target */ T, /* p */ PropertyKey, /* receiver */ Any) => Any): Self = StObject.set(x, "get", js.Any.fromFunction3(value))
    
    inline def setGetOwnPropertyDescriptor(value: (/* target */ T, /* p */ PropertyKey) => js.UndefOr[PropertyDescriptor]): Self = StObject.set(x, "getOwnPropertyDescriptor", js.Any.fromFunction2(value))
    
    inline def setGetOwnPropertyDescriptorUndefined: Self = StObject.set(x, "getOwnPropertyDescriptor", js.undefined)
    
    inline def setGetPrototypeOf(value: /* target */ T => js.Object | Null): Self = StObject.set(x, "getPrototypeOf", js.Any.fromFunction1(value))
    
    inline def setGetPrototypeOfUndefined: Self = StObject.set(x, "getPrototypeOf", js.undefined)
    
    inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    inline def setHas(value: (/* target */ T, /* p */ PropertyKey) => scala.Boolean): Self = StObject.set(x, "has", js.Any.fromFunction2(value))
    
    inline def setHasUndefined: Self = StObject.set(x, "has", js.undefined)
    
    inline def setIsExtensible(value: /* target */ T => scala.Boolean): Self = StObject.set(x, "isExtensible", js.Any.fromFunction1(value))
    
    inline def setIsExtensibleUndefined: Self = StObject.set(x, "isExtensible", js.undefined)
    
    inline def setOwnKeys(value: /* target */ T => Array[PropertyKey]): Self = StObject.set(x, "ownKeys", js.Any.fromFunction1(value))
    
    inline def setOwnKeysUndefined: Self = StObject.set(x, "ownKeys", js.undefined)
    
    inline def setPreventExtensions(value: /* target */ T => scala.Boolean): Self = StObject.set(x, "preventExtensions", js.Any.fromFunction1(value))
    
    inline def setPreventExtensionsUndefined: Self = StObject.set(x, "preventExtensions", js.undefined)
    
    inline def setSet(value: (/* target */ T, /* p */ PropertyKey, /* value */ Any, /* receiver */ Any) => scala.Boolean): Self = StObject.set(x, "set", js.Any.fromFunction4(value))
    
    inline def setSetPrototypeOf(value: (/* target */ T, /* v */ Any) => scala.Boolean): Self = StObject.set(x, "setPrototypeOf", js.Any.fromFunction2(value))
    
    inline def setSetPrototypeOfUndefined: Self = StObject.set(x, "setPrototypeOf", js.undefined)
    
    inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
  }
}
