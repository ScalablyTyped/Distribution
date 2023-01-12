package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.ConditionalColorScaleCriteria
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ColorScaleConditionalFormat object, for use in `colorScaleConditionalFormat.set({ ... })`. */
trait ColorScaleConditionalFormatUpdateData extends StObject {
  
  /**
    * The criteria of the color scale. Midpoint is optional when using a two point color scale.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var criteria: js.UndefOr[ConditionalColorScaleCriteria] = js.undefined
}
object ColorScaleConditionalFormatUpdateData {
  
  inline def apply(): ColorScaleConditionalFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorScaleConditionalFormatUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorScaleConditionalFormatUpdateData] (val x: Self) extends AnyVal {
    
    inline def setCriteria(value: ConditionalColorScaleCriteria): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    inline def setCriteriaUndefined: Self = StObject.set(x, "criteria", js.undefined)
  }
}
