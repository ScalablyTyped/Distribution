package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VppToken extends Entity {
  // The apple Id associated with the given Apple Volume Purchase Program Token.
  var appleId: js.UndefOr[String] = js.native
  // Whether or not apps for the VPP token will be automatically updated.
  var automaticallyUpdateApps: js.UndefOr[Boolean] = js.native
  // Whether or not apps for the VPP token will be automatically updated.
  var countryOrRegion: js.UndefOr[String] = js.native
  // The expiration date time of the Apple Volume Purchase Program Token.
  var expirationDateTime: js.UndefOr[String] = js.native
  // Last modification date time associated with the Apple Volume Purchase Program Token.
  var lastModifiedDateTime: js.UndefOr[String] = js.native
  /**
    * The last time when an application sync was done with the Apple volume purchase program service using the Apple Volume
    * Purchase Program Token.
    */
  var lastSyncDateTime: js.UndefOr[String] = js.native
  /**
    * Current sync status of the last application sync which was triggered using the Apple Volume Purchase Program Token.
    * Possible values are: none, inProgress, completed, failed. Possible values are: none, inProgress, completed, failed.
    */
  var lastSyncStatus: js.UndefOr[VppTokenSyncStatus] = js.native
  // The organization associated with the Apple Volume Purchase Program Token
  var organizationName: js.UndefOr[String] = js.native
  /**
    * Current state of the Apple Volume Purchase Program Token. Possible values are: unknown, valid, expired, invalid,
    * assignedToExternalMDM. Possible values are: unknown, valid, expired, invalid, assignedToExternalMDM.
    */
  var state: js.UndefOr[VppTokenState] = js.native
  // The Apple Volume Purchase Program Token string downloaded from the Apple Volume Purchase Program.
  var token: js.UndefOr[String] = js.native
  /**
    * The type of volume purchase program which the given Apple Volume Purchase Program Token is associated with. Possible
    * values are: business, education. Possible values are: business, education.
    */
  var vppTokenAccountType: js.UndefOr[VppTokenAccountType] = js.native
}

object VppToken {
  @scala.inline
  def apply(): VppToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VppToken]
  }
  @scala.inline
  implicit class VppTokenOps[Self <: VppToken] (val x: Self) extends AnyVal {
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
    def setAppleId(value: String): Self = this.set("appleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppleId: Self = this.set("appleId", js.undefined)
    @scala.inline
    def setAutomaticallyUpdateApps(value: Boolean): Self = this.set("automaticallyUpdateApps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutomaticallyUpdateApps: Self = this.set("automaticallyUpdateApps", js.undefined)
    @scala.inline
    def setCountryOrRegion(value: String): Self = this.set("countryOrRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountryOrRegion: Self = this.set("countryOrRegion", js.undefined)
    @scala.inline
    def setExpirationDateTime(value: String): Self = this.set("expirationDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpirationDateTime: Self = this.set("expirationDateTime", js.undefined)
    @scala.inline
    def setLastModifiedDateTime(value: String): Self = this.set("lastModifiedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedDateTime: Self = this.set("lastModifiedDateTime", js.undefined)
    @scala.inline
    def setLastSyncDateTime(value: String): Self = this.set("lastSyncDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastSyncDateTime: Self = this.set("lastSyncDateTime", js.undefined)
    @scala.inline
    def setLastSyncStatus(value: VppTokenSyncStatus): Self = this.set("lastSyncStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastSyncStatus: Self = this.set("lastSyncStatus", js.undefined)
    @scala.inline
    def setOrganizationName(value: String): Self = this.set("organizationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganizationName: Self = this.set("organizationName", js.undefined)
    @scala.inline
    def setState(value: VppTokenState): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
    @scala.inline
    def setVppTokenAccountType(value: VppTokenAccountType): Self = this.set("vppTokenAccountType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVppTokenAccountType: Self = this.set("vppTokenAccountType", js.undefined)
  }
  
}

