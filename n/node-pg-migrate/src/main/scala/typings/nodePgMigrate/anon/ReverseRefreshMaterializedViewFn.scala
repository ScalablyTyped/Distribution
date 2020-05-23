package typings.nodePgMigrate.anon

import typings.nodePgMigrate.viewsMaterializedTypesMod.RefreshMaterializedViewFn
import typings.nodePgMigrate.viewsMaterializedTypesMod.RefreshMaterializedViewOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReverseRefreshMaterializedViewFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: RefreshMaterializedViewFn = js.native
  def reverse(viewName: typings.nodePgMigrate.generalTypesMod.Name): String | js.Array[String] = js.native
  def reverse(viewName: typings.nodePgMigrate.generalTypesMod.Name, options: RefreshMaterializedViewOptions): String | js.Array[String] = js.native
}

