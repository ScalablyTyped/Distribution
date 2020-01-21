package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.inactive
  - typings.microsoftGraph.microsoftGraphStrings.sendOnly
  - typings.microsoftGraph.microsoftGraphStrings.receiveOnly
  - typings.microsoftGraph.microsoftGraphStrings.sendReceive
*/
trait MediaDirection extends js.Object

object MediaDirection {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def inactive: typings.microsoftGraph.microsoftGraphStrings.inactive = this.cast("inactive")
  @scala.inline
  def receiveOnly: typings.microsoftGraph.microsoftGraphStrings.receiveOnly = this.cast("receiveOnly")
  @scala.inline
  def sendOnly: typings.microsoftGraph.microsoftGraphStrings.sendOnly = this.cast("sendOnly")
  @scala.inline
  def sendReceive: typings.microsoftGraph.microsoftGraphStrings.sendReceive = this.cast("sendReceive")
}

