package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Color extends StObject {
  
  /** The RGB color value. */
  var rgbColor: js.UndefOr[RgbColor] = js.undefined
}
object Color {
  
  @scala.inline
  def apply(): Color = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Color]
  }
  
  @scala.inline
  implicit class ColorMutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRgbColor(value: RgbColor): Self = StObject.set(x, "rgbColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRgbColorUndefined: Self = StObject.set(x, "rgbColor", js.undefined)
  }
}
