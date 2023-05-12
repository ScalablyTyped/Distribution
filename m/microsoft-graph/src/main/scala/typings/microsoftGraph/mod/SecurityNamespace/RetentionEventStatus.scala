package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.NullableOption
import typings.microsoftGraph.mod.PublicError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetentionEventStatus extends StObject {
  
  // The error if the status is not successful.
  var error: js.UndefOr[NullableOption[PublicError]] = js.undefined
  
  // The status of the distribution. The possible values are: pending, error, success, notAvaliable.
  var status: js.UndefOr[NullableOption[EventStatusType]] = js.undefined
}
object RetentionEventStatus {
  
  inline def apply(): RetentionEventStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetentionEventStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RetentionEventStatus] (val x: Self) extends AnyVal {
    
    inline def setError(value: NullableOption[PublicError]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorNull: Self = StObject.set(x, "error", null)
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setStatus(value: NullableOption[EventStatusType]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
