package typings.node.http2Mod

import typings.node.tlsMod.TlsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecureServerOptions
  extends TlsOptions
     with ServerSessionOptions {
  var allowHTTP1: js.UndefOr[Boolean] = js.native
  var origins: js.UndefOr[js.Array[String]] = js.native
}

object SecureServerOptions {
  @scala.inline
  def apply(): SecureServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecureServerOptions]
  }
  @scala.inline
  implicit class SecureServerOptionsOps[Self <: SecureServerOptions] (val x: Self) extends AnyVal {
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
    def setAllowHTTP1(value: Boolean): Self = this.set("allowHTTP1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowHTTP1: Self = this.set("allowHTTP1", js.undefined)
    @scala.inline
    def setOriginsVarargs(value: String*): Self = this.set("origins", js.Array(value :_*))
    @scala.inline
    def setOrigins(value: js.Array[String]): Self = this.set("origins", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigins: Self = this.set("origins", js.undefined)
  }
  
}

