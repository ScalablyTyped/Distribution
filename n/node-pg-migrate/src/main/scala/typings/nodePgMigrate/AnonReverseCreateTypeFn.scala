package typings.nodePgMigrate

import org.scalablytyped.runtime.StringDictionary
import typings.nodePgMigrate.generalTypesMod.DropOptions
import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.generalTypesMod.Type
import typings.nodePgMigrate.generalTypesMod.Value
import typings.nodePgMigrate.typesTypesMod.CreateTypeFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReverseCreateTypeFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: CreateTypeFn = js.native
  def reverse(typeName: Name, values: (js.Array[Value] | StringDictionary[Type]) with DropOptions): String | js.Array[String] = js.native
}

