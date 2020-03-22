package typings.nivoBar.mod

import typings.nivoBar.nivoBarStrings.bottom
import typings.nivoBar.nivoBarStrings.end
import typings.nivoBar.nivoBarStrings.left
import typings.nivoBar.nivoBarStrings.middle
import typings.nivoBar.nivoBarStrings.right
import typings.nivoBar.nivoBarStrings.start
import typings.nivoBar.nivoBarStrings.top
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  format  :string | @nivo/bar.@nivo/bar.LabelFormatter, renderTick (data : any): react.react.ReactNode,   legend  :string,   legendOffset  :number,   legendPosition  :'start' | 'middle' | 'end',   orient  :'top' | 'right' | 'bottom' | 'left',   tickPadding  :number,   tickRotation  :number,   tickSize  :number,   tickValues  :number | std.Array<string> | std.Array<number>}> */
trait Axis extends js.Object {
  var format: js.UndefOr[String | LabelFormatter] = js.undefined
  var legend: js.UndefOr[String] = js.undefined
  var legendOffset: js.UndefOr[Double] = js.undefined
  var legendPosition: js.UndefOr[start | middle | end] = js.undefined
  var orient: js.UndefOr[top | right | bottom | left] = js.undefined
  var renderTick: js.UndefOr[js.Function1[/* data */ js.Any, ReactNode]] = js.undefined
  var tickPadding: js.UndefOr[Double] = js.undefined
  var tickRotation: js.UndefOr[Double] = js.undefined
  var tickSize: js.UndefOr[Double] = js.undefined
  var tickValues: js.UndefOr[Double | (js.Array[Double | String])] = js.undefined
}

object Axis {
  @scala.inline
  def apply(
    format: String | LabelFormatter = null,
    legend: String = null,
    legendOffset: Int | Double = null,
    legendPosition: start | middle | end = null,
    orient: top | right | bottom | left = null,
    renderTick: /* data */ js.Any => ReactNode = null,
    tickPadding: Int | Double = null,
    tickRotation: Int | Double = null,
    tickSize: Int | Double = null,
    tickValues: Double | (js.Array[Double | String]) = null
  ): Axis = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (legendOffset != null) __obj.updateDynamic("legendOffset")(legendOffset.asInstanceOf[js.Any])
    if (legendPosition != null) __obj.updateDynamic("legendPosition")(legendPosition.asInstanceOf[js.Any])
    if (orient != null) __obj.updateDynamic("orient")(orient.asInstanceOf[js.Any])
    if (renderTick != null) __obj.updateDynamic("renderTick")(js.Any.fromFunction1(renderTick))
    if (tickPadding != null) __obj.updateDynamic("tickPadding")(tickPadding.asInstanceOf[js.Any])
    if (tickRotation != null) __obj.updateDynamic("tickRotation")(tickRotation.asInstanceOf[js.Any])
    if (tickSize != null) __obj.updateDynamic("tickSize")(tickSize.asInstanceOf[js.Any])
    if (tickValues != null) __obj.updateDynamic("tickValues")(tickValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[Axis]
  }
}

