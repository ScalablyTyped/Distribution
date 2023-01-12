package typings.oidcProvider.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Encrypt extends StObject {
  
  var encrypt: js.UndefOr[Enc] = js.undefined
  
  var sign: js.UndefOr[Alg | Key] = js.undefined
}
object Encrypt {
  
  inline def apply(): Encrypt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Encrypt]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Encrypt] (val x: Self) extends AnyVal {
    
    inline def setEncrypt(value: Enc): Self = StObject.set(x, "encrypt", value.asInstanceOf[js.Any])
    
    inline def setEncryptUndefined: Self = StObject.set(x, "encrypt", js.undefined)
    
    inline def setSign(value: Alg | Key): Self = StObject.set(x, "sign", value.asInstanceOf[js.Any])
    
    inline def setSignUndefined: Self = StObject.set(x, "sign", js.undefined)
  }
}
