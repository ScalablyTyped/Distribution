package typings.atNodelibFsDotScandir

import typings.atNodelibFsDotScandir.outSettingsMod.default
import typings.atNodelibFsDotScandir.outTypesMod.Entry
import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nodelib/fs.scandir/out/providers/async", JSImport.Namespace)
@js.native
object outProvidersAsyncMod extends js.Object {
  def read(dir: String, settings: default, callback: AsyncCallback): Unit = js.native
  def readdir(dir: String, settings: default, callback: AsyncCallback): Unit = js.native
  def readdirWithFileTypes(dir: String, settings: default, callback: AsyncCallback): Unit = js.native
  type AsyncCallback = js.Function2[/* err */ ErrnoException, /* entries */ js.Array[Entry], Unit]
}

