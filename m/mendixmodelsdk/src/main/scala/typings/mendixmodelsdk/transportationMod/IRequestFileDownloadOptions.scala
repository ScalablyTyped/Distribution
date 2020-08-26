package typings.mendixmodelsdk.transportationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRequestFileDownloadOptions extends js.Object {
  var method: RequestMethod = js.native
  var url: String = js.native
}

object IRequestFileDownloadOptions {
  @scala.inline
  def apply(method: RequestMethod, url: String): IRequestFileDownloadOptions = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRequestFileDownloadOptions]
  }
  @scala.inline
  implicit class IRequestFileDownloadOptionsOps[Self <: IRequestFileDownloadOptions] (val x: Self) extends AnyVal {
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
    def setMethod(value: RequestMethod): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

