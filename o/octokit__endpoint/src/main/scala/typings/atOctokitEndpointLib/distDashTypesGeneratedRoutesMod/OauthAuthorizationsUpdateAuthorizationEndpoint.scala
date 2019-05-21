package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OauthAuthorizationsUpdateAuthorizationEndpoint extends js.Object {
  var add_scopes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var authorization_id: scala.Double
  var fingerprint: js.UndefOr[java.lang.String] = js.undefined
  var note: js.UndefOr[java.lang.String] = js.undefined
  var note_url: js.UndefOr[java.lang.String] = js.undefined
  var remove_scopes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var scopes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object OauthAuthorizationsUpdateAuthorizationEndpoint {
  @scala.inline
  def apply(
    authorization_id: scala.Double,
    add_scopes: js.Array[java.lang.String] = null,
    fingerprint: java.lang.String = null,
    note: java.lang.String = null,
    note_url: java.lang.String = null,
    remove_scopes: js.Array[java.lang.String] = null,
    scopes: js.Array[java.lang.String] = null
  ): OauthAuthorizationsUpdateAuthorizationEndpoint = {
    val __obj = js.Dynamic.literal(authorization_id = authorization_id)
    if (add_scopes != null) __obj.updateDynamic("add_scopes")(add_scopes)
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint)
    if (note != null) __obj.updateDynamic("note")(note)
    if (note_url != null) __obj.updateDynamic("note_url")(note_url)
    if (remove_scopes != null) __obj.updateDynamic("remove_scopes")(remove_scopes)
    if (scopes != null) __obj.updateDynamic("scopes")(scopes)
    __obj.asInstanceOf[OauthAuthorizationsUpdateAuthorizationEndpoint]
  }
}

