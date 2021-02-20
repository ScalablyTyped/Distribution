package typings.nodePgMigrate.anon

import typings.nodePgMigrate.generalTypesMod.IfExistsOption
import typings.nodePgMigrate.policiesTypesMod.CreatePolicyFn
import typings.nodePgMigrate.policiesTypesMod.CreatePolicyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseCreatePolicyFn extends StObject {
  
  def reverse(tableName: typings.nodePgMigrate.generalTypesMod.Name, policyName: String): String | js.Array[String] = js.native
  def reverse(
    tableName: typings.nodePgMigrate.generalTypesMod.Name,
    policyName: String,
    options: CreatePolicyOptions with IfExistsOption
  ): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: CreatePolicyFn = js.native
}
