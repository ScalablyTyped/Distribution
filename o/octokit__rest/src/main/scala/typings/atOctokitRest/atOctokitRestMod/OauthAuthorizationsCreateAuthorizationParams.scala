package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OauthAuthorizationsCreateAuthorizationParams extends js.Object {
  /**
    * The 20 character OAuth app client key for which to create the token.
    */
  var client_id: js.UndefOr[String] = js.undefined
  /**
    * The 40 character OAuth app client secret for which to create the token.
    */
  var client_secret: js.UndefOr[String] = js.undefined
  /**
    * A unique string to distinguish an authorization from others created for the same client ID and user.
    */
  var fingerprint: js.UndefOr[String] = js.undefined
  /**
    * A note to remind you what the OAuth token is for. Tokens not associated with a specific OAuth application (i.e. personal access tokens) must have a unique note.
    */
  var note: String
  /**
    * A URL to remind you what app the OAuth token is for.
    */
  var note_url: js.UndefOr[String] = js.undefined
  /**
    * A list of scopes that this authorization is in.
    */
  var scopes: js.UndefOr[js.Array[String]] = js.undefined
}

object OauthAuthorizationsCreateAuthorizationParams {
  @scala.inline
  def apply(
    note: String,
    client_id: String = null,
    client_secret: String = null,
    fingerprint: String = null,
    note_url: String = null,
    scopes: js.Array[String] = null
  ): OauthAuthorizationsCreateAuthorizationParams = {
    val __obj = js.Dynamic.literal(note = note)
    if (client_id != null) __obj.updateDynamic("client_id")(client_id)
    if (client_secret != null) __obj.updateDynamic("client_secret")(client_secret)
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint)
    if (note_url != null) __obj.updateDynamic("note_url")(note_url)
    if (scopes != null) __obj.updateDynamic("scopes")(scopes)
    __obj.asInstanceOf[OauthAuthorizationsCreateAuthorizationParams]
  }
}

