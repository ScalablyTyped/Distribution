package typings.nivoCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorProps[T] extends StObject {
  
  var colorBy: js.UndefOr[String | GetColor[T]] = js.undefined
  
  var colors: js.UndefOr[Colors] = js.undefined
}
object ColorProps {
  
  inline def apply[T](): ColorProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorProps[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorProps[?], T] (val x: Self & ColorProps[T]) extends AnyVal {
    
    inline def setColorBy(value: String | GetColor[T]): Self = StObject.set(x, "colorBy", value.asInstanceOf[js.Any])
    
    inline def setColorByFunction1(value: T => String): Self = StObject.set(x, "colorBy", js.Any.fromFunction1(value))
    
    inline def setColorByUndefined: Self = StObject.set(x, "colorBy", js.undefined)
    
    inline def setColors(value: Colors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
  }
}
