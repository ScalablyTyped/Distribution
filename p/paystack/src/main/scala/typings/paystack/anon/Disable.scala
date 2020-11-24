package typings.paystack.anon

import typings.paystack.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Disable extends js.Object {
  
  def create(params: Authorization): js.Promise[Response] = js.native
  
  def disable(params: Code): js.Promise[Responsedataundefined] = js.native
  
  def enable(params: Code): js.Promise[Responsedataundefined] = js.native
  
  def get(id_or_subscription_code: String): js.Promise[Response] = js.native
  
  def list(): js.Promise[ResponsedataArrayanymetaa] = js.native
}
object Disable {
  
  @scala.inline
  def apply(
    create: Authorization => js.Promise[Response],
    disable: Code => js.Promise[Responsedataundefined],
    enable: Code => js.Promise[Responsedataundefined],
    get: String => js.Promise[Response],
    list: () => js.Promise[ResponsedataArrayanymetaa]
  ): Disable = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), disable = js.Any.fromFunction1(disable), enable = js.Any.fromFunction1(enable), get = js.Any.fromFunction1(get), list = js.Any.fromFunction0(list))
    __obj.asInstanceOf[Disable]
  }
  
  @scala.inline
  implicit class DisableOps[Self <: Disable] (val x: Self) extends AnyVal {
    
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
    def setCreate(value: Authorization => js.Promise[Response]): Self = this.set("create", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisable(value: Code => js.Promise[Responsedataundefined]): Self = this.set("disable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnable(value: Code => js.Promise[Responsedataundefined]): Self = this.set("enable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: String => js.Promise[Response]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setList(value: () => js.Promise[ResponsedataArrayanymetaa]): Self = this.set("list", js.Any.fromFunction0(value))
  }
}
