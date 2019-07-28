package typings.nodemailer.libXoauth2Mod

import typings.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestParams extends js.Object {
  var customHeaders: js.UndefOr[OutgoingHttpHeaders] = js.undefined
}

object RequestParams {
  @scala.inline
  def apply(customHeaders: OutgoingHttpHeaders = null): RequestParams = {
    val __obj = js.Dynamic.literal()
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders)
    __obj.asInstanceOf[RequestParams]
  }
}

