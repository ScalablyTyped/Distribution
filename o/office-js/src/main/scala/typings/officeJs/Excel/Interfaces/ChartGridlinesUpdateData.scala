package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ChartGridlines object, for use in `chartGridlines.set({ ... })`. */
@js.native
trait ChartGridlinesUpdateData extends StObject {
  
  /**
    *
    * Represents the formatting of chart gridlines.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartGridlinesFormatUpdateData] = js.native
  
  /**
    *
    * Specifies if the axis gridlines are visible.
    *
    * [Api set: ExcelApi 1.1]
    */
  var visible: js.UndefOr[Boolean] = js.native
}
object ChartGridlinesUpdateData {
  
  @scala.inline
  def apply(): ChartGridlinesUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartGridlinesUpdateData]
  }
  
  @scala.inline
  implicit class ChartGridlinesUpdateDataMutableBuilder[Self <: ChartGridlinesUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: ChartGridlinesFormatUpdateData): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
