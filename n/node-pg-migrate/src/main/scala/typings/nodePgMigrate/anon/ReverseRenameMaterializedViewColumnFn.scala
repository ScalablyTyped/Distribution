package typings.nodePgMigrate.anon

import typings.nodePgMigrate.viewsMaterializedTypesMod.RenameMaterializedViewColumnFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReverseRenameMaterializedViewColumnFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: RenameMaterializedViewColumnFn = js.native
  def reverse(viewName: typings.nodePgMigrate.generalTypesMod.Name, columnName: String, newColumnName: String): String | js.Array[String] = js.native
}

