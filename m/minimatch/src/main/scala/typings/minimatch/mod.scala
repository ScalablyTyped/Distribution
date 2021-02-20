package typings.minimatch

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("minimatch", JSImport.Namespace)
  @js.native
  def apply(target: String, pattern: String): Boolean = js.native
  @JSImport("minimatch", JSImport.Namespace)
  @js.native
  def apply(target: String, pattern: String, options: IOptions): Boolean = js.native
  
  @JSImport("minimatch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("minimatch", "Minimatch")
  @js.native
  class Minimatch protected () extends IMinimatch {
    def this(pattern: String) = this()
    def this(pattern: String, options: IOptions) = this()
  }
  @JSImport("minimatch", "Minimatch")
  @js.native
  def Minimatch: IMinimatchStatic = js.native
  @scala.inline
  def Minimatch_=(x: IMinimatchStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Minimatch")(x.asInstanceOf[js.Any])
  
  /**
    * Returns a function that tests its supplied argument, suitable for use with Array.filter
    */
  @JSImport("minimatch", "filter")
  @js.native
  def filter(pattern: String): js.Function3[/* element */ String, /* indexed */ Double, /* array */ js.Array[String], Boolean] = js.native
  @JSImport("minimatch", "filter")
  @js.native
  def filter(pattern: String, options: IOptions): js.Function3[/* element */ String, /* indexed */ Double, /* array */ js.Array[String], Boolean] = js.native
  
  /**
    * Make a regular expression object from the pattern.
    */
  @JSImport("minimatch", "makeRe")
  @js.native
  def makeRe(pattern: String): RegExp = js.native
  @JSImport("minimatch", "makeRe")
  @js.native
  def makeRe(pattern: String, options: IOptions): RegExp = js.native
  
  @js.native
  trait IMinimatch extends StObject {
    
    /**
      * Deprecated. For internal use.
      *
      * @private
      */
    def braceExpand(pattern: String, options: IOptions): Unit = js.native
    
    /**
      * True if the pattern is a comment.
      */
    var comment: Boolean = js.native
    
    /**
      * Deprecated. For internal use.
      *
      * @private
      */
    def debug(): Unit = js.native
    
    /**
      * True if the pattern is ""
      */
    var empty: Boolean = js.native
    
    /**
      * Deprecated. For internal use.
      *
      * @private
      */
    def make(): Unit = js.native
    
    /**
      * Generate the regexp member if necessary, and return it.
      * Will return false if the pattern is invalid.
      */
    def makeRe(): RegExp = js.native
    
    // regexp or boolean
    /**
      * Return true if the filename matches the pattern, or false otherwise.
      */
    def `match`(fname: String): Boolean = js.native
    
    /**
      * Take a /-split filename, and match it against a single row in the regExpSet.
      * This method is mainly for internal use, but is exposed so that it can be used
      * by a glob-walker that needs to avoid excessive filesystem calls.
      */
    def matchOne(files: js.Array[String], pattern: js.Array[String], partial: Boolean): Boolean = js.native
    
    /**
      * True if the pattern is negated.
      */
    var negate: Boolean = js.native
    
    /**
      * The options supplied to the constructor.
      */
    var options: IOptions = js.native
    
    /**
      * Deprecated. For internal use.
      *
      * @private
      */
    def parse(pattern: String): Unit = js.native
    def parse(pattern: String, isSub: Boolean): Unit = js.native
    
    /**
      * Deprecated. For internal use.
      *
      * @private
      */
    def parseNegate(): Unit = js.native
    
    /**
      * The original pattern the minimatch object represents.
      */
    var pattern: String = js.native
    
    // (RegExp | string)[][]
    /**
      * A single regular expression expressing the entire pattern.
      * Created by the makeRe method.
      */
    var regexp: RegExp = js.native
    
    /**
      * A 2-dimensional array of regexp or string expressions.
      */
    var set: js.Array[js.Array[_]] = js.native
  }
  
  @js.native
  trait IMinimatchStatic
    extends Instantiable1[/* pattern */ String, IMinimatch]
       with Instantiable2[/* pattern */ String, /* options */ IOptions, IMinimatch]
  
  @js.native
  trait IOptions extends StObject {
    
    /**
      * Dump a ton of stuff to stderr.
      *
      * @default false
      */
    var debug: js.UndefOr[Boolean] = js.native
    
    /**
      * Allow patterns to match filenames starting with a period,
      * even if the pattern does not explicitly have a period in that spot.
      *
      * @default false
      */
    var dot: js.UndefOr[Boolean] = js.native
    
    /**
      * Returns from negate expressions the same as if they were not negated.
      * (Ie, true on a hit, false on a miss.)
      *
      * @default false
      */
    var flipNegate: js.UndefOr[Boolean] = js.native
    
    /**
      * If set, then patterns without slashes will be matched against
      * the basename of the path if it contains slashes.
      *
      * @default false
      */
    var matchBase: js.UndefOr[Boolean] = js.native
    
    /**
      * Do not expand {a,b} and {1..3} brace sets.
      *
      * @default false
      */
    var nobrace: js.UndefOr[Boolean] = js.native
    
    /**
      * Perform a case-insensitive match.
      *
      * @default false
      */
    var nocase: js.UndefOr[Boolean] = js.native
    
    /**
      * Suppress the behavior of treating #
      * at the start of a pattern as a comment.
      *
      * @default false
      */
    var nocomment: js.UndefOr[Boolean] = js.native
    
    /**
      * Disable "extglob" style patterns like +(a|b).
      *
      * @default false
      */
    var noext: js.UndefOr[Boolean] = js.native
    
    /**
      * Disable ** matching against multiple folder names.
      *
      * @default false
      */
    var noglobstar: js.UndefOr[Boolean] = js.native
    
    /**
      * Suppress the behavior of treating a leading ! character as negation.
      *
      * @default false
      */
    var nonegate: js.UndefOr[Boolean] = js.native
    
    /**
      * When a match is not found by minimatch.match,
      * return a list containing the pattern itself if this option is set.
      * Otherwise, an empty list is returned if there are no matches.
      *
      * @default false
      */
    var nonull: js.UndefOr[Boolean] = js.native
  }
  object IOptions {
    
    @scala.inline
    def apply(): IOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOptions]
    }
    
    @scala.inline
    implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
      
      @scala.inline
      def setFlipNegate(value: Boolean): Self = StObject.set(x, "flipNegate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlipNegateUndefined: Self = StObject.set(x, "flipNegate", js.undefined)
      
      @scala.inline
      def setMatchBase(value: Boolean): Self = StObject.set(x, "matchBase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchBaseUndefined: Self = StObject.set(x, "matchBase", js.undefined)
      
      @scala.inline
      def setNobrace(value: Boolean): Self = StObject.set(x, "nobrace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNobraceUndefined: Self = StObject.set(x, "nobrace", js.undefined)
      
      @scala.inline
      def setNocase(value: Boolean): Self = StObject.set(x, "nocase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNocaseUndefined: Self = StObject.set(x, "nocase", js.undefined)
      
      @scala.inline
      def setNocomment(value: Boolean): Self = StObject.set(x, "nocomment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNocommentUndefined: Self = StObject.set(x, "nocomment", js.undefined)
      
      @scala.inline
      def setNoext(value: Boolean): Self = StObject.set(x, "noext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoextUndefined: Self = StObject.set(x, "noext", js.undefined)
      
      @scala.inline
      def setNoglobstar(value: Boolean): Self = StObject.set(x, "noglobstar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoglobstarUndefined: Self = StObject.set(x, "noglobstar", js.undefined)
      
      @scala.inline
      def setNonegate(value: Boolean): Self = StObject.set(x, "nonegate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonegateUndefined: Self = StObject.set(x, "nonegate", js.undefined)
      
      @scala.inline
      def setNonull(value: Boolean): Self = StObject.set(x, "nonull", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonullUndefined: Self = StObject.set(x, "nonull", js.undefined)
    }
  }
  
  /**
    * Match against the list of files, in the style of fnmatch or glob.
    * If nothing is matched, and options.nonull is set,
    * then return a list containing the pattern itself.
    */
  @JSImport("minimatch", "match")
  @js.native
  def `match`(list: js.Array[String], pattern: String): js.Array[String] = js.native
  @JSImport("minimatch", "match")
  @js.native
  def `match`(list: js.Array[String], pattern: String, options: IOptions): js.Array[String] = js.native
}
