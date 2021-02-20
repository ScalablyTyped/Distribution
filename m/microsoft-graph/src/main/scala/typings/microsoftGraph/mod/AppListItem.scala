package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppListItem extends StObject {
  
  // The application or bundle identifier of the application
  var appId: js.UndefOr[NullableOption[String]] = js.native
  
  // The Store URL of the application
  var appStoreUrl: js.UndefOr[NullableOption[String]] = js.native
  
  // The application name
  var name: js.UndefOr[String] = js.native
  
  // The publisher of the application
  var publisher: js.UndefOr[NullableOption[String]] = js.native
}
object AppListItem {
  
  @scala.inline
  def apply(): AppListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppListItem]
  }
  
  @scala.inline
  implicit class AppListItemMutableBuilder[Self <: AppListItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: NullableOption[String]): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppIdNull: Self = StObject.set(x, "appId", null)
    
    @scala.inline
    def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    @scala.inline
    def setAppStoreUrl(value: NullableOption[String]): Self = StObject.set(x, "appStoreUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppStoreUrlNull: Self = StObject.set(x, "appStoreUrl", null)
    
    @scala.inline
    def setAppStoreUrlUndefined: Self = StObject.set(x, "appStoreUrl", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPublisher(value: NullableOption[String]): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherNull: Self = StObject.set(x, "publisher", null)
    
    @scala.inline
    def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
  }
}
