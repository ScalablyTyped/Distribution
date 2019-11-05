package typings.openapiDashRequestDashCoercer.openapiDashRequestDashCoercerMod

import typings.openapiDashTypes.openapiDashTypesMod.OpenAPI.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenAPIRequestCoercerArgs extends js.Object {
  var enableObjectCoercion: js.UndefOr[Boolean] = js.undefined
  var extensionBase: js.UndefOr[String] = js.undefined
  var loggingKey: js.UndefOr[String] = js.undefined
  var parameters: Parameters
}

object OpenAPIRequestCoercerArgs {
  @scala.inline
  def apply(
    parameters: Parameters,
    enableObjectCoercion: js.UndefOr[Boolean] = js.undefined,
    extensionBase: String = null,
    loggingKey: String = null
  ): OpenAPIRequestCoercerArgs = {
    val __obj = js.Dynamic.literal(parameters = parameters)
    if (!js.isUndefined(enableObjectCoercion)) __obj.updateDynamic("enableObjectCoercion")(enableObjectCoercion)
    if (extensionBase != null) __obj.updateDynamic("extensionBase")(extensionBase)
    if (loggingKey != null) __obj.updateDynamic("loggingKey")(loggingKey)
    __obj.asInstanceOf[OpenAPIRequestCoercerArgs]
  }
}

