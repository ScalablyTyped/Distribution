package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToolOutputReference extends StObject {
  
  /** The creation time of the file. - In response: present if set by create/update request - In create/update request: optional */
  var creationTime: js.UndefOr[Timestamp] = js.undefined
  
  /** A FileReference to an output file. - In response: always set - In create/update request: always set */
  var output: js.UndefOr[FileReference] = js.undefined
  
  /** The test case to which this output file belongs. - In response: present if set by create/update request - In create/update request: optional */
  var testCase: js.UndefOr[TestCaseReference] = js.undefined
}
object ToolOutputReference {
  
  @scala.inline
  def apply(): ToolOutputReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolOutputReference]
  }
  
  @scala.inline
  implicit class ToolOutputReferenceMutableBuilder[Self <: ToolOutputReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setOutput(value: FileReference): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    
    @scala.inline
    def setTestCase(value: TestCaseReference): Self = StObject.set(x, "testCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestCaseUndefined: Self = StObject.set(x, "testCase", js.undefined)
  }
}
