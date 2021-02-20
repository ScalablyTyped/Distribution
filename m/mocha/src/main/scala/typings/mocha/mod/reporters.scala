package typings.mocha.mod

import typings.mocha.Mocha.MochaOptions
import typings.mocha.Mocha.Test
import typings.mocha.Mocha.reporters.Base_.ColorMap
import typings.mocha.Mocha.reporters.Base_.SymbolMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion Test interface augmentations
object reporters {
  
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
  class Base_ protected ()
    extends typings.mocha.Mocha.reporters.Base_ {
    def this(runner: typings.mocha.Mocha.Runner) = this()
    def this(runner: typings.mocha.Mocha.Runner, options: MochaOptions) = this()
  }
  object Base_ {
    
    @JSImport("mocha", "reporters.Base")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Color `str` with the given `type` (from `colors`)
      *
      * @see https://mochajs.org/api/module-base#.color
      */
    @JSImport("mocha", "reporters.Base.color")
    @js.native
    def color(`type`: String, str: String): String = js.native
    
    /**
      * Default color map
      *
      * @see https://mochajs.org/api/module-base#.colors
      */
    @JSImport("mocha", "reporters.Base.colors")
    @js.native
    val colors: ColorMap = js.native
    
    /**
      * ANSI TTY control sequences common among reporters.
      *
      * @see https://mochajs.org/api/module-base#.cursor
      */
    object cursor {
      
      /**
        * Clears the line and moves to the beginning of the line.
        */
      @JSImport("mocha", "reporters.Base.cursor.CR")
      @js.native
      def CR(): Unit = js.native
      
      /**
        * Moves to the beginning of the line
        */
      @JSImport("mocha", "reporters.Base.cursor.beginningOfLine")
      @js.native
      def beginningOfLine(): Unit = js.native
      
      /**
        * Deletes the current line
        */
      @JSImport("mocha", "reporters.Base.cursor.deleteLine")
      @js.native
      def deleteLine(): Unit = js.native
      
      /**
        * Hides the cursor
        */
      @JSImport("mocha", "reporters.Base.cursor.hide")
      @js.native
      def hide(): Unit = js.native
      
      /**
        * Shows the cursor
        */
      @JSImport("mocha", "reporters.Base.cursor.show")
      @js.native
      def show(): Unit = js.native
    }
    
    /**
      * Returns a diff between two strings with colored ANSI output.
      *
      * @see https://mochajs.org/api/module-base#.generateDiff
      */
    @JSImport("mocha", "reporters.Base.generateDiff")
    @js.native
    def generateDiff(actual: String, expected: String): String = js.native
    
    /**
      * Inline diffs instead of +/-
      *
      * @see https://mochajs.org/api/module-base#.inlineDiffs
      */
    @JSImport("mocha", "reporters.Base.inlineDiffs")
    @js.native
    def inlineDiffs: Boolean = js.native
    @scala.inline
    def inlineDiffs_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inlineDiffs")(x.asInstanceOf[js.Any])
    
    /**
      * Output the given `failures` as a list.
      *
      * @see https://mochajs.org/api/Mocha.reporters.Base.html#.exports.list1
      */
    @JSImport("mocha", "reporters.Base.list")
    @js.native
    def list(failures: js.Array[Test]): Unit = js.native
    
    /**
      * Default symbol map
      *
      * @see https://mochajs.org/api/module-base#.symbols
      */
    @JSImport("mocha", "reporters.Base.symbols")
    @js.native
    val symbols: SymbolMap = js.native
    
    /**
      * Enables coloring by default
      *
      * @see https://mochajs.org/api/module-base#.useColors
      */
    @JSImport("mocha", "reporters.Base.useColors")
    @js.native
    def useColors: Boolean = js.native
    @scala.inline
    def useColors_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useColors")(x.asInstanceOf[js.Any])
    
    /**
      * Expose terminal window size
      *
      * @see https://mochajs.org/api/module-base#.window
      */
    object window {
      
