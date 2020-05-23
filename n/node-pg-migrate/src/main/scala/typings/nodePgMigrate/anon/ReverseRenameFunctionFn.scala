package typings.nodePgMigrate.anon

import typings.nodePgMigrate.functionsTypesMod.FunctionParam
import typings.nodePgMigrate.functionsTypesMod.RenameFunctionFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReverseRenameFunctionFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: RenameFunctionFn = js.native
  def reverse(
    oldFunctionName: typings.nodePgMigrate.generalTypesMod.Name,
    functionParams: js.Array[FunctionParam],
    newFunctionName: typings.nodePgMigrate.generalTypesMod.Name
  ): String | js.Array[String] = js.native
}

