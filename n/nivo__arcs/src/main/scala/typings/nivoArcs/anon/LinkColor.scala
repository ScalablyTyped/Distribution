package typings.nivoArcs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkColor extends StObject {
  
  var linkColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<string> */ Any
  
  var opacity: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ Any
  
  var path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Interpolation<string> */ Any
  
  var textAnchor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Interpolation<'start' | 'end'> */ Any
  
  var textColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<string> */ Any
  
  var textPosition: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Interpolation<string> */ Any
  
  var thickness: Double
}
object LinkColor {
  
  inline def apply(
    linkColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<string> */ Any,
    opacity: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ Any,
    path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Interpolation<string> */ Any,
    textAnchor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Interpolation<'start' | 'end'> */ Any,
    textColor: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<string> */ Any,
    textPosition: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Interpolation<string> */ Any,
    thickness: Double
  ): LinkColor = {
    val __obj = js.Dynamic.literal(linkColor = linkColor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], textAnchor = textAnchor.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any], textPosition = textPosition.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkColor]
  }
  
  extension [Self <: LinkColor](x: Self) {
    
    inline def setLinkColor(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<string> */ Any
    ): Self = StObject.set(x, "linkColor", value.asInstanceOf[js.Any])
    
    inline def setOpacity(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ Any
    ): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setPath(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Interpolation<string> */ Any
    ): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setTextAnchor(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Interpolation<'start' | 'end'> */ Any
    ): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
    
    inline def setTextColor(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<string> */ Any
    ): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setTextPosition(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Interpolation<string> */ Any
    ): Self = StObject.set(x, "textPosition", value.asInstanceOf[js.Any])
    
    inline def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
  }
}
