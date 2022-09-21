package typings.nivoArcs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Progress extends StObject {
  
  var progress: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ Any
  
  var textColor: String
  
  var transform: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Interpolation<string> */ Any
}
object Progress {
  
  inline def apply(
    progress: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ Any,
    textColor: String,
    transform: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Interpolation<string> */ Any
  ): Progress = {
    val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Progress]
  }
  
  extension [Self <: Progress](x: Self) {
    
    inline def setProgress(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValue<number> */ Any
    ): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setTransform(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Interpolation<string> */ Any
    ): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
  }
}
