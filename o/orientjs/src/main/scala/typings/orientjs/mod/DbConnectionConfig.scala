package typings.orientjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DbConnectionConfig extends js.Object {
  var forcePrepare: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var password: js.UndefOr[String] = js.native
  var server: js.UndefOr[OServer] = js.native
  var sessionId: js.UndefOr[Double] = js.native
  var storage: js.UndefOr[String] = js.native
  var token: js.UndefOr[js.Any] = js.native
  var transformers: js.UndefOr[js.Array[js.Function1[/* item */ ORecord, _]]] = js.native
  var `type`: js.UndefOr[String] = js.native
  var useToken: js.UndefOr[Boolean] = js.native
  var username: js.UndefOr[String] = js.native
}

object DbConnectionConfig {
  @scala.inline
  def apply(): DbConnectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DbConnectionConfig]
  }
  @scala.inline
  implicit class DbConnectionConfigOps[Self <: DbConnectionConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setForcePrepare(value: Boolean): Self = this.set("forcePrepare", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForcePrepare: Self = this.set("forcePrepare", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setServer(value: OServer): Self = this.set("server", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServer: Self = this.set("server", js.undefined)
    @scala.inline
    def setSessionId(value: Double): Self = this.set("sessionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionId: Self = this.set("sessionId", js.undefined)
    @scala.inline
    def setStorage(value: String): Self = this.set("storage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorage: Self = this.set("storage", js.undefined)
    @scala.inline
    def setToken(value: js.Any): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
    @scala.inline
    def setTransformersVarargs(value: (js.Function1[/* item */ ORecord, js.Any])*): Self = this.set("transformers", js.Array(value :_*))
    @scala.inline
    def setTransformers(value: js.Array[js.Function1[/* item */ ORecord, _]]): Self = this.set("transformers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransformers: Self = this.set("transformers", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUseToken(value: Boolean): Self = this.set("useToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseToken: Self = this.set("useToken", js.undefined)
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
  
}

