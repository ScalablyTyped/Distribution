package typings.onfidoSdkUi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnfidoHandle extends js.Object {
  
  def setOptions(opts: OnfidoConfig): Null = js.native
  
  def tearDown(): Null = js.native
}
object OnfidoHandle {
  
  @scala.inline
  def apply(setOptions: OnfidoConfig => Null, tearDown: () => Null): OnfidoHandle = {
    val __obj = js.Dynamic.literal(setOptions = js.Any.fromFunction1(setOptions), tearDown = js.Any.fromFunction0(tearDown))
    __obj.asInstanceOf[OnfidoHandle]
  }
  
  @scala.inline
  implicit class OnfidoHandleOps[Self <: OnfidoHandle] (val x: Self) extends AnyVal {
    
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
    def setSetOptions(value: OnfidoConfig => Null): Self = this.set("setOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTearDown(value: () => Null): Self = this.set("tearDown", js.Any.fromFunction0(value))
  }
}
