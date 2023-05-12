package typings.metro.anon

import typings.metro.metroStrings.transform_cache_reset
import typings.metro.srcLibReportingMod.ReportableEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1`
  extends StObject
     with ReportableEvent {
  
  var `type`: transform_cache_reset
}
object `1` {
  
  inline def apply(): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("transform_cache_reset")
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `1`] (val x: Self) extends AnyVal {
    
    inline def setType(value: transform_cache_reset): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
