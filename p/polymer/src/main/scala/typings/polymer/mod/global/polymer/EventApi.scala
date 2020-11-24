package typings.polymer.mod.global.polymer

import typings.std.EventTarget
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventApi extends js.Object {
  
  var localTarget: EventTarget = js.native
  
  var path: js.Array[Node] = js.native
  
  var rootTarget: EventTarget = js.native
}
object EventApi {
  
  @scala.inline
  def apply(localTarget: EventTarget, path: js.Array[Node], rootTarget: EventTarget): EventApi = {
    val __obj = js.Dynamic.literal(localTarget = localTarget.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], rootTarget = rootTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventApi]
  }
  
  @scala.inline
  implicit class EventApiOps[Self <: EventApi] (val x: Self) extends AnyVal {
    
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
    def setLocalTarget(value: EventTarget): Self = this.set("localTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: Node*): Self = this.set("path", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: js.Array[Node]): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootTarget(value: EventTarget): Self = this.set("rootTarget", value.asInstanceOf[js.Any])
  }
}
