package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Initialize
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var initialize: js.UndefOr[js.Function2[/* models */ js.Array[this.type], /* options */ js.Object, Unit]] = js.undefined
  
  var parse: js.UndefOr[js.Function1[/* data */ js.Any, js.Any]] = js.undefined
  
  var parseSave: js.UndefOr[js.Function1[/* data */ js.Any, js.Any]] = js.undefined
  
  var urlRoot: js.UndefOr[String] = js.undefined
  
  var validate: js.UndefOr[
    Null | js.Object | String | (js.Function2[/* attributes */ js.Object, /* options */ js.UndefOr[this.type], Double])
  ] = js.undefined
}
object Initialize {
  
  inline def apply(): Initialize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Initialize]
  }
  
  extension [Self <: Initialize](x: Self) {
    
    inline def setInitialize(value: (/* models */ js.Array[Initialize], /* options */ js.Object) => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction2(value))
    
    inline def setInitializeUndefined: Self = StObject.set(x, "initialize", js.undefined)
    
    inline def setParse(value: /* data */ js.Any => js.Any): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    
    inline def setParseSave(value: /* data */ js.Any => js.Any): Self = StObject.set(x, "parseSave", js.Any.fromFunction1(value))
    
    inline def setParseSaveUndefined: Self = StObject.set(x, "parseSave", js.undefined)
    
    inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
    
    inline def setUrlRoot(value: String): Self = StObject.set(x, "urlRoot", value.asInstanceOf[js.Any])
    
    inline def setUrlRootUndefined: Self = StObject.set(x, "urlRoot", js.undefined)
    
    inline def setValidate(
      value: js.Object | String | (js.Function2[/* attributes */ js.Object, /* options */ js.UndefOr[Initialize], Double])
    ): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    
    inline def setValidateFunction2(value: (/* attributes */ js.Object, /* options */ js.UndefOr[Initialize]) => Double): Self = StObject.set(x, "validate", js.Any.fromFunction2(value))
    
    inline def setValidateNull: Self = StObject.set(x, "validate", null)
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
