package typings.powerbiVisualsTools.mod.extensibility

import typings.powerbiVisualsTools.mod.IColorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IColorPalette extends StObject {
  
  def getColor(key: String): IColorInfo
}
object IColorPalette {
  
  inline def apply(getColor: String => IColorInfo): IColorPalette = {
    val __obj = js.Dynamic.literal(getColor = js.Any.fromFunction1(getColor))
    __obj.asInstanceOf[IColorPalette]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IColorPalette] (val x: Self) extends AnyVal {
    
    inline def setGetColor(value: String => IColorInfo): Self = StObject.set(x, "getColor", js.Any.fromFunction1(value))
  }
}
