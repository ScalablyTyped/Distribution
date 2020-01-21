package typings.portNumbers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceInfo extends js.Object {
  val description: String
  val name: String
}

object ServiceInfo {
  @scala.inline
  def apply(description: String, name: String): ServiceInfo = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ServiceInfo]
  }
}

