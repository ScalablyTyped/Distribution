package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ChartLegendEntry object, for use in `chartLegendEntry.set({ ... })`. */
@js.native
trait ChartLegendEntryUpdateData extends StObject {
  
  /**
    *
    * Represents the visible of a chart legend entry.
    *
    * [Api set: ExcelApi 1.7]
    */
  var visible: js.UndefOr[Boolean] = js.native
}
object ChartLegendEntryUpdateData {
  
  @scala.inline
  def apply(): ChartLegendEntryUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartLegendEntryUpdateData]
  }
  
  @scala.inline
  implicit class ChartLegendEntryUpdateDataMutableBuilder[Self <: ChartLegendEntryUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
