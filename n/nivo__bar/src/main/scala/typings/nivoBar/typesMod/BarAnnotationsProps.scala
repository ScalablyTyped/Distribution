package typings.nivoBar.typesMod

import typings.nivoAnnotations.typesMod.AnnotationMatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BarAnnotationsProps[RawDatum] extends StObject {
  
  var annotations: js.Array[AnnotationMatcher[ComputedBarDatum[RawDatum]]]
  
  var bars: js.Array[ComputedBarDatum[RawDatum]]
}
object BarAnnotationsProps {
  
  inline def apply[RawDatum](
    annotations: js.Array[AnnotationMatcher[ComputedBarDatum[RawDatum]]],
    bars: js.Array[ComputedBarDatum[RawDatum]]
  ): BarAnnotationsProps[RawDatum] = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], bars = bars.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarAnnotationsProps[RawDatum]]
  }
  
  extension [Self <: BarAnnotationsProps[?], RawDatum](x: Self & BarAnnotationsProps[RawDatum]) {
    
    inline def setAnnotations(value: js.Array[AnnotationMatcher[ComputedBarDatum[RawDatum]]]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsVarargs(value: AnnotationMatcher[ComputedBarDatum[RawDatum]]*): Self = StObject.set(x, "annotations", js.Array(value*))
    
    inline def setBars(value: js.Array[ComputedBarDatum[RawDatum]]): Self = StObject.set(x, "bars", value.asInstanceOf[js.Any])
    
    inline def setBarsVarargs(value: ComputedBarDatum[RawDatum]*): Self = StObject.set(x, "bars", js.Array(value*))
  }
}
