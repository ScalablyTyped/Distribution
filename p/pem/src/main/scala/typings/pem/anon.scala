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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClientKey] (val x: Self) extends AnyVal {
      
      inline def setClientKey(value: String): Self = StObject.set(x, "clientKey", value.asInstanceOf[js.Any])
      
      inline def setCsr(value: String): Self = StObject.set(x, "csr", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dhparam extends StObject {
    
    var dhparam: Any
  }
  object Dhparam {
    
    inline def apply(dhparam: Any): Dhparam = {
      val __obj = js.Dynamic.literal(dhparam = dhparam.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dhparam]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dhparam] (val x: Self) extends AnyVal {
      
      inline def setDhparam(value: Any): Self = StObject.set(x, "dhparam", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Fingerprint] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait Modulus extends StObject {
    
    var modulus: Any
  }
  object Modulus {
    
    inline def apply(modulus: Any): Modulus = {
      val __obj = js.Dynamic.literal(modulus = modulus.asInstanceOf[js.Any])
      __obj.asInstanceOf[Modulus]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Modulus] (val x: Self) extends AnyVal {
      
      inline def setModulus(value: Any): Self = StObject.set(x, "modulus", value.asInstanceOf[js.Any])
    }
  }
  
  trait Pkcs12 extends StObject {
    
    var pkcs12: Any
  }
  object Pkcs12 {
    
    inline def apply(pkcs12: Any): Pkcs12 = {
      val __obj = js.Dynamic.literal(pkcs12 = pkcs12.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pkcs12]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Pkcs12] (val x: Self) extends AnyVal {
      
      inline def setPkcs12(value: Any): Self = StObject.set(x, "pkcs12", value.asInstanceOf[js.Any])
    }
  }
  
  trait Prime extends StObject {
    
    var prime: Any
    
    var size: Any
  }
  object Prime {
    
    inline def apply(prime: Any, size: Any): Prime = {
      val __obj = js.Dynamic.literal(prime = prime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Prime]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Prime] (val x: Self) extends AnyVal {
      
      inline def setPrime(value: Any): Self = StObject.set(x, "prime", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Any): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PublicKey] (val x: Self) extends AnyVal {
      
      inline def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    }
  }
}
