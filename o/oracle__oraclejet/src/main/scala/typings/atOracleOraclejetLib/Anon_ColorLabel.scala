package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorLabel extends js.Object {
  var color: atOracleOraclejetLib.ojcolorMod.namespaced
  var label: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ColorLabel {
  @scala.inline
  def apply(color: atOracleOraclejetLib.ojcolorMod.namespaced, label: java.lang.String = null): Anon_ColorLabel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("color")(color)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[Anon_ColorLabel]
  }
}

