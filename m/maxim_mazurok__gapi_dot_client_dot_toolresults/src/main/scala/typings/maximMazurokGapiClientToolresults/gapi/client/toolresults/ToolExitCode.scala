package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToolExitCode extends StObject {
  
  /** Tool execution exit code. A value of 0 means that the execution was successful. - In response: always set - In create/update request: always set */
  var number: js.UndefOr[Double] = js.native
}
object ToolExitCode {
  
  @scala.inline
  def apply(): ToolExitCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolExitCode]
  }
  
  @scala.inline
  implicit class ToolExitCodeMutableBuilder[Self <: ToolExitCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
  }
}
