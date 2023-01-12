package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://docs.nova.app/api-reference/color-information/
trait ColorInformation extends StObject {
  
  var color: Color
  
  var format: js.UndefOr[ColorFormat] = js.undefined
  
  var kind: js.UndefOr[String] = js.undefined
  
  var range: Range
  
  var usesFloats: js.UndefOr[Boolean] = js.undefined
}
object ColorInformation {
  
  inline def apply(color: Color, range: Range): ColorInformation = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorInformation] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: ColorFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setUsesFloats(value: Boolean): Self = StObject.set(x, "usesFloats", value.asInstanceOf[js.Any])
    
    inline def setUsesFloatsUndefined: Self = StObject.set(x, "usesFloats", js.undefined)
  }
}
