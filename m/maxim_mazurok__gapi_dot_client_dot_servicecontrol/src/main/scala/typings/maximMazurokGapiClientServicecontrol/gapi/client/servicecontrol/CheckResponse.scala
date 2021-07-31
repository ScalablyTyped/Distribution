package typings.maximMazurokGapiClientServicecontrol.gapi.client.servicecontrol

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckResponse extends StObject {
  
  /** Returns a set of request contexts generated from the `CheckRequest`. */
  var headers: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientServicecontrol.maximMazurokGapiClientServicecontrolStrings.CheckResponse & TopLevel[js.Any]
  ] = js.undefined
  
  /** An 'OK' status allows the operation. Any other status indicates a denial; [google.rpc.Status.details]() would contain additional details about the denial. */
  var status: js.UndefOr[Status] = js.undefined
}
object CheckResponse {
  
  @scala.inline
  def apply(): CheckResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckResponse]
  }
  
  @scala.inline
  implicit class CheckResponseMutableBuilder[Self <: CheckResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientServicecontrol.maximMazurokGapiClientServicecontrolStrings.CheckResponse & TopLevel[js.Any]
    ): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
