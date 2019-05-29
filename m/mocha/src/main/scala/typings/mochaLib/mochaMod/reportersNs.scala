package typings
package mochaLib.mochaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion Test interface augmentations
@JSImport("mocha", "reporters")
@js.native
object reportersNs extends js.Object {
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
    extends mochaLib.MochaNs.reportersNs.Base {
    /** @deprecated Use the overload that accepts `Mocha.Runner` instead. */
    def this(runner: mochaLib.MochaNs.IRunner) = this()
    def this(runner: mochaLib.MochaNs.Runner) = this()
    def this(runner: mochaLib.MochaNs.IRunner, options: mochaLib.MochaNs.MochaOptions) = this()
    def this(runner: mochaLib.MochaNs.Runner, options: mochaLib.MochaNs.MochaOptions) = this()
  }
  
  /**
    * Initialize a new `Doc` reporter.
    *
    * @see https://mochajs.org/api/Mocha.reporters.Doc.html
    */
  @js.native
  class Doc ()
    extends mochaLib.MochaNs.reportersNs.Doc
  
  /**
    * Initialize a new `Dot` matrix test reporter.
    *
    * @see https://mochajs.org/api/Mocha.reporters.Dot.html
    */
  @js.native
  class Dot ()
    extends mochaLib.MochaNs.reportersNs.Dot
  
  /**
    * Initialize a new `HTML` reporter.
    *
    * - _This reporter cannot be used on the console._
    *
    * @see https://mochajs.org/api/Mocha.reporters.HTML.html
    */
  @js.native
  class HTML ()
    extends mochaLib.MochaNs.reportersNs.HTML
  
  /**
    * Initialize a new `JSON` reporter
    *
    * @see https://mochajs.org/api/Mocha.reporters.JSON.html
    */
  @js.native
  class JSON ()
    extends mochaLib.MochaNs.reportersNs.JSON
  
  /**
    * Initialize a new `JSONStream` test reporter.
    *
    * @see https://mochajs.org/api/Mocha.reporters.JSONStream.html
    */
  @js.native
  class JSONStream ()
    extends mochaLib.MochaNs.reportersNs.JSONStream
  
  /**
    * Initialize a new `Landing` reporter.
    *
    * @see https://mochajs.org/api/Mocha.reporters.Landing.html
    */
  @js.native
  class Landing ()
    extends mochaLib.MochaNs.reportersNs.Landing
  
  /**
    * Initialize a new `List` test reporter.
    *
    * @see https://mochajs.org/api/Mocha.reporters.List.html
    */
  @js.native
  class List ()
    extends mochaLib.MochaNs.reportersNs.List
  
  /**
    * Initialize a new `Markdown` test reporter.
    *
    * @see https://mochajs.org/api/Mocha.reporters.Markdown.html
    */
  @js.native
  class Markdown ()
    extends mochaLib.MochaNs.reportersNs.Markdown
  
  /**
    * Initialize a new `Min` minimal test reporter (best used with --watch).
    *
    * @see https://mochajs.org/api/Mocha.reporters.Min.html
    */
  @js.native
  class Min ()
    extends mochaLib.MochaNs.reportersNs.Min
  
  /**
    * Initialize a new `NyanCat` test reporter.
    *
    * @see https://mochajs.org/api/Mocha.reporters.Nyan.html
    */
  @js.native
  class Nyan ()
    extends mochaLib.MochaNs.reportersNs.Nyan
  
  /**
    * Initialize a new `Progress` bar test reporter.
    *
    * @see https://mochajs.org/api/Mocha.reporters.Progress.html
    */
  @js.native
  class Progress protected ()
    extends mochaLib.MochaNs.reportersNs.Progress {
    /** @deprecated Use the overload that accepts `Mocha.Runner` instead. */
    def this(runner: mochaLib.MochaNs.IRunner) = this()
    def this(runner: mochaLib.MochaNs.Runner) = this()
    def this(runner: mochaLib.MochaNs.IRunner, options: mochaLib.MochaNs.reportersNs.ProgressNs.MochaOptions) = this()
    def this(runner: mochaLib.MochaNs.Runner, options: mochaLib.MochaNs.reportersNs.ProgressNs.MochaOptions) = this()
  }
  
  /**
    * Initialize a new `Spec` test reporter.
    *
    * @see https://mochajs.org/api/Mocha.reporters.Spec.html
    */
  @js.native
  class Spec ()
    extends mochaLib.MochaNs.reportersNs.Spec
  
  /**
    * Initialize a new `TAP` test reporter.
    *
    * @see https://mochajs.org/api/Mocha.reporters.TAP.html
    */
  @js.native
  class TAP ()
    extends mochaLib.MochaNs.reportersNs.TAP
  
