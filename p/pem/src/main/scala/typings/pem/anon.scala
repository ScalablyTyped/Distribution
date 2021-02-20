package typings.pem

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ClientKey extends StObject {
    
    var clientKey: String = js.native
    
    var csr: String = js.native
  }
  object ClientKey {
    
    @scala.inline
    def apply(clientKey: String, csr: String): ClientKey = {
      val __obj = js.Dynamic.literal(clientKey = clientKey.asInstanceOf[js.Any], csr = csr.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientKey]
    }
    
    @scala.inline
    implicit class ClientKeyMutableBuilder[Self <: ClientKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientKey(value: String): Self = StObject.set(x, "clientKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCsr(value: String): Self = StObject.set(x, "csr", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Dhparam extends StObject {
    
    var dhparam: js.Any = js.native
  }
  object Dhparam {
    
    @scala.inline
    def apply(dhparam: js.Any): Dhparam = {
      val __obj = js.Dynamic.literal(dhparam = dhparam.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dhparam]
    }
    
    @scala.inline
    implicit class DhparamMutableBuilder[Self <: Dhparam] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDhparam(value: js.Any): Self = StObject.set(x, "dhparam", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Fingerprint extends StObject {
    
    var fingerprint: String = js.native
  }
  object Fingerprint {
    
    @scala.inline
    def apply(fingerprint: String): Fingerprint = {
      val __obj = js.Dynamic.literal(fingerprint = fingerprint.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fingerprint]
    }
    
    @scala.inline
    implicit class FingerprintMutableBuilder[Self <: Fingerprint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Key extends StObject {
    
    var key: String = js.native
  }
  object Key {
    
    @scala.inline
    def apply(key: String): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Modulus extends StObject {
    
    var modulus: js.Any = js.native
  }
  object Modulus {
    
    @scala.inline
    def apply(modulus: js.Any): Modulus = {
      val __obj = js.Dynamic.literal(modulus = modulus.asInstanceOf[js.Any])
      __obj.asInstanceOf[Modulus]
    }
    
    @scala.inline
    implicit class ModulusMutableBuilder[Self <: Modulus] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setModulus(value: js.Any): Self = StObject.set(x, "modulus", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Pkcs12 extends StObject {
    
    var pkcs12: js.Any = js.native
  }
  object Pkcs12 {
    
    @scala.inline
    def apply(pkcs12: js.Any): Pkcs12 = {
      val __obj = js.Dynamic.literal(pkcs12 = pkcs12.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pkcs12]
    }
    
    @scala.inline
    implicit class Pkcs12MutableBuilder[Self <: Pkcs12] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPkcs12(value: js.Any): Self = StObject.set(x, "pkcs12", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Prime extends StObject {
    
    var prime: js.Any = js.native
    
    var size: js.Any = js.native
  }
  object Prime {
    
    @scala.inline
    def apply(prime: js.Any, size: js.Any): Prime = {
      val __obj = js.Dynamic.literal(prime = prime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Prime]
    }
    
    @scala.inline
    implicit class PrimeMutableBuilder[Self <: Prime] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrime(value: js.Any): Self = StObject.set(x, "prime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: js.Any): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PublicKey extends StObject {
    
    var publicKey: String = js.native
  }
  object PublicKey {
    
    @scala.inline
    def apply(publicKey: String): PublicKey = {
      val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[PublicKey]
    }
    
    @scala.inline
    implicit class PublicKeyMutableBuilder[Self <: PublicKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    }
  }
}
