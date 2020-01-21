package typings.nodemailer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransportOptions extends js.Object {
  var component: js.UndefOr[String] = js.undefined
}

object TransportOptions {
  @scala.inline
  def apply(component: String = null): TransportOptions = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransportOptions]
  }
}

