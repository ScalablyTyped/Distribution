package typings.openapiDashSecurityDashHandler.openapiDashSecurityDashHandlerMod

import typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV2.SecurityDefinitionsObject
import typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV2.SecurityRequirementObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenAPISecurityHandlerArgs extends js.Object {
  var loggingKey: String
  var operationSecurity: js.Array[
    SecurityRequirementObject | typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV3.SecurityRequirementObject
  ]
  var securityDefinitions: SecurityDefinitionsObject
  var securityHandlers: SecurityHandlers
}

object OpenAPISecurityHandlerArgs {
  @scala.inline
  def apply(
    loggingKey: String,
    operationSecurity: js.Array[
      SecurityRequirementObject | typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV3.SecurityRequirementObject
    ],
    securityDefinitions: SecurityDefinitionsObject,
    securityHandlers: SecurityHandlers
  ): OpenAPISecurityHandlerArgs = {
    val __obj = js.Dynamic.literal(loggingKey = loggingKey, operationSecurity = operationSecurity, securityDefinitions = securityDefinitions, securityHandlers = securityHandlers)
  
    __obj.asInstanceOf[OpenAPISecurityHandlerArgs]
  }
}

