package typings.atNivoAnnotations.atNivoAnnotationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atNivoAnnotations.atNivoAnnotationsStrings.circle
  - typings.atNivoAnnotations.atNivoAnnotationsStrings.dot
  - typings.atNivoAnnotations.atNivoAnnotationsStrings.rect
*/
trait AnnotationType extends js.Object

object AnnotationType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def circle: typings.atNivoAnnotations.atNivoAnnotationsStrings.circle = this.cast("circle")
  @scala.inline
  def dot: typings.atNivoAnnotations.atNivoAnnotationsStrings.dot = this.cast("dot")
  @scala.inline
  def rect: typings.atNivoAnnotations.atNivoAnnotationsStrings.rect = this.cast("rect")
}

