package typings.plotlyJs.mod

import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClickAnnotationEvent extends StObject {
  
  var annotation: Annotations = js.native
  
  var event: MouseEvent = js.native
  
  var fullAnnotation: Annotations = js.native
  
  var index: Double = js.native
}
object ClickAnnotationEvent {
  
  @scala.inline
  def apply(annotation: Annotations, event: MouseEvent, fullAnnotation: Annotations, index: Double): ClickAnnotationEvent = {
    val __obj = js.Dynamic.literal(annotation = annotation.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], fullAnnotation = fullAnnotation.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickAnnotationEvent]
  }
  
  @scala.inline
  implicit class ClickAnnotationEventMutableBuilder[Self <: ClickAnnotationEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotation(value: Annotations): Self = StObject.set(x, "annotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: MouseEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullAnnotation(value: Annotations): Self = StObject.set(x, "fullAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
