package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintEndpoint extends js.Object {
  var client_id: String
  var client_secret: String
  var fingerprint: String
  var note: js.UndefOr[String] = js.undefined
  var note_url: js.UndefOr[String] = js.undefined
  var scopes: js.UndefOr[js.Array[String]] = js.undefined
}

object OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintEndpoint {
  @scala.inline
  def apply(
    client_id: String,
    client_secret: String,
    fingerprint: String,
    note: String = null,
    note_url: String = null,
    scopes: js.Array[String] = null
  ): OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintEndpoint = {
    val __obj = js.Dynamic.literal(client_id = client_id, client_secret = client_secret, fingerprint = fingerprint)
    if (note != null) __obj.updateDynamic("note")(note)
    if (note_url != null) __obj.updateDynamic("note_url")(note_url)
    if (scopes != null) __obj.updateDynamic("scopes")(scopes)
    __obj.asInstanceOf[OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintEndpoint]
  }
}

