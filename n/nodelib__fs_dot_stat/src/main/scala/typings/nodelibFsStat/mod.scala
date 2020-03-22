package typings.nodelibFsStat

import typings.nodelibFsStat.settingsMod.Options
import typings.nodelibFsStat.settingsMod.default
import typings.nodelibFsStat.typesMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nodelib/fs.stat", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Settings () extends default {
    def this(_options: Options) = this()
  }
  
  def statSync(path: String): Stats = js.native
  def statSync(path: String, optionsOrSettings: Options): Stats = js.native
  def statSync(path: String, optionsOrSettings: default): Stats = js.native
  @js.native
  object stat extends js.Object {
    def apply(path: String, callback: AsyncCallback): Unit = js.native
    def apply(path: String, optionsOrSettings: Options, callback: AsyncCallback): Unit = js.native
    def apply(path: String, optionsOrSettings: default, callback: AsyncCallback): Unit = js.native
    @JSName("__promisify__")
    def promisify(path: String): js.Promise[Stats] = js.native
    @JSName("__promisify__")
    def promisify(path: String, optionsOrSettings: Options): js.Promise[Stats] = js.native
    @JSName("__promisify__")
    def promisify(path: String, optionsOrSettings: default): js.Promise[Stats] = js.native
  }
  
  type AsyncCallback = typings.nodelibFsStat.asyncMod.AsyncCallback
}

