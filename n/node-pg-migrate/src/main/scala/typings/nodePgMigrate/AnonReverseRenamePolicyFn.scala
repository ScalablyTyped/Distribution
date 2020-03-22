package typings.nodePgMigrate

import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.policiesTypesMod.RenamePolicyFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReverseRenamePolicyFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: RenamePolicyFn = js.native
  def reverse(tableName: Name, policyName: String, newPolicyName: String): String | js.Array[String] = js.native
}

