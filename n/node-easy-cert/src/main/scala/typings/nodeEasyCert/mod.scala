package typings.nodeEasyCert

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-easy-cert", JSImport.Namespace)
  @js.native
  def apply(options: CertManagerOptions): CertManager = js.native
  
  @JSImport("node-easy-cert", JSImport.Namespace)
  @js.native
  class ^ protected () extends CertManager {
    def this(options: CertManagerOptions) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeEasyCert.nodeEasyCertStrings.ROOT_CA_NOT_EXISTS
    - typings.nodeEasyCert.nodeEasyCertStrings.ROOT_CA_EXISTED
    - typings.nodeEasyCert.nodeEasyCertStrings.ROOT_CA_COMMON_NAME_UNSPECIFIED
  */
  trait CertErrors extends StObject
  object CertErrors {
    
    @scala.inline
    def ROOT_CA_COMMON_NAME_UNSPECIFIED: typings.nodeEasyCert.nodeEasyCertStrings.ROOT_CA_COMMON_NAME_UNSPECIFIED = "ROOT_CA_COMMON_NAME_UNSPECIFIED".asInstanceOf[typings.nodeEasyCert.nodeEasyCertStrings.ROOT_CA_COMMON_NAME_UNSPECIFIED]
    
    @scala.inline
    def ROOT_CA_EXISTED: typings.nodeEasyCert.nodeEasyCertStrings.ROOT_CA_EXISTED = "ROOT_CA_EXISTED".asInstanceOf[typings.nodeEasyCert.nodeEasyCertStrings.ROOT_CA_EXISTED]
    
    @scala.inline
    def ROOT_CA_NOT_EXISTS: typings.nodeEasyCert.nodeEasyCertStrings.ROOT_CA_NOT_EXISTS = "ROOT_CA_NOT_EXISTS".asInstanceOf[typings.nodeEasyCert.nodeEasyCertStrings.ROOT_CA_NOT_EXISTS]
  }
  
  @js.native
  trait CertManager extends StObject {
    
    /**
      * Clear all certificates in Root directory.
      *
      * @param callback Optional callback called when all certificates are cleared.
      */
    def clearCerts(): Unit = js.native
    def clearCerts(callback: js.Function0[_]): Unit = js.native
    
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
  
  @js.native
  trait CertManagerOptions extends StObject {
    
    /** The default attributes of a generated cert, you can change it here */
    var defaultCertAttrs: js.UndefOr[js.Array[CertificateAttribute]] = js.native
    
    /**
      * Path where certificates should be stored.
      * @default "/{USER_HOME}/{.node_easy_certs}/"
      */
    var rootDirPath: js.UndefOr[String] = js.native
  }
  object CertManagerOptions {
    
    @scala.inline
    def apply(): CertManagerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CertManagerOptions]
    }
    
    @scala.inline
    implicit class CertManagerOptionsMutableBuilder[Self <: CertManagerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultCertAttrs(value: js.Array[CertificateAttribute]): Self = StObject.set(x, "defaultCertAttrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCertAttrsUndefined: Self = StObject.set(x, "defaultCertAttrs", js.undefined)
      
      @scala.inline
      def setDefaultCertAttrsVarargs(value: CertificateAttribute*): Self = StObject.set(x, "defaultCertAttrs", js.Array(value :_*))
      
      @scala.inline
      def setRootDirPath(value: String): Self = StObject.set(x, "rootDirPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootDirPathUndefined: Self = StObject.set(x, "rootDirPath", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeEasyCert.mod.CertificateAttributeName
    - typings.nodeEasyCert.mod.CertificateAttributeShortName
  */
  trait CertificateAttribute extends StObject
  object CertificateAttribute {
    
    @scala.inline
    def CertificateAttributeName(name: String, value: String): typings.nodeEasyCert.mod.CertificateAttributeName = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nodeEasyCert.mod.CertificateAttributeName]
    }
    
    @scala.inline
    def CertificateAttributeShortName(shortName: String, value: String): typings.nodeEasyCert.mod.CertificateAttributeShortName = {
      val __obj = js.Dynamic.literal(shortName = shortName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.nodeEasyCert.mod.CertificateAttributeShortName]
    }
  }
  
  @js.native
  trait CertificateAttributeName extends CertificateAttribute {
    
    var name: String = js.native
    
    var value: String = js.native
  }
  object CertificateAttributeName {
    
    @scala.inline
    def apply(name: String, value: String): CertificateAttributeName = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateAttributeName]
    }
    
    @scala.inline
    implicit class CertificateAttributeNameMutableBuilder[Self <: CertificateAttributeName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CertificateAttributeShortName extends CertificateAttribute {
    
    var shortName: String = js.native
    
    var value: String = js.native
  }
  object CertificateAttributeShortName {
    
    @scala.inline
    def apply(shortName: String, value: String): CertificateAttributeShortName = {
      val __obj = js.Dynamic.literal(shortName = shortName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificateAttributeShortName]
    }
    
    @scala.inline
    implicit class CertificateAttributeShortNameMutableBuilder[Self <: CertificateAttributeShortName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShortName(value: String): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type GenerateCallback = js.Function3[
    /* err */ Error | CertErrors | Null, 
    /* keyPath */ String, 
    /* certPath */ String, 
    js.Any
  ]
  
  @js.native
  trait GenerateConfig extends StObject {
    
    /** The Common Name for the new certificate. */
    var commonName: String = js.native
    
    /**
      * Should overwrite any existing file.
      * @default false
      */
    var overwrite: js.UndefOr[Boolean] = js.native
  }
  object GenerateConfig {
    
    @scala.inline
    def apply(commonName: String): GenerateConfig = {
      val __obj = js.Dynamic.literal(commonName = commonName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateConfig]
    }
    
    @scala.inline
    implicit class GenerateConfigMutableBuilder[Self <: GenerateConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommonName(value: String): Self = StObject.set(x, "commonName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
    }
  }
  
  type GetCertificateCallback = js.Function3[
    /* err */ Error | CertErrors | Null, 
    /* keyContent */ String, 
    /* certContent */ String, 
    js.Any
  ]
}
