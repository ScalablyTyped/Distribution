package typings.maximMazurokGapiClientVault.gapi.client.vault

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CountArtifactsMetadata extends js.Object {
  
  /** End time of count operation. Available when operation is done. */
  var endTime: js.UndefOr[String] = js.native
  
  /** The matter ID of the associated matter. */
  var matterId: js.UndefOr[String] = js.native
  
  /** The search query from the request. */
  var query: js.UndefOr[Query] = js.native
  
  /** Creation time of count operation. */
  var startTime: js.UndefOr[String] = js.native
}
object CountArtifactsMetadata {
  
  @scala.inline
  def apply(): CountArtifactsMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CountArtifactsMetadata]
  }
  
  @scala.inline
  implicit class CountArtifactsMetadataOps[Self <: CountArtifactsMetadata] (val x: Self) extends AnyVal {
    
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
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setMatterId(value: String): Self = this.set("matterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatterId: Self = this.set("matterId", js.undefined)
    
    @scala.inline
    def setQuery(value: Query): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
}
