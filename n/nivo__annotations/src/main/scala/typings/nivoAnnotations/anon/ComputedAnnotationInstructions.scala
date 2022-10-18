package typings.nivoAnnotations.anon

import typings.nivoAnnotations.distTypesTypesMod.AnnotationInstructions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputedAnnotationInstructions extends StObject {
  
  var computed: AnnotationInstructions
}
object ComputedAnnotationInstructions {
  
  inline def apply(computed: AnnotationInstructions): ComputedAnnotationInstructions = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputedAnnotationInstructions]
  }
  
  extension [Self <: ComputedAnnotationInstructions](x: Self) {
    
    inline def setComputed(value: AnnotationInstructions): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
  }
}
