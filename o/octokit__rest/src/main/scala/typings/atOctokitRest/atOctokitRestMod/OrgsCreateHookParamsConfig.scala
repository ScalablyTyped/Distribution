package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsCreateHookParamsConfig extends js.Object {
  var content_type: js.UndefOr[String] = js.undefined
  var insecure_ssl: js.UndefOr[String] = js.undefined
  var secret: js.UndefOr[String] = js.undefined
  var url: String
}

object OrgsCreateHookParamsConfig {
  @scala.inline
  def apply(url: String, content_type: String = null, insecure_ssl: String = null, secret: String = null): OrgsCreateHookParamsConfig = {
    val __obj = js.Dynamic.literal(url = url)
    if (content_type != null) __obj.updateDynamic("content_type")(content_type)
    if (insecure_ssl != null) __obj.updateDynamic("insecure_ssl")(insecure_ssl)
    if (secret != null) __obj.updateDynamic("secret")(secret)
    __obj.asInstanceOf[OrgsCreateHookParamsConfig]
  }
}

