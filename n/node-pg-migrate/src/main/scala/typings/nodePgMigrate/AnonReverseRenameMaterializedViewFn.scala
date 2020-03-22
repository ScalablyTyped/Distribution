package typings.nodePgMigrate

import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.viewsMaterializedTypesMod.RenameMaterializedViewFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReverseRenameMaterializedViewFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: RenameMaterializedViewFn = js.native
  def reverse(viewName: Name, newViewName: Name): String | js.Array[String] = js.native
}

