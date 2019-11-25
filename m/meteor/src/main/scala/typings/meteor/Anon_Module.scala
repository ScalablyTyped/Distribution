package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Module extends js.Object {
  var module: js.Any
  var version: String
}

object Anon_Module {
  @scala.inline
  def apply(module: js.Any, version: String): Anon_Module = {
    val __obj = js.Dynamic.literal(module = module.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Module]
  }
}

