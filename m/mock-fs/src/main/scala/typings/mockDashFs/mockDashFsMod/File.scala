package typings.mockDashFs.mockDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mock-fs", "File")
@js.native
class File () extends js.Object {
  var _file: js.Any = js.native
}

@JSImport("mock-fs", "file")
@js.native
object file extends js.Object {
  def apply(config: FileConfig): File = js.native
}

