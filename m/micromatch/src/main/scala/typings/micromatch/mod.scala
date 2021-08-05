package typings.micromatch

import org.scalablytyped.runtime.Shortcut
import typings.micromatch.anon.partstrueScanOptions
import typings.micromatch.anon.tokenstrueScanOptions
import typings.std.Partial
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("micromatch", JSImport.Namespace)
  @js.native
  val ^ : Micromatch = js.native
  
  trait Item extends StObject {
    
    var glob: String
    
    var input: String
    
    var output: String
    
    var regex: RegExp
  }
  object Item {
    
    inline def apply(glob: String, input: String, output: String, regex: RegExp): Item = {
      val __obj = js.Dynamic.literal(glob = glob.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any])
      __obj.asInstanceOf[Item]
    }
    
    extension [Self <: Item](x: Self) {
      
      inline def setGlob(value: String): Self = StObject.set(x, "glob", value.asInstanceOf[js.Any])
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setRegex(value: RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Micromatch extends StObject {
    
    /**
      * The main function takes a list of strings and one or more glob patterns to use for matching.
      *
      * @param list A list of strings to match
      * @param patterns One or more glob patterns to use for matching.
      * @param options See available options for changing how matches are performed
      * @returns Returns an array of matches
      *
      * @example
      * ```js
      * var mm = require('micromatch');
      * mm(list, patterns[, options]);
      *
      * console.log(mm(['a.js', 'a.txt'], ['*.js']));
      * //=> [ 'a.js' ]
      * ```
      */
    def apply(list: js.Array[String], patterns: String): js.Array[String] = js.native
    def apply(list: js.Array[String], patterns: String, options: Options): js.Array[String] = js.native
    def apply(list: js.Array[String], patterns: js.Array[String]): js.Array[String] = js.native
    def apply(list: js.Array[String], patterns: js.Array[String], options: Options): js.Array[String] = js.native
    
    /**
      * Returns true if **all** of the given `patterns` match the specified string.
      *
      * @param str The string to test.
      * @param patterns One or more glob patterns to use for matching.
      * @param options See available options for changing how matches are performed
      * @returns Returns true if any patterns match `str`
      *
      * @example
      * ```js
      * var mm = require('micromatch');
      * mm.all(string, patterns[, options]);
      *
      * console.log(mm.all('foo.js', ['foo.js']));
      * // true
      *
      * console.log(mm.all('foo.js', ['*.js', '!foo.js']));
      * // false
      *
      * console.log(mm.all('foo.js', ['*.js', 'foo.js']));
      * // true
      *
      * console.log(mm.all('foo.js', ['*.js', 'f*', '*o*', '*o.js']));
      * // true
      * ```
      */
    def all(str: String, patterns: String): Boolean = js.native
    def all(str: String, patterns: String, options: Options): Boolean = js.native
    def all(str: String, patterns: js.Array[String]): Boolean = js.native
    def all(str: String, patterns: js.Array[String], options: Options): Boolean = js.native
    def all(str: js.Array[String], patterns: String): Boolean = js.native
    def all(str: js.Array[String], patterns: String, options: Options): Boolean = js.native
    def all(str: js.Array[String], patterns: js.Array[String]): Boolean = js.native
    def all(str: js.Array[String], patterns: js.Array[String], options: Options): Boolean = js.native
    
    /**
      * Returns true if **any** of the given glob `patterns` match the specified `string`.
      *
      * @param str The string to test.
      * @param patterns One or more glob patterns to use for matching.
      * @param options See available options for changing how matches are performed
      * @returns Returns true if any patterns match `str`
      *
      * @example
      * ```js
      * var mm = require('micromatch');
      * mm.any(string, patterns[, options]);
      *
      * console.log(mm.any('a.a', ['b.*', '*.a']));
      * //=> true
      * console.log(mm.any('a.a', 'b.*'));
      * //=> false
      * ```
      */
    def any(str: String, patterns: String): Boolean = js.native
    def any(str: String, patterns: String, options: Options): Boolean = js.native
    def any(str: String, patterns: js.Array[String]): Boolean = js.native
    def any(str: String, patterns: js.Array[String], options: Options): Boolean = js.native
    def any(str: js.Array[String], patterns: String): Boolean = js.native
    def any(str: js.Array[String], patterns: String, options: Options): Boolean = js.native
    def any(str: js.Array[String], patterns: js.Array[String]): Boolean = js.native
    def any(str: js.Array[String], patterns: js.Array[String], options: Options): Boolean = js.native
    
    /**
      * Expand the given brace `pattern`.
      *
      * @param pattern String with brace pattern to expand.
      * @param options Any options to change how expansion is performed. See the [braces](https://github.com/micromatch/braces) library for all available options.
      *
      * @example
      * ```js
      * var mm = require('micromatch');
      * console.log(mm.braces('foo/{a,b}/bar'));
      * //=> ['foo/(a|b)/bar']
      *
      * console.log(mm.braces('foo/{a,b}/bar', {expand: true}));
      * //=> ['foo/(a|b)/bar']
      * ```
      */
    def braces(pattern: String): js.Array[String] = js.native
    def braces(pattern: String, options: typings.braces.mod.Options): js.Array[String] = js.native
    
    /**
      * Returns an array of matches captured by `pattern` in `string, or`null` if the pattern did not match.
      *
      * @param pattern Glob pattern to use for matching.
      * @param string String to match
      * @param options See available options for changing how matches are performed
      * @returns Returns an array of captures if the string matches the glob pattern, otherwise `null`.
      *
      * @example
      * ```js
      * var mm = require('micromatch');
      * mm.capture(pattern, string[, options]);
      *
      * console.log(mm.capture('test/ *.js', 'test/foo.js'));
      * //=> ['foo']
      * console.log(mm.capture('test/ *.js', 'foo/bar.css'));
      * //=> null
      * ```
      */
    def capture(pattern: String, string: String): js.Array[String] | Null = js.native
    def capture(pattern: String, string: String, options: Options): js.Array[String] | Null = js.native
    
    /**
      * Returns true if the given `string` contains the given pattern. Similar to [.isMatch](#isMatch) but the pattern can match any part of the string.
      *
      * @param str The string to match.
      * @param patterns Glob pattern to use for matching.
      * @param options See available options for changing how matches are performed
      * @returns Returns true if the patter matches any part of `str`.
      *
      * @example
      * ```js
      * var mm = require('micromatch');
      * mm.contains(string, pattern[, options]);
      *
      * console.log(mm.contains('aa/bb/cc', '*b'));
      * //=> true
      * console.log(mm.contains('aa/bb/cc', '*d'));
      * //=> false
      * ```
      */
    def contains(str: String, patterns: String): Boolean = js.native
    def contains(str: String, patterns: String, options: Options): Boolean = js.native
    def contains(str: String, patterns: js.Array[String]): Boolean = js.native
    def contains(str: String, patterns: js.Array[String], options: Options): Boolean = js.native
    
    /**
      * Returns true if every string in the given `list` matches any of the given glob `patterns`.
      *
      * @param list The string or array of strings to test.
      * @param patterns One or more glob patterns to use for matching.
      * @param options See available options for changing how matches are performed
      * @returns Returns true if any patterns match `str`
      *
      * @example
      * ```js
      * var mm = require('micromatch');
      * mm.every(list, patterns[, options]);
      *
      * console.log(mm.every('foo.js', ['foo.js']));
      * // true
      * console.log(mm.every(['foo.js', 'bar.js'], ['*.js']));
      * // true
      * console.log(mm.every(['foo.js', 'bar.js'], ['*.js', '!foo.js']));
      * // false
      * console.log(mm.every(['foo.js'], ['*.js', '!foo.js']));
      * // false
      * ```
      */
    def every(list: String, patterns: String): Boolean = js.native
    def every(list: String, patterns: String, options: Options): Boolean = js.native
    def every(list: String, patterns: js.Array[String]): Boolean = js.native
    def every(list: String, patterns: js.Array[String], options: Options): Boolean = js.native
    def every(list: js.Array[String], patterns: String): Boolean = js.native
    def every(list: js.Array[String], patterns: String, options: Options): Boolean = js.native
    def every(list: js.Array[String], patterns: js.Array[String]): Boolean = js.native
    def every(list: js.Array[String], patterns: js.Array[String], options: Options): Boolean = js.native
    
    /**
      * Returns true if the specified `string` matches the given glob `pattern`.
      *
      * @param string String to match
      * @param pattern Glob pattern to use for matching.
      * @param options See available options for changing how matches are performed
      * @returns Returns true if the string matches the glob pattern.
      *
      * @example
      * ```js
      * var mm = require('micromatch');
      * mm.isMatch(string, pattern[, options]);
      *
      * console.log(mm.isMatch('a.a', '*.a'));
      * //=> true
      * console.log(mm.isMatch('a.b', '*.a'));
      * //=> false
      * ```
      */
    def isMatch(string: String, pattern: String): Boolean = js.native
    def isMatch(string: String, pattern: String, options: Options): Boolean = js.native
    def isMatch(string: String, pattern: js.Array[String]): Boolean = js.native
    def isMatch(string: String, pattern: js.Array[String], options: Options): Boolean = js.native
    
    /**
      * Create a regular expression from the given glob `pattern`.
      *
      * @param pattern A glob pattern to convert to regex.
      * @param options See available options for changing how matches are performed.
      * @returns Returns a regex created from the given pattern.
      *
      * @example
      * ```js
      * var mm = require('micromatch');
      * mm.makeRe(pattern[, options]);
      *
      * console.log(mm.makeRe('*.js'));
      * //=> /^(?:(\.[\\\/])?(?!\.)(?=.)[^\/]*?\.js)$/
      * ```
      */
    def makeRe(pattern: String): RegExp = js.native
    def makeRe(pattern: String, options: Options): RegExp = js.native
    
    /**
      * Similar to the main function, but `pattern` must be a string.
      *
      * @param list Array of strings to match
      * @param pattern Glob pattern to use for matching.
      * @param options See available options for changing how matches are performed
      * @returns Returns an array of matches
      *
      * @example
      * ```js
      * var mm = require('micromatch');
      * mm.match(list, pattern[, options]);
      *
      * console.log(mm.match(['a.a', 'a.aa', 'a.b', 'a.c'], '*.a'));
      * //=> ['a.a', 'a.aa']
      * ```
      */
    def `match`(list: js.Array[String], pattern: String): js.Array[String] = js.native
    def `match`(list: js.Array[String], pattern: String, options: Options): js.Array[String] = js.native
    
    /**
      * Filter the keys of the given object with the given `glob` pattern and `options`. Does not attempt to match nested keys.
      * If you need this feature, use [glob-object](https://github.com/jonschlinkert/glob-object) instead.
      *
      * @param object The object with keys to filter.
      * @param patterns One or more glob patterns to use for matching.
      * @param options See available options for changing how matches are performed
      * @returns Returns an object with only keys that match the given patterns.
      *
      * @example
      * ```js
      * var mm = require('micromatch');
      * mm.matchKeys(object, patterns[, options]);
      *
      * var obj = { aa: 'a', ab: 'b', ac: 'c' };
      * console.log(mm.matchKeys(obj, '*b'));
      * //=> { ab: 'b' }
      * ```
      */
    def matchKeys[T](`object`: T, patterns: String): Partial[T] = js.native
    def matchKeys[T](`object`: T, patterns: String, options: Options): Partial[T] = js.native
    def matchKeys[T](`object`: T, patterns: js.Array[String]): Partial[T] = js.native
    def matchKeys[T](`object`: T, patterns: js.Array[String], options: Options): Partial[T] = js.native
    
    /**
      * Returns a memoized matcher function from the given glob `pattern` and `options`. The returned function takes a string to match as its only argument and returns true if the string is a match.
      *
      * @param pattern Glob pattern
      * @param options See available options for changing how matches are performed.
      * @returns Returns a matcher function.
      *
      * @example
      * ```js
      * var mm = require('micromatch');
      * mm.matcher(pattern[, options]);
      *
      * var isMatch = mm.matcher('*.!(*a)');
      * console.log(isMatch('a.a'));
      * //=> false
      * console.log(isMatch('a.b'));
      * //=> true
      * ```
      */
    def matcher(pattern: String): js.Function1[/* str */ String, Boolean] = js.native
    def matcher(pattern: String, options: Options): js.Function1[/* str */ String, Boolean] = js.native
    
    /**
      * Returns a list of strings that _**do not match any**_ of the given `patterns`.
      *
      * @param list Array of strings to match.
      * @param patterns One or more glob pattern to use for matching.
      * @param options See available options for changing how matches are performed
      * @returns Returns an array of strings that **do not match** the given patterns.
      *
      * @example
      * ```js
      * var mm = require('micromatch');
      * mm.not(list, patterns[, options]);
      *
      * console.log(mm.not(['a.a', 'b.b', 'c.c'], '*.a'));
      * //=> ['b.b', 'c.c']
      * ```
      */
    def not(list: js.Array[String], patterns: String): js.Array[String] = js.native
    def not(list: js.Array[String], patterns: String, options: Options): js.Array[String] = js.native
    def not(list: js.Array[String], patterns: js.Array[String]): js.Array[String] = js.native
    def not(list: js.Array[String], patterns: js.Array[String], options: Options): js.Array[String] = js.native
    
    /**
      * Parse a glob pattern to create the source string for a regular expression.
      *
      * @returns Returns an AST
      *
      * @example
      * ```js
      * var mm = require('micromatch');
      * mm.parse(pattern[, options]);
      *
      * var ast = mm.parse('a/{b,c}/d');
      * console.log(ast);
      * // { type: 'root',
      * //   errors: [],
      * //   input: 'a/{b,c}/d',
      * //   nodes:
      * //    [ { type: 'bos', val: '' },
      * //      { type: 'text', val: 'a/' },
      * //      { type: 'brace',
      * //        nodes:
      * //         [ { type: 'brace.open', val: '{' },
      * //           { type: 'text', val: 'b,c' },
      * //           { type: 'brace.close', val: '}' } ] },
      * //      { type: 'text', val: '/d' },
      * //      { type: 'eos', val: '' } ] }
      * ```
      */
    def parse(glob: String): js.Object = js.native
    def parse(glob: String, options: Options): js.Object = js.native
    
    def scan(pattern: String): ScanInfo = js.native
    /**
      * Scan a glob pattern to separate the pattern into segments.
      */
    def scan(pattern: String, options: partstrueScanOptions): ScanInfoWithParts = js.native
    def scan(pattern: String, options: tokenstrueScanOptions): ScanInfoWithTokens = js.native
    def scan(pattern: String, options: ScanOptions): ScanInfo = js.native
    
    /**
      * Returns true if some of the strings in the given `list` match any of the given glob `patterns`.
      *
      * @param list The string or array of strings to test. Returns as soon as the first match is found.
      * @param patterns One or more glob patterns to use for matching.
      * @param options See available options for changing how matches are performed
      * @returns Returns true if any patterns match `str`
      *
      * @example
      * ```js
      * var mm = require('micromatch');
      * mm.some(list, patterns[, options]);
      *
      * console.log(mm.some(['foo.js', 'bar.js'], ['*.js', '!foo.js']));
      * // true
      * console.log(mm.some(['foo.js'], ['*.js', '!foo.js']));
      * // false
      * ```
      */
    def some(list: String, patterns: String): Boolean = js.native
    def some(list: String, patterns: String, options: Options): Boolean = js.native
    def some(list: String, patterns: js.Array[String]): Boolean = js.native
    def some(list: String, patterns: js.Array[String], options: Options): Boolean = js.native
    def some(list: js.Array[String], patterns: String): Boolean = js.native
    def some(list: js.Array[String], patterns: String, options: Options): Boolean = js.native
    def some(list: js.Array[String], patterns: js.Array[String]): Boolean = js.native
    def some(list: js.Array[String], patterns: js.Array[String], options: Options): Boolean = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * Allow glob patterns without slashes to match a file path based on its basename. Same behavior as [minimatch](https://github.com/isaacs/minimatch) option `matchBase`.
      *
      * @default false
      *
      * @example
      * ```js
      * mm(['a/b.js', 'a/c.md'], '*.js');
      * //=> []
      *
      * mm(['a/b.js', 'a/c.md'], '*.js', {matchBase: true});
      * //=> ['a/b.js']
      * ```
      */
    var basename: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enabled by default, this option enforces bash-like behavior with stars immediately following a bracket expression.
      * Bash bracket expressions are similar to regex character classes, but unlike regex, a star following a bracket expression **does not repeat the bracketed characters**.
      * Instead, the star is treated the same as an other star.
      *
      * @default true
      *
      * @example
      * ```js
      * var files = ['abc', 'ajz'];
      * console.log(mm(files, '[a-c]*'));
      * //=> ['abc', 'ajz']
      *
      * console.log(mm(files, '[a-c]*', {bash: false}));
      * ```
      */
    var bash: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Return regex matches in supporting methods.
      *
      * @default undefined
      */
    var capture: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allows glob to match any part of the given string(s).
      *
      * @default undefined
      */
    var contains: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Current working directory. Used by `picomatch.split()`
      *
      * @default process.cwd()
      */
    var cwd: js.UndefOr[String] = js.undefined
    
    /**
      * Debug regular expressions when an error is thrown.
      *
      * @default undefined
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Match dotfiles. Otherwise dotfiles are ignored unless a `.` is explicitly defined in the pattern.
      *
      * @default false
      */
    var dot: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Custom function for expanding ranges in brace patterns, such as `{a..z}`.
      * The function receives the range values as two arguments, and it must return a string to be used in the generated regex.
      * It's recommended that returned strings be wrapped in parentheses. This option is overridden by the expandBrace option.
      *
      * @default undefined
      */
    var expandRange: js.UndefOr[
        js.Function3[/* left */ String, /* right */ String, /* options */ this.type, String]
      ] = js.undefined
    
    /**
      * Similar to the `--failglob` behavior in Bash, throws an error when no matches are found.
      *
      * @default false
      */
    var failglob: js.UndefOr[Boolean] = js.undefined
    
    /**
      * To speed up processing, full parsing is skipped for a handful common glob patterns. Disable this behavior by setting this option to false.
      *
      * @default true
      */
    var fastpaths: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Regex flags to use in the generated regex. If defined, the `nocase` option will be overridden.
      *
      * @default undefined
      */
    var flags: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Custom function for formatting the returned string. This is useful for removing leading slashes, converting Windows paths to Posix paths, etc.
      *
      * @default undefined
      */
    var format: js.UndefOr[js.Function1[/* returnedString */ String, String]] = js.undefined
    
    /**
      * One or more glob patterns for excluding strings that should not be matched from the result.
      *
      * @default undefined
      */
    var ignore: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * Retain quotes in the generated regex, since quotes may also be used as an alternative to backslashes.
      *
      * @default false
      */
    var keepQuotes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When `true`, brackets in the glob pattern will be escaped so that only literal brackets will be matched.
      *
      * @default undefined
      */
    var literalBrackets: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Support regex positive and negative lookbehinds. Note that you must be using Node 8.1.10 or higher to enable regex lookbehinds.
      *
      * @default true
      */
    var lookbehinds: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Alias for `basename`.
      *
      * @default false
      */
    var matchBase: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Limit the max length of the input string. An error is thrown if the input string is longer than this value.
      *
      * @default 65536
      */
    var maxLength: js.UndefOr[Double] = js.undefined
    
    /**
      * Disable brace matching, so that `{a,b}` and `{1..3}` would be treated as literal characters.
      *
      * @default false
      */
    var nobrace: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disable matching with regex brackets.
      *
      * @default undefined
      */
    var nobracket: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Perform case-insensitive matching. Equivalent to the regex `i` flag.
      * Note that this option is ignored when the `flags` option is defined.
      *
      * @default false
      */
    var nocase: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Alias for `noextglob`
      *
      * @default false
      */
    var noext: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disable support for matching with extglobs (like `+(a|b)`)
      *
      * @default false
      */
    var noextglob: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disable matching with globstars (`**`).
      *
      * @default undefined
      */
    var noglobstar: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disallow negation (`!`) patterns, and treat leading `!` as a literal character to match.
      *
      * @default undefined
      */
    var nonegate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disable support for regex quantifiers (like `a{1,2}`) and treat them as brace patterns to be expanded.
      *
      * @default false
      */
    var noquantifiers: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Function to be called on ignored items.
      *
      * @default undefined
      */
    var onIgnore: js.UndefOr[js.Function1[/* item */ Item, Unit]] = js.undefined
    
    /**
      * Function to be called on matched items.
      *
      * @default undefined
      */
    var onMatch: js.UndefOr[js.Function1[/* item */ Item, Unit]] = js.undefined
    
    /**
      * Function to be called on all items, regardless of whether or not they are matched or ignored.
      *
      * @default undefined
      */
    var onResult: js.UndefOr[js.Function1[/* item */ Item, Unit]] = js.undefined
    
    /**
      * Support POSIX character classes ("posix brackets").
      *
      * @default false
      */
    var posix: js.UndefOr[Boolean] = js.undefined
    
    /**
      * String to prepend to the generated regex used for matching.
      *
      * @default undefined
      */
    var prepend: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Use regular expression rules for `+` (instead of matching literal `+`), and for stars that follow closing parentheses or brackets (as in `)*` and `]*`).
      *
      * @default false
      */
    var regex: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Throw an error if brackets, braces, or parens are imbalanced.
      *
      * @default undefined
      */
    var strictBrackets: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When true, picomatch won't match trailing slashes with single stars.
      *
      * @default undefined
      */
    var strictSlashes: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Remove backslashes from returned matches.
      *
      * @default undefined
      *
      * @example
      * In this example we want to match a literal `*`:
      *
      * ```js
      * mm.match(['abc', 'a\\*c'], 'a\\*c');
      * //=> ['a\\*c']
      *
      * mm.match(['abc', 'a\\*c'], 'a\\*c', {unescape: true});
      * //=> ['a*c']
      * ```
      */
    var unescape: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Convert all slashes in file paths to forward slashes. This does not convert slashes in the glob pattern itself
      *
      * @default undefined
      */
    var windows: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBasename(value: Boolean): Self = StObject.set(x, "basename", value.asInstanceOf[js.Any])
      
      inline def setBasenameUndefined: Self = StObject.set(x, "basename", js.undefined)
      
      inline def setBash(value: Boolean): Self = StObject.set(x, "bash", value.asInstanceOf[js.Any])
      
      inline def setBashUndefined: Self = StObject.set(x, "bash", js.undefined)
      
      inline def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      inline def setContains(value: Boolean): Self = StObject.set(x, "contains", value.asInstanceOf[js.Any])
      
      inline def setContainsUndefined: Self = StObject.set(x, "contains", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDot(value: Boolean): Self = StObject.set(x, "dot", value.asInstanceOf[js.Any])
      
      inline def setDotUndefined: Self = StObject.set(x, "dot", js.undefined)
      
      inline def setExpandRange(value: (/* left */ String, /* right */ String, Options) => String): Self = StObject.set(x, "expandRange", js.Any.fromFunction3(value))
      
      inline def setExpandRangeUndefined: Self = StObject.set(x, "expandRange", js.undefined)
      
      inline def setFailglob(value: Boolean): Self = StObject.set(x, "failglob", value.asInstanceOf[js.Any])
      
      inline def setFailglobUndefined: Self = StObject.set(x, "failglob", js.undefined)
      
      inline def setFastpaths(value: Boolean): Self = StObject.set(x, "fastpaths", value.asInstanceOf[js.Any])
      
      inline def setFastpathsUndefined: Self = StObject.set(x, "fastpaths", js.undefined)
      
      inline def setFlags(value: Boolean): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      inline def setFormat(value: /* returnedString */ String => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setIgnore(value: String | js.Array[String]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: String*): Self = StObject.set(x, "ignore", js.Array(value :_*))
      
      inline def setKeepQuotes(value: Boolean): Self = StObject.set(x, "keepQuotes", value.asInstanceOf[js.Any])
      
      inline def setKeepQuotesUndefined: Self = StObject.set(x, "keepQuotes", js.undefined)
      
      inline def setLiteralBrackets(value: Boolean): Self = StObject.set(x, "literalBrackets", value.asInstanceOf[js.Any])
      
      inline def setLiteralBracketsUndefined: Self = StObject.set(x, "literalBrackets", js.undefined)
      
      inline def setLookbehinds(value: Boolean): Self = StObject.set(x, "lookbehinds", value.asInstanceOf[js.Any])
      
      inline def setLookbehindsUndefined: Self = StObject.set(x, "lookbehinds", js.undefined)
      
      inline def setMatchBase(value: Boolean): Self = StObject.set(x, "matchBase", value.asInstanceOf[js.Any])
      
      inline def setMatchBaseUndefined: Self = StObject.set(x, "matchBase", js.undefined)
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setNobrace(value: Boolean): Self = StObject.set(x, "nobrace", value.asInstanceOf[js.Any])
      
      inline def setNobraceUndefined: Self = StObject.set(x, "nobrace", js.undefined)
      
      inline def setNobracket(value: Boolean): Self = StObject.set(x, "nobracket", value.asInstanceOf[js.Any])
      
      inline def setNobracketUndefined: Self = StObject.set(x, "nobracket", js.undefined)
      
      inline def setNocase(value: Boolean): Self = StObject.set(x, "nocase", value.asInstanceOf[js.Any])
      
      inline def setNocaseUndefined: Self = StObject.set(x, "nocase", js.undefined)
      
      inline def setNoext(value: Boolean): Self = StObject.set(x, "noext", value.asInstanceOf[js.Any])
      
      inline def setNoextUndefined: Self = StObject.set(x, "noext", js.undefined)
      
      inline def setNoextglob(value: Boolean): Self = StObject.set(x, "noextglob", value.asInstanceOf[js.Any])
      
      inline def setNoextglobUndefined: Self = StObject.set(x, "noextglob", js.undefined)
      
      inline def setNoglobstar(value: Boolean): Self = StObject.set(x, "noglobstar", value.asInstanceOf[js.Any])
      
      inline def setNoglobstarUndefined: Self = StObject.set(x, "noglobstar", js.undefined)
      
      inline def setNonegate(value: Boolean): Self = StObject.set(x, "nonegate", value.asInstanceOf[js.Any])
      
      inline def setNonegateUndefined: Self = StObject.set(x, "nonegate", js.undefined)
      
      inline def setNoquantifiers(value: Boolean): Self = StObject.set(x, "noquantifiers", value.asInstanceOf[js.Any])
      
      inline def setNoquantifiersUndefined: Self = StObject.set(x, "noquantifiers", js.undefined)
      
      inline def setOnIgnore(value: /* item */ Item => Unit): Self = StObject.set(x, "onIgnore", js.Any.fromFunction1(value))
      
      inline def setOnIgnoreUndefined: Self = StObject.set(x, "onIgnore", js.undefined)
      
      inline def setOnMatch(value: /* item */ Item => Unit): Self = StObject.set(x, "onMatch", js.Any.fromFunction1(value))
      
      inline def setOnMatchUndefined: Self = StObject.set(x, "onMatch", js.undefined)
      
      inline def setOnResult(value: /* item */ Item => Unit): Self = StObject.set(x, "onResult", js.Any.fromFunction1(value))
      
      inline def setOnResultUndefined: Self = StObject.set(x, "onResult", js.undefined)
      
      inline def setPosix(value: Boolean): Self = StObject.set(x, "posix", value.asInstanceOf[js.Any])
      
      inline def setPosixUndefined: Self = StObject.set(x, "posix", js.undefined)
      
      inline def setPrepend(value: Boolean): Self = StObject.set(x, "prepend", value.asInstanceOf[js.Any])
      
      inline def setPrependUndefined: Self = StObject.set(x, "prepend", js.undefined)
      
      inline def setRegex(value: Boolean): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
      
      inline def setStrictBrackets(value: Boolean): Self = StObject.set(x, "strictBrackets", value.asInstanceOf[js.Any])
      
      inline def setStrictBracketsUndefined: Self = StObject.set(x, "strictBrackets", js.undefined)
      
      inline def setStrictSlashes(value: Boolean): Self = StObject.set(x, "strictSlashes", value.asInstanceOf[js.Any])
      
      inline def setStrictSlashesUndefined: Self = StObject.set(x, "strictSlashes", js.undefined)
      
      inline def setUnescape(value: Boolean): Self = StObject.set(x, "unescape", value.asInstanceOf[js.Any])
      
      inline def setUnescapeUndefined: Self = StObject.set(x, "unescape", js.undefined)
      
      inline def setWindows(value: Boolean): Self = StObject.set(x, "windows", value.asInstanceOf[js.Any])
      
      inline def setWindowsUndefined: Self = StObject.set(x, "windows", js.undefined)
    }
  }
  
  trait ScanInfo extends StObject {
    
    var base: String
    
    var glob: String
    
    var input: String
    
    var isBrace: Boolean
    
    var isBracket: Boolean
    
    var isExtglob: Boolean
    
    var isGlob: Boolean
    
    var isGlobstar: Boolean
    
    var negated: Boolean
    
    var prefix: String
    
    var start: Double
  }
  object ScanInfo {
    
    inline def apply(
      base: String,
      glob: String,
      input: String,
      isBrace: Boolean,
      isBracket: Boolean,
      isExtglob: Boolean,
      isGlob: Boolean,
      isGlobstar: Boolean,
      negated: Boolean,
      prefix: String,
      start: Double
    ): ScanInfo = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], glob = glob.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], isBrace = isBrace.asInstanceOf[js.Any], isBracket = isBracket.asInstanceOf[js.Any], isExtglob = isExtglob.asInstanceOf[js.Any], isGlob = isGlob.asInstanceOf[js.Any], isGlobstar = isGlobstar.asInstanceOf[js.Any], negated = negated.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScanInfo]
    }
    
    extension [Self <: ScanInfo](x: Self) {
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setGlob(value: String): Self = StObject.set(x, "glob", value.asInstanceOf[js.Any])
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setIsBrace(value: Boolean): Self = StObject.set(x, "isBrace", value.asInstanceOf[js.Any])
      
      inline def setIsBracket(value: Boolean): Self = StObject.set(x, "isBracket", value.asInstanceOf[js.Any])
      
      inline def setIsExtglob(value: Boolean): Self = StObject.set(x, "isExtglob", value.asInstanceOf[js.Any])
      
      inline def setIsGlob(value: Boolean): Self = StObject.set(x, "isGlob", value.asInstanceOf[js.Any])
      
      inline def setIsGlobstar(value: Boolean): Self = StObject.set(x, "isGlobstar", value.asInstanceOf[js.Any])
      
      inline def setNegated(value: Boolean): Self = StObject.set(x, "negated", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScanInfoToken extends StObject {
    
    var backslashes: js.UndefOr[Boolean] = js.undefined
    
    var depth: Double
    
    var isBrace: js.UndefOr[Boolean] = js.undefined
    
    var isBracket: js.UndefOr[Boolean] = js.undefined
    
    var isExtglob: js.UndefOr[Boolean] = js.undefined
    
    var isGlob: Boolean
    
    var isGlobstar: js.UndefOr[Boolean] = js.undefined
    
    var isPrefix: js.UndefOr[Boolean] = js.undefined
    
    var negated: js.UndefOr[Boolean] = js.undefined
    
    var value: String
  }
  object ScanInfoToken {
    
    inline def apply(depth: Double, isGlob: Boolean, value: String): ScanInfoToken = {
      val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], isGlob = isGlob.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScanInfoToken]
    }
    
    extension [Self <: ScanInfoToken](x: Self) {
      
      inline def setBackslashes(value: Boolean): Self = StObject.set(x, "backslashes", value.asInstanceOf[js.Any])
      
      inline def setBackslashesUndefined: Self = StObject.set(x, "backslashes", js.undefined)
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setIsBrace(value: Boolean): Self = StObject.set(x, "isBrace", value.asInstanceOf[js.Any])
      
      inline def setIsBraceUndefined: Self = StObject.set(x, "isBrace", js.undefined)
      
      inline def setIsBracket(value: Boolean): Self = StObject.set(x, "isBracket", value.asInstanceOf[js.Any])
      
      inline def setIsBracketUndefined: Self = StObject.set(x, "isBracket", js.undefined)
      
      inline def setIsExtglob(value: Boolean): Self = StObject.set(x, "isExtglob", value.asInstanceOf[js.Any])
      
      inline def setIsExtglobUndefined: Self = StObject.set(x, "isExtglob", js.undefined)
      
      inline def setIsGlob(value: Boolean): Self = StObject.set(x, "isGlob", value.asInstanceOf[js.Any])
      
      inline def setIsGlobstar(value: Boolean): Self = StObject.set(x, "isGlobstar", value.asInstanceOf[js.Any])
      
      inline def setIsGlobstarUndefined: Self = StObject.set(x, "isGlobstar", js.undefined)
      
      inline def setIsPrefix(value: Boolean): Self = StObject.set(x, "isPrefix", value.asInstanceOf[js.Any])
      
      inline def setIsPrefixUndefined: Self = StObject.set(x, "isPrefix", js.undefined)
      
      inline def setNegated(value: Boolean): Self = StObject.set(x, "negated", value.asInstanceOf[js.Any])
      
      inline def setNegatedUndefined: Self = StObject.set(x, "negated", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScanInfoWithParts
    extends StObject
       with ScanInfo {
    
    var parts: js.Array[String]
    
    var slashes: js.Array[Double]
  }
  object ScanInfoWithParts {
    
    inline def apply(
      base: String,
      glob: String,
      input: String,
      isBrace: Boolean,
      isBracket: Boolean,
      isExtglob: Boolean,
      isGlob: Boolean,
      isGlobstar: Boolean,
      negated: Boolean,
      parts: js.Array[String],
      prefix: String,
      slashes: js.Array[Double],
      start: Double
    ): ScanInfoWithParts = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], glob = glob.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], isBrace = isBrace.asInstanceOf[js.Any], isBracket = isBracket.asInstanceOf[js.Any], isExtglob = isExtglob.asInstanceOf[js.Any], isGlob = isGlob.asInstanceOf[js.Any], isGlobstar = isGlobstar.asInstanceOf[js.Any], negated = negated.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], slashes = slashes.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScanInfoWithParts]
    }
    
    extension [Self <: ScanInfoWithParts](x: Self) {
      
      inline def setParts(value: js.Array[String]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      inline def setPartsVarargs(value: String*): Self = StObject.set(x, "parts", js.Array(value :_*))
      
      inline def setSlashes(value: js.Array[Double]): Self = StObject.set(x, "slashes", value.asInstanceOf[js.Any])
      
      inline def setSlashesVarargs(value: Double*): Self = StObject.set(x, "slashes", js.Array(value :_*))
    }
  }
  
  trait ScanInfoWithTokens
    extends StObject
       with ScanInfoWithParts {
    
    var maxDepth: Double
    
    var tokens: js.Array[ScanInfoToken]
  }
  object ScanInfoWithTokens {
    
    inline def apply(
      base: String,
      glob: String,
      input: String,
      isBrace: Boolean,
      isBracket: Boolean,
      isExtglob: Boolean,
      isGlob: Boolean,
      isGlobstar: Boolean,
      maxDepth: Double,
      negated: Boolean,
      parts: js.Array[String],
      prefix: String,
      slashes: js.Array[Double],
      start: Double,
      tokens: js.Array[ScanInfoToken]
    ): ScanInfoWithTokens = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], glob = glob.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], isBrace = isBrace.asInstanceOf[js.Any], isBracket = isBracket.asInstanceOf[js.Any], isExtglob = isExtglob.asInstanceOf[js.Any], isGlob = isGlob.asInstanceOf[js.Any], isGlobstar = isGlobstar.asInstanceOf[js.Any], maxDepth = maxDepth.asInstanceOf[js.Any], negated = negated.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], slashes = slashes.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScanInfoWithTokens]
    }
    
    extension [Self <: ScanInfoWithTokens](x: Self) {
      
      inline def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
      
      inline def setTokens(value: js.Array[ScanInfoToken]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensVarargs(value: ScanInfoToken*): Self = StObject.set(x, "tokens", js.Array(value :_*))
    }
  }
  
  trait ScanOptions
    extends StObject
       with Options {
    
    /**
      * When `true`, the returned object will include an array of strings representing each path "segment" in the scanned glob pattern.
      * This is automatically enabled when `options.tokens` is `true`.
      *
      * @default false
      */
    var parts: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When `true`, the returned object will include an array of `tokens` (objects), representing each path "segment" in the scanned glob pattern.
      *
      * @default false
      */
    var tokens: js.UndefOr[Boolean] = js.undefined
  }
  object ScanOptions {
    
    inline def apply(): ScanOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScanOptions]
    }
    
    extension [Self <: ScanOptions](x: Self) {
      
      inline def setParts(value: Boolean): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      inline def setPartsUndefined: Self = StObject.set(x, "parts", js.undefined)
      
      inline def setTokens(value: Boolean): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensUndefined: Self = StObject.set(x, "tokens", js.undefined)
    }
  }
  
  type _To = Micromatch
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Micromatch = ^
}
