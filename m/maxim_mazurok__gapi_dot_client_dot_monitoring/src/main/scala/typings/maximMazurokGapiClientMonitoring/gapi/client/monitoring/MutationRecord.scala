package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MutationRecord extends StObject {
  
  /** When the change occurred. */
  var mutateTime: js.UndefOr[String] = js.undefined
  
  /** The email address of the user making the change. */
  var mutatedBy: js.UndefOr[String] = js.undefined
}
object MutationRecord {
  
  inline def apply(): MutationRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MutationRecord]
  }
  
  extension [Self <: MutationRecord](x: Self) {
    
    inline def setMutateTime(value: String): Self = StObject.set(x, "mutateTime", value.asInstanceOf[js.Any])
    
    inline def setMutateTimeUndefined: Self = StObject.set(x, "mutateTime", js.undefined)
    
    inline def setMutatedBy(value: String): Self = StObject.set(x, "mutatedBy", value.asInstanceOf[js.Any])
    
    inline def setMutatedByUndefined: Self = StObject.set(x, "mutatedBy", js.undefined)
  }
}
