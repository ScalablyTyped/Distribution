package typings.nodePgMigrate

import typings.nodePgMigrate.generalTypesMod.DropOptions
import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.viewsMaterializedTypesMod.CreateMaterializedViewFn
import typings.nodePgMigrate.viewsMaterializedTypesMod.CreateMaterializedViewOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReverseCreateMaterializedViewFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: CreateMaterializedViewFn = js.native
  def reverse(viewName: Name, options: CreateMaterializedViewOptions with DropOptions, definition: String): String | js.Array[String] = js.native
}

