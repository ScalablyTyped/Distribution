package typings.pQueue.priorityQueueMod

import typings.pQueue.optionsMod.QueueAddOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PriorityQueueOptions extends QueueAddOptions {
  
  var priority: js.UndefOr[Double] = js.native
}
object PriorityQueueOptions {
  
  @scala.inline
  def apply(): PriorityQueueOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PriorityQueueOptions]
  }
  
  @scala.inline
  implicit class PriorityQueueOptionsOps[Self <: PriorityQueueOptions] (val x: Self) extends AnyVal {
    
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
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
  }
}
