package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.delete_
import typings.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.unknown_
  - typings.microsoftGraph.microsoftGraphStrings.create
  - typings.microsoftGraph.microsoftGraphStrings.modify
  - typings.microsoftGraph.microsoftGraphStrings.delete_
  - typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait RegistryOperation extends js.Object

object RegistryOperation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def create: typings.microsoftGraph.microsoftGraphStrings.create = this.cast("create")
  @scala.inline
  def delete: delete_ = this.cast("delete")
  @scala.inline
  def modify: typings.microsoftGraph.microsoftGraphStrings.modify = this.cast("modify")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unknownFutureValue: typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

