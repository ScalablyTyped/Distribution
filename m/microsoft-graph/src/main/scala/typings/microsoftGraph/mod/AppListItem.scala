package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppListItem extends js.Object {
  
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
  implicit class AppListItemOps[Self <: AppListItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAppId(value: NullableOption[String]): Self = this.set("appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppId: Self = this.set("appId", js.undefined)
    
    @scala.inline
    def setAppIdNull: Self = this.set("appId", null)
    
    @scala.inline
    def setAppStoreUrl(value: NullableOption[String]): Self = this.set("appStoreUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppStoreUrl: Self = this.set("appStoreUrl", js.undefined)
    
    @scala.inline
    def setAppStoreUrlNull: Self = this.set("appStoreUrl", null)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPublisher(value: NullableOption[String]): Self = this.set("publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublisher: Self = this.set("publisher", js.undefined)
    
    @scala.inline
    def setPublisherNull: Self = this.set("publisher", null)
  }
}
