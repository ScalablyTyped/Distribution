package typings
package nodemailerLib.libXoauth2Mod.XOAuth2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestParams extends js.Object {
  var customHeaders: js.UndefOr[nodeLib.httpMod.OutgoingHttpHeaders] = js.undefined
}

object RequestParams {
  @scala.inline
  def apply(customHeaders: nodeLib.httpMod.OutgoingHttpHeaders = null): RequestParams = {
    val __obj = js.Dynamic.literal()
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders)
    __obj.asInstanceOf[RequestParams]
  }
}

