package typings.nodeDashVagrant

import typings.node.NodeJS.ProcessEnv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cwd extends js.Object {
  var cwd: String
  var pwd: ProcessEnv
}

object Anon_Cwd {
  @scala.inline
  def apply(cwd: String, pwd: ProcessEnv): Anon_Cwd = {
    val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any], pwd = pwd.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Cwd]
  }
}

