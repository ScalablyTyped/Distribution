package typings.openseadragon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var headers: js.Object
  var responseType: String
  var url: String
  var withCredentials: js.UndefOr[Boolean] = js.undefined
  def error(obj: js.Object): Unit
  def success(obj: js.Object): Unit
}

object Error {
  @scala.inline
  def apply(
    error: js.Object => Unit,
    headers: js.Object,
    responseType: String,
    success: js.Object => Unit,
    url: String,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): Error = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), headers = headers.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any], success = js.Any.fromFunction1(success), url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
}

