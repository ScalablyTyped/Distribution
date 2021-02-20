package typings.octokitTypes.anon

import typings.octokitTypes.octokitTypesStrings.all
import typings.octokitTypes.octokitTypesStrings.selected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Accesstokensurl extends StObject {
  
  var access_tokens_url: String = js.native
  
  var account: Description = js.native
  
  var app_id: Double = js.native
  
  var events: js.Array[String] = js.native
  
  var html_url: String = js.native
  
  var id: Double = js.native
  
  var permissions: Checks = js.native
  
  var repositories_url: String = js.native
  
  var repository_selection: all | selected = js.native
  
  var single_file_name: String = js.native
  
  var target_id: Double = js.native
  
  var target_type: String = js.native
}
object Accesstokensurl {
  
  @scala.inline
  def apply(
    access_tokens_url: String,
    account: Description,
    app_id: Double,
    events: js.Array[String],
    html_url: String,
    id: Double,
    permissions: Checks,
    repositories_url: String,
    repository_selection: all | selected,
    single_file_name: String,
    target_id: Double,
    target_type: String
  ): Accesstokensurl = {
    val __obj = js.Dynamic.literal(access_tokens_url = access_tokens_url.asInstanceOf[js.Any], account = account.asInstanceOf[js.Any], app_id = app_id.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], repositories_url = repositories_url.asInstanceOf[js.Any], repository_selection = repository_selection.asInstanceOf[js.Any], single_file_name = single_file_name.asInstanceOf[js.Any], target_id = target_id.asInstanceOf[js.Any], target_type = target_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accesstokensurl]
  }
  
  @scala.inline
  implicit class AccesstokensurlMutableBuilder[Self <: Accesstokensurl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccess_tokens_url(value: String): Self = StObject.set(x, "access_tokens_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccount(value: Description): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
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
    def setRepository_selection(value: all | selected): Self = StObject.set(x, "repository_selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingle_file_name(value: String): Self = StObject.set(x, "single_file_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget_id(value: Double): Self = StObject.set(x, "target_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget_type(value: String): Self = StObject.set(x, "target_type", value.asInstanceOf[js.Any])
  }
}
