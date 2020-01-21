package typings.nodeVagrant

import typings.node.NodeJS.ProcessEnv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCwd extends js.Object {
  var cwd: String
  var pwd: ProcessEnv
}

object AnonCwd {
  @scala.inline
  def apply(cwd: String, pwd: ProcessEnv): AnonCwd = {
    val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any], pwd = pwd.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCwd]
  }
}

