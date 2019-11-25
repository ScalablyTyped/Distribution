package typings.atNivoLegends.atNivoLegendsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuantileLegendProps extends js.Object {
  var domain: js.UndefOr[js.Array[Double]] = js.undefined
  var scale: js.Any
}

object QuantileLegendProps {
  @scala.inline
  def apply(scale: js.Any, domain: js.Array[Double] = null): QuantileLegendProps = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuantileLegendProps]
  }
}

