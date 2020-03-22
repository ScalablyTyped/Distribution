package typings.nodePgMigrate

import typings.nodePgMigrate.extensionsTypesMod.CreateExtensionFn
import typings.nodePgMigrate.extensionsTypesMod.CreateExtensionOptions
import typings.nodePgMigrate.extensionsTypesMod.Extension
import typings.nodePgMigrate.generalTypesMod.DropOptions
import typings.nodePgMigrate.generalTypesMod.LiteralUnion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReverseCreateExtensionFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: CreateExtensionFn = js.native
  def reverse(extension: js.Array[LiteralUnion[Extension, String]]): String | js.Array[String] = js.native
  def reverse(
    extension: js.Array[LiteralUnion[Extension, String]],
    options: CreateExtensionOptions with DropOptions
  ): String | js.Array[String] = js.native
  def reverse(extension: LiteralUnion[Extension, String]): String | js.Array[String] = js.native
  def reverse(extension: LiteralUnion[Extension, String], options: CreateExtensionOptions with DropOptions): String | js.Array[String] = js.native
}

