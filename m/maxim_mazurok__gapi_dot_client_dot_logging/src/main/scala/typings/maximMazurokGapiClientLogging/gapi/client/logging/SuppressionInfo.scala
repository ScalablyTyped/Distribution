package typings.maximMazurokGapiClientLogging.gapi.client.logging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuppressionInfo extends StObject {
  
  /** The reason that entries were omitted from the session. */
  var reason: js.UndefOr[String] = js.undefined
  
  /** A lower bound on the count of entries omitted due to reason. */
  var suppressedCount: js.UndefOr[Double] = js.undefined
}
object SuppressionInfo {
  
  inline def apply(): SuppressionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuppressionInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SuppressionInfo] (val x: Self) extends AnyVal {
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setSuppressedCount(value: Double): Self = StObject.set(x, "suppressedCount", value.asInstanceOf[js.Any])
    
    inline def setSuppressedCountUndefined: Self = StObject.set(x, "suppressedCount", js.undefined)
  }
}