  /**
    * Initialize a new `XUnit` test reporter.
    *
    * @see https://mochajs.org/api/Mocha.reporters.XUnit.html
    */
  @js.native
  class XUnit protected ()
    extends mochaLib.MochaNs.reportersNs.XUnit {
    /** @deprecated Use the overload that accepts `Mocha.Runner` instead. */
    def this(runner: mochaLib.MochaNs.IRunner) = this()
    def this(runner: mochaLib.MochaNs.Runner) = this()
    def this(runner: mochaLib.MochaNs.IRunner, options: mochaLib.MochaNs.reportersNs.XUnitNs.MochaOptions) = this()
    def this(runner: mochaLib.MochaNs.Runner, options: mochaLib.MochaNs.reportersNs.XUnitNs.MochaOptions) = this()
  }
  
  // value-only aliases
  val base: mochaLib.TypeofBase with (org.scalablytyped.runtime.Instantiable2[
    /* runner */ mochaLib.MochaNs.Runner, 
    js.UndefOr[/* options */ mochaLib.MochaNs.MochaOptions], 
    mochaLib.MochaNs.reportersNs.Base
  ]) = js.native
  val doc: org.scalablytyped.runtime.Instantiable0[mochaLib.MochaNs.reportersNs.Doc] = js.native
  val dot: org.scalablytyped.runtime.Instantiable0[mochaLib.MochaNs.reportersNs.Dot] = js.native
  val html: org.scalablytyped.runtime.Instantiable0[mochaLib.MochaNs.reportersNs.HTML] = js.native
  val json: org.scalablytyped.runtime.Instantiable0[mochaLib.MochaNs.reportersNs.JSON] = js.native
  val landing: org.scalablytyped.runtime.Instantiable0[mochaLib.MochaNs.reportersNs.Landing] = js.native
  val list: org.scalablytyped.runtime.Instantiable0[mochaLib.MochaNs.reportersNs.List] = js.native
  val markdown: org.scalablytyped.runtime.Instantiable0[mochaLib.MochaNs.reportersNs.Markdown] = js.native
  val nyan: org.scalablytyped.runtime.Instantiable0[mochaLib.MochaNs.reportersNs.Nyan] = js.native
  val progress: org.scalablytyped.runtime.Instantiable2[
    /* runner */ mochaLib.MochaNs.Runner, 
    js.UndefOr[/* options */ mochaLib.MochaNs.reportersNs.ProgressNs.MochaOptions], 
    mochaLib.MochaNs.reportersNs.Progress
  ] = js.native
  val spec: org.scalablytyped.runtime.Instantiable0[mochaLib.MochaNs.reportersNs.Spec] = js.native
  val tap: org.scalablytyped.runtime.Instantiable0[mochaLib.MochaNs.reportersNs.TAP] = js.native
  val xunit: org.scalablytyped.runtime.Instantiable2[
    /* runner */ mochaLib.MochaNs.Runner, 
    js.UndefOr[/* options */ mochaLib.MochaNs.reportersNs.XUnitNs.MochaOptions], 
    mochaLib.MochaNs.reportersNs.XUnit
  ] = js.native
  @JSName("Base")
  @js.native
  object BaseNs extends js.Object {
    /**
      * Default color map
      *
      * @see https://mochajs.org/api/module-base#.colors
      */
    val colors: mochaLib.MochaNs.reportersNs.BaseNs.ColorMap = js.native
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
    val symbols: mochaLib.MochaNs.reportersNs.BaseNs.SymbolMap = js.native
    /**
      * Enables coloring by default
      *
      * @see https://mochajs.org/api/module-base#.useColors
      */
    var useColors: scala.Boolean = js.native
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
    /**
      * ANSI TTY control sequences common among reporters.
      *
      * @see https://mochajs.org/api/module-base#.cursor
      */
    @JSName("cursor")
    @js.native
    object cursorNs extends js.Object {
      /**
        * Clears the line and moves to the beginning of the line.
        */
      def CR(): scala.Unit = js.native
      /**
        * Moves to the beginning of the line
        */
      def beginningOfLine(): scala.Unit = js.native
      /**
        * Deletes the current line
        */
      def deleteLine(): scala.Unit = js.native
      /**
        * Hides the cursor
        */
      def hide(): scala.Unit = js.native
      /**
        * Shows the cursor
        */
      def show(): scala.Unit = js.native
    }
    
    /**
      * Expose terminal window size
      *
      * @see https://mochajs.org/api/module-base#.window
      */
    @js.native
    object window extends js.Object {
      var width: scala.Double = js.native
    }
    
  }
  
}

