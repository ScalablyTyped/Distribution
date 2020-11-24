package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Archivedownloadurl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionsListArtifactsForRepoResponseData extends js.Object {
  
  var artifacts: js.Array[Archivedownloadurl] = js.native
  
  var total_count: Double = js.native
}
object ActionsListArtifactsForRepoResponseData {
  
  @scala.inline
  def apply(artifacts: js.Array[Archivedownloadurl], total_count: Double): ActionsListArtifactsForRepoResponseData = {
    val __obj = js.Dynamic.literal(artifacts = artifacts.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListArtifactsForRepoResponseData]
  }
  
  @scala.inline
  implicit class ActionsListArtifactsForRepoResponseDataOps[Self <: ActionsListArtifactsForRepoResponseData] (val x: Self) extends AnyVal {
    
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
    def setArtifactsVarargs(value: Archivedownloadurl*): Self = this.set("artifacts", js.Array(value :_*))
    
    @scala.inline
    def setArtifacts(value: js.Array[Archivedownloadurl]): Self = this.set("artifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_count(value: Double): Self = this.set("total_count", value.asInstanceOf[js.Any])
  }
}
