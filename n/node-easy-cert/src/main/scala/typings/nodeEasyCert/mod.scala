package typings.nodeEasyCert

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(options: CertManagerOptions): CertManager = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[CertManager]
  
  @JSImport("node-easy-cert", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with CertManager {
    def this(options: CertManagerOptions) = this()
  }
  @JSImport("node-easy-cert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeEasyCert.nodeEasyCertStrings.ROOT_CA_NOT_EXISTS
    - typings.nodeEasyCert.nodeEasyCertStrings.ROOT_CA_EXISTED
    - typings.nodeEasyCert.nodeEasyCertStrings.ROOT_CA_COMMON_NAME_UNSPECIFIED
  */
  trait CertErrors extends StObject
  object CertErrors {
    
    inline def ROOT_CA_COMMON_NAME_UNSPECIFIED: typings.nodeEasyCert.nodeEasyCertStrings.ROOT_CA_COMMON_NAME_UNSPECIFIED = "ROOT_CA_COMMON_NAME_UNSPECIFIED".asInstanceOf[typings.nodeEasyCert.nodeEasyCertStrings.ROOT_CA_COMMON_NAME_UNSPECIFIED]
    
    inline def ROOT_CA_EXISTED: typings.nodeEasyCert.nodeEasyCertStrings.ROOT_CA_EXISTED = "ROOT_CA_EXISTED".asInstanceOf[typings.nodeEasyCert.nodeEasyCertStrings.ROOT_CA_EXISTED]
    
    inline def ROOT_CA_NOT_EXISTS: typings.nodeEasyCert.nodeEasyCertStrings.ROOT_CA_NOT_EXISTS = "ROOT_CA_NOT_EXISTS".asInstanceOf[typings.nodeEasyCert.nodeEasyCertStrings.ROOT_CA_NOT_EXISTS]
  }
  
  @js.native
  trait CertManager extends StObject {
    
    /**
      * Clear all certificates in Root directory.
      *
      * @param callback Optional callback called when all certificates are cleared.
      */
    def clearCerts(): Unit = js.native
    def clearCerts(callback: js.Function0[Any]): Unit = js.native
    
    /**
      * Generates a new Root CA certificate.
      *
      * @param config Configuration for the new Root CA.
      * @param callback Callback called when certificate is ready with key and cert paths.
      */
    def generateRootCA(config: GenerateConfig): Unit = js.native
    def generateRootCA(config: GenerateConfig, callback: GenerateCallback): Unit = js.native
    
    /**
      * Get or create a new Certificate for given hostname.
      *
      * @param hostname Hostname for the new certificate.
      * @param callback Callback called with key and cert content.
      */
    def getCertificate(hostname: String): Unit = js.native
    def getCertificate(hostname: String, callback: GetCertificateCallback): Unit = js.native
    
    /**
      * Get the Root CA file path.
      * If the Root CA file does not exist, returns `""`;
      */
    def getRootCAFilePath(): String = js.native
    
    /**
      * Get the Root directory path.
      * Root directory is the path where certificates are stored.
      */
    def getRootDirPath(): String = js.native
    
    /** Get whether Root CA certificate is trusted on this OS. */
    def ifRootCATrusted(): Boolean = js.native
    
    /** Get whether Root CA file exists. */
    def isRootCAFileExists(): Boolean = js.native
  }
  
  trait CertManagerOptions extends StObject {
    
    /** The default attributes of a generated cert, you can change it here */
    var defaultCertAttrs: js.UndefOr[js.Array[CertificateAttribute]] = js.undefined
    
    /**
      * Path where certificates should be stored.
      * @default "/{USER_HOME}/{.node_easy_certs}/"
      */
    var rootDirPath: js.UndefOr[String] = js.undefined
  }
  object CertManagerOptions {
    
    inline def apply(): CertManagerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CertManagerOptions]
    }
    
    extension [Self <: CertManagerOptions](x: Self) {
      
      inline def setDefaultCertAttrs(value: js.Array[CertificateAttribute]): Self = StObject.set(x, "defaultCertAttrs", value.asInstanceOf[js.Any])
      
      inline def setDefaultCertAttrsUndefined: Self = StObject.set(x, "defaultCertAttrs", js.undefined)
      
      inline def setDefaultCertAttrsVarargs(value: CertificateAttribute*): Self = StObject.set(x, "defaultCertAttrs", js.Array(value*))
      
      inline def setRootDirPath(value: String): Self = StObject.set(x, "rootDirPath", value.asInstanceOf[js.Any])
      
      inline def setRootDirPathUndefined: Self = StObject.set(x, "rootDirPath", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeEasyCert.mod.CertificateAttributeName
    - typings.nodeEasyCert.mod.CertificateAttributeShortName
  */
  trait CertificateAttribute extends StObject
  object CertificateAttribute {
    
    inline def CertificateAttributeName(name: String, value: String): typings.nodeEasyCert.mod.CertificateAttributeName = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nodeEasyCert.mod.CertificateAttributeName]
    }
    
    inline def CertificateAttributeShortName(shortName: String, value: String): typings.nodeEasyCert.mod.CertificateAttributeShortName = {
      val __obj = js.Dynamic.literal(shortName = shortName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nodeEasyCert.mod.CertificateAttributeShortName]
    }
  }
  
  trait CertificateAttributeName
    extends StObject
       with CertificateAttribute {
    
    var name: String
    
    var value: String
  }
  object CertificateAttributeName {
    
    inline def apply(name: String, value: String): CertificateAttributeName = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateAttributeName]
    }
    
    extension [Self <: CertificateAttributeName](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait CertificateAttributeShortName
    extends StObject
       with CertificateAttribute {
    
    var shortName: String
    
    var value: String
  }
  object CertificateAttributeShortName {
    
    inline def apply(shortName: String, value: String): CertificateAttributeShortName = {
      val __obj = js.Dynamic.literal(shortName = shortName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateAttributeShortName]
    }
    
    extension [Self <: CertificateAttributeShortName](x: Self) {
      
      inline def setShortName(value: String): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type GenerateCallback = js.Function3[
    /* err */ js.Error | CertErrors | Null, 
    /* keyPath */ String, 
    /* certPath */ String, 
    Any
  ]
  
  trait GenerateConfig extends StObject {
    
    /** The Common Name for the new certificate. */
    var commonName: String
    
    /**
      * Should overwrite any existing file.
      * @default false
      */
    var overwrite: js.UndefOr[Boolean] = js.undefined
  }
  object GenerateConfig {
    
    inline def apply(commonName: String): GenerateConfig = {
      val __obj = js.Dynamic.literal(commonName = commonName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateConfig]
    }
    
    extension [Self <: GenerateConfig](x: Self) {
      
      inline def setCommonName(value: String): Self = StObject.set(x, "commonName", value.asInstanceOf[js.Any])
      
      inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
    }
  }
  
  type GetCertificateCallback = js.Function3[
    /* err */ js.Error | CertErrors | Null, 
    /* keyContent */ String, 
    /* certContent */ String, 
    Any
  ]
}
