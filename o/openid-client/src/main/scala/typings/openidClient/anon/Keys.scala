package typings.openidClient.anon

import typings.jose.distTypesTypesMod.JWK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Keys extends StObject {
  
  var keys: js.Array[JWK]
}
object Keys {
  
  inline def apply(keys: js.Array[JWK]): Keys = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Keys]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Keys] (val x: Self) extends AnyVal {
    
    inline def setKeys(value: js.Array[JWK]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysVarargs(value: JWK*): Self = StObject.set(x, "keys", js.Array(value*))
  }
}
