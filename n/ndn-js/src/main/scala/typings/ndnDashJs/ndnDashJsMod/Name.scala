package typings.ndnDashJs.ndnDashJsMod

import typings.ndnDashJs.nameMod.NameNs.Component
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js", "Name")
@js.native
class Name ()
  extends typings.ndnDashJs.nameMod.Name {
  def this(components: js.Array[Component | Uint8Array]) = this()
  def this(name: String) = this()
  def this(name: typings.ndnDashJs.nameMod.Name) = this()
}

/* static members */
@JSImport("ndn-js", "Name")
@js.native
object Name extends js.Object {
  def fromEscapedString(uri: String): typings.ndnDashJs.nameMod.Name = js.native
}

