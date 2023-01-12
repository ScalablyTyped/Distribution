package typings.passportSamlMetadata

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CamelCase extends StObject {
    
    var camelCase: String
    
    var description: String
    
    var name: String
  }
  object CamelCase {
    
    inline def apply(camelCase: String, description: String, name: String): CamelCase = {
      val __obj = js.Dynamic.literal(camelCase = camelCase.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CamelCase]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CamelCase] (val x: Self) extends AnyVal {
      
      inline def setCamelCase(value: String): Self = StObject.set(x, "camelCase", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var data: String
  }
  object Data {
    
    inline def apply(data: String): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Get extends StObject {
    
    def get(url: String): js.Promise[Data] = js.native
    def get(url: String, params: PartialFetchAxiosConfig): js.Promise[Data] = js.native
  }
  
  trait MultipleCerts extends StObject {
    
    var multipleCerts: Boolean
  }
  object MultipleCerts {
    
    inline def apply(multipleCerts: Boolean): MultipleCerts = {
      val __obj = js.Dynamic.literal(multipleCerts = multipleCerts.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultipleCerts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultipleCerts] (val x: Self) extends AnyVal {
      
      inline def setMultipleCerts(value: Boolean): Self = StObject.set(x, "multipleCerts", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<passport-saml-metadata.passport-saml-metadata/src/fetch.FetchAxiosConfig> */
  trait PartialFetchAxiosConfig extends StObject {
    
    var backupStore: js.UndefOr[Map[String, String]] = js.undefined
    
    var responseType: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object PartialFetchAxiosConfig {
    
    inline def apply(): PartialFetchAxiosConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialFetchAxiosConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialFetchAxiosConfig] (val x: Self) extends AnyVal {
      
      inline def setBackupStore(value: Map[String, String]): Self = StObject.set(x, "backupStore", value.asInstanceOf[js.Any])
      
      inline def setBackupStoreUndefined: Self = StObject.set(x, "backupStore", js.undefined)
      
      inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  /* Inlined std.Partial<passport-saml-metadata.passport-saml-metadata/src/reader.MetadataConstructorOptions> */
  trait PartialMetadataConstructo extends StObject {
    
    var authnRequestBinding: js.UndefOr[String] = js.undefined
    
    var throwExceptions: js.UndefOr[Boolean] = js.undefined
  }
  object PartialMetadataConstructo {
    
    inline def apply(): PartialMetadataConstructo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMetadataConstructo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialMetadataConstructo] (val x: Self) extends AnyVal {
      
      inline def setAuthnRequestBinding(value: String): Self = StObject.set(x, "authnRequestBinding", value.asInstanceOf[js.Any])
      
      inline def setAuthnRequestBindingUndefined: Self = StObject.set(x, "authnRequestBinding", js.undefined)
      
      inline def setThrowExceptions(value: Boolean): Self = StObject.set(x, "throwExceptions", value.asInstanceOf[js.Any])
      
      inline def setThrowExceptionsUndefined: Self = StObject.set(x, "throwExceptions", js.undefined)
    }
  }
}
