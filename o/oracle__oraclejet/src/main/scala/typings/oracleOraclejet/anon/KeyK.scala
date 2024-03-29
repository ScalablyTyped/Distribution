package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyK[K] extends StObject {
  
  var key: K
}
object KeyK {
  
  inline def apply[K](key: K): KeyK[K] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyK[K]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyK[?], K] (val x: Self & KeyK[K]) extends AnyVal {
    
    inline def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
