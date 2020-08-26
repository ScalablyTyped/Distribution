package typings.minio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientOptions extends js.Object {
  var accessKey: String = js.native
  var endPoint: String = js.native
  var partSize: js.UndefOr[Double] = js.native
  var port: js.UndefOr[Double] = js.native
  var region: js.UndefOr[Region] = js.native
  var secretKey: String = js.native
  var sessionToken: js.UndefOr[String] = js.native
  var transport: js.UndefOr[js.Any] = js.native
  var useSSL: js.UndefOr[Boolean] = js.native
}

object ClientOptions {
  @scala.inline
  def apply(accessKey: String, endPoint: String, secretKey: String): ClientOptions = {
    val __obj = js.Dynamic.literal(accessKey = accessKey.asInstanceOf[js.Any], endPoint = endPoint.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
  @scala.inline
  implicit class ClientOptionsOps[Self <: ClientOptions] (val x: Self) extends AnyVal {
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
    def setAccessKey(value: String): Self = this.set("accessKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndPoint(value: String): Self = this.set("endPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecretKey(value: String): Self = this.set("secretKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setPartSize(value: Double): Self = this.set("partSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartSize: Self = this.set("partSize", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setRegion(value: Region): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setSessionToken(value: String): Self = this.set("sessionToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionToken: Self = this.set("sessionToken", js.undefined)
    @scala.inline
    def setTransport(value: js.Any): Self = this.set("transport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransport: Self = this.set("transport", js.undefined)
    @scala.inline
    def setUseSSL(value: Boolean): Self = this.set("useSSL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseSSL: Self = this.set("useSSL", js.undefined)
  }
  
}

