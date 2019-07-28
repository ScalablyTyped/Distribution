package typings.plottable.buildSrcAxesTimeAxisMod

import typings.plottable.buildSrcCoreFormattersMod.Formatter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeAxisTierConfiguration extends js.Object {
  /**
    * Formatter used to format tick labels. Tick values will be passed through the formatter
    * before being displayed.
    */
  @JSName("formatter")
  var formatter_Original: Formatter = js.native
  /**
    * The time unit associated with this configuration (seconds, minutes, hours, etc).
    */
  var interval: String = js.native
  /**
    * Number of intervals between each tick.
    */
  var step: Double = js.native
  /**
    * Formatter used to format tick labels. Tick values will be passed through the formatter
    * before being displayed.
    */
  def formatter(value: js.Any): String = js.native
}

