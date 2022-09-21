package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Autofit extends StObject {
  
  /**
    * The autofit type of the shape. If the autofit type is AUTOFIT_TYPE_UNSPECIFIED, the autofit type is inherited from a parent placeholder if it exists. The field is automatically set
    * to NONE if a request is made that might affect text fitting within its bounding text box. In this case the font_scale is applied to the font_size and the line_spacing_reduction is
    * applied to the line_spacing. Both properties are also reset to default values.
    */
  var autofitType: js.UndefOr[String] = js.undefined
  
  /**
    * The font scale applied to the shape. For shapes with autofit_type NONE or SHAPE_AUTOFIT, this value is the default value of 1. For TEXT_AUTOFIT, this value multiplied by the
    * font_size gives the font size that is rendered in the editor. This property is read-only.
    */
  var fontScale: js.UndefOr[Double] = js.undefined
  
  /**
    * The line spacing reduction applied to the shape. For shapes with autofit_type NONE or SHAPE_AUTOFIT, this value is the default value of 0. For TEXT_AUTOFIT, this value subtracted
    * from the line_spacing gives the line spacing that is rendered in the editor. This property is read-only.
    */
  var lineSpacingReduction: js.UndefOr[Double] = js.undefined
}
object Autofit {
  
  inline def apply(): Autofit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Autofit]
  }
  
  extension [Self <: Autofit](x: Self) {
    
    inline def setAutofitType(value: String): Self = StObject.set(x, "autofitType", value.asInstanceOf[js.Any])
    
    inline def setAutofitTypeUndefined: Self = StObject.set(x, "autofitType", js.undefined)
    
    inline def setFontScale(value: Double): Self = StObject.set(x, "fontScale", value.asInstanceOf[js.Any])
    
    inline def setFontScaleUndefined: Self = StObject.set(x, "fontScale", js.undefined)
    
    inline def setLineSpacingReduction(value: Double): Self = StObject.set(x, "lineSpacingReduction", value.asInstanceOf[js.Any])
    
    inline def setLineSpacingReductionUndefined: Self = StObject.set(x, "lineSpacingReduction", js.undefined)
  }
}
