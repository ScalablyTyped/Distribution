package typings.minimatch

import org.scalablytyped.runtime.Instantiable2
import typings.minimatch.anon.TypeofMinimatch
import typings.minimatch.minimatchBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(target: String, pattern: String): Boolean = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(target: String, pattern: String, options: IOptions): Boolean = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("minimatch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("minimatch", "GLOBSTAR")
  @js.native
  val GLOBSTAR: js.Symbol = js.native
  
  /**
    * Create a minimatch object by instantiating the `minimatch.Minimatch` class.
    *
    * @example
    * import { Minimatch } from "minimatch";
    *
    * const mm = new Minimatch(pattern, options);
    */
  @JSImport("minimatch", "Minimatch")
  @js.native
  open class Minimatch protected () extends StObject {
    def this(pattern: String) = this()
    def this(pattern: String, options: IOptions) = this()
    
    /**
      * @deprecated. For internal use.
      */
    def braceExpand(): js.Array[String] = js.native
    
    /**
      * True if the pattern is a comment.
      */
    var comment: Boolean = js.native
    
    /**
      * @deprecated. For internal use.
      */
    def debug(): Unit = js.native
    
    /**
      * True if the pattern is `""`.
      */
    var empty: Boolean = js.native
    
    /**
      * @deprecated. For internal use.
      */
    def make(): Unit = js.native
    
    /**
      * Generate the `regexp` member if necessary, and return it. Will return `false` if the pattern is invalid.
      */
    def makeRe(): js.RegExp | `false` = js.native
    
    /**
      * @return `true` if the filename matches the pattern, or `false` otherwise.
      */
    def `match`(fname: String): Boolean = js.native
    def `match`(fname: String, partial: Boolean): Boolean = js.native
    
    /**
      * Take a `/`-split filename, and match it against a single row in the `regExpSet`.
      * This method is mainly for internal use, but is exposed so that it can be used
      * by a glob-walker that needs to avoid excessive filesystem calls.
      */
    def matchOne(file: js.Array[String], pattern: js.Array[String | js.RegExp], partial: Boolean): Boolean = js.native
    
    /**
      * True if the pattern is negated.
      */
    var negate: Boolean = js.native
    
    /**
      * The options supplied to the constructor.
      */
    var options: IOptions = js.native
    
    /**
      * @deprecated. For internal use.
      */
    def parse(pattern: String): String | `false` | (js.Tuple2[String, Boolean]) | js.RegExp | js.Symbol = js.native
    def parse(pattern: String, isSub: Boolean): String | `false` | (js.Tuple2[String, Boolean]) | js.RegExp | js.Symbol = js.native
    
    /**
      * @deprecated. For internal use.
      */
    def parseNegate(): Unit = js.native
    
    /**
      * True if partial paths should be compared to a pattern.
      */
    var partial: Boolean = js.native
    
    /**
      * The original pattern the minimatch object represents.
      */
    var pattern: String = js.native
    
    /**
      * Created by the `makeRe` method. A single regular expression expressing the entire pattern. This is
      * useful in cases where you wish to use the pattern somewhat like `fnmatch(3)` with `FNM_PATH` enabled.
      */
    var regexp: js.RegExp | `false` | Null = js.native
    
    /**
      * A 2-dimensional array of regexp or string expressions. Each row in the array corresponds
      * to a brace-expanded pattern. Each item in the row corresponds to a single path-part. For
      * example, the pattern `{a,b/c}/d` would expand to a set of patterns like:
      *
      * ```
      *   [ [ a, d ]
      *   , [ b, c, d ] ]
      * ```
      *
      * If a portion of the pattern doesn't have any "magic" in it (that is, it's something like `"foo"``
      * rather than `fo*o?`), then it will be left as a string rather than converted to a regular expression.
      */
    var set: js.Array[js.Array[js.RegExp | String]] = js.native
    
    /**
      * True if windows path delimiters shouldn't be interpreted as escape characters.
      */
    var windowsPathsNoEscape: Boolean = js.native
  }
  object Minimatch {
    
    @JSImport("minimatch", "Minimatch")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def defaults(defaultOptions: IOptions): TypeofMinimatch & (Instantiable2[/* pattern */ String, /* options */ js.UndefOr[IOptions], Minimatch]) = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(defaultOptions.asInstanceOf[js.Any]).asInstanceOf[TypeofMinimatch & (Instantiable2[/* pattern */ String, /* options */ js.UndefOr[IOptions], Minimatch])]
  }
  
  inline def braceExpand(pattern: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("braceExpand")(pattern.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def braceExpand(pattern: String, options: IOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("braceExpand")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def defaults(defaultOptions: IOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaults")(defaultOptions.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * @return A function that tests its supplied argument, suitable for use with `Array.filter`.
    *
    * @example
    * import minimatch = require("minimatch");
    *
    * const javascripts = fileList.filter(minimatch.filter("*.js", {matchBase: true}));
    */
  inline def filter(pattern: String): js.Function3[/* element */ String, /* indexed */ Double, /* array */ js.Array[String], Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(pattern.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* element */ String, /* indexed */ Double, /* array */ js.Array[String], Boolean]]
  inline def filter(pattern: String, options: IOptions): js.Function3[/* element */ String, /* indexed */ Double, /* array */ js.Array[String], Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function3[/* element */ String, /* indexed */ Double, /* array */ js.Array[String], Boolean]]
  
  /**
    * Make a regular expression object from the pattern.
    */
  inline def makeRe(pattern: String): js.RegExp | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("makeRe")(pattern.asInstanceOf[js.Any]).asInstanceOf[js.RegExp | `false`]
  inline def makeRe(pattern: String, options: IOptions): js.RegExp | `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRe")(pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.RegExp | `false`]
  
  /**
    * Match against the list of files, in the style of fnmatch or glob.
    * If nothing is matched, and options.nonull is set,
    * then return a list containing the pattern itself.
    *
    * @example
    * import minimatch = require("minimatch");
    *
    * const javascripts = minimatch.match(fileList, "*.js", {matchBase: true});
    */
  inline def `match`(list: js.Array[String], pattern: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(list.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def `match`(list: js.Array[String], pattern: String, options: IOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(list.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @JSImport("minimatch", "sep")
  @js.native
  val sep: String = js.native
  
  /**
    * @deprecated Keep legacy interface to prevent unnecessary breakage.
    */
  type IMinimatch = Minimatch
  
  /**
    * @deprecated Keep legacy interface to prevent unnecessary breakage.
    */
  type IMinimatchStatic = TypeofMinimatch & (Instantiable2[/* pattern */ String, /* options */ js.UndefOr[IOptions], Minimatch])
  
  trait IOptions extends StObject {
    
    /**
      * Dump a ton of stuff to stderr.
      *
      * @default false
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allow patterns to match filenames starting with a period,
      * even if the pattern does not explicitly have a period in that spot.
      *
      * Note that by default, `'a/ **' + '/b'` will **not** match `a/.d/b`, unless `dot` is set.
      *
      * @default false
      */
    var dot: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Returns from negate expressions the same as if they were not negated.
      * (Ie, true on a hit, false on a miss.)
      *
      * @default false
      */
    var flipNegate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set, then patterns without slashes will be matched
      * against the basename of the path if it contains slashes. For example,
      * `a?b` would match the path `/xyz/123/acb`, but not `/xyz/acb/123`.
      *
      * @default false
      */
    var matchBase: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Do not expand `{a,b}` and `{1..3}` brace sets.
      *
      * @default false
      */
    var nobrace: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Perform a case-insensitive match.
      *
      * @default false
      */
    var nocase: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Suppress the behavior of treating `#` at the start of a pattern as a comment.
      *
      * @default false
      */
    var nocomment: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disable "extglob" style patterns like `+(a|b)`.
      *
      * @default false
      */
    var noext: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disable `**` matching against multiple folder names.
      *
      * @default false
      */
    var noglobstar: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Suppress the behavior of treating a leading `!` character as negation.
      *
      * @default false
      */
    var nonegate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When a match is not found by `minimatch.match`,
      * return a list containing the pattern itself if this option is set.
      * Otherwise, an empty list is returned if there are no matches.
      *
      * @default false
      */
    var nonull: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Compare a partial path to a pattern.  As long as the parts of the path that
      * are present are not contradicted by the pattern, it will be treated as a
      * match. This is useful in applications where you're walking through a
      * folder structure, and don't yet have the full path, but want to ensure that
      * you do not walk down paths that can never be a match.
      *
      * @default false
      *
      * @example
      * import minimatch = require("minimatch");
      *
      * minimatch('/a/b', '/a/ *' + '/c/d', { partial: true })  // true, might be /a/b/c/d
      * minimatch('/a/b', '/ **' + '/d', { partial: true })     // true, might be /a/b/.../d
      * minimatch('/x/y/z', '/a/ **' + '/z', { partial: true }) // false, because x !== a
      */
    var partial: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Use `\\` as a path separator _only_, and _never_ as an escape
      * character. If set, all `\\` characters are replaced with `/` in
      * the pattern. Note that this makes it **impossible** to match
      * against paths containing literal glob pattern characters, but
      * allows matching with patterns constructed using `path.join()` and
      * `path.resolve()` on Windows platforms, mimicking the (buggy!)
      * behavior of earlier versions on Windows. Please use with
      * caution, and be mindful of the caveat about Windows paths
      *
      * For legacy reasons, this is also set if
      * `options.allowWindowsEscape` is set to the exact value `false`.
      *
      * @default false
      */
    var windowsPathsNoEscape: js.UndefOr[Boolean] = js.undefined
  }
  object IOptions {
    
    inline def apply(): IOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOptions]
    }
    
    extension [Self <: IOptions](x: Self) {
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      inline def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
      
      inline def setFlipNegate(value: Boolean): Self = StObject.set(x, "flipNegate", value.asInstanceOf[js.Any])
      
      inline def setFlipNegateUndefined: Self = StObject.set(x, "flipNegate", js.undefined)
      
      inline def setMatchBase(value: Boolean): Self = StObject.set(x, "matchBase", value.asInstanceOf[js.Any])
      
      inline def setMatchBaseUndefined: Self = StObject.set(x, "matchBase", js.undefined)
      
      inline def setNobrace(value: Boolean): Self = StObject.set(x, "nobrace", value.asInstanceOf[js.Any])
      
      inline def setNobraceUndefined: Self = StObject.set(x, "nobrace", js.undefined)
      
      inline def setNocase(value: Boolean): Self = StObject.set(x, "nocase", value.asInstanceOf[js.Any])
      
      inline def setNocaseUndefined: Self = StObject.set(x, "nocase", js.undefined)
      
      inline def setNocomment(value: Boolean): Self = StObject.set(x, "nocomment", value.asInstanceOf[js.Any])
      
      inline def setNocommentUndefined: Self = StObject.set(x, "nocomment", js.undefined)
      
      inline def setNoext(value: Boolean): Self = StObject.set(x, "noext", value.asInstanceOf[js.Any])
      
      inline def setNoextUndefined: Self = StObject.set(x, "noext", js.undefined)
      
      inline def setNoglobstar(value: Boolean): Self = StObject.set(x, "noglobstar", value.asInstanceOf[js.Any])
      
      inline def setNoglobstarUndefined: Self = StObject.set(x, "noglobstar", js.undefined)
      
      inline def setNonegate(value: Boolean): Self = StObject.set(x, "nonegate", value.asInstanceOf[js.Any])
      
      inline def setNonegateUndefined: Self = StObject.set(x, "nonegate", js.undefined)
      
      inline def setNonull(value: Boolean): Self = StObject.set(x, "nonull", value.asInstanceOf[js.Any])
      
      inline def setNonullUndefined: Self = StObject.set(x, "nonull", js.undefined)
      
      inline def setPartial(value: Boolean): Self = StObject.set(x, "partial", value.asInstanceOf[js.Any])
      
      inline def setPartialUndefined: Self = StObject.set(x, "partial", js.undefined)
      
      inline def setWindowsPathsNoEscape(value: Boolean): Self = StObject.set(x, "windowsPathsNoEscape", value.asInstanceOf[js.Any])
      
      inline def setWindowsPathsNoEscapeUndefined: Self = StObject.set(x, "windowsPathsNoEscape", js.undefined)
    }
  }
}
