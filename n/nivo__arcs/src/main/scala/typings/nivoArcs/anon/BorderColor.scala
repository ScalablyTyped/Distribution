package typings.nivoArcs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderColor extends StObject {
  
  var borderColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<string> */ Any
  
  var borderWidth: Double
  
  var color: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<string> */ Any
  
  var opacity: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ Any
  
  var path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Interpolation<string> */ Any
}
object BorderColor {
  
  inline def apply(
    borderColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<string> */ Any,
    borderWidth: Double,
    color: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<string> */ Any,
    opacity: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ Any,
    path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Interpolation<string> */ Any
  ): BorderColor = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderColor]
  }
  
  extension [Self <: BorderColor](x: Self) {
    
    inline def setBorderColor(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<string> */ Any
    ): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setColor(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<string> */ Any
    ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setOpacity(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ Any
    ): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setPath(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Interpolation<string> */ Any
    ): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
