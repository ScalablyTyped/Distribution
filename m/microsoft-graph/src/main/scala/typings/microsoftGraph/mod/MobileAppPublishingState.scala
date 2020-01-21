package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.notPublished
  - typings.microsoftGraph.microsoftGraphStrings.processing
  - typings.microsoftGraph.microsoftGraphStrings.published
*/
trait MobileAppPublishingState extends js.Object

object MobileAppPublishingState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def notPublished: typings.microsoftGraph.microsoftGraphStrings.notPublished = this.cast("notPublished")
  @scala.inline
  def processing: typings.microsoftGraph.microsoftGraphStrings.processing = this.cast("processing")
  @scala.inline
  def published: typings.microsoftGraph.microsoftGraphStrings.published = this.cast("published")
}

