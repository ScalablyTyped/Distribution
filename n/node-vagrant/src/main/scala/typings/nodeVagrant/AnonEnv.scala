package typings.nodeVagrant

import typings.node.NodeJS.ProcessEnv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnv extends js.Object {
  var cwd: js.UndefOr[String] = js.undefined
  var env: js.UndefOr[ProcessEnv] = js.undefined
}

object AnonEnv {
  @scala.inline
  def apply(cwd: String = null, env: ProcessEnv = null): AnonEnv = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnv]
  }
}

