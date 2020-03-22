package typings.nodePgMigrate

import typings.nodePgMigrate.generalTypesMod.IfExistsOption
import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.policiesTypesMod.CreatePolicyFn
import typings.nodePgMigrate.policiesTypesMod.CreatePolicyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReverseCreatePolicyFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: CreatePolicyFn = js.native
  def reverse(tableName: Name, policyName: String): String | js.Array[String] = js.native
  def reverse(tableName: Name, policyName: String, options: CreatePolicyOptions with IfExistsOption): String | js.Array[String] = js.native
}

