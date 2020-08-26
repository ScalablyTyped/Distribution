package typings.openidClient.mod

import org.scalablytyped.runtime.StringDictionary
import typings.openidClient.anon.Dictkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserinfoResponse
  extends /* key */ StringDictionary[js.Any] {
  var address: js.UndefOr[Dictkey] = js.native
  var birthdate: js.UndefOr[String] = js.native
  var email: js.UndefOr[String] = js.native
  var email_verified: js.UndefOr[Boolean] = js.native
  var family_name: js.UndefOr[String] = js.native
  var gender: js.UndefOr[String] = js.native
  var given_name: js.UndefOr[String] = js.native
  var locale: js.UndefOr[String] = js.native
  var middle_name: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var nickname: js.UndefOr[String] = js.native
  var phone_number: js.UndefOr[String] = js.native
  var picture: js.UndefOr[String] = js.native
  var preferred_username: js.UndefOr[String] = js.native
  var profile: js.UndefOr[String] = js.native
  var sub: String = js.native
  var updated_at: js.UndefOr[Double] = js.native
  var website: js.UndefOr[String] = js.native
  var zoneinfo: js.UndefOr[String] = js.native
}

object UserinfoResponse {
  @scala.inline
  def apply(sub: String): UserinfoResponse = {
    val __obj = js.Dynamic.literal(sub = sub.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserinfoResponse]
  }
  @scala.inline
  implicit class UserinfoResponseOps[Self <: UserinfoResponse] (val x: Self) extends AnyVal {
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
    def setSub(value: String): Self = this.set("sub", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddress(value: Dictkey): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    @scala.inline
    def setBirthdate(value: String): Self = this.set("birthdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBirthdate: Self = this.set("birthdate", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setEmail_verified(value: Boolean): Self = this.set("email_verified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail_verified: Self = this.set("email_verified", js.undefined)
    @scala.inline
    def setFamily_name(value: String): Self = this.set("family_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFamily_name: Self = this.set("family_name", js.undefined)
    @scala.inline
    def setGender(value: String): Self = this.set("gender", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGender: Self = this.set("gender", js.undefined)
    @scala.inline
    def setGiven_name(value: String): Self = this.set("given_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGiven_name: Self = this.set("given_name", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMiddle_name(value: String): Self = this.set("middle_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMiddle_name: Self = this.set("middle_name", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNickname(value: String): Self = this.set("nickname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNickname: Self = this.set("nickname", js.undefined)
    @scala.inline
    def setPhone_number(value: String): Self = this.set("phone_number", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhone_number: Self = this.set("phone_number", js.undefined)
    @scala.inline
    def setPicture(value: String): Self = this.set("picture", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePicture: Self = this.set("picture", js.undefined)
    @scala.inline
    def setPreferred_username(value: String): Self = this.set("preferred_username", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferred_username: Self = this.set("preferred_username", js.undefined)
    @scala.inline
    def setProfile(value: String): Self = this.set("profile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfile: Self = this.set("profile", js.undefined)
    @scala.inline
    def setUpdated_at(value: Double): Self = this.set("updated_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated_at: Self = this.set("updated_at", js.undefined)
    @scala.inline
    def setWebsite(value: String): Self = this.set("website", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebsite: Self = this.set("website", js.undefined)
    @scala.inline
    def setZoneinfo(value: String): Self = this.set("zoneinfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoneinfo: Self = this.set("zoneinfo", js.undefined)
  }
  
}

