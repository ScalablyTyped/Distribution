package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateInstanceRequest extends StObject {
  
  /**
    * Required. A mask specifying which fields in Instance should be updated. The field mask must always be specified; this prevents any future fields in Instance from being erased
    * accidentally by clients that do not know about them.
    */
  var fieldMask: js.UndefOr[String] = js.undefined
  
  /** Required. The instance to update, which must always include the instance name. Otherwise, only fields mentioned in field_mask need be included. */
  var instance: js.UndefOr[Instance] = js.undefined
}
object UpdateInstanceRequest {
  
  inline def apply(): UpdateInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateInstanceRequest]
  }
  
  extension [Self <: UpdateInstanceRequest](x: Self) {
    
    inline def setFieldMask(value: String): Self = StObject.set(x, "fieldMask", value.asInstanceOf[js.Any])
    
    inline def setFieldMaskUndefined: Self = StObject.set(x, "fieldMask", js.undefined)
    
    inline def setInstance(value: Instance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
  }
}
