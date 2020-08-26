package typings.nodemailerSmtpTransport.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthOptions extends js.Object {
  /** is the access token for the user. Required only if refreshToken is not available and there is no token refresh callback specified */
  var accessToken: js.UndefOr[String] = js.native
  /** is an optional HTTP endpoint for requesting new access tokens. This value defaults to Gmail */
  var accessUrl: js.UndefOr[String] = js.native
  /** is the registered client id of the application */
  var clientId: js.UndefOr[String] = js.native
  /** is the registered client secret of the application */
  var clientSecret: js.UndefOr[String] = js.native
  /** is an optional expiration time for the current accessToken */
  var expires: js.UndefOr[Double] = js.native
  /** is the password for the user if normal login is used */
  var pass: js.UndefOr[String] = js.native
  /** is the private key contents, you can find it from the “private_key” field in the service key file */
  var privateKey: js.UndefOr[String] = js.native
  /** is an optional refresh token. If it is provided then Nodemailer tries to generate a new access token if existing one expires or fails */
  var refreshToken: js.UndefOr[String] = js.native
  /** service client id, you can find it from the “client_id” field in the service key file */
  var serviceClient: js.UndefOr[String] = js.native
  /** indicates the authetication type, defaults to ‘login’, other option is ‘oauth2’ */
  var `type`: js.UndefOr[js.Any] = js.native
  /** is the username */
  var user: js.UndefOr[String] = js.native
}

object AuthOptions {
  @scala.inline
  def apply(): AuthOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthOptions]
  }
  @scala.inline
  implicit class AuthOptionsOps[Self <: AuthOptions] (val x: Self) extends AnyVal {
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
    def setAccessToken(value: String): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessToken: Self = this.set("accessToken", js.undefined)
    @scala.inline
    def setAccessUrl(value: String): Self = this.set("accessUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessUrl: Self = this.set("accessUrl", js.undefined)
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    @scala.inline
    def setClientSecret(value: String): Self = this.set("clientSecret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientSecret: Self = this.set("clientSecret", js.undefined)
    @scala.inline
    def setExpires(value: Double): Self = this.set("expires", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpires: Self = this.set("expires", js.undefined)
    @scala.inline
    def setPass(value: String): Self = this.set("pass", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePass: Self = this.set("pass", js.undefined)
    @scala.inline
    def setPrivateKey(value: String): Self = this.set("privateKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateKey: Self = this.set("privateKey", js.undefined)
    @scala.inline
    def setRefreshToken(value: String): Self = this.set("refreshToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefreshToken: Self = this.set("refreshToken", js.undefined)
    @scala.inline
    def setServiceClient(value: String): Self = this.set("serviceClient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceClient: Self = this.set("serviceClient", js.undefined)
    @scala.inline
    def setType(value: js.Any): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
  
}

