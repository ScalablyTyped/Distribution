package typings.mkdirp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mkdirp", "native")
@js.native
object native extends js.Object {
  /**
    * Use the native implementation (not the manual one). This is the default
    * when the native implementation is available and stat/mkdir are not
    * overridden.
    */
  def apply(dir: String): js.Promise[js.UndefOr[String]] = js.native
  def apply(dir: String, opts: Mode): js.Promise[js.UndefOr[String]] = js.native
  def apply(dir: String, opts: Options): js.Promise[js.UndefOr[String]] = js.native
}

