package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.singleInstance
  - typings.microsoftGraph.microsoftGraphStrings.occurrence
  - typings.microsoftGraph.microsoftGraphStrings.exception
  - typings.microsoftGraph.microsoftGraphStrings.seriesMaster
*/
trait EventType extends js.Object

object EventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def exception: typings.microsoftGraph.microsoftGraphStrings.exception = this.cast("exception")
  @scala.inline
  def occurrence: typings.microsoftGraph.microsoftGraphStrings.occurrence = this.cast("occurrence")
  @scala.inline
  def seriesMaster: typings.microsoftGraph.microsoftGraphStrings.seriesMaster = this.cast("seriesMaster")
  @scala.inline
  def singleInstance: typings.microsoftGraph.microsoftGraphStrings.singleInstance = this.cast("singleInstance")
}

