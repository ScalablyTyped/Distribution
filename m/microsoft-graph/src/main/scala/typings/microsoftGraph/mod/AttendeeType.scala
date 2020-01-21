package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.required
  - typings.microsoftGraph.microsoftGraphStrings.optional
  - typings.microsoftGraph.microsoftGraphStrings.resource
*/
trait AttendeeType extends js.Object

object AttendeeType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def optional: typings.microsoftGraph.microsoftGraphStrings.optional = this.cast("optional")
  @scala.inline
  def required: typings.microsoftGraph.microsoftGraphStrings.required = this.cast("required")
  @scala.inline
  def resource: typings.microsoftGraph.microsoftGraphStrings.resource = this.cast("resource")
}

