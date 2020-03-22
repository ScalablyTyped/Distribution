package typings.nodePgMigrate

import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.viewsMaterializedTypesMod.RenameMaterializedViewColumnFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReverseRenameMaterializedViewColumnFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: RenameMaterializedViewColumnFn = js.native
  def reverse(viewName: Name, columnName: String, newColumnName: String): String | js.Array[String] = js.native
}

