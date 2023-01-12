package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `conditionalDataBarPositiveFormat.toJSON()`. */
trait ConditionalDataBarPositiveFormatData extends StObject {
  
  /**
    * HTML color code representing the color of the border line, in the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    Value is "" (an empty string) if no border is present or set.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var borderColor: js.UndefOr[String] = js.undefined
  
  /**
    * HTML color code representing the fill color, in the form #RRGGBB (e.g., "FFA500") or as a named HTML color (e.g., "orange").
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var fillColor: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies if the data bar has a gradient.
    *
    * @remarks
    * [Api set: ExcelApi 1.6]
    */
  var gradientFill: js.UndefOr[Boolean] = js.undefined
}
object ConditionalDataBarPositiveFormatData {
  
  inline def apply(): ConditionalDataBarPositiveFormatData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalDataBarPositiveFormatData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConditionalDataBarPositiveFormatData] (val x: Self) extends AnyVal {
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    inline def setGradientFill(value: Boolean): Self = StObject.set(x, "gradientFill", value.asInstanceOf[js.Any])
    
    inline def setGradientFillUndefined: Self = StObject.set(x, "gradientFill", js.undefined)
  }
}
