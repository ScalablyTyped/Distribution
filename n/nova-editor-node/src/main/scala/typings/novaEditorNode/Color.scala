package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Color
  extends StObject
     with _Transferrable {
  
  val components: js.Array[Double]
  
  def convert(format: ColorFormat): Color
  
  val format: ColorFormat
}
object Color {
  
  inline def apply(components: js.Array[Double], convert: ColorFormat => Color, format: ColorFormat): Color = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], convert = js.Any.fromFunction1(convert), format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  
  extension [Self <: Color](x: Self) {
    
    inline def setComponents(value: js.Array[Double]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsVarargs(value: Double*): Self = StObject.set(x, "components", js.Array(value*))
    
    inline def setConvert(value: ColorFormat => Color): Self = StObject.set(x, "convert", js.Any.fromFunction1(value))
    
    inline def setFormat(value: ColorFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
  }
}
