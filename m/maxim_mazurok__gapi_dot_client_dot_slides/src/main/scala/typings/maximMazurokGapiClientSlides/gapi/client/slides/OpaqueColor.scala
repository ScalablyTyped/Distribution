package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpaqueColor extends StObject {
  
  /** An opaque RGB color. */
  var rgbColor: js.UndefOr[RgbColor] = js.native
  
  /** An opaque theme color. */
  var themeColor: js.UndefOr[String] = js.native
}
object OpaqueColor {
  
  @scala.inline
  def apply(): OpaqueColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpaqueColor]
  }
  
  @scala.inline
  implicit class OpaqueColorMutableBuilder[Self <: OpaqueColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRgbColor(value: RgbColor): Self = StObject.set(x, "rgbColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRgbColorUndefined: Self = StObject.set(x, "rgbColor", js.undefined)
    
    @scala.inline
    def setThemeColor(value: String): Self = StObject.set(x, "themeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeColorUndefined: Self = StObject.set(x, "themeColor", js.undefined)
  }
}
