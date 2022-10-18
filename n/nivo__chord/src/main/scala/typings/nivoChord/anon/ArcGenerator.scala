package typings.nivoChord.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArcGenerator extends StObject {
  
  var arcGenerator: typings.nivoChord.distTypesTypesMod.ArcGenerator
  
  var endAngle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_web.SpringValue<number> */ Any
  
  var startAngle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_web.SpringValue<number> */ Any
}
object ArcGenerator {
  
  inline def apply(
    arcGenerator: typings.nivoChord.distTypesTypesMod.ArcGenerator,
    endAngle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_web.SpringValue<number> */ Any,
    startAngle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_web.SpringValue<number> */ Any
  ): ArcGenerator = {
    val __obj = js.Dynamic.literal(arcGenerator = arcGenerator.asInstanceOf[js.Any], endAngle = endAngle.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcGenerator]
  }
  
  extension [Self <: ArcGenerator](x: Self) {
    
    inline def setArcGenerator(value: typings.nivoChord.distTypesTypesMod.ArcGenerator): Self = StObject.set(x, "arcGenerator", value.asInstanceOf[js.Any])
    
    inline def setEndAngle(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_web.SpringValue<number> */ Any
    ): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    inline def setStartAngle(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_web.SpringValue<number> */ Any
    ): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
  }
}
