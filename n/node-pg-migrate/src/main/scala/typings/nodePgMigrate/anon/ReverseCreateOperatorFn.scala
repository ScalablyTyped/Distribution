package typings.nodePgMigrate.anon

import typings.nodePgMigrate.operatorsTypesMod.CreateOperatorFn
import typings.nodePgMigrate.operatorsTypesMod.CreateOperatorOptions
import typings.nodePgMigrate.operatorsTypesMod.DropOperatorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseCreateOperatorFn extends js.Object {
  
  def reverse(
    operatorName: typings.nodePgMigrate.generalTypesMod.Name,
    options: CreateOperatorOptions with DropOperatorOptions
  ): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: CreateOperatorFn = js.native
}
