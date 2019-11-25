package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Auth extends js.Object {
  var auth: js.UndefOr[String] = js.undefined
  var beforeSend: js.UndefOr[js.Function] = js.undefined
  var content: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[js.Object] = js.undefined
  var followRedirects: js.UndefOr[Boolean] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var npmRequestOptions: js.UndefOr[js.Object] = js.undefined
  var params: js.UndefOr[js.Object] = js.undefined
  var query: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object Anon_Auth {
  @scala.inline
  def apply(
    auth: String = null,
    beforeSend: js.Function = null,
    content: String = null,
    data: js.Object = null,
    followRedirects: js.UndefOr[Boolean] = js.undefined,
    headers: js.Object = null,
    npmRequestOptions: js.Object = null,
    params: js.Object = null,
    query: String = null,
    timeout: Int | Double = null
  ): Anon_Auth = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(beforeSend.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(followRedirects)) __obj.updateDynamic("followRedirects")(followRedirects.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (npmRequestOptions != null) __obj.updateDynamic("npmRequestOptions")(npmRequestOptions.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Auth]
  }
}

