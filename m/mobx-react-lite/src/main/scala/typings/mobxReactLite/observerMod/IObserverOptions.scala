package typings.mobxReactLite.observerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObserverOptions extends js.Object {
  
  val forwardRef: js.UndefOr[Boolean] = js.native
}
object IObserverOptions {
  
  @scala.inline
  def apply(): IObserverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IObserverOptions]
  }
  
  @scala.inline
  implicit class IObserverOptionsOps[Self <: IObserverOptions] (val x: Self) extends AnyVal {
    
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
    def setForwardRef(value: Boolean): Self = this.set("forwardRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForwardRef: Self = this.set("forwardRef", js.undefined)
  }
}
