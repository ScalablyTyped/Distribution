package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Account extends StObject {
  
  var access_tokens_url: String
  
  var account: Eventsurl
  
  var app_id: Double
  
  var events: js.Array[String]
  
  var html_url: String
  
  var id: Double
  
  var permissions: Checks
  
  var repositories_url: String
  
  var single_file_name: String
  
  var target_id: Double
  
  var target_type: String
}
object Account {
  
  @scala.inline
  def apply(
    access_tokens_url: String,
    account: Eventsurl,
    app_id: Double,
    events: js.Array[String],
    html_url: String,
    id: Double,
    permissions: Checks,
    repositories_url: String,
    single_file_name: String,
    target_id: Double,
    target_type: String
  ): Account = {
    val __obj = js.Dynamic.literal(access_tokens_url = access_tokens_url.asInstanceOf[js.Any], account = account.asInstanceOf[js.Any], app_id = app_id.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], repositories_url = repositories_url.asInstanceOf[js.Any], single_file_name = single_file_name.asInstanceOf[js.Any], target_id = target_id.asInstanceOf[js.Any], target_type = target_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Account]
  }
  
  @scala.inline
  implicit class AccountMutableBuilder[Self <: Account] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccess_tokens_url(value: String): Self = StObject.set(x, "access_tokens_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccount(value: Eventsurl): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApp_id(value: Double): Self = StObject.set(x, "app_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvents(value: js.Array[String]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsVarargs(value: String*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    @scala.inline
    def setHtml_url(value: String): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissions(value: Checks): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositories_url(value: String): Self = StObject.set(x, "repositories_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingle_file_name(value: String): Self = StObject.set(x, "single_file_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget_id(value: Double): Self = StObject.set(x, "target_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget_type(value: String): Self = StObject.set(x, "target_type", value.asInstanceOf[js.Any])
  }
}
