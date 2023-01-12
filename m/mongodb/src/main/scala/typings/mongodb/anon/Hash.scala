package typings.mongodb.anon

import typings.bson.mod.Binary
import typings.bson.mod.Long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hash extends StObject {
  
  var hash: Binary
  
  var keyId: Long
}
object Hash {
  
  inline def apply(hash: Binary, keyId: Long): Hash = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], keyId = keyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hash]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Hash] (val x: Self) extends AnyVal {
    
    inline def setHash(value: Binary): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setKeyId(value: Long): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
  }
}
