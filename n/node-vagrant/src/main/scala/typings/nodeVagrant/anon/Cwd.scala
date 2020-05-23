package typings.nodeVagrant.anon

import typings.node.NodeJS.ProcessEnv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cwd extends js.Object {
  var cwd: String
  var pwd: ProcessEnv
}

object Cwd {
  @scala.inline
  def apply(cwd: String, pwd: ProcessEnv): Cwd = {
    val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any], pwd = pwd.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cwd]
  }
}

