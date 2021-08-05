package typings.maximMazurokGapiClientScript.gapi.client.script

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Operation extends StObject {
  
  /**
    * This field indicates whether the script execution has completed. A completed execution has a populated `response` field containing the ExecutionResponse from function that was
    * executed.
    */
  var done: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If a `run` call succeeds but the script function (or Apps Script itself) throws an exception, this field contains a Status object. The `Status` object's `details` field contains an
    * array with a single ExecutionError object that provides information about the nature of the error.
    */
  var error: js.UndefOr[Status] = js.undefined
  
  /** If the script function returns successfully, this field contains an ExecutionResponse object with the function's return value. */
  var response: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientScript.maximMazurokGapiClientScriptStrings.Operation & TopLevel[js.Any]
  ] = js.undefined
}
object Operation {
  
  inline def apply(): Operation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Operation]
  }
  
  extension [Self <: Operation](x: Self) {
    
    inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
    
    inline def setError(value: Status): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setResponse(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientScript.maximMazurokGapiClientScriptStrings.Operation & TopLevel[js.Any]
    ): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
  }
}
