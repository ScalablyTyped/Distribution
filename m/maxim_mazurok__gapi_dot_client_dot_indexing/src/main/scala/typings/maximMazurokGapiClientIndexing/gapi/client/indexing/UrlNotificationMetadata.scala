package typings.maximMazurokGapiClientIndexing.gapi.client.indexing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlNotificationMetadata extends js.Object {
  
  /** Latest notification received with type `URL_REMOVED`. */
  var latestRemove: js.UndefOr[UrlNotification] = js.native
  
  /** Latest notification received with type `URL_UPDATED`. */
  var latestUpdate: js.UndefOr[UrlNotification] = js.native
  
  /** URL to which this metadata refers. */
  var url: js.UndefOr[String] = js.native
}
object UrlNotificationMetadata {
  
  @scala.inline
  def apply(): UrlNotificationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlNotificationMetadata]
  }
  
  @scala.inline
  implicit class UrlNotificationMetadataOps[Self <: UrlNotificationMetadata] (val x: Self) extends AnyVal {
    
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
    def setLatestRemove(value: UrlNotification): Self = this.set("latestRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestRemove: Self = this.set("latestRemove", js.undefined)
    
    @scala.inline
    def setLatestUpdate(value: UrlNotification): Self = this.set("latestUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestUpdate: Self = this.set("latestUpdate", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
