package typings.maximMazurokGapiClientLifesciences.gapi.client.lifesciences

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Operation extends StObject {
  
  /** If the value is `false`, it means the operation is still in progress. If `true`, the operation is completed, and either `error` or `response` is available. */
  var done: js.UndefOr[Boolean] = js.undefined
  
  /** The error result of the operation in case of failure or cancellation. */
  var error: js.UndefOr[Status] = js.undefined
  
  /** An Metadata object. This will always be returned with the Operation. */
  var metadata: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientLifesciences.maximMazurokGapiClientLifesciencesStrings.Operation & TopLevel[js.Any]
  ] = js.undefined
  
  /** The server-assigned name for the operation. This may be passed to the other operation methods to retrieve information about the operation's status. */
  var name: js.UndefOr[String] = js.undefined
  
  /** An Empty object. */
  var response: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientLifesciences.maximMazurokGapiClientLifesciencesStrings.Operation & TopLevel[js.Any]
  ] = js.undefined
}
object Operation {
  
  @scala.inline
  def apply(): Operation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Operation]
  }
  
  @scala.inline
  implicit class OperationMutableBuilder[Self <: Operation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
    
    @scala.inline
    def setError(value: Status): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setMetadata(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientLifesciences.maximMazurokGapiClientLifesciencesStrings.Operation & TopLevel[js.Any]
    ): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setResponse(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientLifesciences.maximMazurokGapiClientLifesciencesStrings.Operation & TopLevel[js.Any]
    ): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
  }
}
