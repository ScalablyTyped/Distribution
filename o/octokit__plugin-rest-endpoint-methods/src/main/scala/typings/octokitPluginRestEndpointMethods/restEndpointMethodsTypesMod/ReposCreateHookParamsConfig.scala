package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateHookParamsConfig extends js.Object {
  /**
    * The media type used to serialize the payloads. Supported values include `json` and `form`. The default is `form`.
    */
  var content_type: js.UndefOr[String] = js.undefined
  /**
    * Determines whether the SSL certificate of the host for `url` will be verified when delivering payloads. Supported values include `0` (verification is performed) and `1` (verification is not performed). The default is `0`. **We strongly recommend not setting this to `1` as you are subject to man-in-the-middle and other attacks.**
    */
  var insecure_ssl: js.UndefOr[String] = js.undefined
  /**
    * If provided, the `secret` will be used as the `key` to generate the HMAC hex digest value in the [`X-Hub-Signature`](https://developer.github.com/webhooks/#delivery-headers) header.
    */
  var secret: js.UndefOr[String] = js.undefined
  /**
    * The URL to which the payloads will be delivered.
    */
  var url: String
}

object ReposCreateHookParamsConfig {
  @scala.inline
  def apply(url: String, content_type: String = null, insecure_ssl: String = null, secret: String = null): ReposCreateHookParamsConfig = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (content_type != null) __obj.updateDynamic("content_type")(content_type.asInstanceOf[js.Any])
    if (insecure_ssl != null) __obj.updateDynamic("insecure_ssl")(insecure_ssl.asInstanceOf[js.Any])
    if (secret != null) __obj.updateDynamic("secret")(secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateHookParamsConfig]
  }
}

