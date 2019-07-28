package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OauthAuthorizationsCreateAuthorizationEndpoint extends js.Object {
  var client_id: js.UndefOr[String] = js.undefined
  var client_secret: js.UndefOr[String] = js.undefined
  var fingerprint: js.UndefOr[String] = js.undefined
  var note: String
  var note_url: js.UndefOr[String] = js.undefined
  var scopes: js.UndefOr[js.Array[String]] = js.undefined
}

object OauthAuthorizationsCreateAuthorizationEndpoint {
  @scala.inline
  def apply(
    note: String,
    client_id: String = null,
    client_secret: String = null,
    fingerprint: String = null,
    note_url: String = null,
    scopes: js.Array[String] = null
  ): OauthAuthorizationsCreateAuthorizationEndpoint = {
    val __obj = js.Dynamic.literal(note = note)
    if (client_id != null) __obj.updateDynamic("client_id")(client_id)
    if (client_secret != null) __obj.updateDynamic("client_secret")(client_secret)
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint)
    if (note_url != null) __obj.updateDynamic("note_url")(note_url)
    if (scopes != null) __obj.updateDynamic("scopes")(scopes)
    __obj.asInstanceOf[OauthAuthorizationsCreateAuthorizationEndpoint]
  }
}

