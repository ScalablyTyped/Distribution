package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompletionResult extends StObject {
  
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
  implicit class CompletionResultMutableBuilder[Self <: CompletionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageUri(value: String): Self = StObject.set(x, "imageUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUriUndefined: Self = StObject.set(x, "imageUri", js.undefined)
    
    @scala.inline
    def setSuggestion(value: String): Self = StObject.set(x, "suggestion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestionUndefined: Self = StObject.set(x, "suggestion", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
