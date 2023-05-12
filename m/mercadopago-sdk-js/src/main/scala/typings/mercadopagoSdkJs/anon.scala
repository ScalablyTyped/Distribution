package typings.mercadopagoSdkJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Fingerprint extends StObject {
    
    var fingerprint: js.UndefOr[Any] = js.undefined
    
    var group: String
    
    var productId: js.UndefOr[String] = js.undefined
    
    var requireEsc: js.UndefOr[Boolean] = js.undefined
  }
  object Fingerprint {
    
    inline def apply(group: String): Fingerprint = {
      val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fingerprint]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Fingerprint] (val x: Self) extends AnyVal {
      
      inline def setFingerprint(value: Any): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
      
      inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
      
      inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
      
      inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
      
      inline def setRequireEsc(value: Boolean): Self = StObject.set(x, "requireEsc", value.asInstanceOf[js.Any])
      
      inline def setRequireEscUndefined: Self = StObject.set(x, "requireEsc", js.undefined)
    }
  }
}
