package typings.openfin.baseMod

import typings.openfin.identityMod.Identity
import typings.openfin.transportMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/api/base", "Base")
@js.native
class Base protected () extends js.Object {
  def this(wire: default) = this()
  var _topic: js.Any = js.native
  val me: Identity = js.native
  var topic: String = js.native
  var wire: default = js.native
  /* protected */ def isNodeEnvironment(): Boolean = js.native
  /* protected */ def isOpenFinEnvironment(): Boolean = js.native
}

