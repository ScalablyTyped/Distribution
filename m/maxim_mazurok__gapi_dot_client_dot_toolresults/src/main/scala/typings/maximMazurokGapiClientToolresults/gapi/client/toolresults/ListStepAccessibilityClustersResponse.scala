package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListStepAccessibilityClustersResponse extends js.Object {
  
  /**
    * A sequence of accessibility suggestions, grouped into clusters. Within the sequence, clusters that belong to the same SuggestionCategory should be adjacent. Within each category,
    * clusters should be ordered by their SuggestionPriority (ERRORs first). The categories should be ordered by their highest priority cluster.
    */
  var clusters: js.UndefOr[js.Array[SuggestionClusterProto]] = js.native
  
  /** A full resource name of the step. For example, projects/my-project/histories/bh.1234567890abcdef/executions/ 1234567890123456789/steps/bs.1234567890abcdef Always presents. */
  var name: js.UndefOr[String] = js.native
}
object ListStepAccessibilityClustersResponse {
  
  @scala.inline
  def apply(): ListStepAccessibilityClustersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStepAccessibilityClustersResponse]
  }
  
  @scala.inline
  implicit class ListStepAccessibilityClustersResponseOps[Self <: ListStepAccessibilityClustersResponse] (val x: Self) extends AnyVal {
    
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
    def setClustersVarargs(value: SuggestionClusterProto*): Self = this.set("clusters", js.Array(value :_*))
    
    @scala.inline
    def setClusters(value: js.Array[SuggestionClusterProto]): Self = this.set("clusters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusters: Self = this.set("clusters", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
