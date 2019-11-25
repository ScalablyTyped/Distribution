package typings.mendixmodelsdk.distSdkInternalTransportationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRequestOptions extends js.Object {
  var body: js.UndefOr[js.Object] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var longTimeout: js.UndefOr[Boolean] = js.undefined
  var method: RequestMethod
  var url: String
}

object IRequestOptions {
  @scala.inline
  def apply(
    method: RequestMethod,
    url: String,
    body: js.Object = null,
    headers: js.Object = null,
    longTimeout: js.UndefOr[Boolean] = js.undefined
  ): IRequestOptions = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(longTimeout)) __obj.updateDynamic("longTimeout")(longTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRequestOptions]
  }
}

