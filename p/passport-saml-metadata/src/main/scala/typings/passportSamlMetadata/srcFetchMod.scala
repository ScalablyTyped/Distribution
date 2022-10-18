package typings.passportSamlMetadata

import typings.passportSamlMetadata.anon.Get
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcFetchMod {
  
  @JSImport("passport-saml-metadata/src/fetch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fetch(config: FetchConfig): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  trait FetchAxiosConfig extends StObject {
    
    var backupStore: Map[String, String]
    
    var responseType: String
    
    var timeout: Double
  }
  object FetchAxiosConfig {
    
    inline def apply(backupStore: Map[String, String], responseType: String, timeout: Double): FetchAxiosConfig = {
      val __obj = js.Dynamic.literal(backupStore = backupStore.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchAxiosConfig]
    }
    
    extension [Self <: FetchAxiosConfig](x: Self) {
      
      inline def setBackupStore(value: Map[String, String]): Self = StObject.set(x, "backupStore", value.asInstanceOf[js.Any])
      
      inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  client :{get (url : string, params : std.Partial<passport-saml-metadata.passport-saml-metadata/src/fetch.FetchAxiosConfig> | undefined): std.Promise<{  data :string}>} | undefined,   url :string} & std.Partial<passport-saml-metadata.passport-saml-metadata/src/fetch.FetchAxiosConfig> */
  trait FetchConfig extends StObject {
    
    var backupStore: js.UndefOr[Map[String, String]] = js.undefined
    
    var client: js.UndefOr[Get] = js.undefined
    
    var responseType: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var url: String
  }
  object FetchConfig {
    
    inline def apply(url: String): FetchConfig = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchConfig]
    }
    
    extension [Self <: FetchConfig](x: Self) {
      
      inline def setBackupStore(value: Map[String, String]): Self = StObject.set(x, "backupStore", value.asInstanceOf[js.Any])
      
      inline def setBackupStoreUndefined: Self = StObject.set(x, "backupStore", js.undefined)
      
      inline def setClient(value: Get): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
