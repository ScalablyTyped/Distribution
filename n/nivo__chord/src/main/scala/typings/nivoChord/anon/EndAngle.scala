package typings.nivoChord.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndAngle extends StObject {
  
  var arcGenerator: typings.nivoChord.typesMod.ArcGenerator
  
  var endAngle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_web.SpringValue<number> */ Any
  
  var startAngle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_web.SpringValue<number> */ Any
}
object EndAngle {
  
  inline def apply(
    arcGenerator: typings.nivoChord.typesMod.ArcGenerator,
    endAngle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_web.SpringValue<number> */ Any,
    startAngle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_web.SpringValue<number> */ Any
  ): EndAngle = {
    val __obj = js.Dynamic.literal(arcGenerator = arcGenerator.asInstanceOf[js.Any], endAngle = endAngle.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndAngle]
  }
  
  extension [Self <: EndAngle](x: Self) {
    
    inline def setArcGenerator(value: typings.nivoChord.typesMod.ArcGenerator): Self = StObject.set(x, "arcGenerator", value.asInstanceOf[js.Any])
    
    inline def setEndAngle(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_web.SpringValue<number> */ Any
    ): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    inline def setStartAngle(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_web.SpringValue<number> */ Any
    ): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
  }
}
