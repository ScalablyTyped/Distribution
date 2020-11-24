package typings.optimism.helpersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Unsubscribable extends js.Object {
  
  var unsubscribe: js.UndefOr[Unit | js.Function0[_]] = js.native
}
object Unsubscribable {
  
  @scala.inline
  def apply(): Unsubscribable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Unsubscribable]
  }
  
  @scala.inline
  implicit class UnsubscribableOps[Self <: Unsubscribable] (val x: Self) extends AnyVal {
    
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
    def setUnsubscribeFunction0(value: () => _): Self = this.set("unsubscribe", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnsubscribe(value: Unit | js.Function0[_]): Self = this.set("unsubscribe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnsubscribe: Self = this.set("unsubscribe", js.undefined)
  }
}
