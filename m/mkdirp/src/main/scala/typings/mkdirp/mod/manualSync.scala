package typings.mkdirp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mkdirp", "manualSync")
@js.native
object manualSync extends js.Object {
  
  /**
    * Use the manual implementation (not the native one). This is the default
    * when the native implementation is not available or the stat/mkdir
    * implementation is overridden.
    */
  def apply(dir: String): js.UndefOr[String] = js.native
  def apply(dir: String, opts: Mode): js.UndefOr[String] = js.native
  def apply(dir: String, opts: OptionsSync): js.UndefOr[String] = js.native
}
