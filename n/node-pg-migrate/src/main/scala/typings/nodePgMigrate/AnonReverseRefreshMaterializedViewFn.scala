package typings.nodePgMigrate

import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.viewsMaterializedTypesMod.RefreshMaterializedViewFn
import typings.nodePgMigrate.viewsMaterializedTypesMod.RefreshMaterializedViewOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReverseRefreshMaterializedViewFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: RefreshMaterializedViewFn = js.native
  def reverse(viewName: Name): String | js.Array[String] = js.native
  def reverse(viewName: Name, options: RefreshMaterializedViewOptions): String | js.Array[String] = js.native
}

