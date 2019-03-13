package typings
package npmDashRunDashPathLib.npmDashRunDashPathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunPathOptions extends js.Object {
  /**
  	 * Working directory.
  	 *
  	 * @default process.cwd()
  	 */
  val cwd: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * PATH to be appended. Default: [`PATH`](https://github.com/sindresorhus/path-key).
  	 *
  	 * Set it to an empty string to exclude the default PATH.
  	 */
  val path: js.UndefOr[java.lang.String] = js.undefined
}

object RunPathOptions {
  @scala.inline
  def apply(cwd: java.lang.String = null, path: java.lang.String = null): RunPathOptions = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[RunPathOptions]
  }
}

