package typings.pkgcloud.mod

import typings.pkgcloud.pkgcloudStrings.google
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleProviderOptions extends js.Object {
  var keyFilename: String = js.native
  var projectId: String = js.native
  var provider: google = js.native
}

object GoogleProviderOptions {
  @scala.inline
  def apply(keyFilename: String, projectId: String, provider: google): GoogleProviderOptions = {
    val __obj = js.Dynamic.literal(keyFilename = keyFilename.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleProviderOptions]
  }
  @scala.inline
  implicit class GoogleProviderOptionsOps[Self <: GoogleProviderOptions] (val x: Self) extends AnyVal {
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
    def setKeyFilename(value: String): Self = this.set("keyFilename", value.asInstanceOf[js.Any])
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvider(value: google): Self = this.set("provider", value.asInstanceOf[js.Any])
  }
  
}

