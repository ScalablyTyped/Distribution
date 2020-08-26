package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParticipantInfo extends js.Object {
  /**
    * The ISO 3166-1 Alpha-2 country code of the participant's best estimated physical location at the start of the call.
    * Read-only.
    */
  var countryCode: js.UndefOr[String] = js.native
  /**
    * The type of endpoint the participant is using. Possible values are: default, skypeForBusiness, or
    * skypeForBusinessVoipPhone. Read-only.
    */
  var endpointType: js.UndefOr[EndpointType] = js.native
  // The identitySet associated with this participant. Read-only.
  var identity: js.UndefOr[IdentitySet] = js.native
  // The language culture string. Read-only.
  var languageId: js.UndefOr[String] = js.native
  /**
    * The home region of the participant. This can be a country, a continent, or a larger geographic region. This does not
    * change based on the participant's current physical location. Read-only.
    */
  var region: js.UndefOr[String] = js.native
}

object ParticipantInfo {
  @scala.inline
  def apply(): ParticipantInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParticipantInfo]
  }
  @scala.inline
  implicit class ParticipantInfoOps[Self <: ParticipantInfo] (val x: Self) extends AnyVal {
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
    def setCountryCode(value: String): Self = this.set("countryCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountryCode: Self = this.set("countryCode", js.undefined)
    @scala.inline
    def setEndpointType(value: EndpointType): Self = this.set("endpointType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpointType: Self = this.set("endpointType", js.undefined)
    @scala.inline
    def setIdentity(value: IdentitySet): Self = this.set("identity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentity: Self = this.set("identity", js.undefined)
    @scala.inline
    def setLanguageId(value: String): Self = this.set("languageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguageId: Self = this.set("languageId", js.undefined)
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
  }
  
}

