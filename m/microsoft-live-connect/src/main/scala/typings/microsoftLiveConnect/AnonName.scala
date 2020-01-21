package typings.microsoftLiveConnect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  /**
    * The name of the user's work position, or null if the name of the
    * work position is not specified.
    */
  var name: String
}

object AnonName {
  @scala.inline
  def apply(name: String): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonName]
  }
}

