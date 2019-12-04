package typings.atNodelibFsDotScandir

import typings.atNodelibFsDotScandir.outSettingsMod.default
import typings.atNodelibFsDotScandir.outTypesMod.Entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nodelib/fs.scandir/out/providers/sync", JSImport.Namespace)
@js.native
object outProvidersSyncMod extends js.Object {
  def read(dir: String, settings: default): js.Array[Entry] = js.native
  def readdir(dir: String, settings: default): js.Array[Entry] = js.native
  def readdirWithFileTypes(dir: String, settings: default): js.Array[Entry] = js.native
}

