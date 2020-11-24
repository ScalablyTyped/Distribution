package typings.openapiRequestCoercer.mod

import typings.openapiTypes.mod.OpenAPI.Parameters
import typings.openapiTypes.mod.OpenAPIV2.Parameter
import typings.openapiTypes.mod.OpenAPIV3.ParameterObject
import typings.openapiTypes.mod.OpenAPIV3.ReferenceObject
import typings.tsLog.mod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenAPIRequestCoercerArgs extends js.Object {
  
  var coercionStrategy: js.UndefOr[CoercionStrategy] = js.native
  
  var enableObjectCoercion: js.UndefOr[Boolean] = js.native
  
  var extensionBase: js.UndefOr[String] = js.native
  
  var logger: js.UndefOr[Logger] = js.native
  
  var loggingKey: js.UndefOr[String] = js.native
  
  var parameters: Parameters = js.native
}
object OpenAPIRequestCoercerArgs {
  
  @scala.inline
  def apply(parameters: Parameters): OpenAPIRequestCoercerArgs = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenAPIRequestCoercerArgs]
  }
  
  @scala.inline
  implicit class OpenAPIRequestCoercerArgsOps[Self <: OpenAPIRequestCoercerArgs] (val x: Self) extends AnyVal {
    
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
    def setParametersVarargs(
      value: (Parameter | ParameterObject | ReferenceObject | typings.openapiTypes.mod.OpenAPIV2.ReferenceObject)*
    ): Self = this.set("parameters", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: Parameters): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoercionStrategy(value: CoercionStrategy): Self = this.set("coercionStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoercionStrategy: Self = this.set("coercionStrategy", js.undefined)
    
    @scala.inline
    def setEnableObjectCoercion(value: Boolean): Self = this.set("enableObjectCoercion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableObjectCoercion: Self = this.set("enableObjectCoercion", js.undefined)
    
    @scala.inline
    def setExtensionBase(value: String): Self = this.set("extensionBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensionBase: Self = this.set("extensionBase", js.undefined)
    
    @scala.inline
    def setLogger(value: Logger): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    
    @scala.inline
    def setLoggingKey(value: String): Self = this.set("loggingKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoggingKey: Self = this.set("loggingKey", js.undefined)
  }
}
