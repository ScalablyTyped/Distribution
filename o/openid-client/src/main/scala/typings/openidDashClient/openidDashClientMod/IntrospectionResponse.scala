package typings.openidDashClient.openidDashClientMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionResponse
  extends /* key */ StringDictionary[js.Any] {
  val active: Boolean
  val aud: js.UndefOr[String] = js.undefined
  val client_id: js.UndefOr[String] = js.undefined
  val exp: js.UndefOr[Double] = js.undefined
  val iat: js.UndefOr[Double] = js.undefined
  val iss: js.UndefOr[String] = js.undefined
  val jti: js.UndefOr[String] = js.undefined
  val nbf: js.UndefOr[Double] = js.undefined
  val scope: js.UndefOr[String] = js.undefined
  val sub: js.UndefOr[String] = js.undefined
  val token_type: js.UndefOr[String] = js.undefined
  val username: js.UndefOr[String] = js.undefined
}

object IntrospectionResponse {
  @scala.inline
  def apply(
    active: Boolean,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    aud: String = null,
    client_id: String = null,
    exp: Int | Double = null,
    iat: Int | Double = null,
    iss: String = null,
    jti: String = null,
    nbf: Int | Double = null,
    scope: String = null,
    sub: String = null,
    token_type: String = null,
    username: String = null
  ): IntrospectionResponse = {
    val __obj = js.Dynamic.literal(active = active)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (aud != null) __obj.updateDynamic("aud")(aud)
    if (client_id != null) __obj.updateDynamic("client_id")(client_id)
    if (exp != null) __obj.updateDynamic("exp")(exp.asInstanceOf[js.Any])
    if (iat != null) __obj.updateDynamic("iat")(iat.asInstanceOf[js.Any])
    if (iss != null) __obj.updateDynamic("iss")(iss)
    if (jti != null) __obj.updateDynamic("jti")(jti)
    if (nbf != null) __obj.updateDynamic("nbf")(nbf.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (sub != null) __obj.updateDynamic("sub")(sub)
    if (token_type != null) __obj.updateDynamic("token_type")(token_type)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[IntrospectionResponse]
  }
}

