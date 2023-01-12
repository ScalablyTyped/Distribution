package typings.pkijs.mod

import typings.asn1js.mod.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRSAPublicKey extends StObject {
  
  /**
    * Modulus part of RSA public key
    */
  var modulus: Integer
  
  /**
    * Public exponent of RSA public key
    */
  var publicExponent: Integer
}
object IRSAPublicKey {
  
  inline def apply(modulus: Integer, publicExponent: Integer): IRSAPublicKey = {
    val __obj = js.Dynamic.literal(modulus = modulus.asInstanceOf[js.Any], publicExponent = publicExponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRSAPublicKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IRSAPublicKey] (val x: Self) extends AnyVal {
    
    inline def setModulus(value: Integer): Self = StObject.set(x, "modulus", value.asInstanceOf[js.Any])
    
    inline def setPublicExponent(value: Integer): Self = StObject.set(x, "publicExponent", value.asInstanceOf[js.Any])
  }
}
