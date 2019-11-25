package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberColumn extends js.Object {
  // How many decimal places to display. See below for information about the possible values.
  var decimalPlaces: js.UndefOr[String] = js.undefined
  // How the value should be presented in the UX. Must be one of number or percentage. If unspecified, treated as number.
  var displayAs: js.UndefOr[String] = js.undefined
  // The maximum permitted value.
  var maximum: js.UndefOr[Double] = js.undefined
  // The minimum permitted value.
  var minimum: js.UndefOr[Double] = js.undefined
}

object NumberColumn {
  @scala.inline
  def apply(
    decimalPlaces: String = null,
    displayAs: String = null,
    maximum: Int | Double = null,
    minimum: Int | Double = null
  ): NumberColumn = {
    val __obj = js.Dynamic.literal()
    if (decimalPlaces != null) __obj.updateDynamic("decimalPlaces")(decimalPlaces.asInstanceOf[js.Any])
    if (displayAs != null) __obj.updateDynamic("displayAs")(displayAs.asInstanceOf[js.Any])
    if (maximum != null) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
    if (minimum != null) __obj.updateDynamic("minimum")(minimum.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberColumn]
  }
}

