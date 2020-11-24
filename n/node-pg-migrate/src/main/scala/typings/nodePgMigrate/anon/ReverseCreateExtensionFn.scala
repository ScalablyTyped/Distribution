package typings.nodePgMigrate.anon

import typings.nodePgMigrate.extensionsTypesMod.CreateExtensionFn
import typings.nodePgMigrate.extensionsTypesMod.CreateExtensionOptions
import typings.nodePgMigrate.extensionsTypesMod.StringExtension
import typings.nodePgMigrate.generalTypesMod.DropOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseCreateExtensionFn extends js.Object {
  
  def reverse(extension: js.Array[StringExtension]): String | js.Array[String] = js.native
  def reverse(extension: js.Array[StringExtension], options: CreateExtensionOptions with DropOptions): String | js.Array[String] = js.native
  def reverse(extension: StringExtension): String | js.Array[String] = js.native
  def reverse(extension: StringExtension, options: CreateExtensionOptions with DropOptions): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: CreateExtensionFn = js.native
}
