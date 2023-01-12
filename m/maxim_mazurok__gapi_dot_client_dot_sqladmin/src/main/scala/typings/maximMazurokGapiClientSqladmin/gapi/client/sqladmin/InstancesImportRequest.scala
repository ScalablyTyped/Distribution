package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstancesImportRequest extends StObject {
  
  /** Contains details about the import operation. */
  var importContext: js.UndefOr[ImportContext] = js.undefined
}
object InstancesImportRequest {
  
  inline def apply(): InstancesImportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesImportRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstancesImportRequest] (val x: Self) extends AnyVal {
    
    inline def setImportContext(value: ImportContext): Self = StObject.set(x, "importContext", value.asInstanceOf[js.Any])
    
    inline def setImportContextUndefined: Self = StObject.set(x, "importContext", js.undefined)
  }
}
