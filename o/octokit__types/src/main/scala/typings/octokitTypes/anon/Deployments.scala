package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Deployments extends js.Object {
  
  var deployments: String = js.native
  
  var metadata: String = js.native
  
  var pull_requests: String = js.native
  
  var statuses: String = js.native
}
object Deployments {
  
  @scala.inline
  def apply(deployments: String, metadata: String, pull_requests: String, statuses: String): Deployments = {
    val __obj = js.Dynamic.literal(deployments = deployments.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], pull_requests = pull_requests.asInstanceOf[js.Any], statuses = statuses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deployments]
  }
  
  @scala.inline
  implicit class DeploymentsOps[Self <: Deployments] (val x: Self) extends AnyVal {
    
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
    def setDeployments(value: String): Self = this.set("deployments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: String): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPull_requests(value: String): Self = this.set("pull_requests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatuses(value: String): Self = this.set("statuses", value.asInstanceOf[js.Any])
  }
}
