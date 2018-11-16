package typings
package mochaLib.MochaNs.reportersNs.BaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Mocha.reporters.Base")
@js.native
object BaseNsMembers extends js.Object {
  /**
               * Default color map
               *
               * @see https://mochajs.org/api/module-base#.colors
               */
  val colors: ColorMap = js.native
  /**
               * Inline diffs instead of +/-
               *
               * @see https://mochajs.org/api/module-base#.inlineDiffs
               */
  var inlineDiffs: scala.Boolean = js.native
  /**
               * Default symbol map
               *
               * @see https://mochajs.org/api/module-base#.symbols
               */
  val symbols: SymbolMap = js.native
  /**
               * Enables coloring by default
               *
               * @see https://mochajs.org/api/module-base#.useColors
               */
  var useColors: scala.Boolean = js.native
  /**
               * Expose terminal window size
               *
               * @see https://mochajs.org/api/module-base#.window
               */
  val window: mochaLib.Anon_Width = js.native
  /**
               * Color `str` with the given `type` (from `colors`)
               *
               * @see https://mochajs.org/api/module-base#.color
               */
  def color(`type`: java.lang.String, str: java.lang.String): java.lang.String = js.native
  /**
               * Returns a diff between two strings with colored ANSI output.
               *
               * @see https://mochajs.org/api/module-base#.generateDiff
               */
  def generateDiff(actual: java.lang.String, expected: java.lang.String): java.lang.String = js.native
  /**
               * Output the given `failures` as a list.
               *
               * @see https://mochajs.org/api/Mocha.reporters.Base.html#.exports.list1
               */
  def list(failures: js.Array[mochaLib.MochaNs.Test]): scala.Unit = js.native
}

