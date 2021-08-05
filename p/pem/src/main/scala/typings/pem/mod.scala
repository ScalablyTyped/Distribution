package typings.pem

import typings.node.Buffer
import typings.pem.anon.ClientKey
import typings.pem.anon.Dhparam
import typings.pem.anon.Fingerprint
import typings.pem.anon.Key
import typings.pem.anon.Modulus
import typings.pem.anon.Pkcs12
import typings.pem.anon.Prime
import typings.pem.anon.PublicKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def config(options: ModuleConfiguration): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def createCSR(callback: Callback[ClientKey]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createCSR")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def createCSR(options: CSRCreationOptions, callback: Callback[ClientKey]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createCSR")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createCertificate(callback: Callback[CertificateCreationResult]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createCertificate")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def createCertificate(options: CertificateCreationOptions, callback: Callback[CertificateCreationResult]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createCertificate")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createDhparam(callback: Callback[Dhparam]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createDhparam")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def createDhparam(keyBitsize: Double, callback: Callback[Dhparam]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createDhparam")(keyBitsize.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createPkcs12(key: String, certificate: String, password: String, callback: Callback[Pkcs12]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createPkcs12")(key.asInstanceOf[js.Any], certificate.asInstanceOf[js.Any], password.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createPkcs12(
    key: String,
    certificate: String,
    password: String,
    options: Pkcs12CreationOptions,
    callback: Callback[Pkcs12]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createPkcs12")(key.asInstanceOf[js.Any], certificate.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createPrivateKey(callback: Callback[Key]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createPrivateKey")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def createPrivateKey(keyBitsize: Double, options: PrivateKeyCreationOptions, callback: Callback[Key]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createPrivateKey")(keyBitsize.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createPrivateKey(optionsOrKeyBitsize: Double, callback: Callback[Key]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createPrivateKey")(optionsOrKeyBitsize.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createPrivateKey(optionsOrKeyBitsize: PrivateKeyCreationOptions, callback: Callback[Key]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createPrivateKey")(optionsOrKeyBitsize.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getDhparamInfo(dh: String, callback: Callback[Prime]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getDhparamInfo")(dh.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getFingerprint(callback: Callback[Fingerprint]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getFingerprint")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def getFingerprint(certificate: String, callback: Callback[Fingerprint]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getFingerprint")(certificate.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def getFingerprint(certificate: String, hash: HashFunction, callback: Callback[Fingerprint]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getFingerprint")(certificate.asInstanceOf[js.Any], hash.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getModulus(certificate: String, callback: Callback[Modulus]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getModulus")(certificate.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def getModulus(certificate: String, password: String, callback: Callback[Modulus]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getModulus")(certificate.asInstanceOf[js.Any], password.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getPublicKey(callback: Callback[PublicKey]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getPublicKey")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def getPublicKey(certificate: String, callback: Callback[PublicKey]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getPublicKey")(certificate.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def readCertificateInfo(callback: Callback[CertificateSubjectReadResult]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("readCertificateInfo")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def readCertificateInfo(certificate: String, callback: Callback[CertificateSubjectReadResult]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readCertificateInfo")(certificate.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def readPkcs12(bufferOrPath: String, callback: Callback[Pkcs12ReadResult]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("readPkcs12")(bufferOrPath.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def readPkcs12(bufferOrPath: String, options: Pkcs12ReadOptions, callback: Callback[Pkcs12ReadResult]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("readPkcs12")(bufferOrPath.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def readPkcs12(bufferOrPath: Buffer, callback: Callback[Pkcs12ReadResult]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("readPkcs12")(bufferOrPath.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def readPkcs12(bufferOrPath: Buffer, options: Pkcs12ReadOptions, callback: Callback[Pkcs12ReadResult]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("readPkcs12")(bufferOrPath.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def verifySigningChain(certificate: String, ca: js.Array[String], callback: Callback[Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verifySigningChain")(certificate.asInstanceOf[js.Any], ca.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait CSRCreationOptions extends StObject {
    
    /**
      * A list of subjectAltNames in the subjectAltName field
      */
    var altNames: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      *  Optional client key to use
      */
    var clientKey: js.UndefOr[String] = js.undefined
    
    var clientKeyPassword: js.UndefOr[String] = js.undefined
    
    /**
      * CSR common name field, defaults to 'localhost'
      */
    var commonName: js.UndefOr[String] = js.undefined
    
    /**
      * CSR country field
      */
    var country: js.UndefOr[String] = js.undefined
    
    /**
      * CSR config file
      */
    var csrConfigFile: js.UndefOr[String] = js.undefined
    
    /**
      * CSR email address field
      */
    var emailAddress: js.UndefOr[String] = js.undefined
    
    /**
      * Hash function to use, defaults to sha256
      */
    var hash: js.UndefOr[HashFunction] = js.undefined
    
    /**
      * If clientKey is undefined, bit size to use for generating a new key (defaults to 2048)
      */
    var keyBitsize: js.UndefOr[Double] = js.undefined
    
    /**
      * CSR locality field
      */
    var locality: js.UndefOr[String] = js.undefined
    
    /**
      * CSR organization field
      */
    var organization: js.UndefOr[String] = js.undefined
    
    /**
      * CSR organizational unit field
      */
    var organizationUnit: js.UndefOr[String] = js.undefined
    
    /**
      * CSR state field
      */
    var state: js.UndefOr[String] = js.undefined
  }
  object CSRCreationOptions {
    
    inline def apply(): CSRCreationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CSRCreationOptions]
    }
    
    extension [Self <: CSRCreationOptions](x: Self) {
      
      inline def setAltNames(value: js.Array[String]): Self = StObject.set(x, "altNames", value.asInstanceOf[js.Any])
      
      inline def setAltNamesUndefined: Self = StObject.set(x, "altNames", js.undefined)
      
      inline def setAltNamesVarargs(value: String*): Self = StObject.set(x, "altNames", js.Array(value :_*))
      
      inline def setClientKey(value: String): Self = StObject.set(x, "clientKey", value.asInstanceOf[js.Any])
      
      inline def setClientKeyPassword(value: String): Self = StObject.set(x, "clientKeyPassword", value.asInstanceOf[js.Any])
      
      inline def setClientKeyPasswordUndefined: Self = StObject.set(x, "clientKeyPassword", js.undefined)
      
      inline def setClientKeyUndefined: Self = StObject.set(x, "clientKey", js.undefined)
      
      inline def setCommonName(value: String): Self = StObject.set(x, "commonName", value.asInstanceOf[js.Any])
      
      inline def setCommonNameUndefined: Self = StObject.set(x, "commonName", js.undefined)
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      inline def setCsrConfigFile(value: String): Self = StObject.set(x, "csrConfigFile", value.asInstanceOf[js.Any])
      
      inline def setCsrConfigFileUndefined: Self = StObject.set(x, "csrConfigFile", js.undefined)
      
      inline def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
      
      inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
      
      inline def setHash(value: HashFunction): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setKeyBitsize(value: Double): Self = StObject.set(x, "keyBitsize", value.asInstanceOf[js.Any])
      
      inline def setKeyBitsizeUndefined: Self = StObject.set(x, "keyBitsize", js.undefined)
      
      inline def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
      
      inline def setLocalityUndefined: Self = StObject.set(x, "locality", js.undefined)
      
      inline def setOrganization(value: String): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
      
      inline def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
      
      inline def setOrganizationUnit(value: String): Self = StObject.set(x, "organizationUnit", value.asInstanceOf[js.Any])
      
      inline def setOrganizationUnitUndefined: Self = StObject.set(x, "organizationUnit", js.undefined)
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  type Callback[T] = js.Function2[/* error */ js.Any, /* result */ T, js.Any]
  
  trait CertificateCreationOptions
    extends StObject
       with CSRCreationOptions {
    
    /**
      * extension config file - with '-extensions v3_req'
      */
    var config: js.UndefOr[String] = js.undefined
    
    /**
      * CSR for the certificate, if not defined a new one is generated from the provided parameters
      */
    var csr: js.UndefOr[String] = js.undefined
    
    /**
      * Certificate expire time in days, defaults to 365
      */
    var days: js.UndefOr[Double] = js.undefined
    
    /**
      * extension config file - without '-extensions v3_req'
      */
    var extFile: js.UndefOr[String] = js.undefined
    
    /**
      * If set to true and serviceKey is not defined, use clientKey for signing
      */
    var selfSigned: js.UndefOr[Boolean] = js.undefined
    
    var serial: js.UndefOr[js.Any] = js.undefined
    
    var serviceCertificate: js.UndefOr[js.Any] = js.undefined
    
    /**
      * Private key for signing the certificate, if not defined a new one is generated
      */
    var serviceKey: js.UndefOr[String] = js.undefined
    
    /**
      * Password of the service key
      */
    var serviceKeyPassword: js.UndefOr[String] = js.undefined
  }
  object CertificateCreationOptions {
    
    inline def apply(): CertificateCreationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CertificateCreationOptions]
    }
    
    extension [Self <: CertificateCreationOptions](x: Self) {
      
      inline def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setCsr(value: String): Self = StObject.set(x, "csr", value.asInstanceOf[js.Any])
      
      inline def setCsrUndefined: Self = StObject.set(x, "csr", js.undefined)
      
      inline def setDays(value: Double): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
      
      inline def setDaysUndefined: Self = StObject.set(x, "days", js.undefined)
      
      inline def setExtFile(value: String): Self = StObject.set(x, "extFile", value.asInstanceOf[js.Any])
      
      inline def setExtFileUndefined: Self = StObject.set(x, "extFile", js.undefined)
      
      inline def setSelfSigned(value: Boolean): Self = StObject.set(x, "selfSigned", value.asInstanceOf[js.Any])
      
      inline def setSelfSignedUndefined: Self = StObject.set(x, "selfSigned", js.undefined)
      
      inline def setSerial(value: js.Any): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
      
      inline def setSerialUndefined: Self = StObject.set(x, "serial", js.undefined)
      
      inline def setServiceCertificate(value: js.Any): Self = StObject.set(x, "serviceCertificate", value.asInstanceOf[js.Any])
      
      inline def setServiceCertificateUndefined: Self = StObject.set(x, "serviceCertificate", js.undefined)
      
      inline def setServiceKey(value: String): Self = StObject.set(x, "serviceKey", value.asInstanceOf[js.Any])
      
      inline def setServiceKeyPassword(value: String): Self = StObject.set(x, "serviceKeyPassword", value.asInstanceOf[js.Any])
      
      inline def setServiceKeyPasswordUndefined: Self = StObject.set(x, "serviceKeyPassword", js.undefined)
      
      inline def setServiceKeyUndefined: Self = StObject.set(x, "serviceKey", js.undefined)
    }
  }
  
  trait CertificateCreationResult extends StObject {
    
    var certificate: js.Any
    
    var clientKey: String
    
    var csr: String
    
    var serviceKey: String
  }
  object CertificateCreationResult {
    
    inline def apply(certificate: js.Any, clientKey: String, csr: String, serviceKey: String): CertificateCreationResult = {
      val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], clientKey = clientKey.asInstanceOf[js.Any], csr = csr.asInstanceOf[js.Any], serviceKey = serviceKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateCreationResult]
    }
    
    extension [Self <: CertificateCreationResult](x: Self) {
      
      inline def setCertificate(value: js.Any): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
      
      inline def setClientKey(value: String): Self = StObject.set(x, "clientKey", value.asInstanceOf[js.Any])
      
      inline def setCsr(value: String): Self = StObject.set(x, "csr", value.asInstanceOf[js.Any])
      
      inline def setServiceKey(value: String): Self = StObject.set(x, "serviceKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait CertificateSubjectReadResult extends StObject {
    
    var commonName: String
    
    var country: String
    
    var emailAddress: String
    
    var locality: String
    
    var organization: String
    
    var organizationUnit: String
    
    var state: String
  }
  object CertificateSubjectReadResult {
    
    inline def apply(
      commonName: String,
      country: String,
      emailAddress: String,
      locality: String,
      organization: String,
      organizationUnit: String,
      state: String
    ): CertificateSubjectReadResult = {
      val __obj = js.Dynamic.literal(commonName = commonName.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], emailAddress = emailAddress.asInstanceOf[js.Any], locality = locality.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], organizationUnit = organizationUnit.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateSubjectReadResult]
    }
    
    extension [Self <: CertificateSubjectReadResult](x: Self) {
      
      inline def setCommonName(value: String): Self = StObject.set(x, "commonName", value.asInstanceOf[js.Any])
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
      
      inline def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
      
      inline def setOrganization(value: String): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
      
      inline def setOrganizationUnit(value: String): Self = StObject.set(x, "organizationUnit", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pem.pemStrings.md5
    - typings.pem.pemStrings.sha1
    - typings.pem.pemStrings.sha256
    - java.lang.String
  */
  type HashFunction = _HashFunction | String
  
  trait ModuleConfiguration extends StObject {
    
    /**
      * Path to OpenSSL binaries
      */
    var pathOpenSSL: String
  }
  object ModuleConfiguration {
    
    inline def apply(pathOpenSSL: String): ModuleConfiguration = {
      val __obj = js.Dynamic.literal(pathOpenSSL = pathOpenSSL.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleConfiguration]
    }
    
    extension [Self <: ModuleConfiguration](x: Self) {
      
      inline def setPathOpenSSL(value: String): Self = StObject.set(x, "pathOpenSSL", value.asInstanceOf[js.Any])
    }
  }
  
  trait Pkcs12CreationOptions extends StObject {
    
    var certFiles: js.UndefOr[js.Array[String]] = js.undefined
    
    var cipher: js.UndefOr[PrivateKeyCipher] = js.undefined
    
    var clientKeyPassword: js.UndefOr[String] = js.undefined
  }
  object Pkcs12CreationOptions {
    
    inline def apply(): Pkcs12CreationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Pkcs12CreationOptions]
    }
    
    extension [Self <: Pkcs12CreationOptions](x: Self) {
      
      inline def setCertFiles(value: js.Array[String]): Self = StObject.set(x, "certFiles", value.asInstanceOf[js.Any])
      
      inline def setCertFilesUndefined: Self = StObject.set(x, "certFiles", js.undefined)
      
      inline def setCertFilesVarargs(value: String*): Self = StObject.set(x, "certFiles", js.Array(value :_*))
      
      inline def setCipher(value: PrivateKeyCipher): Self = StObject.set(x, "cipher", value.asInstanceOf[js.Any])
      
      inline def setCipherUndefined: Self = StObject.set(x, "cipher", js.undefined)
      
      inline def setClientKeyPassword(value: String): Self = StObject.set(x, "clientKeyPassword", value.asInstanceOf[js.Any])
      
      inline def setClientKeyPasswordUndefined: Self = StObject.set(x, "clientKeyPassword", js.undefined)
    }
  }
  
  trait Pkcs12ReadOptions extends StObject {
    
    var clientKeyPassword: js.UndefOr[String] = js.undefined
    
    var p12Password: js.UndefOr[String] = js.undefined
  }
  object Pkcs12ReadOptions {
    
    inline def apply(): Pkcs12ReadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Pkcs12ReadOptions]
    }
    
    extension [Self <: Pkcs12ReadOptions](x: Self) {
      
      inline def setClientKeyPassword(value: String): Self = StObject.set(x, "clientKeyPassword", value.asInstanceOf[js.Any])
      
      inline def setClientKeyPasswordUndefined: Self = StObject.set(x, "clientKeyPassword", js.undefined)
      
      inline def setP12Password(value: String): Self = StObject.set(x, "p12Password", value.asInstanceOf[js.Any])
      
      inline def setP12PasswordUndefined: Self = StObject.set(x, "p12Password", js.undefined)
    }
  }
  
  trait Pkcs12ReadResult extends StObject {
    
    var ca: js.Array[String]
    
    var cert: String
    
    var key: String
  }
  object Pkcs12ReadResult {
    
    inline def apply(ca: js.Array[String], cert: String, key: String): Pkcs12ReadResult = {
      val __obj = js.Dynamic.literal(ca = ca.asInstanceOf[js.Any], cert = cert.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pkcs12ReadResult]
    }
    
    extension [Self <: Pkcs12ReadResult](x: Self) {
      
      inline def setCa(value: js.Array[String]): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setCaVarargs(value: String*): Self = StObject.set(x, "ca", js.Array(value :_*))
      
      inline def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pem.pemStrings.aes128
    - typings.pem.pemStrings.aes192
    - typings.pem.pemStrings.aes256
    - typings.pem.pemStrings.camellia128
    - typings.pem.pemStrings.camellia192
    - typings.pem.pemStrings.camellia256
    - typings.pem.pemStrings.des
    - typings.pem.pemStrings.des3
    - typings.pem.pemStrings.idea
    - java.lang.String
  */
  type PrivateKeyCipher = _PrivateKeyCipher | String
  
  trait PrivateKeyCreationOptions extends StObject {
    
    var cipher: PrivateKeyCipher
    
    var password: String
  }
  object PrivateKeyCreationOptions {
    
    inline def apply(cipher: PrivateKeyCipher, password: String): PrivateKeyCreationOptions = {
      val __obj = js.Dynamic.literal(cipher = cipher.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrivateKeyCreationOptions]
    }
    
    extension [Self <: PrivateKeyCreationOptions](x: Self) {
      
      inline def setCipher(value: PrivateKeyCipher): Self = StObject.set(x, "cipher", value.asInstanceOf[js.Any])
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    }
  }
  
  trait _HashFunction extends StObject
  
  trait _PrivateKeyCipher extends StObject
}
