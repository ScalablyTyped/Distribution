package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OauthAuthorizationsUpdateAuthorizationEndpoint extends js.Object {
  var add_scopes: js.UndefOr[js.Array[String]] = js.undefined
  var authorization_id: Double
  var fingerprint: js.UndefOr[String] = js.undefined
  var note: js.UndefOr[String] = js.undefined
  var note_url: js.UndefOr[String] = js.undefined
  var remove_scopes: js.UndefOr[js.Array[String]] = js.undefined
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

