package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlAssessmentRequest extends ThreatAssessmentRequest {
  
  // The URL string.
  var url: js.UndefOr[String] = js.native
}
object UrlAssessmentRequest {
  
  @scala.inline
  def apply(): UrlAssessmentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlAssessmentRequest]
  }
  
  @scala.inline
  implicit class UrlAssessmentRequestMutableBuilder[Self <: UrlAssessmentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
