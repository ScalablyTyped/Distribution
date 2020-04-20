package typings.plotlyJs.mod

import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClickAnnotationEvent extends js.Object {
  var annotation: Annotations
  var event: MouseEvent
  var fullAnnotation: Annotations
  var index: Double
}

object ClickAnnotationEvent {
  @scala.inline
  def apply(annotation: Annotations, event: MouseEvent, fullAnnotation: Annotations, index: Double): ClickAnnotationEvent = {
    val __obj = js.Dynamic.literal(annotation = annotation.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], fullAnnotation = fullAnnotation.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickAnnotationEvent]
  }
}

