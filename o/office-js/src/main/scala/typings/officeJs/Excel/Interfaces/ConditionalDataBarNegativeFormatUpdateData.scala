package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ConditionalDataBarNegativeFormat object, for use in `conditionalDataBarNegativeFormat.set({ ... })`. */
trait ConditionalDataBarNegativeFormatUpdateData extends StObject {
  
  /**
    *
    * HTML color code representing the color of the border line, of the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    "Empty String" if no border is present or set.
    *
    * [Api set: ExcelApi 1.6]
    */
  var borderColor: js.UndefOr[String] = js.undefined
  
  /**
    *
    * HTML color code representing the fill color, of the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    *
    * [Api set: ExcelApi 1.6]
    */
  var fillColor: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Specifies if the negative DataBar has the same border color as the positive DataBar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var matchPositiveBorderColor: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies if the negative DataBar has the same fill color as the positive DataBar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var matchPositiveFillColor: js.UndefOr[Boolean] = js.undefined
}
object ConditionalDataBarNegativeFormatUpdateData {
  
  @scala.inline
  def apply(): ConditionalDataBarNegativeFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalDataBarNegativeFormatUpdateData]
  }
  
  @scala.inline
  implicit class ConditionalDataBarNegativeFormatUpdateDataMutableBuilder[Self <: ConditionalDataBarNegativeFormatUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    @scala.inline
    def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    @scala.inline
    def setMatchPositiveBorderColor(value: Boolean): Self = StObject.set(x, "matchPositiveBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchPositiveBorderColorUndefined: Self = StObject.set(x, "matchPositiveBorderColor", js.undefined)
    
    @scala.inline
    def setMatchPositiveFillColor(value: Boolean): Self = StObject.set(x, "matchPositiveFillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchPositiveFillColorUndefined: Self = StObject.set(x, "matchPositiveFillColor", js.undefined)
  }
}
