package typings.metro.anon

import typings.metro.libReportingMod.GlobalCacheDisabledReason
import typings.metro.libReportingMod.ReportableEvent
import typings.metro.metroStrings.global_cache_disabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reason
  extends StObject
     with ReportableEvent {
  
  var reason: GlobalCacheDisabledReason
  
  var `type`: global_cache_disabled
}
object Reason {
  
  inline def apply(reason: GlobalCacheDisabledReason): Reason = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("global_cache_disabled")
    __obj.asInstanceOf[Reason]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Reason] (val x: Self) extends AnyVal {
    
    inline def setReason(value: GlobalCacheDisabledReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setType(value: global_cache_disabled): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
