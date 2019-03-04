package typings
package postmanDashCollectionLib.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestDefinition extends PropertyDefinition {
  var auth: js.UndefOr[RequestAuthDefinition] = js.undefined
  var body: js.UndefOr[RequestBody] = js.undefined
  var certificate: js.UndefOr[CertificateDefinition] = js.undefined
  var header: js.UndefOr[HeaderDefinition] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var proxy: js.UndefOr[ProxyConfigDefinition] = js.undefined
  var url: java.lang.String | Url
}

object RequestDefinition {
  @scala.inline
  def apply(
    url: java.lang.String | Url,
    auth: RequestAuthDefinition = null,
    body: RequestBody = null,
    certificate: CertificateDefinition = null,
    description: java.lang.String | DescriptionDefinition = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    header: HeaderDefinition = null,
    id: java.lang.String = null,
    method: java.lang.String = null,
    name: java.lang.String = null,
    proxy: ProxyConfigDefinition = null
  ): RequestDefinition = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (body != null) __obj.updateDynamic("body")(body)
    if (certificate != null) __obj.updateDynamic("certificate")(certificate)
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (header != null) __obj.updateDynamic("header")(header)
    if (id != null) __obj.updateDynamic("id")(id)
    if (method != null) __obj.updateDynamic("method")(method)
    if (name != null) __obj.updateDynamic("name")(name)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    __obj.asInstanceOf[RequestDefinition]
  }
}

