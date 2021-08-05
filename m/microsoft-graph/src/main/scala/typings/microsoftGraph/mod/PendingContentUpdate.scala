package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PendingContentUpdate extends StObject {
  
  // Date and time the pending binary operation was queued in UTC time. Read-only.
  var queuedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
}
object PendingContentUpdate {
  
  inline def apply(): PendingContentUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PendingContentUpdate]
  }
  
  extension [Self <: PendingContentUpdate](x: Self) {
    
    inline def setQueuedDateTime(value: NullableOption[String]): Self = StObject.set(x, "queuedDateTime", value.asInstanceOf[js.Any])
    
    inline def setQueuedDateTimeNull: Self = StObject.set(x, "queuedDateTime", null)
    
    inline def setQueuedDateTimeUndefined: Self = StObject.set(x, "queuedDateTime", js.undefined)
  }
}
