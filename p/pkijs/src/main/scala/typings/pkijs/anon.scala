package typings.pkijs

import typings.pkijs.certificateMod.default
import typings.std.ArrayBuffer
import typings.std.BufferSource
import typings.std.KeyUsage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Algorithm extends StObject {
    
    var algorithm: typings.std.Algorithm
    
    var usages: js.Array[KeyUsage]
  }
  object Algorithm {
    
    inline def apply(algorithm: typings.std.Algorithm, usages: js.Array[KeyUsage]): Algorithm = {
      val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], usages = usages.asInstanceOf[js.Any])
      __obj.asInstanceOf[Algorithm]
    }
    
    extension [Self <: Algorithm](x: Self) {
      
      inline def setAlgorithm(value: typings.std.Algorithm): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setUsages(value: js.Array[KeyUsage]): Self = StObject.set(x, "usages", value.asInstanceOf[js.Any])
      
      inline def setUsagesVarargs(value: KeyUsage*): Self = StObject.set(x, "usages", js.Array(value :_*))
    }
  }
  
  trait ContentEncryptionAlgorithm extends StObject {
    
    var contentEncryptionAlgorithm: typings.std.Algorithm
    
    var contentToEncrypt: BufferSource
    
    var hmacHashAlgorithm: String
    
    var iterationCount: Double
    
    var password: String
  }
  object ContentEncryptionAlgorithm {
    
    inline def apply(
      contentEncryptionAlgorithm: typings.std.Algorithm,
      contentToEncrypt: BufferSource,
      hmacHashAlgorithm: String,
      iterationCount: Double,
      password: String
    ): ContentEncryptionAlgorithm = {
      val __obj = js.Dynamic.literal(contentEncryptionAlgorithm = contentEncryptionAlgorithm.asInstanceOf[js.Any], contentToEncrypt = contentToEncrypt.asInstanceOf[js.Any], hmacHashAlgorithm = hmacHashAlgorithm.asInstanceOf[js.Any], iterationCount = iterationCount.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentEncryptionAlgorithm]
    }
    
    extension [Self <: ContentEncryptionAlgorithm](x: Self) {
      
      inline def setContentEncryptionAlgorithm(value: typings.std.Algorithm): Self = StObject.set(x, "contentEncryptionAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setContentToEncrypt(value: BufferSource): Self = StObject.set(x, "contentToEncrypt", value.asInstanceOf[js.Any])
      
      inline def setHmacHashAlgorithm(value: String): Self = StObject.set(x, "hmacHashAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setIterationCount(value: Double): Self = StObject.set(x, "iterationCount", value.asInstanceOf[js.Any])
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    }
  }
  
  trait Counter extends StObject {
    
    var counter: Double
    
    var result: ArrayBuffer
  }
  object Counter {
    
    inline def apply(counter: Double, result: ArrayBuffer): Counter = {
      val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[Counter]
    }
    
    extension [Self <: Counter](x: Self) {
      
      inline def setCounter(value: Double): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
      
      inline def setResult(value: ArrayBuffer): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  trait HmacHashAlgorithm extends StObject {
    
    var hmacHashAlgorithm: js.UndefOr[String] = js.undefined
    
    var iterationCount: js.UndefOr[Double] = js.undefined
    
    var keyEncryptionAlgorithm: js.UndefOr[typings.std.Algorithm] = js.undefined
    
    var keyEncryptionAlgorithmParams: js.UndefOr[js.Any] = js.undefined
    
    var keyIdentifier: js.UndefOr[ArrayBuffer] = js.undefined
  }
  object HmacHashAlgorithm {
    
    inline def apply(): HmacHashAlgorithm = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HmacHashAlgorithm]
    }
    
    extension [Self <: HmacHashAlgorithm](x: Self) {
      
      inline def setHmacHashAlgorithm(value: String): Self = StObject.set(x, "hmacHashAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setHmacHashAlgorithmUndefined: Self = StObject.set(x, "hmacHashAlgorithm", js.undefined)
      
      inline def setIterationCount(value: Double): Self = StObject.set(x, "iterationCount", value.asInstanceOf[js.Any])
      
      inline def setIterationCountUndefined: Self = StObject.set(x, "iterationCount", js.undefined)
      
      inline def setKeyEncryptionAlgorithm(value: typings.std.Algorithm): Self = StObject.set(x, "keyEncryptionAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setKeyEncryptionAlgorithmParams(value: js.Any): Self = StObject.set(x, "keyEncryptionAlgorithmParams", value.asInstanceOf[js.Any])
      
      inline def setKeyEncryptionAlgorithmParamsUndefined: Self = StObject.set(x, "keyEncryptionAlgorithmParams", js.undefined)
      
      inline def setKeyEncryptionAlgorithmUndefined: Self = StObject.set(x, "keyEncryptionAlgorithm", js.undefined)
      
      inline def setKeyIdentifier(value: ArrayBuffer): Self = StObject.set(x, "keyIdentifier", value.asInstanceOf[js.Any])
      
      inline def setKeyIdentifierUndefined: Self = StObject.set(x, "keyIdentifier", js.undefined)
    }
  }
  
  trait IssuerCertificate extends StObject {
    
    var issuerCertificate: js.UndefOr[default] = js.undefined
    
    var publicKeyInfo: js.UndefOr[typings.pkijs.publicKeyInfoMod.default] = js.undefined
  }
  object IssuerCertificate {
    
    inline def apply(): IssuerCertificate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IssuerCertificate]
    }
    
    extension [Self <: IssuerCertificate](x: Self) {
      
      inline def setIssuerCertificate(value: default): Self = StObject.set(x, "issuerCertificate", value.asInstanceOf[js.Any])
      
      inline def setIssuerCertificateUndefined: Self = StObject.set(x, "issuerCertificate", js.undefined)
      
      inline def setPublicKeyInfo(value: typings.pkijs.publicKeyInfoMod.default): Self = StObject.set(x, "publicKeyInfo", value.asInstanceOf[js.Any])
      
      inline def setPublicKeyInfoUndefined: Self = StObject.set(x, "publicKeyInfo", js.undefined)
    }
  }
  
  trait KdfAlgorithm extends StObject {
    
    var kdfAlgorithm: js.UndefOr[String] = js.undefined
    
    var kekEncryptionLength: js.UndefOr[Double] = js.undefined
    
    var oaepHashAlgorithm: js.UndefOr[String] = js.undefined
  }
  object KdfAlgorithm {
    
    inline def apply(): KdfAlgorithm = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KdfAlgorithm]
    }
    
    extension [Self <: KdfAlgorithm](x: Self) {
      
      inline def setKdfAlgorithm(value: String): Self = StObject.set(x, "kdfAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setKdfAlgorithmUndefined: Self = StObject.set(x, "kdfAlgorithm", js.undefined)
      
      inline def setKekEncryptionLength(value: Double): Self = StObject.set(x, "kekEncryptionLength", value.asInstanceOf[js.Any])
      
      inline def setKekEncryptionLengthUndefined: Self = StObject.set(x, "kekEncryptionLength", js.undefined)
      
      inline def setOaepHashAlgorithm(value: String): Self = StObject.set(x, "oaepHashAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setOaepHashAlgorithmUndefined: Self = StObject.set(x, "oaepHashAlgorithm", js.undefined)
    }
  }
  
  trait Password extends StObject {
    
    var password: String
  }
  object Password {
    
    inline def apply(password: String): Password = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any])
      __obj.asInstanceOf[Password]
    }
    
    extension [Self <: Password](x: Self) {
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    }
  }
  
  trait RecipientCertificate extends StObject {
    
    var recipientCertificate: default
    
    var recipientPrivateKey: ArrayBuffer
  }
  object RecipientCertificate {
    
    inline def apply(recipientCertificate: default, recipientPrivateKey: ArrayBuffer): RecipientCertificate = {
      val __obj = js.Dynamic.literal(recipientCertificate = recipientCertificate.asInstanceOf[js.Any], recipientPrivateKey = recipientPrivateKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecipientCertificate]
    }
    
    extension [Self <: RecipientCertificate](x: Self) {
      
      inline def setRecipientCertificate(value: default): Self = StObject.set(x, "recipientCertificate", value.asInstanceOf[js.Any])
      
      inline def setRecipientPrivateKey(value: ArrayBuffer): Self = StObject.set(x, "recipientPrivateKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait TrustedCerts extends StObject {
    
    var trustedCerts: js.UndefOr[js.Array[default]] = js.undefined
  }
  object TrustedCerts {
    
    inline def apply(): TrustedCerts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrustedCerts]
    }
    
    extension [Self <: TrustedCerts](x: Self) {
      
      inline def setTrustedCerts(value: js.Array[default]): Self = StObject.set(x, "trustedCerts", value.asInstanceOf[js.Any])
      
      inline def setTrustedCertsUndefined: Self = StObject.set(x, "trustedCerts", js.undefined)
      
      inline def setTrustedCertsVarargs(value: default*): Self = StObject.set(x, "trustedCerts", js.Array(value :_*))
    }
  }
}
