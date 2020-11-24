package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompletionResult extends js.Object {
  
  /** The URI of the company image for CompletionType.COMPANY_NAME. */
  var imageUri: js.UndefOr[String] = js.native
  
  /** The suggestion for the query. */
  var suggestion: js.UndefOr[String] = js.native
  
  /** The completion topic. */
  var `type`: js.UndefOr[String] = js.native
}
object CompletionResult {
  
  @scala.inline
  def apply(): CompletionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompletionResult]
  }
  
  @scala.inline
  implicit class CompletionResultOps[Self <: CompletionResult] (val x: Self) extends AnyVal {
    
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
    def setImageUri(value: String): Self = this.set("imageUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageUri: Self = this.set("imageUri", js.undefined)
    
    @scala.inline
    def setSuggestion(value: String): Self = this.set("suggestion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestion: Self = this.set("suggestion", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
