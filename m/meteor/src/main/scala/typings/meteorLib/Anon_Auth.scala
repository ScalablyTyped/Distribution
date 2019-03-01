package typings
package meteorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Auth extends js.Object {
  var auth: js.UndefOr[java.lang.String] = js.undefined
  var beforeSend: js.UndefOr[js.Function] = js.undefined
  var content: js.UndefOr[java.lang.String] = js.undefined
  var data: js.UndefOr[js.Object] = js.undefined
  var followRedirects: js.UndefOr[scala.Boolean] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var npmRequestOptions: js.UndefOr[js.Object] = js.undefined
  var params: js.UndefOr[js.Object] = js.undefined
  var query: js.UndefOr[java.lang.String] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Auth {
  @scala.inline
  def apply(
    auth: java.lang.String = null,
    beforeSend: js.Function = null,
    content: java.lang.String = null,
    data: js.Object = null,
    followRedirects: js.UndefOr[scala.Boolean] = js.undefined,
    headers: js.Object = null,
    npmRequestOptions: js.Object = null,
    params: js.Object = null,
    query: java.lang.String = null,
    timeout: scala.Int | scala.Double = null
  ): Anon_Auth = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(beforeSend)
    if (content != null) __obj.updateDynamic("content")(content)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(followRedirects)) __obj.updateDynamic("followRedirects")(followRedirects)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (npmRequestOptions != null) __obj.updateDynamic("npmRequestOptions")(npmRequestOptions)
    if (params != null) __obj.updateDynamic("params")(params)
    if (query != null) __obj.updateDynamic("query")(query)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Auth]
  }
}

