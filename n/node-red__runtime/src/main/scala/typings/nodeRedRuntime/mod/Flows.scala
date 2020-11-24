package typings.nodeRedRuntime.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Flows extends js.Object {
  
  /** the flow configuration, an array of node configuration objects */
  var flows: js.Array[js.Object] = js.native
  
  /** the flow revision identifier */
  var rev: String = js.native
}
object Flows {
  
  @scala.inline
  def apply(flows: js.Array[js.Object], rev: String): Flows = {
    val __obj = js.Dynamic.literal(flows = flows.asInstanceOf[js.Any], rev = rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flows]
  }
  
  @scala.inline
  implicit class FlowsOps[Self <: Flows] (val x: Self) extends AnyVal {
    
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
    def setFlowsVarargs(value: js.Object*): Self = this.set("flows", js.Array(value :_*))
    
    @scala.inline
    def setFlows(value: js.Array[js.Object]): Self = this.set("flows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRev(value: String): Self = this.set("rev", value.asInstanceOf[js.Any])
  }
}
