package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorScheme extends StObject {
  
  /** The ThemeColorType and corresponding concrete color pairs. */
  var colors: js.UndefOr[js.Array[ThemeColorPair]] = js.native
}
object ColorScheme {
  
  @scala.inline
  def apply(): ColorScheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorScheme]
  }
  
  @scala.inline
  implicit class ColorSchemeMutableBuilder[Self <: ColorScheme] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColors(value: js.Array[ThemeColorPair]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    @scala.inline
    def setColorsVarargs(value: ThemeColorPair*): Self = StObject.set(x, "colors", js.Array(value :_*))
  }
}
