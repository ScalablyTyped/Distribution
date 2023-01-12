package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UrlAssessmentRequest
  extends StObject
     with ThreatAssessmentRequest {
  
  // The URL string.
  var url: js.UndefOr[String] = js.undefined
}
object UrlAssessmentRequest {
  
  inline def apply(): UrlAssessmentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UrlAssessmentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UrlAssessmentRequest] (val x: Self) extends AnyVal {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
