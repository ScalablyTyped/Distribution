package typings.openapiDefaultSetter.mod

import typings.openapiTypes.mod.OpenAPIV2.ParameterObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenAPIDefaultSetterArgs extends js.Object {
  var loggingKey: js.UndefOr[String] = js.native
  var parameters: js.Array[ParameterObject | typings.openapiTypes.mod.OpenAPIV3.ParameterObject] = js.native
}

object OpenAPIDefaultSetterArgs {
  @scala.inline
  def apply(parameters: js.Array[ParameterObject | typings.openapiTypes.mod.OpenAPIV3.ParameterObject]): OpenAPIDefaultSetterArgs = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenAPIDefaultSetterArgs]
  }
  @scala.inline
  implicit class OpenAPIDefaultSetterArgsOps[Self <: OpenAPIDefaultSetterArgs] (val x: Self) extends AnyVal {
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
    def setParametersVarargs(value: (ParameterObject | typings.openapiTypes.mod.OpenAPIV3.ParameterObject)*): Self = this.set("parameters", js.Array(value :_*))
    @scala.inline
    def setParameters(value: js.Array[ParameterObject | typings.openapiTypes.mod.OpenAPIV3.ParameterObject]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoggingKey(value: String): Self = this.set("loggingKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoggingKey: Self = this.set("loggingKey", js.undefined)
  }
  
}

