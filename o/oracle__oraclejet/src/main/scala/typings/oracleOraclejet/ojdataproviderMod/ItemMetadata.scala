package typings.oracleOraclejet.ojdataproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemMetadata[K] extends StObject {
  
  var key: K
}
object ItemMetadata {
  
  inline def apply[K](key: K): ItemMetadata[K] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemMetadata[K]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemMetadata[?], K] (val x: Self & ItemMetadata[K]) extends AnyVal {
    
    inline def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
