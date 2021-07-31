package typings.picomatch

import org.scalablytyped.runtime.Shortcut
import typings.picomatch.anon.CHAR0
import typings.picomatch.anon.Debug
import typings.picomatch.anon.IsMatch
import typings.picomatch.anon.MaxLength
import typings.picomatch.parseMod.State
import typings.std.RegExp
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("picomatch", JSImport.Namespace)
  @js.native
  val ^ : Picomatch = js.native
  
  type Matcher = js.Function1[/* test */ String, Boolean]
  
  @js.native
  trait Picomatch extends StObject {
    
    /**
      * Creates a matcher function from one or more glob patterns. The
      * returned function takes a string to match as its first argument,
      * and returns true if the string is a match. The returned matcher
      * function also takes a boolean as the second argument that, when true,
      * returns an object with additional information.
      *
      * ```js
      * const picomatch = require('picomatch');
      * // picomatch(glob[, options]);
      *
      * const isMatch = picomatch('*.!(*a)');
      * console.log(isMatch('a.a')); //=> false
      * console.log(isMatch('a.b')); //=> true
      * ```
      * @param glob One or more glob patterns.
      * @return Returns a matcher function.
      * @api public
      */
    def apply(glob: String): Matcher = js.native
    def apply(glob: String, options: Unit, returnState: Boolean): Matcher = js.native
    def apply(glob: String, options: PicomatchOptions): Matcher = js.native
    def apply(glob: String, options: PicomatchOptions, returnState: Boolean): Matcher = js.native
    def apply(glob: js.Array[String]): Matcher = js.native
    def apply(glob: js.Array[String], options: Unit, returnState: Boolean): Matcher = js.native
    def apply(glob: js.Array[String], options: PicomatchOptions): Matcher = js.native
    def apply(glob: js.Array[String], options: PicomatchOptions, returnState: Boolean): Matcher = js.native
    
    def compileRe(state: ReturnType[js.Function2[/* input */ String, /* options */ MaxLength, State]]): RegExp = js.native
    def compileRe(
      state: ReturnType[js.Function2[/* input */ String, /* options */ MaxLength, State]],
      options: Unit,
      returnOutput: Boolean
    ): RegExp = js.native
    def compileRe(
      state: ReturnType[js.Function2[/* input */ String, /* options */ MaxLength, State]],
      options: Unit,
      returnOutput: Boolean,
      returnState: Boolean
    ): RegExp = js.native
    def compileRe(
      state: ReturnType[js.Function2[/* input */ String, /* options */ MaxLength, State]],
      options: Unit,
      returnOutput: Unit,
      returnState: Boolean
    ): RegExp = js.native
    def compileRe(
      state: ReturnType[js.Function2[/* input */ String, /* options */ MaxLength, State]],
      options: PicomatchOptions
    ): RegExp = js.native
    def compileRe(
      state: ReturnType[js.Function2[/* input */ String, /* options */ MaxLength, State]],
      options: PicomatchOptions,
      returnOutput: Boolean
    ): RegExp = js.native
    def compileRe(
      state: ReturnType[js.Function2[/* input */ String, /* options */ MaxLength, State]],
      options: PicomatchOptions,
      returnOutput: Boolean,
      returnState: Boolean
    ): RegExp = js.native
    def compileRe(
      state: ReturnType[js.Function2[/* input */ String, /* options */ MaxLength, State]],
      options: PicomatchOptions,
      returnOutput: Unit,
      returnState: Boolean
    ): RegExp = js.native
    
    var constants: CHAR0 = js.native
    
    def isMatch(str: String, patterns: String): Boolean = js.native
    def isMatch(str: String, patterns: String, options: js.Object): Boolean = js.native
    def isMatch(str: String, patterns: js.Array[String]): Boolean = js.native
    def isMatch(str: String, patterns: js.Array[String], options: js.Object): Boolean = js.native
    def isMatch(str: js.Array[String], patterns: String): Boolean = js.native
    def isMatch(str: js.Array[String], patterns: String, options: js.Object): Boolean = js.native
    def isMatch(str: js.Array[String], patterns: js.Array[String]): Boolean = js.native
    def isMatch(str: js.Array[String], patterns: js.Array[String], options: js.Object): Boolean = js.native
    
    def makeRe(input: String): js.Function4[
        /* state */ ReturnType[js.Function2[/* input */ String, /* options */ MaxLength, State]], 
        /* options */ js.UndefOr[PicomatchOptions], 
        /* returnOutput */ js.UndefOr[Boolean], 
        /* returnState */ js.UndefOr[Boolean], 
        RegExp
      ] = js.native
    def makeRe(input: String, options: Unit, returnOutput: Boolean): js.Function4[
        /* state */ ReturnType[js.Function2[/* input */ String, /* options */ MaxLength, State]], 
        /* options */ js.UndefOr[PicomatchOptions], 
        /* returnOutput */ js.UndefOr[Boolean], 
        /* returnState */ js.UndefOr[Boolean], 
        RegExp
      ] = js.native
    def makeRe(input: String, options: Unit, returnOutput: Boolean, returnState: Boolean): js.Function4[
        /* state */ ReturnType[js.Function2[/* input */ String, /* options */ MaxLength, State]], 
        /* options */ js.UndefOr[PicomatchOptions], 
        /* returnOutput */ js.UndefOr[Boolean], 
        /* returnState */ js.UndefOr[Boolean], 
        RegExp
      ] = js.native
    def makeRe(input: String, options: Unit, returnOutput: Unit, returnState: Boolean): js.Function4[
        /* state */ ReturnType[js.Function2[/* input */ String, /* options */ MaxLength, State]], 
        /* options */ js.UndefOr[PicomatchOptions], 
        /* returnOutput */ js.UndefOr[Boolean], 
        /* returnState */ js.UndefOr[Boolean], 
        RegExp
      ] = js.native
    def makeRe(input: String, options: PicomatchOptions): js.Function4[
        /* state */ ReturnType[js.Function2[/* input */ String, /* options */ MaxLength, State]], 
        /* options */ js.UndefOr[PicomatchOptions], 
        /* returnOutput */ js.UndefOr[Boolean], 
        /* returnState */ js.UndefOr[Boolean], 
        RegExp
      ] = js.native
    def makeRe(input: String, options: PicomatchOptions, returnOutput: Boolean): js.Function4[
        /* state */ ReturnType[js.Function2[/* input */ String, /* options */ MaxLength, State]], 
        /* options */ js.UndefOr[PicomatchOptions], 
        /* returnOutput */ js.UndefOr[Boolean], 
        /* returnState */ js.UndefOr[Boolean], 
        RegExp
      ] = js.native
    def makeRe(input: String, options: PicomatchOptions, returnOutput: Boolean, returnState: Boolean): js.Function4[
        /* state */ ReturnType[js.Function2[/* input */ String, /* options */ MaxLength, State]], 
        /* options */ js.UndefOr[PicomatchOptions], 
        /* returnOutput */ js.UndefOr[Boolean], 
        /* returnState */ js.UndefOr[Boolean], 
        RegExp
      ] = js.native
    def makeRe(input: String, options: PicomatchOptions, returnOutput: Unit, returnState: Boolean): js.Function4[
        /* state */ ReturnType[js.Function2[/* input */ String, /* options */ MaxLength, State]], 
        /* options */ js.UndefOr[PicomatchOptions], 
        /* returnOutput */ js.UndefOr[Boolean], 
        /* returnState */ js.UndefOr[Boolean], 
        RegExp
      ] = js.native
    
    def matchBase(input: String, glob: String, options: js.Object): Boolean = js.native
    def matchBase(input: String, glob: String, options: js.Object, posix: js.Any): Boolean = js.native
    def matchBase(input: String, glob: RegExp, options: js.Object): Boolean = js.native
    def matchBase(input: String, glob: RegExp, options: js.Object, posix: js.Any): Boolean = js.native
    
    def parse(pattern: String, options: js.Object): js.Object = js.native
    
    def scan(input: String, options: js.Object): js.Object = js.native
    
    def test(input: String, regex: RegExp): IsMatch = js.native
    def test(input: String, regex: RegExp, options: Unit, test: js.Object): IsMatch = js.native
    def test(input: String, regex: RegExp, options: PicomatchOptions): IsMatch = js.native
    def test(input: String, regex: RegExp, options: PicomatchOptions, test: js.Object): IsMatch = js.native
    
    def toRegex(source: String): RegExp = js.native
    def toRegex(source: String, options: Debug): RegExp = js.native
    def toRegex(source: RegExp): RegExp = js.native
    def toRegex(source: RegExp, options: Debug): RegExp = js.native
  }
  
  trait PicomatchOptions extends StObject {
    
    var contains: js.UndefOr[Boolean] = js.undefined
    
    var dot: js.UndefOr[Boolean] = js.undefined
    
    var format: js.UndefOr[js.Function1[/* input */ String, String]] = js.undefined
    
    var ignore: js.UndefOr[String] = js.undefined
    
    var onIgnore: js.UndefOr[js.Function1[/* result */ Result, Unit]] = js.undefined
    
    var onMatch: js.UndefOr[js.Function1[/* result */ Result, Unit]] = js.undefined
    
    var onResult: js.UndefOr[js.Function1[/* result */ Result, Unit]] = js.undefined
    
    var windows: js.UndefOr[Boolean] = js.undefined
  }
  object PicomatchOptions {
    
    @scala.inline
    def apply(): PicomatchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PicomatchOptions]
    }
    
    @scala.inline
    implicit class PicomatchOptionsMutableBuilder[Self <: PicomatchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContains(value: Boolean): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
      
      @scala.inline
      def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
      
      @scala.inline
      def setFormat(value: /* input */ String => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setIgnore(value: String): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setOnIgnore(value: /* result */ Result => Unit): Self = StObject.set(x, "onIgnore", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnIgnoreUndefined: Self = StObject.set(x, "onIgnore", js.undefined)
      
      @scala.inline
      def setOnMatch(value: /* result */ Result => Unit): Self = StObject.set(x, "onMatch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMatchUndefined: Self = StObject.set(x, "onMatch", js.undefined)
      
      @scala.inline
      def setOnResult(value: /* result */ Result => Unit): Self = StObject.set(x, "onResult", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResultUndefined: Self = StObject.set(x, "onResult", js.undefined)
      
      @scala.inline
      def setWindows(value: Boolean): Self = StObject.set(x, "windows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowsUndefined: Self = StObject.set(x, "windows", js.undefined)
    }
  }
  
  trait Result extends StObject {
    
    var glob: String
    
    var input: String
    
    var isMatch: /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<(input : string, regex : std.RegExp, options : picomatch.picomatch.PicomatchOptions | undefined, test : {} | undefined): picomatch.anon.IsMatch>['isMatch'] */ js.Any
    
    var `match`: /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<(input : string, regex : std.RegExp, options : picomatch.picomatch.PicomatchOptions | undefined, test : {} | undefined): picomatch.anon.IsMatch>['match'] */ js.Any
    
    var output: String
    
    var posix: Boolean
    
    var regex: RegExp
    
    var state: js.Any
  }
  object Result {
    
    @scala.inline
    def apply(
      glob: String,
      input: String,
      isMatch: /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<(input : string, regex : std.RegExp, options : picomatch.picomatch.PicomatchOptions | undefined, test : {} | undefined): picomatch.anon.IsMatch>['isMatch'] */ js.Any,
      `match`: /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<(input : string, regex : std.RegExp, options : picomatch.picomatch.PicomatchOptions | undefined, test : {} | undefined): picomatch.anon.IsMatch>['match'] */ js.Any,
      output: String,
      posix: Boolean,
      regex: RegExp,
      state: js.Any
    ): Result = {
      val __obj = js.Dynamic.literal(glob = glob.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], isMatch = isMatch.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], posix = posix.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlob(value: String): Self = StObject.set(x, "glob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMatch(
        value: /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<(input : string, regex : std.RegExp, options : picomatch.picomatch.PicomatchOptions | undefined, test : {} | undefined): picomatch.anon.IsMatch>['isMatch'] */ js.Any
      ): Self = StObject.set(x, "isMatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatch(
        value: /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<(input : string, regex : std.RegExp, options : picomatch.picomatch.PicomatchOptions | undefined, test : {} | undefined): picomatch.anon.IsMatch>['match'] */ js.Any
      ): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosix(value: Boolean): Self = StObject.set(x, "posix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegex(value: RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: js.Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Picomatch
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Picomatch = ^
}
