package typings.mendixmodelsdk.transportationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRequestOptions extends js.Object {
  var body: js.UndefOr[js.Object] = js.native
  var headers: js.UndefOr[js.Object] = js.native
  var longTimeout: js.UndefOr[Boolean] = js.native
  var method: RequestMethod = js.native
  var url: String = js.native
}

object IRequestOptions {
  @scala.inline
  def apply(method: RequestMethod, url: String): IRequestOptions = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRequestOptions]
  }
  @scala.inline
  implicit class IRequestOptionsOps[Self <: IRequestOptions] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setBody(value: js.Object): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setLongTimeout(value: Boolean): Self = this.set("longTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLongTimeout: Self = this.set("longTimeout", js.undefined)
  }
  
}

