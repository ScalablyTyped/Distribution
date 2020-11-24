package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebhookInfo extends js.Object {
  
  var allowed_updates: js.UndefOr[js.Array[String]] = js.native
  
  var has_custom_certificate: Boolean = js.native
  
  var last_error_date: js.UndefOr[Double] = js.native
  
  var last_error_message: js.UndefOr[String] = js.native
  
  var max_connections: js.UndefOr[Double] = js.native
  
  var pending_update_count: Double = js.native
  
  var url: String = js.native
}
object WebhookInfo {
  
  @scala.inline
  def apply(has_custom_certificate: Boolean, pending_update_count: Double, url: String): WebhookInfo = {
    val __obj = js.Dynamic.literal(has_custom_certificate = has_custom_certificate.asInstanceOf[js.Any], pending_update_count = pending_update_count.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookInfo]
  }
  
  @scala.inline
  implicit class WebhookInfoOps[Self <: WebhookInfo] (val x: Self) extends AnyVal {
    
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
    def setHas_custom_certificate(value: Boolean): Self = this.set("has_custom_certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPending_update_count(value: Double): Self = this.set("pending_update_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowed_updatesVarargs(value: String*): Self = this.set("allowed_updates", js.Array(value :_*))
    
    @scala.inline
    def setAllowed_updates(value: js.Array[String]): Self = this.set("allowed_updates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowed_updates: Self = this.set("allowed_updates", js.undefined)
    
    @scala.inline
    def setLast_error_date(value: Double): Self = this.set("last_error_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLast_error_date: Self = this.set("last_error_date", js.undefined)
    
    @scala.inline
    def setLast_error_message(value: String): Self = this.set("last_error_message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLast_error_message: Self = this.set("last_error_message", js.undefined)
    
    @scala.inline
    def setMax_connections(value: Double): Self = this.set("max_connections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax_connections: Self = this.set("max_connections", js.undefined)
  }
}
