package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OauthAuthorizationsGetOrCreateAuthorizationForAppFingerprintEndpoint extends js.Object {
  var client_id: java.lang.String
  var client_secret: java.lang.String
  var fingerprint: java.lang.String
  var note: js.UndefOr[java.lang.String] = js.undefined
  var note_url: js.UndefOr[java.lang.String] = js.undefined
  var scopes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object OauthAuthorizationsGetOrCreateAuthorizationForAppFingerprintEndpoint {
  @scala.inline
  def apply(
    client_id: java.lang.String,
    client_secret: java.lang.String,
    fingerprint: java.lang.String,
    note: java.lang.String = null,
    note_url: java.lang.String = null,
    scopes: js.Array[java.lang.String] = null
  ): OauthAuthorizationsGetOrCreateAuthorizationForAppFingerprintEndpoint = {
    val __obj = js.Dynamic.literal(client_id = client_id, client_secret = client_secret, fingerprint = fingerprint)
    if (note != null) __obj.updateDynamic("note")(note)
    if (note_url != null) __obj.updateDynamic("note_url")(note_url)
    if (scopes != null) __obj.updateDynamic("scopes")(scopes)
    __obj.asInstanceOf[OauthAuthorizationsGetOrCreateAuthorizationForAppFingerprintEndpoint]
  }
}

