package typings.meteor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Module extends js.Object {
  var module: js.Any
  var version: String
}

object Module {
  @scala.inline
  def apply(module: js.Any, version: String): Module = {
    val __obj = js.Dynamic.literal(module = module.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Module]
  }
}

