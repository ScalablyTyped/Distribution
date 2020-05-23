package typings.nodePgMigrate.anon

import typings.nodePgMigrate.generalTypesMod.DropOptions
import typings.nodePgMigrate.viewsMaterializedTypesMod.CreateMaterializedViewFn
import typings.nodePgMigrate.viewsMaterializedTypesMod.CreateMaterializedViewOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReverseCreateMaterializedViewFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: CreateMaterializedViewFn = js.native
  def reverse(
    viewName: typings.nodePgMigrate.generalTypesMod.Name,
    options: CreateMaterializedViewOptions with DropOptions,
    definition: String
  ): String | js.Array[String] = js.native
}

