package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Border extends StObject {
  
  /** The color of the border. */
  var color: js.UndefOr[Color] = js.native
  
  /** The color of the border. If color is also set, this field takes precedence. */
  var colorStyle: js.UndefOr[ColorStyle] = js.native
  
  /** The style of the border. */
  var style: js.UndefOr[String] = js.native
  
  /** The width of the border, in pixels. Deprecated; the width is determined by the "style" field. */
  var width: js.UndefOr[Double] = js.native
}
object Border {
  
  @scala.inline
  def apply(): Border = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Border]
  }
  
  @scala.inline
  implicit class BorderMutableBuilder[Self <: Border] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorStyle(value: ColorStyle): Self = StObject.set(x, "colorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorStyleUndefined: Self = StObject.set(x, "colorStyle", js.undefined)
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
