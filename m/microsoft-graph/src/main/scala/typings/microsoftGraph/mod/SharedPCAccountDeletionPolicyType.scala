package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.immediate
  - typings.microsoftGraph.microsoftGraphStrings.diskSpaceThreshold
  - typings.microsoftGraph.microsoftGraphStrings.diskSpaceThresholdOrInactiveThreshold
*/
trait SharedPCAccountDeletionPolicyType extends js.Object

object SharedPCAccountDeletionPolicyType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def diskSpaceThreshold: typings.microsoftGraph.microsoftGraphStrings.diskSpaceThreshold = this.cast("diskSpaceThreshold")
  @scala.inline
  def diskSpaceThresholdOrInactiveThreshold: typings.microsoftGraph.microsoftGraphStrings.diskSpaceThresholdOrInactiveThreshold = this.cast("diskSpaceThresholdOrInactiveThreshold")
  @scala.inline
  def immediate: typings.microsoftGraph.microsoftGraphStrings.immediate = this.cast("immediate")
}

