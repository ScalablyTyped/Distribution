package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.deviceDefault
  - typings.microsoftGraph.microsoftGraphStrings.prompt
  - typings.microsoftGraph.microsoftGraphStrings.autoGrant
  - typings.microsoftGraph.microsoftGraphStrings.autoDeny
*/
trait AndroidWorkProfileDefaultAppPermissionPolicyType extends js.Object

object AndroidWorkProfileDefaultAppPermissionPolicyType {
  @scala.inline
  def autoDeny: typings.microsoftGraph.microsoftGraphStrings.autoDeny = this.cast("autoDeny")
  @scala.inline
  def autoGrant: typings.microsoftGraph.microsoftGraphStrings.autoGrant = this.cast("autoGrant")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deviceDefault: typings.microsoftGraph.microsoftGraphStrings.deviceDefault = this.cast("deviceDefault")
  @scala.inline
  def prompt: typings.microsoftGraph.microsoftGraphStrings.prompt = this.cast("prompt")
}

