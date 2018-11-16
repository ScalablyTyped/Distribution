package typings
package plottableLib.buildSrcAxesTimeAxisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TimeAxisTierConfiguration extends js.Object {
  /**
       * Formatter used to format tick labels. Tick values will be passed through the formatter
       * before being displayed.
       */
  var formatter: plottableLib.buildSrcCoreFormattersMod.Formatter
  /**
       * The time unit associated with this configuration (seconds, minutes, hours, etc).
       */
  var interval: java.lang.String
  /**
       * Number of intervals between each tick.
       */
  var step: scala.Double
}

