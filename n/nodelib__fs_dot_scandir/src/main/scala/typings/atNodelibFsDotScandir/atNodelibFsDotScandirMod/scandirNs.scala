package typings.atNodelibFsDotScandir.atNodelibFsDotScandirMod

import typings.atNodelibFsDotScandir.outSettingsMod.Options
import typings.atNodelibFsDotScandir.outSettingsMod.default
import typings.atNodelibFsDotScandir.outTypesMod.Entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nodelib/fs.scandir", "scandir")
@js.native
object scandirNs extends js.Object {
  def __promisify__(path: String): js.Promise[js.Array[Entry]] = js.native
  def __promisify__(path: String, optionsOrSettings: Options): js.Promise[js.Array[Entry]] = js.native
  def __promisify__(path: String, optionsOrSettings: default): js.Promise[js.Array[Entry]] = js.native
}

