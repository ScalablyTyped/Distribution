package typings.nivoAnnotations.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nivoAnnotations.nivoAnnotationsStrings.circle
  - typings.nivoAnnotations.nivoAnnotationsStrings.dot
  - typings.nivoAnnotations.nivoAnnotationsStrings.rect
*/
trait AnnotationType extends js.Object

object AnnotationType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def circle: typings.nivoAnnotations.nivoAnnotationsStrings.circle = this.cast("circle")
  @scala.inline
  def dot: typings.nivoAnnotations.nivoAnnotationsStrings.dot = this.cast("dot")
  @scala.inline
  def rect: typings.nivoAnnotations.nivoAnnotationsStrings.rect = this.cast("rect")
}

