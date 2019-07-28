package typings.atNodelibFsDotScandir.atNodelibFsDotScandirMod

import typings.atNodelibFsDotScandir.outSettingsMod.Options
import typings.atNodelibFsDotScandir.outSettingsMod.default
import typings.atNodelibFsDotScandir.outTypesMod.Entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nodelib/fs.scandir", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def scandir(path: String, callback: AsyncCallback): Unit = js.native
  def scandir(path: String, optionsOrSettings: Options, callback: AsyncCallback): Unit = js.native
  def scandir(path: String, optionsOrSettings: default, callback: AsyncCallback): Unit = js.native
  def scandirSync(path: String): js.Array[Entry] = js.native
  def scandirSync(path: String, optionsOrSettings: Options): js.Array[Entry] = js.native
  def scandirSync(path: String, optionsOrSettings: default): js.Array[Entry] = js.native
}

