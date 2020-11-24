package typings.postmark.domainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Domains extends js.Object {
  
  var Domains: js.Array[Domain] = js.native
  
  var TotalCount: Double = js.native
}
object Domains {
  
  @scala.inline
  def apply(Domains: js.Array[Domain], TotalCount: Double): Domains = {
    val __obj = js.Dynamic.literal(Domains = Domains.asInstanceOf[js.Any], TotalCount = TotalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Domains]
  }
  
  @scala.inline
  implicit class DomainsOps[Self <: Domains] (val x: Self) extends AnyVal {
    
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
    def setDomainsVarargs(value: Domain*): Self = this.set("Domains", js.Array(value :_*))
    
    @scala.inline
    def setDomains(value: js.Array[Domain]): Self = this.set("Domains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalCount(value: Double): Self = this.set("TotalCount", value.asInstanceOf[js.Any])
  }
}
