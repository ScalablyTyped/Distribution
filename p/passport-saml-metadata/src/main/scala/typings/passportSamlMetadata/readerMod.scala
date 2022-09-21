package typings.passportSamlMetadata

import org.scalablytyped.runtime.StringDictionary
import typings.passportSamlMetadata.anon.CamelCase
import typings.passportSamlMetadata.anon.PartialMetadataConstructo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readerMod {
  
  @JSImport("passport-saml-metadata/src/reader", "MetadataReader")
  @js.native
  open class MetadataReader protected () extends StObject {
    def this(metadata: String) = this()
    def this(metadata: String, options: PartialMetadataConstructo) = this()
    
    def claimSchema: StringDictionary[CamelCase] = js.native
    
    def encryptionCert: js.UndefOr[String] = js.native
    
    def encryptionCerts: js.Array[String] = js.native
    
    def identifierFormat: js.UndefOr[String] = js.native
    
    def identityProviderUrl: js.UndefOr[String] = js.native
    
    def logoutUrl: js.UndefOr[String] = js.native
    
    def signingCert: js.UndefOr[String] = js.native
    
    def signingCerts: js.Array[String] = js.native
  }
  
  trait MetadataConstructorOptions extends StObject {
    
    var authnRequestBinding: String
    
    var throwExceptions: Boolean
  }
  object MetadataConstructorOptions {
    
    inline def apply(authnRequestBinding: String, throwExceptions: Boolean): MetadataConstructorOptions = {
      val __obj = js.Dynamic.literal(authnRequestBinding = authnRequestBinding.asInstanceOf[js.Any], throwExceptions = throwExceptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetadataConstructorOptions]
    }
    
    extension [Self <: MetadataConstructorOptions](x: Self) {
      
      inline def setAuthnRequestBinding(value: String): Self = StObject.set(x, "authnRequestBinding", value.asInstanceOf[js.Any])
      
      inline def setThrowExceptions(value: Boolean): Self = StObject.set(x, "throwExceptions", value.asInstanceOf[js.Any])
    }
  }
}
