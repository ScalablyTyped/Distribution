package typings.passportWindowsauth.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailAfter extends js.Object {
  
  var failAfter: js.UndefOr[Double] = js.native
  
  var initialDelay: js.UndefOr[Double] = js.native
  
  var maxDelay: js.UndefOr[Double] = js.native
}
object FailAfter {
  
  @scala.inline
  def apply(): FailAfter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailAfter]
  }
  
  @scala.inline
  implicit class FailAfterOps[Self <: FailAfter] (val x: Self) extends AnyVal {
    
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
    def setFailAfter(value: Double): Self = this.set("failAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailAfter: Self = this.set("failAfter", js.undefined)
    
    @scala.inline
    def setInitialDelay(value: Double): Self = this.set("initialDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialDelay: Self = this.set("initialDelay", js.undefined)
    
    @scala.inline
    def setMaxDelay(value: Double): Self = this.set("maxDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDelay: Self = this.set("maxDelay", js.undefined)
  }
}
