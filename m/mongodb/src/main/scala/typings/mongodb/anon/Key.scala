package typings.mongodb.anon

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Key extends StObject {
  
  /**
    * The master key used to encrypt/decrypt data keys.
    * A 96-byte long Buffer or base64 encoded string.
    */
  var key: Buffer | String
}
object Key {
  
  inline def apply(key: Buffer | String): Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
  
  extension [Self <: Key](x: Self) {
    
    inline def setKey(value: Buffer | String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
