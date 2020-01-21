package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateHookParamsConfig extends js.Object {
  var content_type: js.UndefOr[String] = js.undefined
  var insecure_ssl: js.UndefOr[String] = js.undefined
  var secret: js.UndefOr[String] = js.undefined
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

