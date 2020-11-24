package typings.ottomatedPassportTwitch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Profile
  extends typings.passport.mod.Profile {
  
  var _json: js.Object = js.native
  
  var _raw: String = js.native
  
  var profileImageUrl: String = js.native
  
  var userName: String = js.native
  
  var viewCount: Double = js.native
}
object Profile {
  
  @scala.inline
  def apply(
    _json: js.Object,
    _raw: String,
    displayName: String,
    id: String,
    profileImageUrl: String,
    provider: String,
    userName: String,
    viewCount: Double
  ): Profile = {
    val __obj = js.Dynamic.literal(_json = _json.asInstanceOf[js.Any], _raw = _raw.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], profileImageUrl = profileImageUrl.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any], viewCount = viewCount.asInstanceOf[js.Any])
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
    def set_json(value: js.Object): Self = this.set("_json", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_raw(value: String): Self = this.set("_raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileImageUrl(value: String): Self = this.set("profileImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: String): Self = this.set("userName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewCount(value: Double): Self = this.set("viewCount", value.asInstanceOf[js.Any])
  }
}
