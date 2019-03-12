package typings
package phononLib.PhononNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhononAjaxObject extends js.Object {
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  var crossDomain: js.UndefOr[scala.Boolean] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var dataType: java.lang.String
  var error: js.UndefOr[
    js.Function3[
      /* res */ js.Any, 
      /* flagError */ PhononAjaxErrorFlag, 
      /* xhr */ stdLib.XMLHttpRequest, 
      scala.Unit
    ]
  ] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var method: java.lang.String
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var url: java.lang.String
  def success(res: js.Any, xhr: stdLib.XMLHttpRequest): scala.Unit
}

object PhononAjaxObject {
  @scala.inline
  def apply(
    dataType: java.lang.String,
    method: java.lang.String,
    success: (js.Any, stdLib.XMLHttpRequest) => scala.Unit,
    url: java.lang.String,
    contentType: java.lang.String = null,
    crossDomain: js.UndefOr[scala.Boolean] = js.undefined,
    data: js.Any = null,
    error: (/* res */ js.Any, /* flagError */ PhononAjaxErrorFlag, /* xhr */ stdLib.XMLHttpRequest) => scala.Unit = null,
    headers: js.Any = null,
    timeout: scala.Int | scala.Double = null
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

