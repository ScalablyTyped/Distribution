package typings.passportSamlMetadata

import typings.passportSamlMetadata.anon.Get
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fetchMod {
  
  @JSImport("passport-saml-metadata/src/fetch", "fetch")
  @js.native
  def fetch(config: FetchConfig): js.Promise[String] = js.native
  
  @js.native
  trait FetchAxiosConfig extends StObject {
    
    var backupStore: Map[String, String] = js.native
    
    var responseType: String = js.native
    
    var timeout: Double = js.native
  }
  object FetchAxiosConfig {
    
    @scala.inline
    def apply(backupStore: Map[String, String], responseType: String, timeout: Double): FetchAxiosConfig = {
      val __obj = js.Dynamic.literal(backupStore = backupStore.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchAxiosConfig]
    }
    
    @scala.inline
    implicit class FetchAxiosConfigMutableBuilder[Self <: FetchAxiosConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackupStore(value: Map[String, String]): Self = StObject.set(x, "backupStore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  client :{get (url : string, params : std.Partial<passport-saml-metadata.passport-saml-metadata/src/fetch.FetchAxiosConfig> | undefined): std.Promise<{  data :string}>} | undefined,   url :string} & std.Partial<passport-saml-metadata.passport-saml-metadata/src/fetch.FetchAxiosConfig> */
  @js.native
  trait FetchConfig extends StObject {
    
    var backupStore: js.UndefOr[Map[String, String]] = js.native
    
    var client: js.UndefOr[Get] = js.native
    
    var responseType: js.UndefOr[String] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
    
    var url: String = js.native
  }
  object FetchConfig {
    
    @scala.inline
    def apply(url: String): FetchConfig = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchConfig]
    }
    
    @scala.inline
    implicit class FetchConfigMutableBuilder[Self <: FetchConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackupStore(value: Map[String, String]): Self = StObject.set(x, "backupStore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupStoreUndefined: Self = StObject.set(x, "backupStore", js.undefined)
      
      @scala.inline
      def setClient(value: Get): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
      
      @scala.inline
      def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
