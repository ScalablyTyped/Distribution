package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ConditionalRangeFill object, for use in `conditionalRangeFill.set({ ... })`. */
@js.native
trait ConditionalRangeFillUpdateData extends StObject {
  
  /**
    *
    * HTML color code representing the color of the fill, of the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    *
    * [Api set: ExcelApi 1.6]
    */
  var color: js.UndefOr[String] = js.native
}
object ConditionalRangeFillUpdateData {
  
  @scala.inline
  def apply(): ConditionalRangeFillUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalRangeFillUpdateData]
  }
  
  @scala.inline
  implicit class ConditionalRangeFillUpdateDataMutableBuilder[Self <: ConditionalRangeFillUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
