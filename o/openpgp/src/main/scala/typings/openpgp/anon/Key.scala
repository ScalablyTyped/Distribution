package typings.openpgp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Key extends StObject {
  
  var key: typings.openpgp.mod.key.Key
}
object Key {
  
  inline def apply(key: typings.openpgp.mod.key.Key): Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
  
  extension [Self <: Key](x: Self) {
    
    inline def setKey(value: typings.openpgp.mod.key.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
