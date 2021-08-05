package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppListItem extends StObject {
  
  // The application or bundle identifier of the application
  var appId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The Store URL of the application
  var appStoreUrl: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The application name
  var name: js.UndefOr[String] = js.undefined
  
  // The publisher of the application
  var publisher: js.UndefOr[NullableOption[String]] = js.undefined
}
object AppListItem {
  
  inline def apply(): AppListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppListItem]
  }
  
  extension [Self <: AppListItem](x: Self) {
    
    inline def setAppId(value: NullableOption[String]): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAppIdNull: Self = StObject.set(x, "appId", null)
    
    inline def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    inline def setAppStoreUrl(value: NullableOption[String]): Self = StObject.set(x, "appStoreUrl", value.asInstanceOf[js.Any])
    
    inline def setAppStoreUrlNull: Self = StObject.set(x, "appStoreUrl", null)
    
    inline def setAppStoreUrlUndefined: Self = StObject.set(x, "appStoreUrl", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPublisher(value: NullableOption[String]): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherNull: Self = StObject.set(x, "publisher", null)
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
  }
}
