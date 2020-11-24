package typings.openfin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CrossOriginInjection extends js.Object {
  
  var crossOriginInjection: js.UndefOr[Boolean] = js.native
  
  var sameOriginInjection: js.UndefOr[Boolean] = js.native
}
object CrossOriginInjection {
  
  @scala.inline
  def apply(): CrossOriginInjection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrossOriginInjection]
  }
  
  @scala.inline
  implicit class CrossOriginInjectionOps[Self <: CrossOriginInjection] (val x: Self) extends AnyVal {
    
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
    def setCrossOriginInjection(value: Boolean): Self = this.set("crossOriginInjection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossOriginInjection: Self = this.set("crossOriginInjection", js.undefined)
    
    @scala.inline
    def setSameOriginInjection(value: Boolean): Self = this.set("sameOriginInjection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSameOriginInjection: Self = this.set("sameOriginInjection", js.undefined)
  }
}
