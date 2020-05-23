package typings.openfin.directoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Icon extends js.Object {
  /**
    * A URL that points to an icon.
    */
  var icon: String
}

object Icon {
  @scala.inline
  def apply(icon: String): Icon = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icon]
  }
}

