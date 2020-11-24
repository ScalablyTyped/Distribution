package typings.maximMazurokGapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuntimeMetadata extends js.Object {
  
  /** Execution information specific to Google Compute Engine. */
  var computeEngine: js.UndefOr[ComputeEngine] = js.native
}
object RuntimeMetadata {
  
  @scala.inline
  def apply(): RuntimeMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuntimeMetadata]
  }
  
  @scala.inline
  implicit class RuntimeMetadataOps[Self <: RuntimeMetadata] (val x: Self) extends AnyVal {
    
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
    def setComputeEngine(value: ComputeEngine): Self = this.set("computeEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComputeEngine: Self = this.set("computeEngine", js.undefined)
  }
}
