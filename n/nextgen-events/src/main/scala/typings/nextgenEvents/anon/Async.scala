package typings.nextgenEvents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Async extends js.Object {
  
  var async: js.Any = js.native
  
  var context: js.UndefOr[String] = js.native
  
  var eventObject: js.Any = js.native
  
  var fn: js.Any = js.native
  
  var id: js.UndefOr[js.Any] = js.native
  
  var nice: js.UndefOr[Double] = js.native
  
  var once: js.Any = js.native
}
object Async {
  
  @scala.inline
  def apply(async: js.Any, eventObject: js.Any, fn: js.Any, once: js.Any): Async = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], eventObject = eventObject.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any], once = once.asInstanceOf[js.Any])
    __obj.asInstanceOf[Async]
  }
  
  @scala.inline
  implicit class AsyncOps[Self <: Async] (val x: Self) extends AnyVal {
    
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
    def setAsync(value: js.Any): Self = this.set("async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventObject(value: js.Any): Self = this.set("eventObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFn(value: js.Any): Self = this.set("fn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnce(value: js.Any): Self = this.set("once", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setId(value: js.Any): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setNice(value: Double): Self = this.set("nice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNice: Self = this.set("nice", js.undefined)
  }
}
