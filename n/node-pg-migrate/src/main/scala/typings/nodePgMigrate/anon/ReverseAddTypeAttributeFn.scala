package typings.nodePgMigrate.anon

import typings.nodePgMigrate.generalTypesMod.IfExistsOption
import typings.nodePgMigrate.typesTypesMod.AddTypeAttributeFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseAddTypeAttributeFn extends StObject {
  
  def reverse(
    typeName: typings.nodePgMigrate.generalTypesMod.Name,
    attributeName: String,
    attributeType: typings.nodePgMigrate.generalTypesMod.Type with IfExistsOption
  ): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: AddTypeAttributeFn = js.native
}
