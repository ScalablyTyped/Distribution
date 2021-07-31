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
  
  @scala.inline
  def config(options: ModuleConfiguration): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def createCSR(callback: Callback[ClientKey]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createCSR")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def createCSR(options: CSRCreationOptions, callback: Callback[ClientKey]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createCSR")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def createCertificate(callback: Callback[CertificateCreationResult]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createCertificate")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def createCertificate(options: CertificateCreationOptions, callback: Callback[CertificateCreationResult]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createCertificate")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def createDhparam(callback: Callback[Dhparam]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createDhparam")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def createDhparam(keyBitsize: Double, callback: Callback[Dhparam]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createDhparam")(keyBitsize.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def createPkcs12(key: String, certificate: String, password: String, callback: Callback[Pkcs12]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createPkcs12")(key.asInstanceOf[js.Any], certificate.asInstanceOf[js.Any], password.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def createPkcs12(
    key: String,
    certificate: String,
    password: String,
    options: Pkcs12CreationOptions,
    callback: Callback[Pkcs12]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createPkcs12")(key.asInstanceOf[js.Any], certificate.asInstanceOf[js.Any], password.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def createPrivateKey(callback: Callback[Key]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createPrivateKey")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def createPrivateKey(keyBitsize: Double, options: PrivateKeyCreationOptions, callback: Callback[Key]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createPrivateKey")(keyBitsize.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def createPrivateKey(optionsOrKeyBitsize: Double, callback: Callback[Key]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createPrivateKey")(optionsOrKeyBitsize.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def createPrivateKey(optionsOrKeyBitsize: PrivateKeyCreationOptions, callback: Callback[Key]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createPrivateKey")(optionsOrKeyBitsize.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def getDhparamInfo(dh: String, callback: Callback[Prime]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getDhparamInfo")(dh.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def getFingerprint(callback: Callback[Fingerprint]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getFingerprint")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def getFingerprint(certificate: String, callback: Callback[Fingerprint]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getFingerprint")(certificate.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def getFingerprint(certificate: String, hash: HashFunction, callback: Callback[Fingerprint]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getFingerprint")(certificate.asInstanceOf[js.Any], hash.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def getModulus(certificate: String, callback: Callback[Modulus]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getModulus")(certificate.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def getModulus(certificate: String, password: String, callback: Callback[Modulus]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getModulus")(certificate.asInstanceOf[js.Any], password.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def getPublicKey(callback: Callback[PublicKey]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getPublicKey")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def getPublicKey(certificate: String, callback: Callback[PublicKey]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getPublicKey")(certificate.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def readCertificateInfo(callback: Callback[CertificateSubjectReadResult]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("readCertificateInfo")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def readCertificateInfo(certificate: String, callback: Callback[CertificateSubjectReadResult]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readCertificateInfo")(certificate.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def readPkcs12(bufferOrPath: String, callback: Callback[Pkcs12ReadResult]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("readPkcs12")(bufferOrPath.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def readPkcs12(bufferOrPath: String, options: Pkcs12ReadOptions, callback: Callback[Pkcs12ReadResult]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("readPkcs12")(bufferOrPath.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def readPkcs12(bufferOrPath: Buffer, callback: Callback[Pkcs12ReadResult]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("readPkcs12")(bufferOrPath.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def readPkcs12(bufferOrPath: Buffer, options: Pkcs12ReadOptions, callback: Callback[Pkcs12ReadResult]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("readPkcs12")(bufferOrPath.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def verifySigningChain(certificate: String, ca: js.Array[String], callback: Callback[Boolean]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verifySigningChain")(certificate.asInstanceOf[js.Any], ca.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
    
    @scala.inline
    def apply(): CSRCreationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CSRCreationOptions]
    }
    
    @scala.inline
    implicit class CSRCreationOptionsMutableBuilder[Self <: CSRCreationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAltNames(value: js.Array[String]): Self = StObject.set(x, "altNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltNamesUndefined: Self = StObject.set(x, "altNames", js.undefined)
      
      @scala.inline
      def setAltNamesVarargs(value: String*): Self = StObject.set(x, "altNames", js.Array(value :_*))
      
      @scala.inline
      def setClientKey(value: String): Self = StObject.set(x, "clientKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientKeyPassword(value: String): Self = StObject.set(x, "clientKeyPassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientKeyPasswordUndefined: Self = StObject.set(x, "clientKeyPassword", js.undefined)
      
      @scala.inline
      def setClientKeyUndefined: Self = StObject.set(x, "clientKey", js.undefined)
      
      @scala.inline
      def setCommonName(value: String): Self = StObject.set(x, "commonName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommonNameUndefined: Self = StObject.set(x, "commonName", js.undefined)
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
      
      @scala.inline
      def setCsrConfigFile(value: String): Self = StObject.set(x, "csrConfigFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCsrConfigFileUndefined: Self = StObject.set(x, "csrConfigFile", js.undefined)
      
      @scala.inline
      def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
      
      @scala.inline
      def setHash(value: HashFunction): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      @scala.inline
      def setKeyBitsize(value: Double): Self = StObject.set(x, "keyBitsize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyBitsizeUndefined: Self = StObject.set(x, "keyBitsize", js.undefined)
      
      @scala.inline
      def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalityUndefined: Self = StObject.set(x, "locality", js.undefined)
      
      @scala.inline
      def setOrganization(value: String): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrganizationUndefined: Self = StObject.set(x, "organization", js.undefined)
      
      @scala.inline
      def setOrganizationUnit(value: String): Self = StObject.set(x, "organizationUnit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrganizationUnitUndefined: Self = StObject.set(x, "organizationUnit", js.undefined)
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
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
    
    @scala.inline
    def apply(): CertificateCreationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CertificateCreationOptions]
    }
    
    @scala.inline
    implicit class CertificateCreationOptionsMutableBuilder[Self <: CertificateCreationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setCsr(value: String): Self = StObject.set(x, "csr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCsrUndefined: Self = StObject.set(x, "csr", js.undefined)
      
      @scala.inline
      def setDays(value: Double): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDaysUndefined: Self = StObject.set(x, "days", js.undefined)
      
      @scala.inline
      def setExtFile(value: String): Self = StObject.set(x, "extFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtFileUndefined: Self = StObject.set(x, "extFile", js.undefined)
      
      @scala.inline
      def setSelfSigned(value: Boolean): Self = StObject.set(x, "selfSigned", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelfSignedUndefined: Self = StObject.set(x, "selfSigned", js.undefined)
      
      @scala.inline
      def setSerial(value: js.Any): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerialUndefined: Self = StObject.set(x, "serial", js.undefined)
      
      @scala.inline
      def setServiceCertificate(value: js.Any): Self = StObject.set(x, "serviceCertificate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceCertificateUndefined: Self = StObject.set(x, "serviceCertificate", js.undefined)
      
      @scala.inline
      def setServiceKey(value: String): Self = StObject.set(x, "serviceKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceKeyPassword(value: String): Self = StObject.set(x, "serviceKeyPassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceKeyPasswordUndefined: Self = StObject.set(x, "serviceKeyPassword", js.undefined)
      
      @scala.inline
      def setServiceKeyUndefined: Self = StObject.set(x, "serviceKey", js.undefined)
    }
  }
  
  trait CertificateCreationResult extends StObject {
    
    var certificate: js.Any
    
    var clientKey: String
    
    var csr: String
    
    var serviceKey: String
  }
  object CertificateCreationResult {
    
    @scala.inline
    def apply(certificate: js.Any, clientKey: String, csr: String, serviceKey: String): CertificateCreationResult = {
      val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], clientKey = clientKey.asInstanceOf[js.Any], csr = csr.asInstanceOf[js.Any], serviceKey = serviceKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateCreationResult]
    }
    
    @scala.inline
    implicit class CertificateCreationResultMutableBuilder[Self <: CertificateCreationResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCertificate(value: js.Any): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientKey(value: String): Self = StObject.set(x, "clientKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCsr(value: String): Self = StObject.set(x, "csr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceKey(value: String): Self = StObject.set(x, "serviceKey", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class CertificateSubjectReadResultMutableBuilder[Self <: CertificateSubjectReadResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommonName(value: String): Self = StObject.set(x, "commonName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrganization(value: String): Self = StObject.set(x, "organization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrganizationUnit(value: String): Self = StObject.set(x, "organizationUnit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(pathOpenSSL: String): ModuleConfiguration = {
      val __obj = js.Dynamic.literal(pathOpenSSL = pathOpenSSL.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleConfiguration]
    }
    
    @scala.inline
    implicit class ModuleConfigurationMutableBuilder[Self <: ModuleConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPathOpenSSL(value: String): Self = StObject.set(x, "pathOpenSSL", value.asInstanceOf[js.Any])
    }
  }
  
  trait Pkcs12CreationOptions extends StObject {
    
    var certFiles: js.UndefOr[js.Array[String]] = js.undefined
    
    var cipher: js.UndefOr[PrivateKeyCipher] = js.undefined
    
    var clientKeyPassword: js.UndefOr[String] = js.undefined
  }
  object Pkcs12CreationOptions {
    
    @scala.inline
    def apply(): Pkcs12CreationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Pkcs12CreationOptions]
    }
    
    @scala.inline
    implicit class Pkcs12CreationOptionsMutableBuilder[Self <: Pkcs12CreationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCertFiles(value: js.Array[String]): Self = StObject.set(x, "certFiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertFilesUndefined: Self = StObject.set(x, "certFiles", js.undefined)
      
      @scala.inline
      def setCertFilesVarargs(value: String*): Self = StObject.set(x, "certFiles", js.Array(value :_*))
      
      @scala.inline
      def setCipher(value: PrivateKeyCipher): Self = StObject.set(x, "cipher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCipherUndefined: Self = StObject.set(x, "cipher", js.undefined)
      
      @scala.inline
      def setClientKeyPassword(value: String): Self = StObject.set(x, "clientKeyPassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientKeyPasswordUndefined: Self = StObject.set(x, "clientKeyPassword", js.undefined)
    }
  }
  
  trait Pkcs12ReadOptions extends StObject {
    
    var clientKeyPassword: js.UndefOr[String] = js.undefined
    
    var p12Password: js.UndefOr[String] = js.undefined
  }
  object Pkcs12ReadOptions {
    
    @scala.inline
    def apply(): Pkcs12ReadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Pkcs12ReadOptions]
    }
    
    @scala.inline
    implicit class Pkcs12ReadOptionsMutableBuilder[Self <: Pkcs12ReadOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientKeyPassword(value: String): Self = StObject.set(x, "clientKeyPassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientKeyPasswordUndefined: Self = StObject.set(x, "clientKeyPassword", js.undefined)
      
      @scala.inline
      def setP12Password(value: String): Self = StObject.set(x, "p12Password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP12PasswordUndefined: Self = StObject.set(x, "p12Password", js.undefined)
    }
  }
  
  trait Pkcs12ReadResult extends StObject {
    
    var ca: js.Array[String]
    
    var cert: String
    
    var key: String
  }
  object Pkcs12ReadResult {
    
    @scala.inline
    def apply(ca: js.Array[String], cert: String, key: String): Pkcs12ReadResult = {
      val __obj = js.Dynamic.literal(ca = ca.asInstanceOf[js.Any], cert = cert.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pkcs12ReadResult]
    }
    
    @scala.inline
    implicit class Pkcs12ReadResultMutableBuilder[Self <: Pkcs12ReadResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCa(value: js.Array[String]): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaVarargs(value: String*): Self = StObject.set(x, "ca", js.Array(value :_*))
      
      @scala.inline
      def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(cipher: PrivateKeyCipher, password: String): PrivateKeyCreationOptions = {
      val __obj = js.Dynamic.literal(cipher = cipher.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
      __obj.asInstanceOf[PrivateKeyCreationOptions]
    }
    
    @scala.inline
    implicit class PrivateKeyCreationOptionsMutableBuilder[Self <: PrivateKeyCreationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCipher(value: PrivateKeyCipher): Self = StObject.set(x, "cipher", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    }
  }
  
  trait _HashFunction extends StObject
  
  trait _PrivateKeyCipher extends StObject
}
