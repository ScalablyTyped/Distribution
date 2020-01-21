package typings.nightwatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArch extends js.Object {
  var arch: String
  var name: String
  var version: String
}

object AnonArch {
  @scala.inline
  def apply(arch: String, name: String, version: String): AnonArch = {
    val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonArch]
  }
}

