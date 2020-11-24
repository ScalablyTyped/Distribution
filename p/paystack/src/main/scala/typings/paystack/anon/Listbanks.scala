package typings.paystack.anon

import typings.paystack.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Listbanks extends js.Object {
  
  def list_banks(params: Page): js.Promise[ResponsedataArrayany] = js.native
  
  def resolve_bin(bin: String): js.Promise[Response] = js.native
}
object Listbanks {
  
  @scala.inline
  def apply(list_banks: Page => js.Promise[ResponsedataArrayany], resolve_bin: String => js.Promise[Response]): Listbanks = {
    val __obj = js.Dynamic.literal(list_banks = js.Any.fromFunction1(list_banks), resolve_bin = js.Any.fromFunction1(resolve_bin))
    __obj.asInstanceOf[Listbanks]
  }
  
  @scala.inline
  implicit class ListbanksOps[Self <: Listbanks] (val x: Self) extends AnyVal {
    
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
    def setList_banks(value: Page => js.Promise[ResponsedataArrayany]): Self = this.set("list_banks", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResolve_bin(value: String => js.Promise[Response]): Self = this.set("resolve_bin", js.Any.fromFunction1(value))
  }
}
