package typings.nivoScales.mod

import typings.nivoScales.nivoScalesStrings.auto
import typings.nivoScales.nivoScalesStrings.day
import typings.nivoScales.nivoScalesStrings.hour
import typings.nivoScales.nivoScalesStrings.linear
import typings.nivoScales.nivoScalesStrings.log
import typings.nivoScales.nivoScalesStrings.millisecond
import typings.nivoScales.nivoScalesStrings.minute
import typings.nivoScales.nivoScalesStrings.month
import typings.nivoScales.nivoScalesStrings.point
import typings.nivoScales.nivoScalesStrings.second
import typings.nivoScales.nivoScalesStrings.time
import typings.nivoScales.nivoScalesStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nivoScales.mod.LinearScale
  - typings.nivoScales.mod.PointScale
  - typings.nivoScales.mod.TimeScale
  - typings.nivoScales.mod.LogScale
*/
trait Scale extends js.Object

object Scale {
  @scala.inline
  def LinearScale(
    `type`: linear,
    max: auto | Double = null,
    min: auto | Double = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    stacked: js.UndefOr[Boolean] = js.undefined
  ): Scale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (!js.isUndefined(stacked)) __obj.updateDynamic("stacked")(stacked.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  @scala.inline
  def PointScale(`type`: point): Scale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  @scala.inline
  def TimeScale(
    `type`: time,
    format: String = null,
    precision: millisecond | second | minute | hour | month | year | day = null,
    useUTC: js.UndefOr[Boolean] = js.undefined
  ): Scale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (!js.isUndefined(useUTC)) __obj.updateDynamic("useUTC")(useUTC.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
  @scala.inline
  def LogScale(`type`: log, base: Int | Double = null, max: auto | Double = null, min: auto | Double = null): Scale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scale]
  }
}

