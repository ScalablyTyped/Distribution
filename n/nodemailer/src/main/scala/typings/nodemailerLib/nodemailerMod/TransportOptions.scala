package typings
package nodemailerLib.nodemailerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransportOptions extends js.Object {
  var component: js.UndefOr[java.lang.String] = js.undefined
}

object TransportOptions {
  @scala.inline
  def apply(component: java.lang.String = null): TransportOptions = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component)
    __obj.asInstanceOf[TransportOptions]
  }
}

