package typings.atNodelibFsDotWalk.atNodelibFsDotWalkMod

import typings.atNodelibFsDotWalk.outProvidersAsyncMod.AsyncCallback
import typings.atNodelibFsDotWalk.outSettingsMod.Options
import typings.atNodelibFsDotWalk.outSettingsMod.default
import typings.atNodelibFsDotWalk.outTypesMod.Entry
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nodelib/fs.walk", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def walk(dir: String, callback: AsyncCallback): Unit = js.native
  def walk(dir: String, optionsOrSettings: Options, callback: AsyncCallback): Unit = js.native
  def walk(dir: String, optionsOrSettings: default, callback: AsyncCallback): Unit = js.native
  def walkStream(dir: String): Readable = js.native
  def walkStream(dir: String, optionsOrSettings: Options): Readable = js.native
  def walkStream(dir: String, optionsOrSettings: default): Readable = js.native
  def walkSync(dir: String): js.Array[Entry] = js.native
  def walkSync(dir: String, optionsOrSettings: Options): js.Array[Entry] = js.native
  def walkSync(dir: String, optionsOrSettings: default): js.Array[Entry] = js.native
}

