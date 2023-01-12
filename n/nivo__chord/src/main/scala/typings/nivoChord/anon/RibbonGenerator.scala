package typings.nivoChord.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RibbonGenerator extends StObject {
  
  var ribbonGenerator: typings.nivoChord.distTypesTypesMod.RibbonGenerator
  
  var sourceEndAngle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_web.SpringValue<number> */ Any
  
  var sourceStartAngle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_web.SpringValue<number> */ Any
  
  var targetEndAngle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_web.SpringValue<number> */ Any
  
  var targetStartAngle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_web.SpringValue<number> */ Any
}
object RibbonGenerator {
  
  inline def apply(
    ribbonGenerator: typings.nivoChord.distTypesTypesMod.RibbonGenerator,
    sourceEndAngle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_web.SpringValue<number> */ Any,
    sourceStartAngle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_web.SpringValue<number> */ Any,
    targetEndAngle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_web.SpringValue<number> */ Any,
    targetStartAngle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_web.SpringValue<number> */ Any
  ): RibbonGenerator = {
    val __obj = js.Dynamic.literal(ribbonGenerator = ribbonGenerator.asInstanceOf[js.Any], sourceEndAngle = sourceEndAngle.asInstanceOf[js.Any], sourceStartAngle = sourceStartAngle.asInstanceOf[js.Any], targetEndAngle = targetEndAngle.asInstanceOf[js.Any], targetStartAngle = targetStartAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[RibbonGenerator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RibbonGenerator] (val x: Self) extends AnyVal {
    
    inline def setRibbonGenerator(value: typings.nivoChord.distTypesTypesMod.RibbonGenerator): Self = StObject.set(x, "ribbonGenerator", value.asInstanceOf[js.Any])
    
    inline def setSourceEndAngle(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_web.SpringValue<number> */ Any
    ): Self = StObject.set(x, "sourceEndAngle", value.asInstanceOf[js.Any])
    
    inline def setSourceStartAngle(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_web.SpringValue<number> */ Any
    ): Self = StObject.set(x, "sourceStartAngle", value.asInstanceOf[js.Any])
    
    inline def setTargetEndAngle(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_web.SpringValue<number> */ Any
    ): Self = StObject.set(x, "targetEndAngle", value.asInstanceOf[js.Any])
    
    inline def setTargetStartAngle(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_web.SpringValue<number> */ Any
    ): Self = StObject.set(x, "targetStartAngle", value.asInstanceOf[js.Any])
  }
}
