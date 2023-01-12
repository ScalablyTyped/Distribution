package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentKey extends StObject {
  
  /**
    * Previous key value
    */
  var currentKey: String
  
  /**
    * Existing keys
    */
  var keys: js.Array[String]
}
object CurrentKey {
  
  inline def apply(currentKey: String, keys: js.Array[String]): CurrentKey = {
    val __obj = js.Dynamic.literal(currentKey = currentKey.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CurrentKey] (val x: Self) extends AnyVal {
    
    inline def setCurrentKey(value: String): Self = StObject.set(x, "currentKey", value.asInstanceOf[js.Any])
    
    inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
  }
}
