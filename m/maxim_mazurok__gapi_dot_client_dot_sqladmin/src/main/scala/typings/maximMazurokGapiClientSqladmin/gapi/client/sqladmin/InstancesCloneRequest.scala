package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstancesCloneRequest extends StObject {
  
  /** Contains details about the clone operation. */
  var cloneContext: js.UndefOr[CloneContext] = js.undefined
}
object InstancesCloneRequest {
  
  inline def apply(): InstancesCloneRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesCloneRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstancesCloneRequest] (val x: Self) extends AnyVal {
    
    inline def setCloneContext(value: CloneContext): Self = StObject.set(x, "cloneContext", value.asInstanceOf[js.Any])
    
    inline def setCloneContextUndefined: Self = StObject.set(x, "cloneContext", js.undefined)
  }
}
