package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `conditionalDataBarNegativeFormat.toJSON()`. */
@js.native
trait ConditionalDataBarNegativeFormatData extends StObject {
  
  /**
    *
    * HTML color code representing the color of the border line, of the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    "Empty String" if no border is present or set.
    *
    * [Api set: ExcelApi 1.6]
    */
  var borderColor: js.UndefOr[String] = js.native
  
  /**
    *
    * HTML color code representing the fill color, of the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    *
    * [Api set: ExcelApi 1.6]
    */
  var fillColor: js.UndefOr[String] = js.native
  
  /**
    *
    * Specifies if the negative DataBar has the same border color as the positive DataBar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var matchPositiveBorderColor: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies if the negative DataBar has the same fill color as the positive DataBar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var matchPositiveFillColor: js.UndefOr[Boolean] = js.native
}
object ConditionalDataBarNegativeFormatData {
  
  @scala.inline
  def apply(): ConditionalDataBarNegativeFormatData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalDataBarNegativeFormatData]
  }
  
  @scala.inline
  implicit class ConditionalDataBarNegativeFormatDataMutableBuilder[Self <: ConditionalDataBarNegativeFormatData] (val x: Self) extends AnyVal {
    
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
