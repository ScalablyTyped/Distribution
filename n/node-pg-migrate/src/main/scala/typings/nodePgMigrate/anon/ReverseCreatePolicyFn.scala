package typings.nodePgMigrate.anon

import typings.nodePgMigrate.generalTypesMod.IfExistsOption
import typings.nodePgMigrate.policiesTypesMod.CreatePolicyFn
import typings.nodePgMigrate.policiesTypesMod.CreatePolicyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReverseCreatePolicyFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: CreatePolicyFn = js.native
  def reverse(tableName: typings.nodePgMigrate.generalTypesMod.Name, policyName: String): String | js.Array[String] = js.native
  def reverse(
    tableName: typings.nodePgMigrate.generalTypesMod.Name,
    policyName: String,
    options: CreatePolicyOptions with IfExistsOption
  ): String | js.Array[String] = js.native
}

