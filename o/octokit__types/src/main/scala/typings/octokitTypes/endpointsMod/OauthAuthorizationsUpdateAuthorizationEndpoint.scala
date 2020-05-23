package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OauthAuthorizationsUpdateAuthorizationEndpoint extends js.Object {
  /**
    * A list of scopes to add to this authorization.
    */
  var add_scopes: js.UndefOr[js.Array[String]] = js.undefined
  var authorization_id: Double
  /**
    * A unique string to distinguish an authorization from others created for the same client ID and user.
    */
  var fingerprint: js.UndefOr[String] = js.undefined
  /**
    * A note to remind you what the OAuth token is for. Tokens not associated with a specific OAuth application (i.e. personal access tokens) must have a unique note.
    */
  var note: js.UndefOr[String] = js.undefined
  /**
    * A URL to remind you what app the OAuth token is for.
    */
  var note_url: js.UndefOr[String] = js.undefined
  /**
    * A list of scopes to remove from this authorization.
    */
  var remove_scopes: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Replaces the authorization scopes with these.
    */
  var scopes: js.UndefOr[js.Array[String]] = js.undefined
}

object OauthAuthorizationsUpdateAuthorizationEndpoint {
  @scala.inline
  def apply(
    authorization_id: Double,
    add_scopes: js.Array[String] = null,
    fingerprint: String = null,
    note: String = null,
    note_url: String = null,
    remove_scopes: js.Array[String] = null,
    scopes: js.Array[String] = null
  ): OauthAuthorizationsUpdateAuthorizationEndpoint = {
    val __obj = js.Dynamic.literal(authorization_id = authorization_id.asInstanceOf[js.Any])
    if (add_scopes != null) __obj.updateDynamic("add_scopes")(add_scopes.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (note_url != null) __obj.updateDynamic("note_url")(note_url.asInstanceOf[js.Any])
    if (remove_scopes != null) __obj.updateDynamic("remove_scopes")(remove_scopes.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[OauthAuthorizationsUpdateAuthorizationEndpoint]
  }
}

