package typings.nodeOpenload.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunningFileConverts extends js.Object {
  
  var id: String = js.native
  
  var last_update: String = js.native
  
  var link: String = js.native
  
  var linkextid: String = js.native
  
  var name: String = js.native
  
  var progress: Double = js.native
  
  var retries: String = js.native
  
  var status: String = js.native
}
object RunningFileConverts {
  
  @scala.inline
  def apply(
    id: String,
    last_update: String,
    link: String,
    linkextid: String,
    name: String,
    progress: Double,
    retries: String,
    status: String
  ): RunningFileConverts = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], last_update = last_update.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], linkextid = linkextid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], retries = retries.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunningFileConverts]
  }
  
  @scala.inline
  implicit class RunningFileConvertsOps[Self <: RunningFileConverts] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_update(value: String): Self = this.set("last_update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkextid(value: String): Self = this.set("linkextid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetries(value: String): Self = this.set("retries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
