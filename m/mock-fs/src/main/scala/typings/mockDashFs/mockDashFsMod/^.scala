package typings.mockDashFs.mockDashFsMod

import typings.mockDashFs.Typeofnodefs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mock-fs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): Unit = js.native
  def apply(config: Config): Unit = js.native
  def apply(config: Config, options: Options): Unit = js.native
  def directory(config: DirectoryConfig): Directory = js.native
  def file(config: FileConfig): File = js.native
  def fs(): Typeofnodefs = js.native
  def fs(config: Config): Typeofnodefs = js.native
  def fs(config: Config, options: Options): Typeofnodefs = js.native
  def restore(): Unit = js.native
  def symlink(config: SymlinkConfig): Symlink = js.native
}

