package typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV3Ns

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
    if (description != null) __obj.updateDynamic("description")(description)
    if (operationId != null) __obj.updateDynamic("operationId")(operationId)
    if (operationRef != null) __obj.updateDynamic("operationRef")(operationRef)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    if (requestBody != null) __obj.updateDynamic("requestBody")(requestBody)
    if (server != null) __obj.updateDynamic("server")(server)
    __obj.asInstanceOf[LinkObject]
  }
}

