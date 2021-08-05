package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Color extends StObject {
  
  var components: ColorComponents
  
  var format: ColorFormat
}
object Color {
  
  inline def apply(components: ColorComponents, format: ColorFormat): Color = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  
  extension [Self <: Color](x: Self) {
    
    inline def setComponents(value: ColorComponents): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: ColorFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
  }
}
