package typings.plotlyJs.mod

import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClickAnnotationEvent extends StObject {
  
  var annotation: Annotations
  
  var event: MouseEvent
  
  var fullAnnotation: Annotations
  
  var index: Double
}
object ClickAnnotationEvent {
  
  inline def apply(annotation: Annotations, event: MouseEvent, fullAnnotation: Annotations, index: Double): ClickAnnotationEvent = {
    val __obj = js.Dynamic.literal(annotation = annotation.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], fullAnnotation = fullAnnotation.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickAnnotationEvent]
  }
  
  extension [Self <: ClickAnnotationEvent](x: Self) {
    
    inline def setAnnotation(value: Annotations): Self = StObject.set(x, "annotation", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: MouseEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setFullAnnotation(value: Annotations): Self = StObject.set(x, "fullAnnotation", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
