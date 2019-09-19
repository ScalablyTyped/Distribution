package typings.orientjs.orientjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DbConnectionConfig extends js.Object {
  var forcePrepare: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var server: js.UndefOr[OServer] = js.undefined
  var sessionId: js.UndefOr[Double] = js.undefined
  var storage: js.UndefOr[String] = js.undefined
  var token: js.UndefOr[js.Any] = js.undefined
  var transformers: js.UndefOr[js.Array[js.Function1[/* item */ ORecord, _]]] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var useToken: js.UndefOr[Boolean] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object DbConnectionConfig {
  @scala.inline
  def apply(
    forcePrepare: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    password: String = null,
    server: OServer = null,
    sessionId: Int | Double = null,
    storage: String = null,
    token: js.Any = null,
    transformers: js.Array[js.Function1[/* item */ ORecord, _]] = null,
    `type`: String = null,
    useToken: js.UndefOr[Boolean] = js.undefined,
    username: String = null
  ): DbConnectionConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(forcePrepare)) __obj.updateDynamic("forcePrepare")(forcePrepare)
    if (name != null) __obj.updateDynamic("name")(name)
    if (password != null) __obj.updateDynamic("password")(password)
    if (server != null) __obj.updateDynamic("server")(server)
    if (sessionId != null) __obj.updateDynamic("sessionId")(sessionId.asInstanceOf[js.Any])
    if (storage != null) __obj.updateDynamic("storage")(storage)
    if (token != null) __obj.updateDynamic("token")(token)
    if (transformers != null) __obj.updateDynamic("transformers")(transformers)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(useToken)) __obj.updateDynamic("useToken")(useToken)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[DbConnectionConfig]
  }
}

