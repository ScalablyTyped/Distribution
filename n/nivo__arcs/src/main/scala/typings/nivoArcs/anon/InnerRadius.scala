package typings.nivoArcs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InnerRadius extends StObject {
  
  var endAngle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_web.SpringValue<number> */ Any
  
  var innerRadius: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_web.SpringValue<number> */ Any
  
  var outerRadius: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_web.SpringValue<number> */ Any
  
  var path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_web.Interpolation<string | null, any> */ Any
  
  var startAngle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_web.SpringValue<number> */ Any
}
object InnerRadius {
  
  inline def apply(
    endAngle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_web.SpringValue<number> */ Any,
    innerRadius: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_web.SpringValue<number> */ Any,
    outerRadius: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_web.SpringValue<number> */ Any,
    path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_web.Interpolation<string | null, any> */ Any,
    startAngle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_web.SpringValue<number> */ Any
  ): InnerRadius = {
    val __obj = js.Dynamic.literal(endAngle = endAngle.asInstanceOf[js.Any], innerRadius = innerRadius.asInstanceOf[js.Any], outerRadius = outerRadius.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[InnerRadius]
  }
  
  extension [Self <: InnerRadius](x: Self) {
    
    inline def setEndAngle(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_web.SpringValue<number> */ Any
    ): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    inline def setInnerRadius(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_web.SpringValue<number> */ Any
    ): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
    
    inline def setOuterRadius(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_web.SpringValue<number> */ Any
    ): Self = StObject.set(x, "outerRadius", value.asInstanceOf[js.Any])
    
    inline def setPath(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_web.Interpolation<string | null, any> */ Any
    ): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setStartAngle(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_web.SpringValue<number> */ Any
    ): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
  }
}
