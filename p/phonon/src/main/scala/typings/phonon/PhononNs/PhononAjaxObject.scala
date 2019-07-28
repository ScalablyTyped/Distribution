package typings.phonon.PhononNs

import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhononAjaxObject extends js.Object {
  var contentType: js.UndefOr[String] = js.undefined
  var crossDomain: js.UndefOr[Boolean] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var dataType: String
  var error: js.UndefOr[
    js.Function3[/* res */ js.Any, /* flagError */ PhononAjaxErrorFlag, /* xhr */ XMLHttpRequest, Unit]
  ] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var method: String
  var timeout: js.UndefOr[Double] = js.undefined
  var url: String
  def success(res: js.Any, xhr: XMLHttpRequest): Unit
}

object PhononAjaxObject {
  @scala.inline
  def apply(
    dataType: String,
    method: String,
    success: (js.Any, XMLHttpRequest) => Unit,
    url: String,
    contentType: String = null,
    crossDomain: js.UndefOr[Boolean] = js.undefined,
    data: js.Any = null,
    error: (/* res */ js.Any, /* flagError */ PhononAjaxErrorFlag, /* xhr */ XMLHttpRequest) => Unit = null,
    headers: js.Any = null,
    timeout: Int | Double = null
  ): PhononAjaxObject = {
    val __obj = js.Dynamic.literal(dataType = dataType, method = method, success = js.Any.fromFunction2(success), url = url)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (!js.isUndefined(crossDomain)) __obj.updateDynamic("crossDomain")(crossDomain)
    if (data != null) __obj.updateDynamic("data")(data)
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction3(error))
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhononAjaxObject]
  }
}

