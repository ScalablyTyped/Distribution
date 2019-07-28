package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VppToken extends Entity {
  // The apple Id associated with the given Apple Volume Purchase Program Token.
  var appleId: js.UndefOr[String] = js.undefined
  // Whether or not apps for the VPP token will be automatically updated.
  var automaticallyUpdateApps: js.UndefOr[Boolean] = js.undefined
  // Whether or not apps for the VPP token will be automatically updated.
  var countryOrRegion: js.UndefOr[String] = js.undefined
  // The expiration date time of the Apple Volume Purchase Program Token.
  var expirationDateTime: js.UndefOr[String] = js.undefined
  // Last modification date time associated with the Apple Volume Purchase Program Token.
  var lastModifiedDateTime: js.UndefOr[String] = js.undefined
  /**
    * The last time when an application sync was done with the Apple volume purchase program service using the the Apple
    * Volume Purchase Program Token.
    */
  var lastSyncDateTime: js.UndefOr[String] = js.undefined
  /**
    * Current sync status of the last application sync which was triggered using the Apple Volume Purchase Program Token.
    * Possible values are: none, inProgress, completed, failed. Possible values are: none, inProgress, completed, failed.
    */
  var lastSyncStatus: js.UndefOr[VppTokenSyncStatus] = js.undefined
  // The organization associated with the Apple Volume Purchase Program Token
  var organizationName: js.UndefOr[String] = js.undefined
  /**
    * Current state of the Apple Volume Purchase Program Token. Possible values are: unknown, valid, expired, invalid,
    * assignedToExternalMDM. Possible values are: unknown, valid, expired, invalid, assignedToExternalMDM.
    */
  var state: js.UndefOr[VppTokenState] = js.undefined
  // The Apple Volume Purchase Program Token string downloaded from the Apple Volume Purchase Program.
  var token: js.UndefOr[String] = js.undefined
  /**
    * The type of volume purchase program which the given Apple Volume Purchase Program Token is associated with. Possible
    * values are: business, education. Possible values are: business, education.
    */
  var vppTokenAccountType: js.UndefOr[VppTokenAccountType] = js.undefined
}

object VppToken {
  @scala.inline
  def apply(
    appleId: String = null,
    automaticallyUpdateApps: js.UndefOr[Boolean] = js.undefined,
    countryOrRegion: String = null,
    expirationDateTime: String = null,
    id: String = null,
    lastModifiedDateTime: String = null,
    lastSyncDateTime: String = null,
    lastSyncStatus: VppTokenSyncStatus = null,
    organizationName: String = null,
    state: VppTokenState = null,
    token: String = null,
    vppTokenAccountType: VppTokenAccountType = null
  ): VppToken = {
    val __obj = js.Dynamic.literal()
    if (appleId != null) __obj.updateDynamic("appleId")(appleId)
    if (!js.isUndefined(automaticallyUpdateApps)) __obj.updateDynamic("automaticallyUpdateApps")(automaticallyUpdateApps)
    if (countryOrRegion != null) __obj.updateDynamic("countryOrRegion")(countryOrRegion)
    if (expirationDateTime != null) __obj.updateDynamic("expirationDateTime")(expirationDateTime)
    if (id != null) __obj.updateDynamic("id")(id)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (lastSyncDateTime != null) __obj.updateDynamic("lastSyncDateTime")(lastSyncDateTime)
    if (lastSyncStatus != null) __obj.updateDynamic("lastSyncStatus")(lastSyncStatus)
    if (organizationName != null) __obj.updateDynamic("organizationName")(organizationName)
    if (state != null) __obj.updateDynamic("state")(state)
    if (token != null) __obj.updateDynamic("token")(token)
    if (vppTokenAccountType != null) __obj.updateDynamic("vppTokenAccountType")(vppTokenAccountType)
    __obj.asInstanceOf[VppToken]
  }
}