      @JSImport("mocha", "reporters.Base.window")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("mocha", "reporters.Base.window.width")
      @js.native
      def width: Double = js.native
      @scala.inline
      def width_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("width")(x.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Initialize a new `Doc` reporter.
    *
    * @see https://mochajs.org/api/Mocha.reporters.Doc.html
    */
  @JSImport("mocha", "reporters.Doc")
  @js.native
  class Doc_ ()
    extends typings.mocha.Mocha.reporters.Base_
  
  /**
    * Initialize a new `Dot` matrix test reporter.
    *
    * @see https://mochajs.org/api/Mocha.reporters.Dot.html
    */
  @JSImport("mocha", "reporters.Dot")
  @js.native
  class Dot_ ()
    extends typings.mocha.Mocha.reporters.Base_
  
  /**
    * Initialize a new `HTML` reporter.
    *
    * - _This reporter cannot be used on the console._
    *
    * @see https://mochajs.org/api/Mocha.reporters.HTML.html
    */
  @JSImport("mocha", "reporters.HTML")
  @js.native
  class HTML_ ()
    extends typings.mocha.Mocha.reporters.HTML_
  
  /**
    * Initialize a new `JSONStream` test reporter.
    *
    * @see https://mochajs.org/api/Mocha.reporters.JSONStream.html
    */
  @JSImport("mocha", "reporters.JSONStream")
  @js.native
  class JSONStream ()
    extends typings.mocha.Mocha.reporters.Base_
  
  /**
    * Initialize a new `JSON` reporter
    *
    * @see https://mochajs.org/api/Mocha.reporters.JSON.html
    */
  @JSImport("mocha", "reporters.JSON")
  @js.native
  class JSON_ ()
    extends typings.mocha.Mocha.reporters.Base_
  
  /**
    * Initialize a new `Landing` reporter.
    *
    * @see https://mochajs.org/api/Mocha.reporters.Landing.html
    */
  @JSImport("mocha", "reporters.Landing")
  @js.native
  class Landing_ ()
    extends typings.mocha.Mocha.reporters.Base_
  
  /**
    * Initialize a new `List` test reporter.
    *
    * @see https://mochajs.org/api/Mocha.reporters.List.html
    */
  @JSImport("mocha", "reporters.List")
  @js.native
  class List_ ()
    extends typings.mocha.Mocha.reporters.Base_
  
  /**
    * Initialize a new `Markdown` test reporter.
    *
    * @see https://mochajs.org/api/Mocha.reporters.Markdown.html
    */
  @JSImport("mocha", "reporters.Markdown")
  @js.native
  class Markdown_ ()
    extends typings.mocha.Mocha.reporters.Base_
  
  /**
    * Initialize a new `Min` minimal test reporter (best used with --watch).
    *
    * @see https://mochajs.org/api/Mocha.reporters.Min.html
    */
  @JSImport("mocha", "reporters.Min")
  @js.native
  class Min ()
    extends typings.mocha.Mocha.reporters.Base_
  
  /**
    * Initialize a new `NyanCat` test reporter.
    *
    * @see https://mochajs.org/api/Mocha.reporters.Nyan.html
    */
  @JSImport("mocha", "reporters.Nyan")
  @js.native
  class Nyan_ ()
    extends typings.mocha.Mocha.reporters.Nyan_
  
  /**
    * Initialize a new `Progress` bar test reporter.
    *
    * @see https://mochajs.org/api/Mocha.reporters.Progress.html
    */
  @JSImport("mocha", "reporters.Progress")
  @js.native
  class Progress_ protected ()
    extends typings.mocha.Mocha.reporters.Base_ {
    def this(runner: typings.mocha.Mocha.Runner) = this()
    def this(runner: typings.mocha.Mocha.Runner, options: typings.mocha.Mocha.reporters.Progress_.MochaOptions) = this()
  }
  
  /**
    * Initialize a new `Spec` test reporter.
    *
    * @see https://mochajs.org/api/Mocha.reporters.Spec.html
    */
  @JSImport("mocha", "reporters.Spec")
  @js.native
  class Spec_ ()
    extends typings.mocha.Mocha.reporters.Base_
  
  /**
    * Initialize a new `TAP` test reporter.
    *
    * @see https://mochajs.org/api/Mocha.reporters.TAP.html
    */
  @JSImport("mocha", "reporters.TAP")
  @js.native
  class TAP_ ()
    extends typings.mocha.Mocha.reporters.Base_
  
  /**
    * Initialize a new `XUnit` test reporter.
    *
    * @see https://mochajs.org/api/Mocha.reporters.XUnit.html
    */
  @JSImport("mocha", "reporters.XUnit")
  @js.native
  class XUnit_ protected ()
    extends typings.mocha.Mocha.reporters.XUnit_ {
    def this(runner: typings.mocha.Mocha.Runner) = this()
    def this(runner: typings.mocha.Mocha.Runner, options: typings.mocha.Mocha.reporters.XUnit_.MochaOptions) = this()
  }
  
  /**
    * Initialize a new `Base` reporter.
    *
    * All other reporters generally inherit from this reporter, providing stats such as test duration,
    * number of tests passed / failed, etc.
    *
    * @see https://mochajs.org/api/Mocha.reporters.Base.html
    */
  /* was `typeof Base` */
  @JSImport("mocha", "reporters.base")
  @js.native
  class base protected ()
    extends typings.mocha.Mocha.reporters.Base_ {
    def this(runner: typings.mocha.Mocha.Runner) = this()
    def this(runner: typings.mocha.Mocha.Runner, options: MochaOptions) = this()
  }
  /* was `typeof Base` */
  object base {
    
    @JSImport("mocha", "reporters.base")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Color `str` with the given `type` (from `colors`)
      *
      * @see https://mochajs.org/api/module-base#.color
      */
    @JSImport("mocha", "reporters.base.color")
    @js.native
    def color(`type`: String, str: String): String = js.native
    
    /**
      * Default color map
      *
      * @see https://mochajs.org/api/module-base#.colors
      */
    @JSImport("mocha", "reporters.base.colors")
    @js.native
    val colors: ColorMap = js.native
    
    /**
      * ANSI TTY control sequences common among reporters.
      *
      * @see https://mochajs.org/api/module-base#.cursor
      */
    object cursor {
      
      /**
        * Clears the line and moves to the beginning of the line.
        */
      @JSImport("mocha", "reporters.base.cursor.CR")
      @js.native
      def CR(): Unit = js.native
      
      /**
        * Moves to the beginning of the line
        */
      @JSImport("mocha", "reporters.base.cursor.beginningOfLine")
      @js.native
      def beginningOfLine(): Unit = js.native
      
      /**
        * Deletes the current line
        */
      @JSImport("mocha", "reporters.base.cursor.deleteLine")
      @js.native
      def deleteLine(): Unit = js.native
      
      /**
        * Hides the cursor
        */
      @JSImport("mocha", "reporters.base.cursor.hide")
      @js.native
      def hide(): Unit = js.native
      
      /**
        * Shows the cursor
        */
      @JSImport("mocha", "reporters.base.cursor.show")
      @js.native
      def show(): Unit = js.native
    }
    
    /**
      * Returns a diff between two strings with colored ANSI output.
      *
      * @see https://mochajs.org/api/module-base#.generateDiff
      */
    @JSImport("mocha", "reporters.base.generateDiff")
    @js.native
    def generateDiff(actual: String, expected: String): String = js.native
    
    /**
      * Inline diffs instead of +/-
      *
      * @see https://mochajs.org/api/module-base#.inlineDiffs
      */
    @JSImport("mocha", "reporters.base.inlineDiffs")
    @js.native
    def inlineDiffs: Boolean = js.native
    @scala.inline
    def inlineDiffs_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inlineDiffs")(x.asInstanceOf[js.Any])
    
    /**
      * Output the given `failures` as a list.
      *
      * @see https://mochajs.org/api/Mocha.reporters.Base.html#.exports.list1
      */
    @JSImport("mocha", "reporters.base.list")
    @js.native
    def list(failures: js.Array[Test]): Unit = js.native
    
    /**
      * Default symbol map
      *
      * @see https://mochajs.org/api/module-base#.symbols
      */
    @JSImport("mocha", "reporters.base.symbols")
    @js.native
    val symbols: SymbolMap = js.native
    
    /**
      * Enables coloring by default
      *
      * @see https://mochajs.org/api/module-base#.useColors
      */
    @JSImport("mocha", "reporters.base.useColors")
    @js.native
    def useColors: Boolean = js.native
    @scala.inline
    def useColors_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useColors")(x.asInstanceOf[js.Any])
    
    /**
      * Expose terminal window size
      *
      * @see https://mochajs.org/api/module-base#.window
      */
    object window {
      
      @JSImport("mocha", "reporters.base.window")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("mocha", "reporters.base.window.width")
      @js.native
      def width: Double = js.native
      @scala.inline
      def width_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("width")(x.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Initialize a new `Doc` reporter.
    *
    * @see https://mochajs.org/api/Mocha.reporters.Doc.html
    */
  /* was `typeof Doc` */
  @JSImport("mocha", "reporters.doc")
  @js.native
  class doc ()
    extends typings.mocha.Mocha.reporters.Base_
  
  /**
    * Initialize a new `Dot` matrix test reporter.
    *
    * @see https://mochajs.org/api/Mocha.reporters.Dot.html
    */
  /* was `typeof Dot` */
  @JSImport("mocha", "reporters.dot")
  @js.native
  class dot ()
    extends typings.mocha.Mocha.reporters.Base_
  
  /**
    * Initialize a new `HTML` reporter.
    *
    * - _This reporter cannot be used on the console._
    *
    * @see https://mochajs.org/api/Mocha.reporters.HTML.html
    */
  /* was `typeof HTML` */
  @JSImport("mocha", "reporters.html")
  @js.native
  class html ()
    extends typings.mocha.Mocha.reporters.HTML_
  
  /**
    * Initialize a new `JSON` reporter
    *
    * @see https://mochajs.org/api/Mocha.reporters.JSON.html
    */
  /* was `typeof JSON` */
  @JSImport("mocha", "reporters.json")
  @js.native
  class json ()
    extends typings.mocha.Mocha.reporters.Base_
  
  /**
    * Initialize a new `Landing` reporter.
    *
    * @see https://mochajs.org/api/Mocha.reporters.Landing.html
    */
  /* was `typeof Landing` */
  @JSImport("mocha", "reporters.landing")
  @js.native
  class landing ()
    extends typings.mocha.Mocha.reporters.Base_
  
  /**
    * Initialize a new `List` test reporter.
    *
    * @see https://mochajs.org/api/Mocha.reporters.List.html
    */
  /* was `typeof List` */
  @JSImport("mocha", "reporters.list")
  @js.native
  class list ()
    extends typings.mocha.Mocha.reporters.Base_
  
  /**
    * Initialize a new `Markdown` test reporter.
    *
    * @see https://mochajs.org/api/Mocha.reporters.Markdown.html
    */
  /* was `typeof Markdown` */
  @JSImport("mocha", "reporters.markdown")
  @js.native
  class markdown ()
    extends typings.mocha.Mocha.reporters.Base_
  
  /**
    * Initialize a new `NyanCat` test reporter.
    *
    * @see https://mochajs.org/api/Mocha.reporters.Nyan.html
    */
  /* was `typeof Nyan` */
  @JSImport("mocha", "reporters.nyan")
  @js.native
  class nyan ()
    extends typings.mocha.Mocha.reporters.Nyan_
  
  /**
    * Initialize a new `Progress` bar test reporter.
    *
    * @see https://mochajs.org/api/Mocha.reporters.Progress.html
    */
  /* was `typeof Progress` */
  @JSImport("mocha", "reporters.progress")
  @js.native
  class progress protected ()
    extends typings.mocha.Mocha.reporters.Base_ {
    def this(runner: typings.mocha.Mocha.Runner) = this()
    def this(runner: typings.mocha.Mocha.Runner, options: typings.mocha.Mocha.reporters.Progress_.MochaOptions) = this()
  }
  /* was `typeof Progress` */
  object progress
  
  /**
    * Initialize a new `Spec` test reporter.
    *
    * @see https://mochajs.org/api/Mocha.reporters.Spec.html
    */
  /* was `typeof Spec` */
  @JSImport("mocha", "reporters.spec")
  @js.native
  class spec ()
    extends typings.mocha.Mocha.reporters.Base_
  
  /**
    * Initialize a new `TAP` test reporter.
    *
    * @see https://mochajs.org/api/Mocha.reporters.TAP.html
    */
  /* was `typeof TAP` */
  @JSImport("mocha", "reporters.tap")
  @js.native
  class tap ()
    extends typings.mocha.Mocha.reporters.Base_
  
  /**
    * Initialize a new `XUnit` test reporter.
    *
    * @see https://mochajs.org/api/Mocha.reporters.XUnit.html
    */
  /* was `typeof XUnit` */
  @JSImport("mocha", "reporters.xunit")
  @js.native
  class xunit protected ()
    extends typings.mocha.Mocha.reporters.XUnit_ {
    def this(runner: typings.mocha.Mocha.Runner) = this()
    def this(runner: typings.mocha.Mocha.Runner, options: typings.mocha.Mocha.reporters.XUnit_.MochaOptions) = this()
  }
  /* was `typeof XUnit` */
  object xunit
}
