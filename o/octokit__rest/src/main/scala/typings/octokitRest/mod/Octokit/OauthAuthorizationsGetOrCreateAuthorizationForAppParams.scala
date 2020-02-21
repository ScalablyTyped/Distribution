package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OauthAuthorizationsGetOrCreateAuthorizationForAppParams extends js.Object {
  var client_id: String
  /**
    * The 40 character OAuth app client secret associated with the client ID specified in the URL.
    */
  var client_secret: String
  /**
    * A unique string to distinguish an authorization from others created for the same client and user. If provided, this API is functionally equivalent to [Get-or-create an authorization for a specific app and fingerprint](https://developer.github.com/v3/oauth_authorizations/#get-or-create-an-authorization-for-a-specific-app-and-fingerprint).
    */
  var fingerprint: js.UndefOr[String] = js.undefined
  /**
    * A note to remind you what the OAuth token is for.
    */
  var note: js.UndefOr[String] = js.undefined
  /**
    * A URL to remind you what app the OAuth token is for.
    */
  var note_url: js.UndefOr[String] = js.undefined
  /**
    * A list of scopes that this authorization is in.
    */
  var scopes: js.UndefOr[js.Array[String]] = js.undefined
}

object OauthAuthorizationsGetOrCreateAuthorizationForAppParams {
  @scala.inline
  def apply(
    client_id: String,
    client_secret: String,
    fingerprint: String = null,
    note: String = null,
    note_url: String = null,
    scopes: js.Array[String] = null
  ): OauthAuthorizationsGetOrCreateAuthorizationForAppParams = {
    val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any], client_secret = client_secret.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (note_url != null) __obj.updateDynamic("note_url")(note_url.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[OauthAuthorizationsGetOrCreateAuthorizationForAppParams]
  }
}

