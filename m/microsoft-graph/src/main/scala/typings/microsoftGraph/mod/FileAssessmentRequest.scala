package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileAssessmentRequest extends ThreatAssessmentRequest {
  
  // Base64 encoded file content. The file content cannot fetch back because it isn't stored.
  var contentData: js.UndefOr[String] = js.native
  
  // The file name.
  var fileName: js.UndefOr[String] = js.native
}
object FileAssessmentRequest {
  
  @scala.inline
  def apply(): FileAssessmentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileAssessmentRequest]
  }
  
  @scala.inline
  implicit class FileAssessmentRequestMutableBuilder[Self <: FileAssessmentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentData(value: String): Self = StObject.set(x, "contentData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentDataUndefined: Self = StObject.set(x, "contentData", js.undefined)
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
  }
}
