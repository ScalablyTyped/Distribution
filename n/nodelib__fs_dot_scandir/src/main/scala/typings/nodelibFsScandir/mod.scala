package typings.nodelibFsScandir

import typings.nodelibFsScandir.settingsMod.Options
import typings.nodelibFsScandir.settingsMod.default
import typings.nodelibFsScandir.typesMod.Entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nodelib/fs.scandir", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Settings () extends default {
    def this(_options: Options) = this()
  }
  
  def scandirSync(path: String): js.Array[Entry] = js.native
  def scandirSync(path: String, optionsOrSettings: Options): js.Array[Entry] = js.native
  def scandirSync(path: String, optionsOrSettings: default): js.Array[Entry] = js.native
  @js.native
  object scandir extends js.Object {
    def apply(path: String, callback: AsyncCallback): Unit = js.native
    def apply(path: String, optionsOrSettings: Options, callback: AsyncCallback): Unit = js.native
    def apply(path: String, optionsOrSettings: default, callback: AsyncCallback): Unit = js.native
    @JSName("__promisify__")
    def promisify(path: String): js.Promise[js.Array[Entry]] = js.native
    @JSName("__promisify__")
    def promisify(path: String, optionsOrSettings: Options): js.Promise[js.Array[Entry]] = js.native
    @JSName("__promisify__")
    def promisify(path: String, optionsOrSettings: default): js.Promise[js.Array[Entry]] = js.native
  }
  
  type AsyncCallback = typings.nodelibFsScandir.asyncMod.AsyncCallback
}

