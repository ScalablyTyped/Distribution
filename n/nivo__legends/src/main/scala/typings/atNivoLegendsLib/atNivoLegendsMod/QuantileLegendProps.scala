package typings
package atNivoLegendsLib.atNivoLegendsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuantileLegendProps extends js.Object {
  var domain: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var scale: js.Any
}

object QuantileLegendProps {
  @scala.inline
  def apply(scale: js.Any, domain: js.Array[scala.Double] = null): QuantileLegendProps = {
    val __obj = js.Dynamic.literal(scale = scale)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    __obj.asInstanceOf[QuantileLegendProps]
  }
}

