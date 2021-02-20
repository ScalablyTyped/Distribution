package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstancesTruncateLogRequest extends StObject {
  
  /** Contains details about the truncate log operation. */
  var truncateLogContext: js.UndefOr[TruncateLogContext] = js.native
}
object InstancesTruncateLogRequest {
  
  @scala.inline
  def apply(): InstancesTruncateLogRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancesTruncateLogRequest]
  }
  
  @scala.inline
  implicit class InstancesTruncateLogRequestMutableBuilder[Self <: InstancesTruncateLogRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTruncateLogContext(value: TruncateLogContext): Self = StObject.set(x, "truncateLogContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTruncateLogContextUndefined: Self = StObject.set(x, "truncateLogContext", js.undefined)
  }
}
