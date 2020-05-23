package typings.nodePgMigrate.anon

import typings.nodePgMigrate.viewsMaterializedTypesMod.RenameMaterializedViewFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReverseRenameMaterializedViewFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: RenameMaterializedViewFn = js.native
  def reverse(
    viewName: typings.nodePgMigrate.generalTypesMod.Name,
    newViewName: typings.nodePgMigrate.generalTypesMod.Name
  ): String | js.Array[String] = js.native
}

