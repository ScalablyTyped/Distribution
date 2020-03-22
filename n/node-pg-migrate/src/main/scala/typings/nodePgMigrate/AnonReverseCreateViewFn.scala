package typings.nodePgMigrate

import typings.nodePgMigrate.generalTypesMod.DropOptions
import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.viewsTypesMod.CreateViewFn
import typings.nodePgMigrate.viewsTypesMod.CreateViewOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReverseCreateViewFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: CreateViewFn = js.native
  def reverse(viewName: Name, options: CreateViewOptions with DropOptions, definition: String): String | js.Array[String] = js.native
}

