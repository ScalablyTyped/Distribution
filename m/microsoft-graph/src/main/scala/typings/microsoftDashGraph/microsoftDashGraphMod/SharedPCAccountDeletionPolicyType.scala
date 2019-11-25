package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.immediate
  - typings.microsoftDashGraph.microsoftDashGraphStrings.diskSpaceThreshold
  - typings.microsoftDashGraph.microsoftDashGraphStrings.diskSpaceThresholdOrInactiveThreshold
*/
trait SharedPCAccountDeletionPolicyType extends js.Object

object SharedPCAccountDeletionPolicyType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def diskSpaceThreshold: typings.microsoftDashGraph.microsoftDashGraphStrings.diskSpaceThreshold = this.cast("diskSpaceThreshold")
  @scala.inline
  def diskSpaceThresholdOrInactiveThreshold: typings.microsoftDashGraph.microsoftDashGraphStrings.diskSpaceThresholdOrInactiveThreshold = this.cast("diskSpaceThresholdOrInactiveThreshold")
  @scala.inline
  def immediate: typings.microsoftDashGraph.microsoftDashGraphStrings.immediate = this.cast("immediate")
}

