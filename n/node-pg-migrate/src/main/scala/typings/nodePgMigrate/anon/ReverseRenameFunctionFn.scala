package typings.nodePgMigrate.anon

import typings.nodePgMigrate.functionsTypesMod.FunctionParam
import typings.nodePgMigrate.functionsTypesMod.RenameFunctionFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseRenameFunctionFn extends StObject {
  
  def reverse(
    oldFunctionName: typings.nodePgMigrate.generalTypesMod.Name,
    functionParams: js.Array[FunctionParam],
    newFunctionName: typings.nodePgMigrate.generalTypesMod.Name
  ): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: RenameFunctionFn = js.native
}
