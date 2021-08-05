package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `runtime.toJSON()`. */
trait RuntimeData extends StObject {
  
  /**
    *
    * Toggle JavaScript events in the current task pane or content add-in.
    *
    * [Api set: ExcelApi 1.8]
    */
  var enableEvents: js.UndefOr[Boolean] = js.undefined
}
object RuntimeData {
  
  inline def apply(): RuntimeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuntimeData]
  }
  
  extension [Self <: RuntimeData](x: Self) {
    
    inline def setEnableEvents(value: Boolean): Self = StObject.set(x, "enableEvents", value.asInstanceOf[js.Any])
    
    inline def setEnableEventsUndefined: Self = StObject.set(x, "enableEvents", js.undefined)
  }
}
