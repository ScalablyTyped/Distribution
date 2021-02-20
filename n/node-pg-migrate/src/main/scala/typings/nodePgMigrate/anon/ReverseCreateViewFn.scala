package typings.nodePgMigrate.anon

import typings.nodePgMigrate.generalTypesMod.DropOptions
import typings.nodePgMigrate.viewsTypesMod.CreateViewFn
import typings.nodePgMigrate.viewsTypesMod.CreateViewOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseCreateViewFn extends StObject {
  
  def reverse(
    viewName: typings.nodePgMigrate.generalTypesMod.Name,
    options: CreateViewOptions with DropOptions,
    definition: String
  ): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: CreateViewFn = js.native
}
