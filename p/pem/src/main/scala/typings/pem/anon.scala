package typings.pem

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ClientKey extends StObject {
    
    var clientKey: String
    
    var csr: String
  }
  object ClientKey {
    
    inline def apply(clientKey: String, csr: String): ClientKey = {
      val __obj = js.Dynamic.literal(clientKey = clientKey.asInstanceOf[js.Any], csr = csr.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientKey]
    }
    
    extension [Self <: ClientKey](x: Self) {
      
      inline def setClientKey(value: String): Self = StObject.set(x, "clientKey", value.asInstanceOf[js.Any])
      
      inline def setCsr(value: String): Self = StObject.set(x, "csr", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dhparam extends StObject {
    
    var dhparam: js.Any
  }
  object Dhparam {
    
    inline def apply(dhparam: js.Any): Dhparam = {
      val __obj = js.Dynamic.literal(dhparam = dhparam.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dhparam]
    }
    
    extension [Self <: Dhparam](x: Self) {
      
      inline def setDhparam(value: js.Any): Self = StObject.set(x, "dhparam", value.asInstanceOf[js.Any])
    }
  }
  
  trait Fingerprint extends StObject {
    
    var fingerprint: String
  }
  object Fingerprint {
    
    inline def apply(fingerprint: String): Fingerprint = {
      val __obj = js.Dynamic.literal(fingerprint = fingerprint.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fingerprint]
    }
    
    extension [Self <: Fingerprint](x: Self) {
      
      inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    }
  }
  
  trait Key extends StObject {
    
    var key: String
  }
  object Key {
    
    inline def apply(key: String): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    extension [Self <: Key](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait Modulus extends StObject {
    
    var modulus: js.Any
  }
  object Modulus {
    
    inline def apply(modulus: js.Any): Modulus = {
      val __obj = js.Dynamic.literal(modulus = modulus.asInstanceOf[js.Any])
      __obj.asInstanceOf[Modulus]
    }
    
    extension [Self <: Modulus](x: Self) {
      
      inline def setModulus(value: js.Any): Self = StObject.set(x, "modulus", value.asInstanceOf[js.Any])
    }
  }
  
  trait Pkcs12 extends StObject {
    
    var pkcs12: js.Any
  }
  object Pkcs12 {
    
    inline def apply(pkcs12: js.Any): Pkcs12 = {
      val __obj = js.Dynamic.literal(pkcs12 = pkcs12.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pkcs12]
    }
    
    extension [Self <: Pkcs12](x: Self) {
      
      inline def setPkcs12(value: js.Any): Self = StObject.set(x, "pkcs12", value.asInstanceOf[js.Any])
    }
  }
  
  trait Prime extends StObject {
    
    var prime: js.Any
    
    var size: js.Any
  }
  object Prime {
    
    inline def apply(prime: js.Any, size: js.Any): Prime = {
      val __obj = js.Dynamic.literal(prime = prime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Prime]
    }
    
    extension [Self <: Prime](x: Self) {
      
      inline def setPrime(value: js.Any): Self = StObject.set(x, "prime", value.asInstanceOf[js.Any])
      
      inline def setSize(value: js.Any): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  trait PublicKey extends StObject {
    
    var publicKey: String
  }
  object PublicKey {
    
    inline def apply(publicKey: String): PublicKey = {
      val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[PublicKey]
    }
    
    extension [Self <: PublicKey](x: Self) {
      
      inline def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    }
  }
}
