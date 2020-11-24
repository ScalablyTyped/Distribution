package typings.picomatch.mod

import typings.picomatch.anon.CHAR0
import typings.picomatch.anon.Debug
import typings.picomatch.anon.IsMatch
import typings.picomatch.anon.MaxLength
import typings.picomatch.parseMod.State
import typings.std.RegExp
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Picomatch extends js.Object {
  
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
  def apply(glob: String, options: js.UndefOr[scala.Nothing], returnState: Boolean): Matcher = js.native
  def apply(glob: String, options: PicomatchOptions): Matcher = js.native
  def apply(glob: String, options: PicomatchOptions, returnState: Boolean): Matcher = js.native
  def apply(glob: js.Array[String]): Matcher = js.native
  def apply(glob: js.Array[String], options: js.UndefOr[scala.Nothing], returnState: Boolean): Matcher = js.native
  def apply(glob: js.Array[String], options: PicomatchOptions): Matcher = js.native
  def apply(glob: js.Array[String], options: PicomatchOptions, returnState: Boolean): Matcher = js.native
  
  def compileRe(state: ReturnType[js.Function2[/* input */ String, /* options */ MaxLength, State]]): RegExp = js.native
  def compileRe(
    state: ReturnType[js.Function2[/* input */ String, /* options */ MaxLength, State]],
    options: js.UndefOr[scala.Nothing],
    returnOutput: js.UndefOr[scala.Nothing],
    returnState: Boolean
  ): RegExp = js.native
  def compileRe(
    state: ReturnType[js.Function2[/* input */ String, /* options */ MaxLength, State]],
    options: js.UndefOr[scala.Nothing],
    returnOutput: Boolean
  ): RegExp = js.native
  def compileRe(
    state: ReturnType[js.Function2[/* input */ String, /* options */ MaxLength, State]],
    options: js.UndefOr[scala.Nothing],
    returnOutput: Boolean,
    returnState: Boolean
  ): RegExp = js.native
  def compileRe(
    state: ReturnType[js.Function2[/* input */ String, /* options */ MaxLength, State]],
    options: PicomatchOptions
  ): RegExp = js.native
  def compileRe(
    state: ReturnType[js.Function2[/* input */ String, /* options */ MaxLength, State]],
    options: PicomatchOptions,
    returnOutput: js.UndefOr[scala.Nothing],
    returnState: Boolean
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
  def makeRe(
    input: String,
    options: js.UndefOr[scala.Nothing],
    returnOutput: js.UndefOr[scala.Nothing],
    returnState: Boolean
  ): js.Function4[
    /* state */ ReturnType[js.Function2[/* input */ String, /* options */ MaxLength, State]], 
    /* options */ js.UndefOr[PicomatchOptions], 
    /* returnOutput */ js.UndefOr[Boolean], 
    /* returnState */ js.UndefOr[Boolean], 
    RegExp
  ] = js.native
  def makeRe(input: String, options: js.UndefOr[scala.Nothing], returnOutput: Boolean): js.Function4[
    /* state */ ReturnType[js.Function2[/* input */ String, /* options */ MaxLength, State]], 
    /* options */ js.UndefOr[PicomatchOptions], 
    /* returnOutput */ js.UndefOr[Boolean], 
    /* returnState */ js.UndefOr[Boolean], 
    RegExp
  ] = js.native
  def makeRe(input: String, options: js.UndefOr[scala.Nothing], returnOutput: Boolean, returnState: Boolean): js.Function4[
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
  def makeRe(
    input: String,
    options: PicomatchOptions,
    returnOutput: js.UndefOr[scala.Nothing],
    returnState: Boolean
  ): js.Function4[
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
  
  def matchBase(input: String, glob: String, options: js.Object): Boolean = js.native
  def matchBase(input: String, glob: String, options: js.Object, posix: js.Any): Boolean = js.native
  def matchBase(input: String, glob: RegExp, options: js.Object): Boolean = js.native
  def matchBase(input: String, glob: RegExp, options: js.Object, posix: js.Any): Boolean = js.native
  
  def parse(pattern: String, options: js.Object): js.Object = js.native
  
  def scan(input: String, options: js.Object): js.Object = js.native
  
  def test(input: String, regex: RegExp): IsMatch = js.native
  def test(input: String, regex: RegExp, options: js.UndefOr[scala.Nothing], test: js.Object): IsMatch = js.native
  def test(input: String, regex: RegExp, options: PicomatchOptions): IsMatch = js.native
  def test(input: String, regex: RegExp, options: PicomatchOptions, test: js.Object): IsMatch = js.native
  
  def toRegex(source: String): RegExp = js.native
  def toRegex(source: String, options: Debug): RegExp = js.native
  def toRegex(source: RegExp): RegExp = js.native
  def toRegex(source: RegExp, options: Debug): RegExp = js.native
}
