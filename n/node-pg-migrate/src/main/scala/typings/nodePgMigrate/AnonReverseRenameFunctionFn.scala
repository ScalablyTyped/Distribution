package typings.nodePgMigrate

import typings.nodePgMigrate.functionsTypesMod.FunctionParam
import typings.nodePgMigrate.functionsTypesMod.RenameFunctionFn
import typings.nodePgMigrate.generalTypesMod.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReverseRenameFunctionFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: RenameFunctionFn = js.native
  def reverse(oldFunctionName: Name, functionParams: js.Array[FunctionParam], newFunctionName: Name): String | js.Array[String] = js.native
}

