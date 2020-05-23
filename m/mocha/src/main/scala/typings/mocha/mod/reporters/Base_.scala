package typings.mocha.mod.reporters

import typings.mocha.Mocha.IRunner
import typings.mocha.Mocha.MochaOptions
import typings.mocha.Mocha.Runner
import typings.mocha.Mocha.Stats
import typings.mocha.Mocha.Test
import typings.mocha.Mocha.reporters.Base
import typings.mocha.Mocha.reporters.Base.ColorMap
import typings.mocha.Mocha.reporters.Base.SymbolMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Initialize a new `Base` reporter.
  *
  * All other reporters generally inherit from this reporter, providing stats such as test duration,
  * number of tests passed / failed, etc.
  *
  * @see https://mochajs.org/api/Mocha.reporters.Base.html
  */
@JSImport("mocha", "reporters.Base")
@js.native
class Base_ protected () extends Base {
  /** @deprecated Use the overload that accepts `Mocha.Runner` instead. */
  def this(runner: IRunner) = this()
  def this(runner: Runner) = this()
  def this(runner: IRunner, options: MochaOptions) = this()
  def this(runner: Runner, options: MochaOptions) = this()
  /**
    * Test failures
    */
  /* CompleteClass */
  override var failures: js.Array[Test] = js.native
  /**
    * The configured runner
    */
  /* CompleteClass */
  override var runner: Runner = js.native
  /**
    * Test run statistics
    */
  /* CompleteClass */
  override var stats: Stats = js.native
  /**
    * Output common epilogue used by many of the bundled reporters.
    *
    * @see https://mochajs.org/api/Mocha.reporters.Base.html#.Base#epilogue
    */
  /* CompleteClass */
  override def epilogue(): Unit = js.native
}

@JSImport("mocha", "reporters.Base")
@js.native
object Base_ extends js.Object {
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
  var inlineDiffs: Boolean = js.native
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
  var useColors: Boolean = js.native
  /**
    * Color `str` with the given `type` (from `colors`)
    *
    * @see https://mochajs.org/api/module-base#.color
    */
  def color(`type`: String, str: String): String = js.native
  /**
    * Returns a diff between two strings with colored ANSI output.
    *
    * @see https://mochajs.org/api/module-base#.generateDiff
    */
  def generateDiff(actual: String, expected: String): String = js.native
  /**
    * Output the given `failures` as a list.
    *
    * @see https://mochajs.org/api/Mocha.reporters.Base.html#.exports.list1
    */
  def list(failures: js.Array[Test]): Unit = js.native
  /**
    * ANSI TTY control sequences common among reporters.
    *
    * @see https://mochajs.org/api/module-base#.cursor
    */
  @js.native
  object cursor extends js.Object {
    /**
      * Clears the line and moves to the beginning of the line.
      */
    def CR(): Unit = js.native
    /**
      * Moves to the beginning of the line
      */
    def beginningOfLine(): Unit = js.native
    /**
      * Deletes the current line
      */
    def deleteLine(): Unit = js.native
    /**
      * Hides the cursor
      */
    def hide(): Unit = js.native
    /**
      * Shows the cursor
      */
    def show(): Unit = js.native
  }
  
  /**
    * Expose terminal window size
    *
    * @see https://mochajs.org/api/module-base#.window
    */
  @js.native
  object window extends js.Object {
    var width: Double = js.native
  }
  
}

