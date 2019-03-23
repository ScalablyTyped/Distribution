package typings
package ndnDashJsLib.ndnDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ndn-js", "Name")
@js.native
class Name ()
  extends ndnDashJsLib.nameMod.Name {
  def this(components: js.Array[ndnDashJsLib.nameMod.NameNs.Component | stdLib.Uint8Array]) = this()
  def this(name: java.lang.String) = this()
  def this(name: ndnDashJsLib.nameMod.Name) = this()
}

/* static members */
@JSImport("ndn-js", "Name")
@js.native
object Name extends js.Object {
  def fromEscapedString(uri: java.lang.String): ndnDashJsLib.nameMod.Name = js.native
}

