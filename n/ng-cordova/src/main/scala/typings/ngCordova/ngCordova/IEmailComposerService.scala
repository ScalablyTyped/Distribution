package typings.ngCordova.ngCordova

import typings.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEmailComposerService extends js.Object {
  
  def addAlias(app: String, schema: String): Unit = js.native
  
  def isAvailable(): IPromise[Boolean] = js.native
  
  def open(properties: IEmailComposerOptions): IPromise[_] = js.native
}
object IEmailComposerService {
  
  @scala.inline
  def apply(
    addAlias: (String, String) => Unit,
    isAvailable: () => IPromise[Boolean],
    open: IEmailComposerOptions => IPromise[_]
  ): IEmailComposerService = {
    val __obj = js.Dynamic.literal(addAlias = js.Any.fromFunction2(addAlias), isAvailable = js.Any.fromFunction0(isAvailable), open = js.Any.fromFunction1(open))
    __obj.asInstanceOf[IEmailComposerService]
  }
  
  @scala.inline
  implicit class IEmailComposerServiceOps[Self <: IEmailComposerService] (val x: Self) extends AnyVal {
    
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
    def setAddAlias(value: (String, String) => Unit): Self = this.set("addAlias", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIsAvailable(value: () => IPromise[Boolean]): Self = this.set("isAvailable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpen(value: IEmailComposerOptions => IPromise[_]): Self = this.set("open", js.Any.fromFunction1(value))
  }
}
