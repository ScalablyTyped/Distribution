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
    color: (java.lang.String, java.lang.String) => java.lang.String,
    colors: mochaLib.MochaNs.reportersNs.BaseNs.ColorMap,
    cursorNs: Anon_BeginningOfLine,
    generateDiff: (java.lang.String, java.lang.String) => java.lang.String,
    inlineDiffs: scala.Boolean,
    list: js.Array[mochaLib.MochaNs.Test] => scala.Unit,
    symbols: mochaLib.MochaNs.reportersNs.BaseNs.SymbolMap,
    useColors: scala.Boolean,
    window: Anon_Width
  ): Anon_Actual = {
    val __obj = js.Dynamic.literal(color = js.Any.fromFunction2(color), colors = colors, cursorNs = cursorNs, generateDiff = js.Any.fromFunction2(generateDiff), inlineDiffs = inlineDiffs, list = js.Any.fromFunction1(list), symbols = symbols, useColors = useColors, window = window)
  
    __obj.asInstanceOf[Anon_Actual]
  }
}

