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
  def create: typings.microsoftGraph.microsoftGraphStrings.create = "create".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.create]
  @scala.inline
  def delete: delete_ = "delete".asInstanceOf[delete_]
  @scala.inline
  def modify: typings.microsoftGraph.microsoftGraphStrings.modify = "modify".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.modify]
  @scala.inline
  def unknown: unknown_ = "unknown".asInstanceOf[unknown_]
  @scala.inline
  def unknownFutureValue: typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue = "unknownFutureValue".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue]
}

