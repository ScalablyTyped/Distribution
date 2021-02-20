package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateInstanceRequest extends StObject {
  
  /**
    * Required. A mask specifying which fields in Instance should be updated. The field mask must always be specified; this prevents any future fields in Instance from being erased
    * accidentally by clients that do not know about them.
    */
  var fieldMask: js.UndefOr[String] = js.native
  
  /** Required. The instance to update, which must always include the instance name. Otherwise, only fields mentioned in field_mask need be included. */
  var instance: js.UndefOr[Instance] = js.native
}
object UpdateInstanceRequest {
  
  @scala.inline
  def apply(): UpdateInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateInstanceRequest]
  }
  
  @scala.inline
  implicit class UpdateInstanceRequestMutableBuilder[Self <: UpdateInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldMask(value: String): Self = StObject.set(x, "fieldMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldMaskUndefined: Self = StObject.set(x, "fieldMask", js.undefined)
    
    @scala.inline
    def setInstance(value: Instance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
  }
}
