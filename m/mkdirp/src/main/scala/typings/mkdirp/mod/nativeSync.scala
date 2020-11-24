package typings.mkdirp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mkdirp", "nativeSync")
@js.native
object nativeSync extends js.Object {
  
  /**
    * Use the native implementation (not the manual one). This is the default
    * when the native implementation is available and stat/mkdir are not
    * overridden.
    */
  def apply(dir: String): js.UndefOr[String] = js.native
  def apply(dir: String, opts: Mode): js.UndefOr[String] = js.native
  def apply(dir: String, opts: OptionsSync): js.UndefOr[String] = js.native
}
