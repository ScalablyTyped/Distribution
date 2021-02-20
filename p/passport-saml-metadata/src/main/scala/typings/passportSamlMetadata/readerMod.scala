package typings.passportSamlMetadata

import org.scalablytyped.runtime.StringDictionary
import typings.passportSamlMetadata.anon.CamelCase
import typings.passportSamlMetadata.anon.PartialMetadataConstructo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readerMod {
  
  @JSImport("passport-saml-metadata/src/reader", "MetadataReader")
  @js.native
  class MetadataReader protected () extends StObject {
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
  
  @js.native
  trait MetadataConstructorOptions extends StObject {
    
    var authnRequestBinding: String = js.native
    
    var throwExceptions: Boolean = js.native
  }
  object MetadataConstructorOptions {
    
    @scala.inline
    def apply(authnRequestBinding: String, throwExceptions: Boolean): MetadataConstructorOptions = {
      val __obj = js.Dynamic.literal(authnRequestBinding = authnRequestBinding.asInstanceOf[js.Any], throwExceptions = throwExceptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetadataConstructorOptions]
    }
    
    @scala.inline
    implicit class MetadataConstructorOptionsMutableBuilder[Self <: MetadataConstructorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthnRequestBinding(value: String): Self = StObject.set(x, "authnRequestBinding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrowExceptions(value: Boolean): Self = StObject.set(x, "throwExceptions", value.asInstanceOf[js.Any])
    }
  }
}
