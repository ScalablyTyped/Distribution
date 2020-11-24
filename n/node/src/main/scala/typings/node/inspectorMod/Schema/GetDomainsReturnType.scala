package typings.node.inspectorMod.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDomainsReturnType extends js.Object {
  
  /**
    * List of supported domains.
    */
  var domains: js.Array[Domain] = js.native
}
object GetDomainsReturnType {
  
  @scala.inline
  def apply(domains: js.Array[Domain]): GetDomainsReturnType = {
    val __obj = js.Dynamic.literal(domains = domains.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainsReturnType]
  }
  
  @scala.inline
  implicit class GetDomainsReturnTypeOps[Self <: GetDomainsReturnType] (val x: Self) extends AnyVal {
    
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
    def setDomainsVarargs(value: Domain*): Self = this.set("domains", js.Array(value :_*))
    
    @scala.inline
    def setDomains(value: js.Array[Domain]): Self = this.set("domains", value.asInstanceOf[js.Any])
  }
}
