package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents a conditional format DataBar Format for the positive side of the data bar.
  *
  * [Api set: ExcelApi 1.6]
  */
trait ConditionalDataBarPositiveFormatLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * HTML color code representing the color of the border line, of the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    "" (empty string) if no border is present or set.
    *
    * [Api set: ExcelApi 1.6]
    */
  var borderColor: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * HTML color code representing the fill color, of the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    *
    * [Api set: ExcelApi 1.6]
    */
  var fillColor: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies if the DataBar has a gradient.
    *
    * [Api set: ExcelApi 1.6]
    */
  var gradientFill: js.UndefOr[Boolean] = js.undefined
}
object ConditionalDataBarPositiveFormatLoadOptions {
  
  @scala.inline
  def apply(): ConditionalDataBarPositiveFormatLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalDataBarPositiveFormatLoadOptions]
  }
  
  @scala.inline
  implicit class ConditionalDataBarPositiveFormatLoadOptionsMutableBuilder[Self <: ConditionalDataBarPositiveFormatLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setBorderColor(value: Boolean): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    @scala.inline
    def setFillColor(value: Boolean): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    @scala.inline
    def setGradientFill(value: Boolean): Self = StObject.set(x, "gradientFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGradientFillUndefined: Self = StObject.set(x, "gradientFill", js.undefined)
  }
}
