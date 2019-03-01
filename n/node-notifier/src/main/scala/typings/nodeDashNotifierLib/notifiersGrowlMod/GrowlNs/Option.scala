package typings
package nodeDashNotifierLib.notifiersGrowlMod.GrowlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  var host: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
}

object Option {
  @scala.inline
  def apply(
    host: java.lang.String = null,
    name: java.lang.String = null,
    port: scala.Int | scala.Double = null
  ): Option = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host)
    if (name != null) __obj.updateDynamic("name")(name)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
}

