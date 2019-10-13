package typings.mocha.mochaMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import typings.mocha.Mocha.IRunner
import typings.mocha.Mocha.MochaOptions
import typings.mocha.Mocha.reporters.Base.ColorMap
import typings.mocha.Mocha.reporters.Base.SymbolMap
import typings.mocha.TypeofBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion Test interface augmentations
@JSImport("mocha", "reporters")
@js.native
object reporters extends js.Object {
  /**
    * Initialize a new `Base` reporter.
    *
    * All other reporters generally inherit from this reporter, providing stats such as test duration,
    * number of tests passed / failed, etc.
    *
    * @see https://mochajs.org/api/Mocha.reporters.Base.html
    */
  @js.native
  class Base protected ()
    extends typings.mocha.Mocha.reporters.Base {
    /** @deprecated Use the overload that accepts `Mocha.Runner` instead. */
    def this(runner: IRunner) = this()
    def this(runner: typings.mocha.Mocha.Runner) = this()
    def this(runner: IRunner, options: MochaOptions) = this()
    def this(runner: typings.mocha.Mocha.Runner, options: MochaOptions) = this()
  }
  
  /**
    * Initialize a new `Doc` reporter.
    *
    * @see https://mochajs.org/api/Mocha.reporters.Doc.html
    */
  @js.native
  class Doc ()
    extends typings.mocha.Mocha.reporters.Base
  
  /**
    * Initialize a new `Dot` matrix test reporter.
    *
    * @see https://mochajs.org/api/Mocha.reporters.Dot.html
    */
  @js.native
  class Dot ()
    extends typings.mocha.Mocha.reporters.Base
  
  /**
    * Initialize a new `HTML` reporter.
    *
    * - _This reporter cannot be used on the console._
    *
    * @see https://mochajs.org/api/Mocha.reporters.HTML.html
    */
  @js.native
  class HTML ()
    extends typings.mocha.Mocha.reporters.HTML
  
  /**
    * Initialize a new `JSON` reporter
    *
    * @see https://mochajs.org/api/Mocha.reporters.JSON.html
    */
  @js.native
  class JSON ()
    extends typings.mocha.Mocha.reporters.Base
  
  /**
    * Initialize a new `JSONStream` test reporter.
    *
    * @see https://mochajs.org/api/Mocha.reporters.JSONStream.html
    */
  @js.native
  class JSONStream ()
    extends typings.mocha.Mocha.reporters.Base
  
  /**
    * Initialize a new `Landing` reporter.
    *
    * @see https://mochajs.org/api/Mocha.reporters.Landing.html
    */
  @js.native
  class Landing ()
    extends typings.mocha.Mocha.reporters.Base
  
  /**
    * Initialize a new `List` test reporter.
    *
    * @see https://mochajs.org/api/Mocha.reporters.List.html
    */
  @js.native
  class List ()
    extends typings.mocha.Mocha.reporters.Base
  
  /**
    * Initialize a new `Markdown` test reporter.
    *
    * @see https://mochajs.org/api/Mocha.reporters.Markdown.html
    */
  @js.native
  class Markdown ()
    extends typings.mocha.Mocha.reporters.Base
  
  /**
    * Initialize a new `Min` minimal test reporter (best used with --watch).
    *
    * @see https://mochajs.org/api/Mocha.reporters.Min.html
    */
  @js.native
  class Min ()
    extends typings.mocha.Mocha.reporters.Base
  
  /**
    * Initialize a new `NyanCat` test reporter.
    *
    * @see https://mochajs.org/api/Mocha.reporters.Nyan.html
    */
  @js.native
  class Nyan ()
    extends typings.mocha.Mocha.reporters.Nyan
  
  /**
    * Initialize a new `Progress` bar test reporter.
    *
    * @see https://mochajs.org/api/Mocha.reporters.Progress.html
    */
  @js.native
  class Progress protected ()
    extends typings.mocha.Mocha.reporters.Progress {
    /** @deprecated Use the overload that accepts `Mocha.Runner` instead. */
    def this(runner: IRunner) = this()
    def this(runner: typings.mocha.Mocha.Runner) = this()
    def this(runner: IRunner, options: typings.mocha.Mocha.reporters.Progress.MochaOptions) = this()
    def this(runner: typings.mocha.Mocha.Runner, options: typings.mocha.Mocha.reporters.Progress.MochaOptions) = this()
  }
  
  /**
    * Initialize a new `Spec` test reporter.
    *
    * @see https://mochajs.org/api/Mocha.reporters.Spec.html
    */
  @js.native
  class Spec ()
    extends typings.mocha.Mocha.reporters.Base
  
  /**
    * Initialize a new `TAP` test reporter.
    *
    * @see https://mochajs.org/api/Mocha.reporters.TAP.html
    */
  @js.native
  class TAP ()
    extends typings.mocha.Mocha.reporters.Base
  
  /**
    * Initialize a new `XUnit` test reporter.
    *
    * @see https://mochajs.org/api/Mocha.reporters.XUnit.html
    */
  @js.native
  class XUnit protected ()
    extends typings.mocha.Mocha.reporters.XUnit {
    /** @deprecated Use the overload that accepts `Mocha.Runner` instead. */
    def this(runner: IRunner) = this()
    def this(runner: typings.mocha.Mocha.Runner) = this()
    def this(runner: IRunner, options: typings.mocha.Mocha.reporters.XUnit.MochaOptions) = this()
    def this(runner: typings.mocha.Mocha.Runner, options: typings.mocha.Mocha.reporters.XUnit.MochaOptions) = this()
  }
  
  // value-only aliases
  val base: TypeofBase with (Instantiable2[
    /* runner */ typings.mocha.Mocha.Runner, 
    js.UndefOr[/* options */ MochaOptions], 
    typings.mocha.Mocha.reporters.Base
  ]) = js.native
  val doc: Instantiable0[typings.mocha.Mocha.reporters.Doc] = js.native
  val dot: Instantiable0[typings.mocha.Mocha.reporters.Dot] = js.native
  val html: Instantiable0[typings.mocha.Mocha.reporters.HTML] = js.native
  val json: Instantiable0[typings.mocha.Mocha.reporters.JSON] = js.native
  val landing: Instantiable0[typings.mocha.Mocha.reporters.Landing] = js.native
  val list: Instantiable0[typings.mocha.Mocha.reporters.List] = js.native
  val markdown: Instantiable0[typings.mocha.Mocha.reporters.Markdown] = js.native
  val nyan: Instantiable0[typings.mocha.Mocha.reporters.Nyan] = js.native
  val progress: Instantiable2[
    /* runner */ typings.mocha.Mocha.Runner, 
    js.UndefOr[/* options */ typings.mocha.Mocha.reporters.Progress.MochaOptions], 
    typings.mocha.Mocha.reporters.Progress
  ] = js.native
  val spec: Instantiable0[typings.mocha.Mocha.reporters.Spec] = js.native
  val tap: Instantiable0[typings.mocha.Mocha.reporters.TAP] = js.native
  val xunit: Instantiable2[
    /* runner */ typings.mocha.Mocha.Runner, 
    js.UndefOr[/* options */ typings.mocha.Mocha.reporters.XUnit.MochaOptions], 
    typings.mocha.Mocha.reporters.XUnit
  ] = js.native
  @js.native
  object Base extends js.Object {
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
    def list(failures: js.Array[typings.mocha.Mocha.Test]): Unit = js.native
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
  
}

