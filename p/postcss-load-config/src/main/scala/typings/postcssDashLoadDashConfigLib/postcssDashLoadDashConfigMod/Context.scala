package typings
package postcssDashLoadDashConfigLib.postcssDashLoadDashConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Additional context options that postcss-load-config understands.
trait Context extends js.Object {
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  var env: js.UndefOr[java.lang.String] = js.undefined
}

object Context {
  @scala.inline
  def apply(cwd: java.lang.String = null, env: java.lang.String = null): Context = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (env != null) __obj.updateDynamic("env")(env)
    __obj.asInstanceOf[Context]
  }
}

