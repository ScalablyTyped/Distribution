package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BulkFetchDocsWrapper extends StObject {
  
  var keys: js.Array[String]
}
object BulkFetchDocsWrapper {
  
  inline def apply(keys: js.Array[String]): BulkFetchDocsWrapper = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkFetchDocsWrapper]
  }
  
  extension [Self <: BulkFetchDocsWrapper](x: Self) {
    
    inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
  }
}
