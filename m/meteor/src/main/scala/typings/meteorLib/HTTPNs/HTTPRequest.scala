package typings
package meteorLib.HTTPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTTPRequest extends js.Object {
  var auth: js.UndefOr[java.lang.String] = js.undefined
  var content: js.UndefOr[java.lang.String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var followRedirects: js.UndefOr[scala.Boolean] = js.undefined
  var headers: /* import warning: ImportType.apply Failed type conversion: {[id: string] : string, [id: string] : string} */ js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: {[id: string] : string, [id: string] : string} */ js.Any
  ] = js.undefined
  var params: /* import warning: ImportType.apply Failed type conversion: {[id: string] : string, [id: string] : string} */ js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: {[id: string] : string, [id: string] : string} */ js.Any
  ] = js.undefined
  var query: js.UndefOr[java.lang.String] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object HTTPRequest {
  @scala.inline
  def apply(
    auth: java.lang.String = null,
    content: java.lang.String = null,
    data: js.Any = null,
    followRedirects: js.UndefOr[scala.Boolean] = js.undefined,
    headers: /* import warning: ImportType.apply Failed type conversion: {[id: string] : string, [id: string] : string} */ js.Any = null,
    params: /* import warning: ImportType.apply Failed type conversion: {[id: string] : string, [id: string] : string} */ js.Any = null,
    query: java.lang.String = null,
    timeout: scala.Int | scala.Double = null
  ): HTTPRequest = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (content != null) __obj.updateDynamic("content")(content)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(followRedirects)) __obj.updateDynamic("followRedirects")(followRedirects)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (params != null) __obj.updateDynamic("params")(params)
    if (query != null) __obj.updateDynamic("query")(query)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTTPRequest]
  }
}

