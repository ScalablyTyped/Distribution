package typings
package openidDashClientLib.openidDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientMetadata extends js.Object {
  val client_id: js.UndefOr[java.lang.String] = js.undefined
  val client_secret: js.UndefOr[java.lang.String] = js.undefined
  val post_logout_redirect_uris: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  val redirect_uris: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  val response_types: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ClientMetadata {
  @scala.inline
  def apply(
    client_id: java.lang.String = null,
    client_secret: java.lang.String = null,
    post_logout_redirect_uris: js.Array[java.lang.String] = null,
    redirect_uris: js.Array[java.lang.String] = null,
    response_types: js.Array[java.lang.String] = null
  ): ClientMetadata = {
    val __obj = js.Dynamic.literal()
    if (client_id != null) __obj.updateDynamic("client_id")(client_id)
    if (client_secret != null) __obj.updateDynamic("client_secret")(client_secret)
    if (post_logout_redirect_uris != null) __obj.updateDynamic("post_logout_redirect_uris")(post_logout_redirect_uris)
    if (redirect_uris != null) __obj.updateDynamic("redirect_uris")(redirect_uris)
    if (response_types != null) __obj.updateDynamic("response_types")(response_types)
    __obj.asInstanceOf[ClientMetadata]
  }
}

