package typings.octokitTypes.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dictk
  extends /**
  * Any additional parameter will be passed as follows
  * 1. URL parameter if `':parameter'` or `{parameter}` is part of `url`
  * 2. Query parameter if `method` is `'GET'` or `'HEAD'`
  * 3. Request body if `parameter` is `'data'`
  * 4. JSON in the request body in the form of `body[parameter]` unless `parameter` key is `'data'`
  */
/* parameter */ StringDictionary[js.Any] {
  
  var avatar_url: js.UndefOr[String] = js.native
  
  var events_url: js.UndefOr[String] = js.native
  
  var followers_url: js.UndefOr[String] = js.native
  
  var following_url: js.UndefOr[String] = js.native
  
  var gists_url: js.UndefOr[String] = js.native
  
  var gravatar_id: js.UndefOr[String] = js.native
  
  var html_url: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[Double] = js.native
  
  var login: js.UndefOr[String] = js.native
  
  var node_id: js.UndefOr[String] = js.native
  
  var organizations_url: js.UndefOr[String] = js.native
  
  var received_events_url: js.UndefOr[String] = js.native
  
  var repos_url: js.UndefOr[String] = js.native
  
  var site_admin: js.UndefOr[Boolean] = js.native
  
  var starred_url: js.UndefOr[String] = js.native
  
  var subscriptions_url: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object Dictk {
  
  @scala.inline
  def apply(): Dictk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictk]
  }
  
  @scala.inline
  implicit class DictkOps[Self <: Dictk] (val x: Self) extends AnyVal {
    
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
    def setAvatar_url(value: String): Self = this.set("avatar_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvatar_url: Self = this.set("avatar_url", js.undefined)
    
    @scala.inline
    def setEvents_url(value: String): Self = this.set("events_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents_url: Self = this.set("events_url", js.undefined)
    
    @scala.inline
    def setFollowers_url(value: String): Self = this.set("followers_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollowers_url: Self = this.set("followers_url", js.undefined)
    
    @scala.inline
    def setFollowing_url(value: String): Self = this.set("following_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollowing_url: Self = this.set("following_url", js.undefined)
    
    @scala.inline
    def setGists_url(value: String): Self = this.set("gists_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGists_url: Self = this.set("gists_url", js.undefined)
    
    @scala.inline
    def setGravatar_id(value: String): Self = this.set("gravatar_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGravatar_id: Self = this.set("gravatar_id", js.undefined)
    
    @scala.inline
    def setHtml_url(value: String): Self = this.set("html_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtml_url: Self = this.set("html_url", js.undefined)
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLogin(value: String): Self = this.set("login", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogin: Self = this.set("login", js.undefined)
    
    @scala.inline
    def setNode_id(value: String): Self = this.set("node_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNode_id: Self = this.set("node_id", js.undefined)
    
    @scala.inline
    def setOrganizations_url(value: String): Self = this.set("organizations_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganizations_url: Self = this.set("organizations_url", js.undefined)
    
    @scala.inline
    def setReceived_events_url(value: String): Self = this.set("received_events_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReceived_events_url: Self = this.set("received_events_url", js.undefined)
    
    @scala.inline
    def setRepos_url(value: String): Self = this.set("repos_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepos_url: Self = this.set("repos_url", js.undefined)
    
    @scala.inline
    def setSite_admin(value: Boolean): Self = this.set("site_admin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSite_admin: Self = this.set("site_admin", js.undefined)
    
    @scala.inline
    def setStarred_url(value: String): Self = this.set("starred_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStarred_url: Self = this.set("starred_url", js.undefined)
    
    @scala.inline
    def setSubscriptions_url(value: String): Self = this.set("subscriptions_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscriptions_url: Self = this.set("subscriptions_url", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
