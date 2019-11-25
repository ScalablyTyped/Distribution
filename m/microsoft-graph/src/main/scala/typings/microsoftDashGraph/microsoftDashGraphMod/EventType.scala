package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.singleInstance
  - typings.microsoftDashGraph.microsoftDashGraphStrings.occurrence
  - typings.microsoftDashGraph.microsoftDashGraphStrings.exception
  - typings.microsoftDashGraph.microsoftDashGraphStrings.seriesMaster
*/
trait EventType extends js.Object

object EventType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def exception: typings.microsoftDashGraph.microsoftDashGraphStrings.exception = this.cast("exception")
  @scala.inline
  def occurrence: typings.microsoftDashGraph.microsoftDashGraphStrings.occurrence = this.cast("occurrence")
  @scala.inline
  def seriesMaster: typings.microsoftDashGraph.microsoftDashGraphStrings.seriesMaster = this.cast("seriesMaster")
  @scala.inline
  def singleInstance: typings.microsoftDashGraph.microsoftDashGraphStrings.singleInstance = this.cast("singleInstance")
}

