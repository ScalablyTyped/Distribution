package typings.metro.anon

import typings.metro.metroStrings.transformer_load_done
import typings.metro.srcLibReportingMod.ReportableEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3`
  extends StObject
     with ReportableEvent {
  
  var `type`: transformer_load_done
}
object `3` {
  
  inline def apply(): `3` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("transformer_load_done")
    __obj.asInstanceOf[`3`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `3`] (val x: Self) extends AnyVal {
    
    inline def setType(value: transformer_load_done): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
