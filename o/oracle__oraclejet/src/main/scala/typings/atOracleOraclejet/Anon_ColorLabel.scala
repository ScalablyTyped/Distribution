package typings.atOracleOraclejet

import typings.atOracleOraclejet.ojcolorMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorLabel extends js.Object {
  var color: ^
  var label: js.UndefOr[String] = js.undefined
}

object Anon_ColorLabel {
  @scala.inline
  def apply(color: ^, label: String = null): Anon_ColorLabel = {
    val __obj = js.Dynamic.literal(color = color)
    if (label != null) __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[Anon_ColorLabel]
  }
}

