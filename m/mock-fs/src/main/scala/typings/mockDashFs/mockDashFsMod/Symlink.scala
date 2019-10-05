package typings.mockDashFs.mockDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mock-fs", "Symlink")
@js.native
class Symlink () extends js.Object {
  var _symlink: js.Any = js.native
}

@JSImport("mock-fs", "symlink")
@js.native
object symlink extends js.Object {
  def apply(config: SymlinkConfig): Symlink = js.native
}

