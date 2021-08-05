package typings.maximMazurokGapiClientPlaycustomapp

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientPlaycustomapp.anon.Accesstoken
import typings.maximMazurokGapiClientPlaycustomapp.anon.Account
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object playcustomapp {
      
      trait AccountsResource extends StObject {
        
        var customApps: CustomAppsResource
      }
      object AccountsResource {
        
        inline def apply(customApps: CustomAppsResource): AccountsResource = {
          val __obj = js.Dynamic.literal(customApps = customApps.asInstanceOf[js.Any])
          __obj.asInstanceOf[AccountsResource]
        }
        
        extension [Self <: AccountsResource](x: Self) {
          
          inline def setCustomApps(value: CustomAppsResource): Self = StObject.set(x, "customApps", value.asInstanceOf[js.Any])
        }
      }
      
      trait CustomApp extends StObject {
        
        /** Default listing language in BCP 47 format. */
        var languageCode: js.UndefOr[String] = js.undefined
        
        /** Output only. Package name of the created Android app. Only present in the API response. */
        var packageName: js.UndefOr[String] = js.undefined
        
        /** Title for the Android app. */
        var title: js.UndefOr[String] = js.undefined
      }
      object CustomApp {
        
        inline def apply(): CustomApp = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[CustomApp]
        }
        
        extension [Self <: CustomApp](x: Self) {
          
          inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
          
          inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
          
          inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
          
          inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
          
          inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
          
          inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        }
      }
      
      @js.native
      trait CustomAppsResource extends StObject {
        
        /** Creates a new custom app. */
        def create(request: Accesstoken): Request[CustomApp] = js.native
        def create(request: Account, body: CustomApp): Request[CustomApp] = js.native
      }
    }
  }
}
