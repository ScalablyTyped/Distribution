package typings.postRobot.mod

import typings.postRobot.postRobotBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegularRequestOptionsType extends js.Object {
  
  var domain: js.UndefOr[DomainMatcher] = js.native
  
  var fireAndForget: js.UndefOr[`false`] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object RegularRequestOptionsType {
  
  @scala.inline
  def apply(): RegularRequestOptionsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegularRequestOptionsType]
  }
  
  @scala.inline
  implicit class RegularRequestOptionsTypeOps[Self <: RegularRequestOptionsType] (val x: Self) extends AnyVal {
    
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
    def setFireAndForget(value: `false`): Self = this.set("fireAndForget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFireAndForget: Self = this.set("fireAndForget", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
