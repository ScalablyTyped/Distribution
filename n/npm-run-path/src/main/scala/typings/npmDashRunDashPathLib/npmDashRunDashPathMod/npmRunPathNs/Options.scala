package typings
package npmDashRunDashPathLib.npmDashRunDashPathMod.npmRunPathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Working directory.
    */
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  /**
    * PATH to be appended.
    * Set it to an empty string to exclude the default [PATH](https://github.com/sindresorhus/path-key).
    * @default PATH
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(cwd: java.lang.String = null, path: java.lang.String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[Options]
  }
}

