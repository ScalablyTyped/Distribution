package typings.mockDashFs.mockDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mock-fs", "Directory")
@js.native
class Directory () extends js.Object {
  var _directory: js.Any = js.native
}

@JSImport("mock-fs", "directory")
@js.native
object directory extends js.Object {
  def apply(config: DirectoryConfig): Directory = js.native
}

