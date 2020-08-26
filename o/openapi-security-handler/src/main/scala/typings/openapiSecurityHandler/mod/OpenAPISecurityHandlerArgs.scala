package typings.openapiSecurityHandler.mod

import typings.openapiTypes.mod.OpenAPIV2.SecurityDefinitionsObject
import typings.openapiTypes.mod.OpenAPIV2.SecurityRequirementObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenAPISecurityHandlerArgs extends js.Object {
  var loggingKey: String = js.native
  var operationSecurity: js.Array[
    SecurityRequirementObject | typings.openapiTypes.mod.OpenAPIV3.SecurityRequirementObject
  ] = js.native
  var securityDefinitions: SecurityDefinitionsObject = js.native
  var securityHandlers: SecurityHandlers = js.native
}

object OpenAPISecurityHandlerArgs {
  @scala.inline
  def apply(
    loggingKey: String,
    operationSecurity: js.Array[
      SecurityRequirementObject | typings.openapiTypes.mod.OpenAPIV3.SecurityRequirementObject
    ],
    securityDefinitions: SecurityDefinitionsObject,
    securityHandlers: SecurityHandlers
  ): OpenAPISecurityHandlerArgs = {
    val __obj = js.Dynamic.literal(loggingKey = loggingKey.asInstanceOf[js.Any], operationSecurity = operationSecurity.asInstanceOf[js.Any], securityDefinitions = securityDefinitions.asInstanceOf[js.Any], securityHandlers = securityHandlers.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenAPISecurityHandlerArgs]
  }
  @scala.inline
  implicit class OpenAPISecurityHandlerArgsOps[Self <: OpenAPISecurityHandlerArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLoggingKey(value: String): Self = this.set("loggingKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperationSecurityVarargs(value: (SecurityRequirementObject | typings.openapiTypes.mod.OpenAPIV3.SecurityRequirementObject)*): Self = this.set("operationSecurity", js.Array(value :_*))
    @scala.inline
    def setOperationSecurity(
      value: js.Array[
          SecurityRequirementObject | typings.openapiTypes.mod.OpenAPIV3.SecurityRequirementObject
        ]
    ): Self = this.set("operationSecurity", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecurityDefinitions(value: SecurityDefinitionsObject): Self = this.set("securityDefinitions", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecurityHandlers(value: SecurityHandlers): Self = this.set("securityHandlers", value.asInstanceOf[js.Any])
  }
  
}

