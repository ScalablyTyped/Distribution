package typings
package mendixmodelsdkLib.distSdkInternalTransportationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRequestOptions extends js.Object {
  var body: js.UndefOr[js.Object] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var longTimeout: js.UndefOr[scala.Boolean] = js.undefined
  var method: RequestMethod
  var url: java.lang.String
}

object IRequestOptions {
  @scala.inline
  def apply(
    method: RequestMethod,
    url: java.lang.String,
    body: js.Object = null,
    headers: js.Object = null,
    longTimeout: js.UndefOr[scala.Boolean] = js.undefined
  ): IRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("url")(url)
    if (body != null) __obj.updateDynamic("body")(body)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(longTimeout)) __obj.updateDynamic("longTimeout")(longTimeout)
    __obj.asInstanceOf[IRequestOptions]
  }
}

