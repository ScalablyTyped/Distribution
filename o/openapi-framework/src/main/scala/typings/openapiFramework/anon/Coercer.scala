package typings.openapiFramework.anon

import typings.openapiDefaultSetter.mod.IOpenAPIDefaultSetter
import typings.openapiRequestCoercer.mod.IOpenAPIRequestCoercer
import typings.openapiRequestValidator.mod.IOpenAPIRequestValidator
import typings.openapiResponseValidator.mod.IOpenAPIResponseValidator
import typings.openapiSecurityHandler.mod.IOpenAPISecurityHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Coercer extends js.Object {
  
  var coercer: js.UndefOr[IOpenAPIRequestCoercer] = js.native
  
  var defaultSetter: js.UndefOr[IOpenAPIDefaultSetter] = js.native
  
  var requestValidator: js.UndefOr[IOpenAPIRequestValidator] = js.native
  
  var responseValidator: js.UndefOr[IOpenAPIResponseValidator] = js.native
  
  var securityHandler: js.UndefOr[IOpenAPISecurityHandler] = js.native
}
object Coercer {
  
  @scala.inline
  def apply(): Coercer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Coercer]
  }
  
  @scala.inline
  implicit class CoercerOps[Self <: Coercer] (val x: Self) extends AnyVal {
    
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
    def setCoercer(value: IOpenAPIRequestCoercer): Self = this.set("coercer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoercer: Self = this.set("coercer", js.undefined)
    
    @scala.inline
    def setDefaultSetter(value: IOpenAPIDefaultSetter): Self = this.set("defaultSetter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSetter: Self = this.set("defaultSetter", js.undefined)
    
    @scala.inline
    def setRequestValidator(value: IOpenAPIRequestValidator): Self = this.set("requestValidator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestValidator: Self = this.set("requestValidator", js.undefined)
    
    @scala.inline
    def setResponseValidator(value: IOpenAPIResponseValidator): Self = this.set("responseValidator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseValidator: Self = this.set("responseValidator", js.undefined)
    
    @scala.inline
    def setSecurityHandler(value: IOpenAPISecurityHandler): Self = this.set("securityHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityHandler: Self = this.set("securityHandler", js.undefined)
  }
}
