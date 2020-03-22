package typings.nodePgMigrate

import typings.nodePgMigrate.functionsTypesMod.CreateFunctionFn
import typings.nodePgMigrate.functionsTypesMod.FunctionOptions
import typings.nodePgMigrate.functionsTypesMod.FunctionParam
import typings.nodePgMigrate.generalTypesMod.DropOptions
import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.generalTypesMod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReverseCreateFunctionFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: CreateFunctionFn = js.native
  def reverse(
    functionName: Name,
    functionParams: js.Array[FunctionParam],
    functionOptions: FunctionOptions with DropOptions,
    definition: Value
  ): String | js.Array[String] = js.native
}

