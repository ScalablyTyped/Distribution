package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `28` extends StObject {
  
  /**
    * Array with strings or Promises resolving with strings
    */
  var keys: js.UndefOr[js.Array[String | js.Promise[String]]] = js.undefined
}
object `28` {
  
  inline def apply(): `28` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`28`]
  }
  
  extension [Self <: `28`](x: Self) {
    
    inline def setKeys(value: js.Array[String | js.Promise[String]]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setKeysVarargs(value: (String | js.Promise[String])*): Self = StObject.set(x, "keys", js.Array(value*))
  }
}
