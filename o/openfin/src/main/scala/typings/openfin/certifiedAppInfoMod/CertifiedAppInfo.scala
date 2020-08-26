package typings.openfin.certifiedAppInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertifiedAppInfo extends js.Object {
  var isCertified: js.UndefOr[Boolean] = js.native
  var isOptedIntoCertfiedApp: js.UndefOr[Boolean] = js.native
  var isPresentInAppDirectory: js.UndefOr[Boolean] = js.native
  var isRunning: Boolean = js.native
  var isSSLCertified: js.UndefOr[Boolean] = js.native
}

object CertifiedAppInfo {
  @scala.inline
  def apply(isRunning: Boolean): CertifiedAppInfo = {
    val __obj = js.Dynamic.literal(isRunning = isRunning.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertifiedAppInfo]
  }
  @scala.inline
  implicit class CertifiedAppInfoOps[Self <: CertifiedAppInfo] (val x: Self) extends AnyVal {
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
    def setIsRunning(value: Boolean): Self = this.set("isRunning", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsCertified(value: Boolean): Self = this.set("isCertified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsCertified: Self = this.set("isCertified", js.undefined)
    @scala.inline
    def setIsOptedIntoCertfiedApp(value: Boolean): Self = this.set("isOptedIntoCertfiedApp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsOptedIntoCertfiedApp: Self = this.set("isOptedIntoCertfiedApp", js.undefined)
    @scala.inline
    def setIsPresentInAppDirectory(value: Boolean): Self = this.set("isPresentInAppDirectory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPresentInAppDirectory: Self = this.set("isPresentInAppDirectory", js.undefined)
    @scala.inline
    def setIsSSLCertified(value: Boolean): Self = this.set("isSSLCertified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSSLCertified: Self = this.set("isSSLCertified", js.undefined)
  }
  
}

