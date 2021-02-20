package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplaceAllTextRequest extends StObject {
  
  /** Finds text in the document matching this substring. */
  var containsText: js.UndefOr[SubstringMatchCriteria] = js.native
  
  /** The text that will replace the matched text. */
  var replaceText: js.UndefOr[String] = js.native
}
object ReplaceAllTextRequest {
  
  @scala.inline
  def apply(): ReplaceAllTextRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceAllTextRequest]
  }
  
  @scala.inline
  implicit class ReplaceAllTextRequestMutableBuilder[Self <: ReplaceAllTextRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainsText(value: SubstringMatchCriteria): Self = StObject.set(x, "containsText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainsTextUndefined: Self = StObject.set(x, "containsText", js.undefined)
    
    @scala.inline
    def setReplaceText(value: String): Self = StObject.set(x, "replaceText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceTextUndefined: Self = StObject.set(x, "replaceText", js.undefined)
  }
}
