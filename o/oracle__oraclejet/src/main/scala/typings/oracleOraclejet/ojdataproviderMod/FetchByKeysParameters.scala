package typings.oracleOraclejet.ojdataproviderMod

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchByKeysParameters[K] extends StObject {
  
  var attributes: js.UndefOr[js.Array[String | FetchAttribute]] = js.undefined
  
  var keys: Set[K]
}
object FetchByKeysParameters {
  
  inline def apply[K](keys: Set[K]): FetchByKeysParameters[K] = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchByKeysParameters[K]]
  }
  
  extension [Self <: FetchByKeysParameters[?], K](x: Self & FetchByKeysParameters[K]) {
    
    inline def setAttributes(value: js.Array[String | FetchAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: (String | FetchAttribute)*): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    inline def setKeys(value: Set[K]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
  }
}
