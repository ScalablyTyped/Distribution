package typings.mocha

import typings.mocha.Mocha.Test
import typings.mocha.Mocha.reporters.Base.ColorMap
import typings.mocha.Mocha.reporters.Base.SymbolMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofBase extends js.Object {
  /**
    * Default color map
    *
    * @see https://mochajs.org/api/module-base#.colors
    */
  val colors: ColorMap
  /**
    * ANSI TTY control sequences common among reporters.
    *
    * @see https://mochajs.org/api/module-base#.cursor
    */
  val cursor: Typeofcursor
  /**
    * Inline diffs instead of +/-
    *
    * @see https://mochajs.org/api/module-base#.inlineDiffs
    */
  var inlineDiffs: Boolean
  /**
    * Default symbol map
    *
    * @see https://mochajs.org/api/module-base#.symbols
    */
  val symbols: SymbolMap
  /**
    * Enables coloring by default
    *
    * @see https://mochajs.org/api/module-base#.useColors
    */
  var useColors: Boolean
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
  def color(`type`: String, str: String): String
  /**
    * Returns a diff between two strings with colored ANSI output.
    *
    * @see https://mochajs.org/api/module-base#.generateDiff
    */
  def generateDiff(actual: String, expected: String): String
  /**
    * Output the given `failures` as a list.
    *
    * @see https://mochajs.org/api/Mocha.reporters.Base.html#.exports.list1
    */
  def list(failures: js.Array[Test]): Unit
}

object TypeofBase {
  @scala.inline
  def apply(
    color: (String, String) => String,
    colors: ColorMap,
    cursor: Typeofcursor,
    generateDiff: (String, String) => String,
    inlineDiffs: Boolean,
    list: js.Array[Test] => Unit,
    symbols: SymbolMap,
    useColors: Boolean,
    window: Anon_Width
  ): TypeofBase = {
    val __obj = js.Dynamic.literal(color = js.Any.fromFunction2(color), colors = colors.asInstanceOf[js.Any], cursor = cursor.asInstanceOf[js.Any], generateDiff = js.Any.fromFunction2(generateDiff), inlineDiffs = inlineDiffs.asInstanceOf[js.Any], list = js.Any.fromFunction1(list), symbols = symbols.asInstanceOf[js.Any], useColors = useColors.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeofBase]
  }
}

