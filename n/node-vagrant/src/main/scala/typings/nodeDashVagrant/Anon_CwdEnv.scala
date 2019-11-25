package typings.nodeDashVagrant

import typings.node.NodeJS.ProcessEnv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CwdEnv extends js.Object {
  var cwd: js.UndefOr[String] = js.undefined
  var env: js.UndefOr[ProcessEnv] = js.undefined
}

object Anon_CwdEnv {
  @scala.inline
  def apply(cwd: String = null, env: ProcessEnv = null): Anon_CwdEnv = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CwdEnv]
  }
}

