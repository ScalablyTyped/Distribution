package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorStyle extends StObject {
  
  /**
    * RGB color. The [`alpha`](/sheets/api/reference/rest/v4/spreadsheets/other#Color.FIELDS.alpha) value in the [`Color`](/sheets/api/reference/rest/v4/spreadsheets/other#color) object
    * isn't generally supported.
    */
  var rgbColor: js.UndefOr[Color] = js.undefined
  
  /** Theme color. */
  var themeColor: js.UndefOr[String] = js.undefined
}
object ColorStyle {
  
  inline def apply(): ColorStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorStyle]
  }
  
  extension [Self <: ColorStyle](x: Self) {
    
    inline def setRgbColor(value: Color): Self = StObject.set(x, "rgbColor", value.asInstanceOf[js.Any])
    
    inline def setRgbColorUndefined: Self = StObject.set(x, "rgbColor", js.undefined)
    
    inline def setThemeColor(value: String): Self = StObject.set(x, "themeColor", value.asInstanceOf[js.Any])
    
    inline def setThemeColorUndefined: Self = StObject.set(x, "themeColor", js.undefined)
  }
}
