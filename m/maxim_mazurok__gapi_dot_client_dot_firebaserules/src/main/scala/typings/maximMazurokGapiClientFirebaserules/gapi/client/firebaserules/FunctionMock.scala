package typings.maximMazurokGapiClientFirebaserules.gapi.client.firebaserules

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionMock extends StObject {
  
  /** The list of `Arg` values to match. The order in which the arguments are provided is the order in which they must appear in the function invocation. */
  var args: js.UndefOr[js.Array[Arg]] = js.undefined
  
  /** The name of the function. The function name must match one provided by a service declaration. */
  var function: js.UndefOr[String] = js.undefined
  
  /** The mock result of the function call. */
  var result: js.UndefOr[Result] = js.undefined
}
object FunctionMock {
  
  @scala.inline
  def apply(): FunctionMock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionMock]
  }
  
  @scala.inline
  implicit class FunctionMockMutableBuilder[Self <: FunctionMock] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[Arg]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setArgsVarargs(value: Arg*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setFunction(value: String): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
    
    @scala.inline
    def setResult(value: Result): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
