package typings
package mochaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Actual extends js.Object {
  /**
    * Default color map
    *
    * @see https://mochajs.org/api/module-base#.colors
    */
  val colors: mochaLib.MochaNs.reportersNs.BaseNs.ColorMap
  /**
    * ANSI TTY control sequences common among reporters.
    *
    * @see https://mochajs.org/api/module-base#.cursor
    */
  val cursorNs: Anon_BeginningOfLine
  /**
    * Inline diffs instead of +/-
    *
    * @see https://mochajs.org/api/module-base#.inlineDiffs
    */
  var inlineDiffs: scala.Boolean
  /**
    * Default symbol map
    *
    * @see https://mochajs.org/api/module-base#.symbols
    */
  val symbols: mochaLib.MochaNs.reportersNs.BaseNs.SymbolMap
  /**
    * Enables coloring by default
    *
    * @see https://mochajs.org/api/module-base#.useColors
    */
  var useColors: scala.Boolean
  /**
    * Expose terminal window size
    *
    * @see https://mochajs.org/api/module-base#.window
    */
  val window: Anon_Width
  /**
    * Color `str` with the given `type` (from `colors`)
    *
    * @see https://mochajs.org/api/module-base#.color
    */
  def color(`type`: java.lang.String, str: java.lang.String): java.lang.String
  /**
    * Returns a diff between two strings with colored ANSI output.
    *
    * @see https://mochajs.org/api/module-base#.generateDiff
    */
  def generateDiff(actual: java.lang.String, expected: java.lang.String): java.lang.String
  /**
    * Output the given `failures` as a list.
    *
    * @see https://mochajs.org/api/Mocha.reporters.Base.html#.exports.list1
    */
  def list(failures: js.Array[mochaLib.MochaNs.Test]): scala.Unit
}

object Anon_Actual {
  @scala.inline
  def apply(
    color: js.Function2[java.lang.String, java.lang.String, java.lang.String],
    colors: mochaLib.MochaNs.reportersNs.BaseNs.ColorMap,
    cursorNs: Anon_BeginningOfLine,
    generateDiff: js.Function2[java.lang.String, java.lang.String, java.lang.String],
    inlineDiffs: scala.Boolean,
    list: js.Function1[js.Array[mochaLib.MochaNs.Test], scala.Unit],
    symbols: mochaLib.MochaNs.reportersNs.BaseNs.SymbolMap,
    useColors: scala.Boolean,
    window: Anon_Width
  ): Anon_Actual = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("colors")(colors)
    __obj.updateDynamic("cursorNs")(cursorNs)
    __obj.updateDynamic("generateDiff")(generateDiff)
    __obj.updateDynamic("inlineDiffs")(inlineDiffs)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("symbols")(symbols)
    __obj.updateDynamic("useColors")(useColors)
    __obj.updateDynamic("window")(window)
    __obj.asInstanceOf[Anon_Actual]
  }
}

