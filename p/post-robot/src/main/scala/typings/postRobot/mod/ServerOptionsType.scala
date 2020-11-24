package typings.postRobot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerOptionsType extends js.Object {
  
  var domain: js.UndefOr[DomainMatcher] = js.native
  
  var errorHandler: js.UndefOr[ErrorHandlerType] = js.native
  
  var errorOnClose: js.UndefOr[Boolean] = js.native
  
  var handler: js.UndefOr[HandlerType] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var once: js.UndefOr[Boolean] = js.native
  
  var window: js.UndefOr[CrossDomainWindowType] = js.native
}
object ServerOptionsType {
  
  @scala.inline
  def apply(): ServerOptionsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerOptionsType]
  }
  
  @scala.inline
  implicit class ServerOptionsTypeOps[Self <: ServerOptionsType] (val x: Self) extends AnyVal {
    
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
    def setDomainVarargs(value: String*): Self = this.set("domain", js.Array(value :_*))
    
    @scala.inline
    def setDomain(value: DomainMatcher): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setErrorHandler(value: /* err */ js.Any => Unit): Self = this.set("errorHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteErrorHandler: Self = this.set("errorHandler", js.undefined)
    
    @scala.inline
    def setErrorOnClose(value: Boolean): Self = this.set("errorOnClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorOnClose: Self = this.set("errorOnClose", js.undefined)
    
    @scala.inline
    def setHandler(
      value: (/* source */ CrossDomainWindowType, /* origin */ String, /* data */ js.Object) => Unit | ZalgoPromise[js.Any]
    ): Self = this.set("handler", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteHandler: Self = this.set("handler", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOnce(value: Boolean): Self = this.set("once", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnce: Self = this.set("once", js.undefined)
    
    @scala.inline
    def setWindow(value: CrossDomainWindowType): Self = this.set("window", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindow: Self = this.set("window", js.undefined)
    
    @scala.inline
    def setWindowNull: Self = this.set("window", null)
  }
}
