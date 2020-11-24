package typings.nodeRedRuntime.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Flow extends js.Object {
  
  var flow: js.Object = js.native
  
  var req: js.UndefOr[js.Object] = js.native
}
object Flow {
  
  @scala.inline
  def apply(flow: js.Object): Flow = {
    val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  
  @scala.inline
  implicit class FlowOps[Self <: Flow] (val x: Self) extends AnyVal {
    
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
    def setFlow(value: js.Object): Self = this.set("flow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReq(value: js.Object): Self = this.set("req", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReq: Self = this.set("req", js.undefined)
  }
}
