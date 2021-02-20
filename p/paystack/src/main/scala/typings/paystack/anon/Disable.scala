package typings.paystack.anon

import typings.paystack.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Disable extends StObject {
  
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
  implicit class DisableMutableBuilder[Self <: Disable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: Authorization => js.Promise[Response]): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisable(value: Code => js.Promise[Responsedataundefined]): Self = StObject.set(x, "disable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnable(value: Code => js.Promise[Responsedataundefined]): Self = StObject.set(x, "enable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: String => js.Promise[Response]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setList(value: () => js.Promise[ResponsedataArrayanymetaa]): Self = StObject.set(x, "list", js.Any.fromFunction0(value))
  }
}
