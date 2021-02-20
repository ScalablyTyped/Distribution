package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorStyle extends StObject {
  
  /** RGB color. */
  var rgbColor: js.UndefOr[Color] = js.native
  
  /** Theme color. */
  var themeColor: js.UndefOr[String] = js.native
}
object ColorStyle {
  
  @scala.inline
  def apply(): ColorStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorStyle]
  }
  
  @scala.inline
  implicit class ColorStyleMutableBuilder[Self <: ColorStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRgbColor(value: Color): Self = StObject.set(x, "rgbColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRgbColorUndefined: Self = StObject.set(x, "rgbColor", js.undefined)
    
    @scala.inline
    def setThemeColor(value: String): Self = StObject.set(x, "themeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeColorUndefined: Self = StObject.set(x, "themeColor", js.undefined)
  }
}
