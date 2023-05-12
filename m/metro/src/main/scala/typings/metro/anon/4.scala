package typings.metro.anon

import typings.metro.metroStrings.transformer_load_failed
import typings.metro.srcLibReportingMod.ReportableEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4`
  extends StObject
     with ReportableEvent {
  
  var error: js.Error
  
  var `type`: transformer_load_failed
}
object `4` {
  
  inline def apply(error: js.Error): `4` = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("transformer_load_failed")
    __obj.asInstanceOf[`4`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `4`] (val x: Self) extends AnyVal {
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setType(value: transformer_load_failed): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
