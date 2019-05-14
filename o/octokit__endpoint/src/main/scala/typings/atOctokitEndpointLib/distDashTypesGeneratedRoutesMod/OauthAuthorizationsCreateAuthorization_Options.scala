package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OauthAuthorizationsCreateAuthorization_Options extends js.Object {
  var client_id: js.UndefOr[java.lang.String] = js.undefined
  var client_secret: js.UndefOr[java.lang.String] = js.undefined
  var fingerprint: js.UndefOr[java.lang.String] = js.undefined
  var note: java.lang.String
  var note_url: js.UndefOr[java.lang.String] = js.undefined
  var scopes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object OauthAuthorizationsCreateAuthorization_Options {
  @scala.inline
  def apply(
    note: java.lang.String,
    client_id: java.lang.String = null,
    client_secret: java.lang.String = null,
    fingerprint: java.lang.String = null,
    note_url: java.lang.String = null,
    scopes: js.Array[java.lang.String] = null
  ): OauthAuthorizationsCreateAuthorization_Options = {
    val __obj = js.Dynamic.literal(note = note)
    if (client_id != null) __obj.updateDynamic("client_id")(client_id)
    if (client_secret != null) __obj.updateDynamic("client_secret")(client_secret)
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint)
    if (note_url != null) __obj.updateDynamic("note_url")(note_url)
    if (scopes != null) __obj.updateDynamic("scopes")(scopes)
    __obj.asInstanceOf[OauthAuthorizationsCreateAuthorization_Options]
  }
}

