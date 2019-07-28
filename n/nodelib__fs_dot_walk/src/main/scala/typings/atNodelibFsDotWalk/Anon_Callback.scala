package typings.atNodelibFsDotWalk

import typings.atNodelibFsDotScandir.atNodelibFsDotScandirMod.AsyncCallback
import typings.atNodelibFsDotScandir.outSettingsMod.Options
import typings.atNodelibFsDotScandir.outSettingsMod.default
import typings.atNodelibFsDotScandir.outTypesMod.Entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Callback extends js.Object {
  def apply(path: String, callback: AsyncCallback): Unit = js.native
  def apply(path: String, optionsOrSettings: Options, callback: AsyncCallback): Unit = js.native
  def apply(path: String, optionsOrSettings: default, callback: AsyncCallback): Unit = js.native
  def __promisify__(path: String): js.Promise[js.Array[Entry]] = js.native
  def __promisify__(path: String, optionsOrSettings: Options): js.Promise[js.Array[Entry]] = js.native
  def __promisify__(path: String, optionsOrSettings: default): js.Promise[js.Array[Entry]] = js.native
}

