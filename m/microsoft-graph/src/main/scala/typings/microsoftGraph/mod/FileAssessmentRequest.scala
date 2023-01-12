package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileAssessmentRequest
  extends StObject
     with ThreatAssessmentRequest {
  
  // Base64 encoded file content. The file content cannot fetch back because it isn't stored.
  var contentData: js.UndefOr[String] = js.undefined
  
  // The file name.
  var fileName: js.UndefOr[String] = js.undefined
}
object FileAssessmentRequest {
  
  inline def apply(): FileAssessmentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileAssessmentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileAssessmentRequest] (val x: Self) extends AnyVal {
    
    inline def setContentData(value: String): Self = StObject.set(x, "contentData", value.asInstanceOf[js.Any])
    
    inline def setContentDataUndefined: Self = StObject.set(x, "contentData", js.undefined)
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
  }
}
