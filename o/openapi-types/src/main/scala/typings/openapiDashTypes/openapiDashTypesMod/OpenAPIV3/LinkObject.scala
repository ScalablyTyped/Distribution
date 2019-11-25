package typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkObject extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var operationId: js.UndefOr[String] = js.undefined
  var operationRef: js.UndefOr[String] = js.undefined
  var parameters: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var requestBody: js.UndefOr[js.Any] = js.undefined
  var server: js.UndefOr[ServerObject] = js.undefined
}

object LinkObject {
  @scala.inline
  def apply(
    description: String = null,
    operationId: String = null,
    operationRef: String = null,
    parameters: StringDictionary[js.Any] = null,
    requestBody: js.Any = null,
    server: ServerObject = null
  ): LinkObject = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (operationId != null) __obj.updateDynamic("operationId")(operationId.asInstanceOf[js.Any])
    if (operationRef != null) __obj.updateDynamic("operationRef")(operationRef.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (requestBody != null) __obj.updateDynamic("requestBody")(requestBody.asInstanceOf[js.Any])
    if (server != null) __obj.updateDynamic("server")(server.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkObject]
  }
}

