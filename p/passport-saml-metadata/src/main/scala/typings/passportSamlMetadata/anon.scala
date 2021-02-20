package typings.passportSamlMetadata

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait CamelCase extends StObject {
    
    var camelCase: String = js.native
    
    var description: String = js.native
    
    var name: String = js.native
  }
  object CamelCase {
    
    @scala.inline
    def apply(camelCase: String, description: String, name: String): CamelCase = {
      val __obj = js.Dynamic.literal(camelCase = camelCase.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CamelCase]
    }
    
    @scala.inline
    implicit class CamelCaseMutableBuilder[Self <: CamelCase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCamelCase(value: String): Self = StObject.set(x, "camelCase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Data extends StObject {
    
    var data: String = js.native
  }
  object Data {
    
    @scala.inline
    def apply(data: String): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Get extends StObject {
    
    def get(url: String): js.Promise[Data] = js.native
    def get(url: String, params: PartialFetchAxiosConfig): js.Promise[Data] = js.native
  }
  
  @js.native
  trait MultipleCerts extends StObject {
    
    var multipleCerts: Boolean = js.native
  }
  object MultipleCerts {
    
    @scala.inline
    def apply(multipleCerts: Boolean): MultipleCerts = {
      val __obj = js.Dynamic.literal(multipleCerts = multipleCerts.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultipleCerts]
    }
    
    @scala.inline
    implicit class MultipleCertsMutableBuilder[Self <: MultipleCerts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMultipleCerts(value: Boolean): Self = StObject.set(x, "multipleCerts", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<passport-saml-metadata.passport-saml-metadata/src/fetch.FetchAxiosConfig> */
  @js.native
  trait PartialFetchAxiosConfig extends StObject {
    
    var backupStore: js.UndefOr[Map[String, String]] = js.native
    
    var responseType: js.UndefOr[String] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object PartialFetchAxiosConfig {
    
    @scala.inline
    def apply(): PartialFetchAxiosConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialFetchAxiosConfig]
    }
    
    @scala.inline
    implicit class PartialFetchAxiosConfigMutableBuilder[Self <: PartialFetchAxiosConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackupStore(value: Map[String, String]): Self = StObject.set(x, "backupStore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupStoreUndefined: Self = StObject.set(x, "backupStore", js.undefined)
      
      @scala.inline
      def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  /* Inlined std.Partial<passport-saml-metadata.passport-saml-metadata/src/reader.MetadataConstructorOptions> */
  @js.native
  trait PartialMetadataConstructo extends StObject {
    
    var authnRequestBinding: js.UndefOr[String] = js.native
    
    var throwExceptions: js.UndefOr[Boolean] = js.native
  }
  object PartialMetadataConstructo {
    
    @scala.inline
    def apply(): PartialMetadataConstructo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMetadataConstructo]
    }
    
    @scala.inline
    implicit class PartialMetadataConstructoMutableBuilder[Self <: PartialMetadataConstructo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthnRequestBinding(value: String): Self = StObject.set(x, "authnRequestBinding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthnRequestBindingUndefined: Self = StObject.set(x, "authnRequestBinding", js.undefined)
      
      @scala.inline
      def setThrowExceptions(value: Boolean): Self = StObject.set(x, "throwExceptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrowExceptionsUndefined: Self = StObject.set(x, "throwExceptions", js.undefined)
    }
  }
}
