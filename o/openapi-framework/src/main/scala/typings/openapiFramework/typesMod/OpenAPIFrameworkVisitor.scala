package typings.openapiFramework.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenAPIFrameworkVisitor extends js.Object {
  
  var visitApi: js.UndefOr[js.Function1[/* context */ OpenAPIFrameworkAPIContext, Unit]] = js.native
  
  var visitOperation: js.UndefOr[js.Function1[/* context */ OpenAPIFrameworkOperationContext, Unit]] = js.native
  
  var visitPath: js.UndefOr[js.Function1[/* context */ OpenAPIFrameworkPathContext, Unit]] = js.native
}
object OpenAPIFrameworkVisitor {
  
  @scala.inline
  def apply(): OpenAPIFrameworkVisitor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenAPIFrameworkVisitor]
  }
  
  @scala.inline
  implicit class OpenAPIFrameworkVisitorOps[Self <: OpenAPIFrameworkVisitor] (val x: Self) extends AnyVal {
    
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
    def setVisitApi(value: /* context */ OpenAPIFrameworkAPIContext => Unit): Self = this.set("visitApi", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteVisitApi: Self = this.set("visitApi", js.undefined)
    
    @scala.inline
    def setVisitOperation(value: /* context */ OpenAPIFrameworkOperationContext => Unit): Self = this.set("visitOperation", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteVisitOperation: Self = this.set("visitOperation", js.undefined)
    
    @scala.inline
    def setVisitPath(value: /* context */ OpenAPIFrameworkPathContext => Unit): Self = this.set("visitPath", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteVisitPath: Self = this.set("visitPath", js.undefined)
  }
}
