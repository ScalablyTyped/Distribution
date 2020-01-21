package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.notConfigured
  - typings.microsoftGraph.microsoftGraphStrings.blockBoth
  - typings.microsoftGraph.microsoftGraphStrings.blockHostToContainer
  - typings.microsoftGraph.microsoftGraphStrings.blockContainerToHost
  - typings.microsoftGraph.microsoftGraphStrings.blockNone
*/
trait ApplicationGuardBlockClipboardSharingType extends js.Object

object ApplicationGuardBlockClipboardSharingType {
  @scala.inline
  def blockBoth: typings.microsoftGraph.microsoftGraphStrings.blockBoth = this.cast("blockBoth")
  @scala.inline
  def blockContainerToHost: typings.microsoftGraph.microsoftGraphStrings.blockContainerToHost = this.cast("blockContainerToHost")
  @scala.inline
  def blockHostToContainer: typings.microsoftGraph.microsoftGraphStrings.blockHostToContainer = this.cast("blockHostToContainer")
  @scala.inline
  def blockNone: typings.microsoftGraph.microsoftGraphStrings.blockNone = this.cast("blockNone")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def notConfigured: typings.microsoftGraph.microsoftGraphStrings.notConfigured = this.cast("notConfigured")
}

