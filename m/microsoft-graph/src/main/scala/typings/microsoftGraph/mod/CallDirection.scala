package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.incoming
  - typings.microsoftGraph.microsoftGraphStrings.outgoing
*/
trait CallDirection extends js.Object

object CallDirection {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def incoming: typings.microsoftGraph.microsoftGraphStrings.incoming = this.cast("incoming")
  @scala.inline
  def outgoing: typings.microsoftGraph.microsoftGraphStrings.outgoing = this.cast("outgoing")
}

