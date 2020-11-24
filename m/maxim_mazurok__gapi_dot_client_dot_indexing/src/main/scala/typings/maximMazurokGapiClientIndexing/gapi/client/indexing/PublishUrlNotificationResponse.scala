package typings.maximMazurokGapiClientIndexing.gapi.client.indexing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PublishUrlNotificationResponse extends js.Object {
  
  /** Description of the notification events received for this URL. */
  var urlNotificationMetadata: js.UndefOr[UrlNotificationMetadata] = js.native
}
object PublishUrlNotificationResponse {
  
  @scala.inline
  def apply(): PublishUrlNotificationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublishUrlNotificationResponse]
  }
  
  @scala.inline
  implicit class PublishUrlNotificationResponseOps[Self <: PublishUrlNotificationResponse] (val x: Self) extends AnyVal {
    
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
    def setUrlNotificationMetadata(value: UrlNotificationMetadata): Self = this.set("urlNotificationMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlNotificationMetadata: Self = this.set("urlNotificationMetadata", js.undefined)
  }
}
