package typings
package atNivoAxesLib.atNivoAxesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxisProps extends js.Object {
  var format: js.UndefOr[js.Any] = js.undefined
  var legend: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var legendOffset: js.UndefOr[scala.Double] = js.undefined
  var legendPosition: js.UndefOr[
    atNivoAxesLib.atNivoAxesLibStrings.start | atNivoAxesLib.atNivoAxesLibStrings.middle | atNivoAxesLib.atNivoAxesLibStrings.end
  ] = js.undefined
  // PropTypes.oneOfType([PropTypes.func, PropTypes.string])
  var renderTick: js.UndefOr[js.Function1[/* data */ js.Any, reactLib.reactMod.ReactNode]] = js.undefined
  var tickPadding: js.UndefOr[scala.Double] = js.undefined
  var tickRotation: js.UndefOr[scala.Double] = js.undefined
  var tickSize: js.UndefOr[scala.Double] = js.undefined
  var tickValues: js.UndefOr[
    scala.Double | js.Array[scala.Double] | js.Array[java.lang.String] | js.Array[stdLib.Date]
  ] = js.undefined
}

object AxisProps {
  @scala.inline
  def apply(
    format: js.Any = null,
    legend: reactLib.reactMod.ReactNode = null,
    legendOffset: scala.Int | scala.Double = null,
    legendPosition: atNivoAxesLib.atNivoAxesLibStrings.start | atNivoAxesLib.atNivoAxesLibStrings.middle | atNivoAxesLib.atNivoAxesLibStrings.end = null,
    renderTick: /* data */ js.Any => reactLib.reactMod.ReactNode = null,
    tickPadding: scala.Int | scala.Double = null,
    tickRotation: scala.Int | scala.Double = null,
    tickSize: scala.Int | scala.Double = null,
    tickValues: scala.Double | js.Array[scala.Double] | js.Array[java.lang.String] | js.Array[stdLib.Date] = null
  ): AxisProps = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (legendOffset != null) __obj.updateDynamic("legendOffset")(legendOffset.asInstanceOf[js.Any])
    if (legendPosition != null) __obj.updateDynamic("legendPosition")(legendPosition.asInstanceOf[js.Any])
    if (renderTick != null) __obj.updateDynamic("renderTick")(js.Any.fromFunction1(renderTick))
    if (tickPadding != null) __obj.updateDynamic("tickPadding")(tickPadding.asInstanceOf[js.Any])
    if (tickRotation != null) __obj.updateDynamic("tickRotation")(tickRotation.asInstanceOf[js.Any])
    if (tickSize != null) __obj.updateDynamic("tickSize")(tickSize.asInstanceOf[js.Any])
    if (tickValues != null) __obj.updateDynamic("tickValues")(tickValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisProps]
  }
}

