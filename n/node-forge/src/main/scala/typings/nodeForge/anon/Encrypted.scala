package typings.nodeForge.anon

import typings.nodeForge.mod.pkcs12.Bag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Encrypted extends StObject {
  
  var encrypted: Boolean
  
  var safeBags: js.Array[Bag]
}
object Encrypted {
  
  inline def apply(encrypted: Boolean, safeBags: js.Array[Bag]): Encrypted = {
    val __obj = js.Dynamic.literal(encrypted = encrypted.asInstanceOf[js.Any], safeBags = safeBags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encrypted]
  }
  
  extension [Self <: Encrypted](x: Self) {
    
    inline def setEncrypted(value: Boolean): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
    
    inline def setSafeBags(value: js.Array[Bag]): Self = StObject.set(x, "safeBags", value.asInstanceOf[js.Any])
    
    inline def setSafeBagsVarargs(value: Bag*): Self = StObject.set(x, "safeBags", js.Array(value*))
  }
}
