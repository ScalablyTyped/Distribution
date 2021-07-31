package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebhookInfo extends StObject {
  
  var allowed_updates: js.UndefOr[js.Array[String]] = js.undefined
  
  var has_custom_certificate: Boolean
  
  var last_error_date: js.UndefOr[Double] = js.undefined
  
  var last_error_message: js.UndefOr[String] = js.undefined
  
  var max_connections: js.UndefOr[Double] = js.undefined
  
  var pending_update_count: Double
  
  var url: String
}
object WebhookInfo {
  
  @scala.inline
  def apply(has_custom_certificate: Boolean, pending_update_count: Double, url: String): WebhookInfo = {
    val __obj = js.Dynamic.literal(has_custom_certificate = has_custom_certificate.asInstanceOf[js.Any], pending_update_count = pending_update_count.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebhookInfo]
  }
  
  @scala.inline
  implicit class WebhookInfoMutableBuilder[Self <: WebhookInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowed_updates(value: js.Array[String]): Self = StObject.set(x, "allowed_updates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowed_updatesUndefined: Self = StObject.set(x, "allowed_updates", js.undefined)
    
    @scala.inline
    def setAllowed_updatesVarargs(value: String*): Self = StObject.set(x, "allowed_updates", js.Array(value :_*))
    
    @scala.inline
    def setHas_custom_certificate(value: Boolean): Self = StObject.set(x, "has_custom_certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_error_date(value: Double): Self = StObject.set(x, "last_error_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_error_dateUndefined: Self = StObject.set(x, "last_error_date", js.undefined)
    
    @scala.inline
    def setLast_error_message(value: String): Self = StObject.set(x, "last_error_message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_error_messageUndefined: Self = StObject.set(x, "last_error_message", js.undefined)
    
    @scala.inline
    def setMax_connections(value: Double): Self = StObject.set(x, "max_connections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_connectionsUndefined: Self = StObject.set(x, "max_connections", js.undefined)
    
    @scala.inline
    def setPending_update_count(value: Double): Self = StObject.set(x, "pending_update_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
