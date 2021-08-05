package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleDevtoolsRemoteworkersV1test2CommandTask extends StObject {
  
  /** The expected outputs from the task. */
  var expectedOutputs: js.UndefOr[GoogleDevtoolsRemoteworkersV1test2CommandTaskOutputs] = js.undefined
  
  /** The inputs to the task. */
  var inputs: js.UndefOr[GoogleDevtoolsRemoteworkersV1test2CommandTaskInputs] = js.undefined
  
  /** The timeouts of this task. */
  var timeouts: js.UndefOr[GoogleDevtoolsRemoteworkersV1test2CommandTaskTimeouts] = js.undefined
}
object GoogleDevtoolsRemoteworkersV1test2CommandTask {
  
  inline def apply(): GoogleDevtoolsRemoteworkersV1test2CommandTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsRemoteworkersV1test2CommandTask]
  }
  
  extension [Self <: GoogleDevtoolsRemoteworkersV1test2CommandTask](x: Self) {
    
    inline def setExpectedOutputs(value: GoogleDevtoolsRemoteworkersV1test2CommandTaskOutputs): Self = StObject.set(x, "expectedOutputs", value.asInstanceOf[js.Any])
    
    inline def setExpectedOutputsUndefined: Self = StObject.set(x, "expectedOutputs", js.undefined)
    
    inline def setInputs(value: GoogleDevtoolsRemoteworkersV1test2CommandTaskInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    inline def setTimeouts(value: GoogleDevtoolsRemoteworkersV1test2CommandTaskTimeouts): Self = StObject.set(x, "timeouts", value.asInstanceOf[js.Any])
    
    inline def setTimeoutsUndefined: Self = StObject.set(x, "timeouts", js.undefined)
  }
}
