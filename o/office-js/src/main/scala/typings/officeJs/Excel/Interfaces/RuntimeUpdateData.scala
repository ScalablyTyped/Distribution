package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the Runtime object, for use in `runtime.set({ ... })`. */
trait RuntimeUpdateData extends StObject {
  
  /**
    *
    * Toggle JavaScript events in the current task pane or content add-in.
    *
    * [Api set: ExcelApi 1.8]
    */
  var enableEvents: js.UndefOr[Boolean] = js.undefined
}
object RuntimeUpdateData {
  
  inline def apply(): RuntimeUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuntimeUpdateData]
  }
  
  extension [Self <: RuntimeUpdateData](x: Self) {
    
    inline def setEnableEvents(value: Boolean): Self = StObject.set(x, "enableEvents", value.asInstanceOf[js.Any])
    
    inline def setEnableEventsUndefined: Self = StObject.set(x, "enableEvents", js.undefined)
  }
}
