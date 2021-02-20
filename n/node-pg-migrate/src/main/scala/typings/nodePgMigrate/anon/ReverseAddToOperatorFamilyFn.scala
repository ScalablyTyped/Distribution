package typings.nodePgMigrate.anon

import typings.nodePgMigrate.operatorsTypesMod.AddToOperatorFamilyFn
import typings.nodePgMigrate.operatorsTypesMod.OperatorListDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseAddToOperatorFamilyFn extends StObject {
  
  def reverse(
    operatorFamilyName: typings.nodePgMigrate.generalTypesMod.Name,
    indexMethod: typings.nodePgMigrate.generalTypesMod.Name,
    operatorList: js.Array[OperatorListDefinition]
  ): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: AddToOperatorFamilyFn = js.native
}
