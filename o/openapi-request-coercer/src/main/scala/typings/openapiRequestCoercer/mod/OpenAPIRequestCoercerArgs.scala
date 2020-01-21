package typings.openapiRequestCoercer.mod

import typings.openapiTypes.mod.OpenAPI.Parameters
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
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    if (!js.isUndefined(enableObjectCoercion)) __obj.updateDynamic("enableObjectCoercion")(enableObjectCoercion.asInstanceOf[js.Any])
    if (extensionBase != null) __obj.updateDynamic("extensionBase")(extensionBase.asInstanceOf[js.Any])
    if (loggingKey != null) __obj.updateDynamic("loggingKey")(loggingKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenAPIRequestCoercerArgs]
  }
}

