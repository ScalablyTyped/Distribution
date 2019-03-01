package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormattingTypeDescriptor extends js.Object {
  val alignment: js.UndefOr[scala.Boolean] = js.undefined
  val altText: js.UndefOr[scala.Boolean] = js.undefined
  val bubbleSize: js.UndefOr[scala.Boolean] = js.undefined
  val color: js.UndefOr[scala.Boolean] = js.undefined
  val fontFamily: js.UndefOr[scala.Boolean] = js.undefined
  val fontSize: js.UndefOr[scala.Boolean] = js.undefined
  val formatString: js.UndefOr[scala.Boolean] = js.undefined
  val labelDensity: js.UndefOr[scala.Boolean] = js.undefined
  val labelDisplayUnits: js.UndefOr[scala.Boolean] = js.undefined
}

object FormattingTypeDescriptor {
  @scala.inline
  def apply(
    alignment: js.UndefOr[scala.Boolean] = js.undefined,
    altText: js.UndefOr[scala.Boolean] = js.undefined,
    bubbleSize: js.UndefOr[scala.Boolean] = js.undefined,
    color: js.UndefOr[scala.Boolean] = js.undefined,
    fontFamily: js.UndefOr[scala.Boolean] = js.undefined,
    fontSize: js.UndefOr[scala.Boolean] = js.undefined,
    formatString: js.UndefOr[scala.Boolean] = js.undefined,
    labelDensity: js.UndefOr[scala.Boolean] = js.undefined,
    labelDisplayUnits: js.UndefOr[scala.Boolean] = js.undefined
  ): FormattingTypeDescriptor = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alignment)) __obj.updateDynamic("alignment")(alignment)
    if (!js.isUndefined(altText)) __obj.updateDynamic("altText")(altText)
    if (!js.isUndefined(bubbleSize)) __obj.updateDynamic("bubbleSize")(bubbleSize)
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(fontFamily)) __obj.updateDynamic("fontFamily")(fontFamily)
    if (!js.isUndefined(fontSize)) __obj.updateDynamic("fontSize")(fontSize)
    if (!js.isUndefined(formatString)) __obj.updateDynamic("formatString")(formatString)
    if (!js.isUndefined(labelDensity)) __obj.updateDynamic("labelDensity")(labelDensity)
    if (!js.isUndefined(labelDisplayUnits)) __obj.updateDynamic("labelDisplayUnits")(labelDisplayUnits)
    __obj.asInstanceOf[FormattingTypeDescriptor]
  }
}

