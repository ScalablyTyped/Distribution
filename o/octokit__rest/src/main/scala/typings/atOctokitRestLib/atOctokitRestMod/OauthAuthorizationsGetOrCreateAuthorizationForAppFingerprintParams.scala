package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OauthAuthorizationsGetOrCreateAuthorizationForAppFingerprintParams extends js.Object {
  var client_id: java.lang.String
  /**
    * The 40 character OAuth app client secret associated with the client ID specified in the URL.
    */
  var client_secret: java.lang.String
  var fingerprint: java.lang.String
  /**
    * A note to remind you what the OAuth token is for.
    */
  var note: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A URL to remind you what app the OAuth token is for.
    */
  var note_url: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A list of scopes that this authorization is in.
    */
  var scopes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object OauthAuthorizationsGetOrCreateAuthorizationForAppFingerprintParams {
  @scala.inline
  def apply(
    client_id: java.lang.String,
    client_secret: java.lang.String,
    fingerprint: java.lang.String,
    note: java.lang.String = null,
    note_url: java.lang.String = null,
    scopes: js.Array[java.lang.String] = null
  ): OauthAuthorizationsGetOrCreateAuthorizationForAppFingerprintParams = {
    val __obj = js.Dynamic.literal(client_id = client_id, client_secret = client_secret, fingerprint = fingerprint)
    if (note != null) __obj.updateDynamic("note")(note)
    if (note_url != null) __obj.updateDynamic("note_url")(note_url)
    if (scopes != null) __obj.updateDynamic("scopes")(scopes)
    __obj.asInstanceOf[OauthAuthorizationsGetOrCreateAuthorizationForAppFingerprintParams]
  }
}

