package typings
package mockDashFsLib.mockDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mock-fs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): scala.Unit = js.native
  def apply(config: Config): scala.Unit = js.native
  def apply(config: Config, options: Options): scala.Unit = js.native
  def directory(config: DirectoryConfig): Directory = js.native
  def file(config: FileConfig): File = js.native
  def fs(): mockDashFsLib.Typeofnodefs = js.native
  def fs(config: Config): mockDashFsLib.Typeofnodefs = js.native
  def fs(config: Config, options: Options): mockDashFsLib.Typeofnodefs = js.native
  def restore(): scala.Unit = js.native
  def symlink(config: SymlinkConfig): Symlink = js.native
}

