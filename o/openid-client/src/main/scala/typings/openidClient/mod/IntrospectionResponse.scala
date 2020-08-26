package typings.openidClient.mod

import org.scalablytyped.runtime.StringDictionary
import typings.openidClient.anon.X5tS256
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntrospectionResponse
  extends /* key */ StringDictionary[js.Any] {
  var active: Boolean = js.native
  var aud: js.UndefOr[String | js.Array[String]] = js.native
  var client_id: js.UndefOr[String] = js.native
  var cnf: js.UndefOr[X5tS256] = js.native
  var exp: js.UndefOr[Double] = js.native
  var iat: js.UndefOr[Double] = js.native
  var iss: js.UndefOr[String] = js.native
  var jti: js.UndefOr[String] = js.native
  var scope: String = js.native
  var sid: js.UndefOr[String] = js.native
  var token_type: js.UndefOr[String] = js.native
  var username: js.UndefOr[String] = js.native
}

object IntrospectionResponse {
  @scala.inline
  def apply(active: Boolean, scope: String): IntrospectionResponse = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionResponse]
  }
  @scala.inline
  implicit class IntrospectionResponseOps[Self <: IntrospectionResponse] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def setAudVarargs(value: String*): Self = this.set("aud", js.Array(value :_*))
    @scala.inline
    def setAud(value: String | js.Array[String]): Self = this.set("aud", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAud: Self = this.set("aud", js.undefined)
    @scala.inline
    def setClient_id(value: String): Self = this.set("client_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClient_id: Self = this.set("client_id", js.undefined)
    @scala.inline
    def setCnf(value: X5tS256): Self = this.set("cnf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCnf: Self = this.set("cnf", js.undefined)
    @scala.inline
    def setExp(value: Double): Self = this.set("exp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExp: Self = this.set("exp", js.undefined)
    @scala.inline
    def setIat(value: Double): Self = this.set("iat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIat: Self = this.set("iat", js.undefined)
    @scala.inline
    def setIss(value: String): Self = this.set("iss", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIss: Self = this.set("iss", js.undefined)
    @scala.inline
    def setJti(value: String): Self = this.set("jti", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJti: Self = this.set("jti", js.undefined)
    @scala.inline
    def setSid(value: String): Self = this.set("sid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSid: Self = this.set("sid", js.undefined)
    @scala.inline
    def setToken_type(value: String): Self = this.set("token_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToken_type: Self = this.set("token_type", js.undefined)
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
  
}

