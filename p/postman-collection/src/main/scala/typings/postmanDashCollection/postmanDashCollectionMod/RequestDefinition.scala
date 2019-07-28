package typings.postmanDashCollection.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestDefinition extends PropertyDefinition {
  var auth: js.UndefOr[RequestAuthDefinition] = js.undefined
  var body: js.UndefOr[RequestBody] = js.undefined
  var certificate: js.UndefOr[CertificateDefinition] = js.undefined
  var header: js.UndefOr[HeaderDefinition] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var proxy: js.UndefOr[ProxyConfigDefinition] = js.undefined
  var url: String | Url
}

object RequestDefinition {
  @scala.inline
  def apply(
    url: String | Url,
    auth: RequestAuthDefinition = null,
    body: RequestBody = null,
    certificate: CertificateDefinition = null,
    description: String | DescriptionDefinition = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    header: HeaderDefinition = null,
    id: String = null,
    method: String = null,
    name: String = null,
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

