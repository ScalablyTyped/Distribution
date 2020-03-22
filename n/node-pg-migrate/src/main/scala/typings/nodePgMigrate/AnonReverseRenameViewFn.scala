package typings.nodePgMigrate

import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.viewsTypesMod.RenameViewFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReverseRenameViewFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: RenameViewFn = js.native
  def reverse(viewName: Name, newViewName: Name): String | js.Array[String] = js.native
}

