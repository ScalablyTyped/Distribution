package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstancesImportRequest extends StObject {
  
  /** Contains details about the import operation. */
  var importContext: js.UndefOr[ImportContext] = js.undefined
}
object InstancesImportRequest {
  
  @scala.inline
  def apply(): InstancesImportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesImportRequest]
  }
  
  @scala.inline
  implicit class InstancesImportRequestMutableBuilder[Self <: InstancesImportRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImportContext(value: ImportContext): Self = StObject.set(x, "importContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportContextUndefined: Self = StObject.set(x, "importContext", js.undefined)
  }
}
