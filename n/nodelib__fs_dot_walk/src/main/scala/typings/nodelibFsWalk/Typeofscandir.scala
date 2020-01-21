package typings.nodelibFsWalk

import typings.nodelibFsScandir.mod.AsyncCallback
import typings.nodelibFsScandir.settingsMod.Options
import typings.nodelibFsScandir.settingsMod.default
import typings.nodelibFsScandir.typesMod.Entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofscandir extends js.Object {
  def apply(path: String, callback: AsyncCallback): Unit = js.native
  def apply(path: String, optionsOrSettings: Options, callback: AsyncCallback): Unit = js.native
  def apply(path: String, optionsOrSettings: default, callback: AsyncCallback): Unit = js.native
  def __promisify__(path: String): js.Promise[js.Array[Entry]] = js.native
  def __promisify__(path: String, optionsOrSettings: Options): js.Promise[js.Array[Entry]] = js.native
  def __promisify__(path: String, optionsOrSettings: default): js.Promise[js.Array[Entry]] = js.native
}

