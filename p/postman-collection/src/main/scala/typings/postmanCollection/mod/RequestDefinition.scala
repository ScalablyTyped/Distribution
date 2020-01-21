package typings.postmanCollection.mod

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
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (certificate != null) __obj.updateDynamic("certificate")(certificate.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestDefinition]
  }
}

