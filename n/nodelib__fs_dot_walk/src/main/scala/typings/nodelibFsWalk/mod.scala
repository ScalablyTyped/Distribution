package typings.nodelibFsWalk

import typings.node.streamMod.Readable
import typings.nodelibFsWalk.asyncMod.AsyncCallback
import typings.nodelibFsWalk.settingsMod.Options
import typings.nodelibFsWalk.settingsMod.default
import typings.nodelibFsWalk.typesMod.Entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nodelib/fs.walk", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Settings () extends default {
    def this(_options: Options) = this()
  }
  
  def walkStream(directory: String): Readable = js.native
  def walkStream(directory: String, optionsOrSettings: Options): Readable = js.native
  def walkStream(directory: String, optionsOrSettings: default): Readable = js.native
  def walkSync(directory: String): js.Array[Entry] = js.native
  def walkSync(directory: String, optionsOrSettings: Options): js.Array[Entry] = js.native
  def walkSync(directory: String, optionsOrSettings: default): js.Array[Entry] = js.native
  @js.native
  object walk extends js.Object {
    def apply(directory: String, callback: AsyncCallback): Unit = js.native
    def apply(directory: String, optionsOrSettings: Options, callback: AsyncCallback): Unit = js.native
    def apply(directory: String, optionsOrSettings: default, callback: AsyncCallback): Unit = js.native
    @JSName("__promisify__")
    def promisify(directory: String): js.Promise[js.Array[Entry]] = js.native
    @JSName("__promisify__")
    def promisify(directory: String, optionsOrSettings: Options): js.Promise[js.Array[Entry]] = js.native
    @JSName("__promisify__")
    def promisify(directory: String, optionsOrSettings: default): js.Promise[js.Array[Entry]] = js.native
  }
  
}

