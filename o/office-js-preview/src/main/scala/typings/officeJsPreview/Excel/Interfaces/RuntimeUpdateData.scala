package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the Runtime object, for use in `runtime.set({ ... })`. */
@js.native
trait RuntimeUpdateData extends StObject {
  
  /**
    *
    * Toggle JavaScript events in the current task pane or content add-in.
    *
    * [Api set: ExcelApi 1.8]
    */
  var enableEvents: js.UndefOr[Boolean] = js.native
}
object RuntimeUpdateData {
  
  @scala.inline
  def apply(): RuntimeUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuntimeUpdateData]
  }
  
  @scala.inline
  implicit class RuntimeUpdateDataMutableBuilder[Self <: RuntimeUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableEvents(value: Boolean): Self = StObject.set(x, "enableEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableEventsUndefined: Self = StObject.set(x, "enableEvents", js.undefined)
  }
}
