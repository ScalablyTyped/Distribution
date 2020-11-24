package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptimizeRestoredDatabaseMetadata extends js.Object {
  
  /** Name of the restored database being optimized. */
  var name: js.UndefOr[String] = js.native
  
  /** The progress of the post-restore optimizations. */
  var progress: js.UndefOr[OperationProgress] = js.native
}
object OptimizeRestoredDatabaseMetadata {
  
  @scala.inline
  def apply(): OptimizeRestoredDatabaseMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptimizeRestoredDatabaseMetadata]
  }
  
  @scala.inline
  implicit class OptimizeRestoredDatabaseMetadataOps[Self <: OptimizeRestoredDatabaseMetadata] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProgress(value: OperationProgress): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
  }
}
