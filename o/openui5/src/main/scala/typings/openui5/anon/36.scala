package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `36` extends StObject {
  
  /**
    * Array with strings or Promises resolving with strings
    */
  var keys: js.UndefOr[js.Array[String | js.Promise[String]]] = js.undefined
}
object `36` {
  
  inline def apply(): `36` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`36`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `36`] (val x: Self) extends AnyVal {
    
    inline def setKeys(value: js.Array[String | js.Promise[String]]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setKeysVarargs(value: (String | js.Promise[String])*): Self = StObject.set(x, "keys", js.Array(value*))
  }
}
