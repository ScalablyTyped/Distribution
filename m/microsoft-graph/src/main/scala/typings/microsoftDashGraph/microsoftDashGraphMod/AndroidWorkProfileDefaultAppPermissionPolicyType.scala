package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.deviceDefault
  - typings.microsoftDashGraph.microsoftDashGraphStrings.prompt
  - typings.microsoftDashGraph.microsoftDashGraphStrings.autoGrant
  - typings.microsoftDashGraph.microsoftDashGraphStrings.autoDeny
*/
trait AndroidWorkProfileDefaultAppPermissionPolicyType extends js.Object

object AndroidWorkProfileDefaultAppPermissionPolicyType {
  @scala.inline
  def autoDeny: typings.microsoftDashGraph.microsoftDashGraphStrings.autoDeny = this.cast("autoDeny")
  @scala.inline
  def autoGrant: typings.microsoftDashGraph.microsoftDashGraphStrings.autoGrant = this.cast("autoGrant")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deviceDefault: typings.microsoftDashGraph.microsoftDashGraphStrings.deviceDefault = this.cast("deviceDefault")
  @scala.inline
  def prompt: typings.microsoftDashGraph.microsoftDashGraphStrings.prompt = this.cast("prompt")
}

