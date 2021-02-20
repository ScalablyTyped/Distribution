package typings.nodePgMigrate.anon

import typings.nodePgMigrate.generalTypesMod.DropOptions
import typings.nodePgMigrate.operatorsTypesMod.CreateOperatorFamilyFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseCreateOperatorFamilyFn extends StObject {
  
  def reverse(
    operatorFamilyName: typings.nodePgMigrate.generalTypesMod.Name,
    indexMethod: typings.nodePgMigrate.generalTypesMod.Name
  ): String | js.Array[String] = js.native
  def reverse(
    operatorFamilyName: typings.nodePgMigrate.generalTypesMod.Name,
    indexMethod: typings.nodePgMigrate.generalTypesMod.Name,
    options: DropOptions
  ): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: CreateOperatorFamilyFn = js.native
}
