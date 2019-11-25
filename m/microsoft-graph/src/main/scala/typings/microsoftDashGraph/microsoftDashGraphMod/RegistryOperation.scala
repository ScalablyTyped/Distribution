package typings.microsoftDashGraph.microsoftDashGraphMod

import typings.microsoftDashGraph.microsoftDashGraphStrings.delete_
import typings.microsoftDashGraph.microsoftDashGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknown_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.create
  - typings.microsoftDashGraph.microsoftDashGraphStrings.modify
  - typings.microsoftDashGraph.microsoftDashGraphStrings.delete_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.unknownFutureValue
*/
trait RegistryOperation extends js.Object

object RegistryOperation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def create: typings.microsoftDashGraph.microsoftDashGraphStrings.create = this.cast("create")
  @scala.inline
  def delete: delete_ = this.cast("delete")
  @scala.inline
  def modify: typings.microsoftDashGraph.microsoftDashGraphStrings.modify = this.cast("modify")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unknownFutureValue: typings.microsoftDashGraph.microsoftDashGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

