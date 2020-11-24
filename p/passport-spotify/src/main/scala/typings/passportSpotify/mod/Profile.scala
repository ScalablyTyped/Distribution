package typings.passportSpotify.mod

import typings.passportSpotify.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Profile extends js.Object {
  
  var _json: js.Any = js.native
  
  var _raw: String = js.native
  
  var country: String = js.native
  
  var displayName: String = js.native
  
  var emails: js.UndefOr[js.Array[Type]] = js.native
  
  var followers: Double | Null = js.native
  
  var id: String = js.native
  
  var photos: js.Array[String] | Null = js.native
  
  var product: String | Null = js.native
  
  var profileUrl: String | Null = js.native
  
  var provider: String = js.native
  
  var username: String = js.native
}
object Profile {
  
  @scala.inline
  def apply(
    _json: js.Any,
    _raw: String,
    country: String,
    displayName: String,
    id: String,
    provider: String,
    username: String
  ): Profile = {
    val __obj = js.Dynamic.literal(_json = _json.asInstanceOf[js.Any], _raw = _raw.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Profile]
  }
  
  @scala.inline
  implicit class ProfileOps[Self <: Profile] (val x: Self) extends AnyVal {
    
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
    def set_json(value: js.Any): Self = this.set("_json", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_raw(value: String): Self = this.set("_raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvider(value: String): Self = this.set("provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailsVarargs(value: Type*): Self = this.set("emails", js.Array(value :_*))
    
    @scala.inline
    def setEmails(value: js.Array[Type]): Self = this.set("emails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmails: Self = this.set("emails", js.undefined)
    
    @scala.inline
    def setFollowers(value: Double): Self = this.set("followers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowersNull: Self = this.set("followers", null)
    
    @scala.inline
    def setPhotosVarargs(value: String*): Self = this.set("photos", js.Array(value :_*))
    
    @scala.inline
    def setPhotos(value: js.Array[String]): Self = this.set("photos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotosNull: Self = this.set("photos", null)
    
    @scala.inline
    def setProduct(value: String): Self = this.set("product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductNull: Self = this.set("product", null)
    
    @scala.inline
    def setProfileUrl(value: String): Self = this.set("profileUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileUrlNull: Self = this.set("profileUrl", null)
  }
}
