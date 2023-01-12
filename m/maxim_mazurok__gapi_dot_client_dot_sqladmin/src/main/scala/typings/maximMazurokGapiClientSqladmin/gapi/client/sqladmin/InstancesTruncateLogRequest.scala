package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstancesTruncateLogRequest extends StObject {
  
  /** Contains details about the truncate log operation. */
  var truncateLogContext: js.UndefOr[TruncateLogContext] = js.undefined
}
object InstancesTruncateLogRequest {
  
  inline def apply(): InstancesTruncateLogRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesTruncateLogRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstancesTruncateLogRequest] (val x: Self) extends AnyVal {
    
    inline def setTruncateLogContext(value: TruncateLogContext): Self = StObject.set(x, "truncateLogContext", value.asInstanceOf[js.Any])
    
    inline def setTruncateLogContextUndefined: Self = StObject.set(x, "truncateLogContext", js.undefined)
  }
}
