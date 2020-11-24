package typings.opentok.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BroadcastStopResponse extends js.Object {
  
  var createdAt: Double = js.native
  
  var id: String = js.native
  
  var projectId: Double = js.native
  
  var resolution: String = js.native
  
  var sessionId: String = js.native
  
  var updatedAt: Double = js.native
}
object BroadcastStopResponse {
  
  @scala.inline
  def apply(
    createdAt: Double,
    id: String,
    projectId: Double,
    resolution: String,
    sessionId: String,
    updatedAt: Double
  ): BroadcastStopResponse = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[BroadcastStopResponse]
  }
  
  @scala.inline
  implicit class BroadcastStopResponseOps[Self <: BroadcastStopResponse] (val x: Self) extends AnyVal {
    
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
    def setCreatedAt(value: Double): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectId(value: Double): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolution(value: String): Self = this.set("resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionId(value: String): Self = this.set("sessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAt(value: Double): Self = this.set("updatedAt", value.asInstanceOf[js.Any])
  }
}
