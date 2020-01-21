package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.none_
  - typings.microsoftGraph.microsoftGraphStrings.organizer
  - typings.microsoftGraph.microsoftGraphStrings.tentativelyAccepted
  - typings.microsoftGraph.microsoftGraphStrings.accepted
  - typings.microsoftGraph.microsoftGraphStrings.declined
  - typings.microsoftGraph.microsoftGraphStrings.notResponded
*/
trait ResponseType extends js.Object

object ResponseType {
  @scala.inline
  def accepted: typings.microsoftGraph.microsoftGraphStrings.accepted = this.cast("accepted")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def declined: typings.microsoftGraph.microsoftGraphStrings.declined = this.cast("declined")
  @scala.inline
  def none: none_ = this.cast("none")
  @scala.inline
  def notResponded: typings.microsoftGraph.microsoftGraphStrings.notResponded = this.cast("notResponded")
  @scala.inline
  def organizer: typings.microsoftGraph.microsoftGraphStrings.organizer = this.cast("organizer")
  @scala.inline
  def tentativelyAccepted: typings.microsoftGraph.microsoftGraphStrings.tentativelyAccepted = this.cast("tentativelyAccepted")
}

