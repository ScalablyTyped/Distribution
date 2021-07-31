package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Archivedownloadurl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionsListWorkflowRunArtifactsResponseData extends StObject {
  
  var artifacts: js.Array[Archivedownloadurl]
  
  var total_count: Double
}
object ActionsListWorkflowRunArtifactsResponseData {
  
  @scala.inline
  def apply(artifacts: js.Array[Archivedownloadurl], total_count: Double): ActionsListWorkflowRunArtifactsResponseData = {
    val __obj = js.Dynamic.literal(artifacts = artifacts.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsListWorkflowRunArtifactsResponseData]
  }
  
  @scala.inline
  implicit class ActionsListWorkflowRunArtifactsResponseDataMutableBuilder[Self <: ActionsListWorkflowRunArtifactsResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifacts(value: js.Array[Archivedownloadurl]): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactsVarargs(value: Archivedownloadurl*): Self = StObject.set(x, "artifacts", js.Array(value :_*))
    
    @scala.inline
    def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
